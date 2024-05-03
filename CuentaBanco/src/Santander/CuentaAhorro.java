package Santander;

public class CuentaAhorro extends CuentaBancaria{

    protected float rendimiento;

    //Constructor ------------------------------------------------------------------------------
    public CuentaAhorro(String titularCuenta, String fechaApertura, int sueldo, String dniNie) {
        super(titularCuenta, fechaApertura, sueldo, dniNie);

        this.rendimiento = 0.03f;
    }

    // getters y setters ------------------------------------------------------------------------
    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    // Overrides --------------------------------------------------------------------------------
    @Override
    public void estadoActual(){
        System.out.println("------------------------------------------------------");
        if(getStatus()){
            System.out.println("===           Estado de la cuenta:           ===");
            System.out.println("|   Número de la cuenta: " + this.getNumCuenta()+"                 |");
            System.out.println("|   Titular de la Cuenta: "+ this.getTitularCuenta()+"                 |");
            System.out.println("|   Fecha de Apertura de la Cuenta: "+ this.getFechaApertura()+"  |");
            System.out.println("|   Tasa de rendimiento: "+ this.getRendimiento()+"                   |");
            System.out.println("|   Sueldo: "+ this.getSueldo()+"€.                            |");
            System.out.println("|_______________________________________________|");

        } else {
            System.out.println("Cuenta inactiva");
        }
    }

    @Override
    public void ingresarDinero(float valorCash){
        System.out.println("------------------------------------------------------");
        if(this.getStatus()){
            this.setSueldo(this.getSueldo()+valorCash);
            System.out.println("Dinero ingresado en la Cuenta Ahorro de "+ this.getTitularCuenta());
        } else {
            System.out.println("¡E R R O R!");
            System.out.println("Tienes que abrir una cuenta primero.");
        }
    }

    @Override
    public float sacarDinero(float valorCashout){
        System.out.println("------------------------------------------------------");
        if(this.getStatus()){
            if(this.getSueldo()>=valorCashout){
                this.setSueldo(this.getSueldo()-valorCashout);
                System.out.println("Dinero sacado de la Cuenta Ahorro de "+ this.getTitularCuenta()+".");
                System.out.println("Sueldo actual: "+ this.getSueldo());
                return valorCashout;
            }
            System.out.println("Sueldo insuficiente.");
            System.out.println("Sueldo actual: "+this.getSueldo()+"€.");
        }
        return 0;
    }

    // método de rendimiento
    public float generadorRendimiento(){
        System.out.println("------------------------------------------------------");
        float result = 0;
        result = this.getSueldo() + (this.getRendimiento()*this.getSueldo());
        System.out.println("Total rendimiento: "+ result);
        return  result;
    }

    // método para saber cuanto me generaría si ingresara un valor especifico
    public float generadorRendimiento(float valorAdicional){
        System.out.println("------------------------------------------------------");
        float result = 0, sumaValores = 0;
        sumaValores = this.getSueldo() + (valorAdicional);
        result = sumaValores + (this.getRendimiento()*sumaValores);
        System.out.println("::::::   Total rendimiento SIMULACIÓN: "+ result+"€   :::::");
        return result;
    }
}
