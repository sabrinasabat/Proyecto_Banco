package Santander;

public class CuentaEstudiante extends CuentaBancaria{
    private String nombreUniversidad;
    private String fechaInicio;
    private String curso;
    private int periodo;
    private boolean concluido;
    public CuentaEstudiante(String titularCuenta, String fechaApertura, int sueldo, String dniNie, String nombreUniversidad, String fechaInicio, String curso, int periodo) {
        super(titularCuenta, fechaApertura, sueldo, dniNie);

        this.nombreUniversidad = nombreUniversidad;
        this.fechaInicio = fechaInicio;
        this.curso = curso;
        this.periodo = periodo;
        this.concluido = false;
    }

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
    public void ingresarDinero(float valorCash){
        if(this.getStatus()){
            this.setSueldo(this.getSueldo()+valorCash);
            System.out.println("------------------------------------------------------");
            System.out.println("Dinero ingresado en la Cuenta Estudiante de "+ this.getTitularCuenta()+".");
            System.out.println("Sueldo actual: "+this.getSueldo());
        } else {
            System.out.println("------------------------------------------------------");
            System.out.println("¡E R R O R!");
            System.out.println("Tienes que abrir una cuenta primero.");
        }
    }

    @Override
    public float sacarDinero(float valorCashout){
        if (getStatus()) {
            if (this.getSueldo() >= valorCashout && valorCashout <= 15) {
                this.setSueldo(this.getSueldo() - valorCashout);
                System.out.println("------------------------------------------------------");
                System.out.println("Dinero sacado de la Cuenta Estudiante de " + this.getTitularCuenta() + ".");
                System.out.println("Sueldo actual: " + this.getSueldo()+"€.");
                return valorCashout;
            } else if (valorCashout>this.getSueldo()) {
                System.out.println("------------------------------------------------------");
                System.out.println("Sueldo insuficiente.");
                System.out.println("Sueldo actual: " + this.getSueldo() + "€.");

            } else {
                System.out.println("------------------------------------------------------");
                System.out.println("¡Limite diario excedido!");
                System.out.println("Limite diario para cuenta Estudiante: 15€.");
            }
        } else {
            if(getSueldo()>=valorCashout){
                setSueldo(getSueldo()-valorCashout);
                return valorCashout;
            }
        }
        return 0;
    }

    public void actualizarCadastro(String nombreUniversidad, String fechaInicio, String curso, int nuevoPeriodo, boolean concluido){
        if(nuevoPeriodo>=11) {
            setStatus(false);
            System.out.println("------------------------------------------------------");
            System.out.println("¡Has ultrapasado el tiempo limite para tener una cuenta Universitária!");
            System.out.println("Cuantía restante en la cuenta: " + getSueldo()+"€.");
            System.out.println("Su cuenta ha sido cerrada automáticamente.");

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
