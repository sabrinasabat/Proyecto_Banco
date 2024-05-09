package Santander;

public class CuentaEstudiante extends CuentaBancaria implements AlarmaInterfazEstudiante {
    private String nombreUniversidad;
    private String fechaInicio;
    private String curso;
    private int periodo;
    private boolean concluido;
    public CuentaEstudiante(String titularCuenta, String fechaApertura, int sueldo, String dniNie, String nombreUniversidad, String fechaInicio, String curso, int periodo, String empadronamiento) {
        super(titularCuenta, fechaApertura, sueldo, dniNie, empadronamiento);

        this.nombreUniversidad = nombreUniversidad;
        this.fechaInicio = fechaInicio;
        this.curso = curso;
        this.periodo = periodo;
        this.concluido = false;
    }

// ---------------------------------------------------------------------------



    // getters y setters --------------------------------------------------------------------------------


    private String getNombreUniversidad() {
        return nombreUniversidad;
    }

    private void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    private String getFechaInicio() {
        return fechaInicio;
    }

    private void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    private String getCurso() {
        return curso;
    }

    private void setCurso(String curso) {
        this.curso = curso;
    }

    private int getPeriodo() {
        return periodo;
    }

    private void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    // Overrides --------------------------------------------------------------------------------

    @Override
    public String toString(){
        return String.format("=== Resumen de la cuenta: ===\nNúmero de la cuenta: %s\nTitular de la cuenta: %s\nFecha de apertura de la cuenta: %s\nNombre de la universidad: %s\n", this.getNumCuenta(), this.getTitularCuenta(), this.getFechaApertura(), this.getNombreUniversidad());

    }
    @Override
    public void estadoActual(){
        if(getStatus()){
            System.out.println("------------------------------------------------------");
            System.out.println("===           Estado de la cuenta:          ===");
            System.out.println("|   Número de la cuenta: " + this.getNumCuenta()+"                 |");
            System.out.println("|   Titular de la Cuenta: "+ this.getTitularCuenta()+"               |");
            System.out.println("|   Fecha de Apertura de la Cuenta: "+ this.getFechaApertura()+"  |");
            System.out.println("|   Sueldo: "+ this.getSueldo()+"€.                             |");
            System.out.println("|_______________________________________________|");
        } else {
            System.out.println("------------------------------------------------------");
            System.out.println("¡Has ultrapasado el tiempo limite para tener una cuenta Universitária!");
            System.out.println("Cuantía restante en la cuenta: "+ getSueldo()+"€.");
        }
    }

    @Override
    public boolean ingresarDinero(float valorCash){
        if(this.getStatus()){
            this.setSueldo(this.getSueldo()+valorCash);
            System.out.println("------------------------------------------------------");
            System.out.println("Dinero ingresado en la Cuenta Estudiante de "+ this.getTitularCuenta()+".");
            System.out.println("Sueldo actual: "+this.getSueldo());
            return true;
        } else {
            System.out.println("------------------------------------------------------");
            System.out.println("¡E R R O R!");
            System.out.println("Tienes que abrir una cuenta primero.");
            return false;
        }
    }

    @Override
    public boolean sacarDinero(float valorCashout){
        if (getStatus()) {
            if (this.getSueldo() >= valorCashout && valorCashout <= 15) {
                this.setSueldo(this.getSueldo() - valorCashout);
                System.out.println("------------------------------------------------------");
                System.out.println("Dinero sacado de la Cuenta Estudiante de " + this.getTitularCuenta() + ".");
                System.out.printf("Sueldo: %.2f€.                           %n", this.getSueldo());
                return true;
            } else if (valorCashout>this.getSueldo()) {
                System.out.println("------------------------------------------------------");
                System.out.println("Sueldo insuficiente.");
                System.out.printf("Sueldo: %.2f€.                           %n", this.getSueldo());

            } else {
                AlarmaInterfazEstudiante.limiteCashout();
            }
        } else {
            if(getSueldo()>=valorCashout){
                setSueldo(getSueldo()-valorCashout);
                return true;
            }
        }
        return false;
    }

    public void actualizarCadastro(String nombreUniversidad, String fechaInicio, String curso, int nuevoPeriodo, boolean concluido, String empadronamiento){
        if(nuevoPeriodo>=11) {
            setStatus(false);
            System.out.println("------------------------------------------------------");
            AlarmaInterfazEstudiante.limiteTiempo();
            System.out.printf("Cuantía restante en la cuenta: %.2f€.                           %n", this.getSueldo());

        } else if (concluido){
            setStatus(false);
            System.out.println("------------------------------------------------------");
            System.out.println("Enhorabuena! Has concluido el curso!");
            System.out.println("¡No te olvides de pasar en nuestra agencia y retirar todo su dinero!");
        } else {
            setNombreUniversidad(nombreUniversidad);
            setFechaInicio(fechaInicio);
            setCurso(curso);
            setPeriodo(periodo);
            System.out.println("------------------------------------------------------");
            System.out.println("===     ¡Datos actualizados!     ===");
            System.out.println("|   Nombre Universidad: "+this.nombreUniversidad+"         |");
            System.out.println("|   Fecha de inicio: "+this.fechaInicio+"     |");
            System.out.println("|   Curso: "+this.curso+"               |");
            System.out.println("|   Periodo: "+this.periodo+"                     |");
            System.out.println("|___________________________________|");
        }
    }
}
