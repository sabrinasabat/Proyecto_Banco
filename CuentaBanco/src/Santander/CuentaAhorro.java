package Santander;

public class CuentaAhorro extends CuentaBancaria{

    protected float rendimiento;

    //Constructor ------------------------------------------------------------------------------
    public CuentaAhorro(String titularCuenta, String fechaApertura, int sueldo, String dniNie, String empadronamiento) {
        super(titularCuenta, fechaApertura, sueldo, dniNie, empadronamiento);

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
    public String toString() {
        return String.format("=== Resumen de la cuenta: ===\nNúmero de la cuenta: %s\nTitular de la cuenta: %s\nFecha de apertura de la cuenta: %s\n", this.getNumCuenta(), this.getTitularCuenta(), this.getFechaApertura());
    }

    @Override
    public void estadoActual(){
        System.out.println("------------------------------------------------------");
        if(getStatus()){
            System.out.println("===           Estado de la cuenta:           ===");
            System.out.println("|   Número de la cuenta: " + this.getNumCuenta()+"                 |");
            System.out.println("|   Titular de la Cuenta: "+ this.getTitularCuenta()+"                 |");
            System.out.println("|   Fecha de Apertura de la Cuenta: "+ this.getFechaApertura()+"  |");
            System.out.println("|   Tasa de rendimiento: "+ this.getRendimiento()+"                   |");
            System.out.printf("|   Sueldo: %.2f€.                           |%n", this.getSueldo());
            System.out.println("|_______________________________________________|");

        } else {
            System.out.println("Cuenta inactiva");
        }
    }

    @Override
    public boolean ingresarDinero(float valorCash){
        System.out.println("------------------------------------------------------");
        if(this.getStatus()){
            this.setSueldo(this.getSueldo()+valorCash);
            System.out.println("Dinero ingresado en la Cuenta Ahorro de "+ this.getTitularCuenta());
            return true;
        } else {
            System.out.println("¡E R R O R!");
            System.out.println("Tienes que abrir una cuenta primero.");
            return false;
        }
    }

    @Override
    public boolean sacarDinero(float valorCashout){
        System.out.println("------------------------------------------------------");
        if(this.getStatus()){
            if(this.getSueldo()>=valorCashout){
                this.setSueldo(this.getSueldo()-valorCashout);
                System.out.println("Dinero sacado de la Cuenta Ahorro de "+ this.getTitularCuenta()+".");
                System.out.printf("Sueldo: %.2f€.                           %n", this.getSueldo());
                return true;
            }
            System.out.println("Sueldo insuficiente.");
            System.out.printf("Sueldo: %.2f€.                           %n", this.getSueldo());
        }
        return false;
    }

    // método de rendimiento
    // Polimorfismo
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
