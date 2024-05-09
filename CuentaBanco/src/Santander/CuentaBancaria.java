package Santander;
import java.util.Random;
public abstract class CuentaBancaria {
    private final int numCuenta;
    private String titularCuenta;
    private String fechaApertura;
    private float sueldo;
    private boolean status;
    private String dniNie;
    private String empadronamiento;


    // ----------------------------------------------------------------------------------- //

    protected CuentaBancaria(String titularCuenta, String fechaApertura, int sueldo, String dniNie, String empadronamiento) {
        Random generator = new Random();
        this.numCuenta = generator.nextInt(899999) + 100000;
        this.titularCuenta = titularCuenta;
        this.fechaApertura = fechaApertura;
        this.sueldo = sueldo;
        this.dniNie = dniNie;
        this.status = true;
        this.empadronamiento = empadronamiento;
    }

    // ----------------------------------------------------------------------------------- //
    public abstract void estadoActual();

    public abstract boolean ingresarDinero(float valorCash);

    public abstract boolean sacarDinero(float valorCashout);

    // ----------------------------------------------------------------------------------- //

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }


    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDniNie() {
        return dniNie;
    }

    public void setDniNie(String dniNie) {
        this.dniNie = dniNie;
    }

    public String getEmpadronamiento(){
        return empadronamiento;
    }

    public void setEmpadronamiento(){
        this.empadronamiento = empadronamiento;
    }

}

