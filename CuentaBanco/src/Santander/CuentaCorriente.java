package Santander;

public class CuentaCorriente extends CuentaBancaria{

    private float anuidad;
    private float Factura;
    public CuentaCorriente(String titularCuenta, String fechaApertura, int sueldo, String dniNie, String empadronamiento) {
        super(titularCuenta, fechaApertura, sueldo, dniNie, empadronamiento);

        this.anuidad = 0.05f;
        this.Factura = 250.50f;
    }

    // getters y setters ------------------------------------------------------------------------

    public float getAnuidad() {
        return anuidad;
    }

    public void setAnuidad(float anuidad) {
        this.anuidad = anuidad;
    }

    public float getFactura(){
        return Factura;
    }

    public void setFactura(float factura){
        this.Factura = factura;
    }
    // overrides --------------------------------------------------------------------------
    @Override
    public void estadoActual(){
        System.out.println("------------------------------------------------------");
        System.out.println("===           Estado de la cuenta:           ===");
        System.out.println("|   Número de la cuenta: " + this.getNumCuenta()+"                 |");
        System.out.println("|   Titular de la Cuenta: "+ this.getTitularCuenta()+"              |");
        System.out.println("|   Fecha de Apertura de la Cuenta: "+ this.getFechaApertura()+"  |");
        System.out.println("|   Sueldo: "+ this.getSueldo()+"€.                            |");
        System.out.println("|_______________________________________________|");

    }

    @Override
    public void ingresarDinero(float valorCash){
        if(this.getStatus()){
            this.setSueldo(this.getSueldo()+valorCash);
            System.out.println("------------------------------------------------------");
            System.out.println("Dinero ingresado en la Cuenta Corriente de "+ this.getTitularCuenta()+".");
            System.out.println("Sueldo actual: "+this.getSueldo());
        } else {
            System.out.println("------------------------------------------------------");
            System.out.println("¡E R R O R!");
            System.out.println("Tienes que abrir una cuenta primero.");
        }
    }

    @Override
    public float sacarDinero(float valorCashout){
        float tasa = 2.30f;
        if(this.getStatus()) {
            if (this.getSueldo() >= valorCashout) {
                this.setSueldo(this.getSueldo() - valorCashout);
                System.out.println("------------------------------------------------------");
                System.out.println("Dinero sacado de la Cuenta Corriente de " + this.getTitularCuenta() + ".");
                System.out.println("Sueldo actual: " + this.getSueldo()+"€.");
                return valorCashout-tasa;
            }
            System.out.println("------------------------------------------------------");
            System.out.println("Sueldo insuficiente.");
            System.out.println("Sueldo actual: " + this.getSueldo() + "€.");
        }
        return 0;
    }

    public void pagarAnuidad(){
        float anuidad=5.90f;

        if (getStatus()) {
            if (getSueldo() >= anuidad) {
                setSueldo(getSueldo() - anuidad);
                System.out.println("------------------------------------------------------");
                System.out.println("¡Su anuidad ha sido pagada con succeso!");
                System.out.println("Sueldo actual: "+this.getSueldo());
            } else {
                setSueldo(getSueldo() - anuidad);
                System.out.println("------------------------------------------------------");
                System.out.println("Anuidad descontada.");
                System.out.println("Cuenta negativada. Regularize la situación.");
            }
        }
    }

    public void pagarFactura(){
        if(getSueldo()>=getFactura()){
            setSueldo(getSueldo()-getFactura());
            setFactura(0);
            System.out.println("------------------------------------------------------");
            System.out.println("¡Factura pagada con succeso!");
            System.out.println("Sueldo actual: "+this.getSueldo());
        } else {
            setFactura(getFactura()-getSueldo());
            setSueldo(0);
            setStatus(false);
            System.out.println("------------------------------------------------------");
            System.out.println("Valor pendiente para pagar: "+getFactura()+"€.");
            System.out.println("Su cuenta estará negativada hasta que hagas el pago de las pendencias.");
        }
    }
}
