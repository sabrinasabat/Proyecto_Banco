package Santander;

public class Transferencia {
    private String fechaTransferencia;
    private float valorTransferencia;
    private CuentaCorriente remetenteTransferencia;
    private CuentaCorriente destinatarioTransferencia;



    public boolean transferirCash(CuentaCorriente remetenteTransferencia, CuentaCorriente destinatarioTransferencia, String fechaTransferencia, float valorTransferencia){
        if (remetenteTransferencia.sacarDinero(valorTransferencia)){
            if(destinatarioTransferencia.ingresarDinero(valorTransferencia)){
                System.out.println("---------------------------------------------------------");
                System.out.println("¡Transferencia hecha con succeso!");
                this.fechaTransferencia = fechaTransferencia;
                this.remetenteTransferencia = remetenteTransferencia;
                this.destinatarioTransferencia = destinatarioTransferencia;
                this.valorTransferencia = valorTransferencia;
                System.out.printf("Sueldo Remetente: %.2f%n",remetenteTransferencia.getSueldo());
                System.out.printf("Sueldo Destinatário: %.2f%n",destinatarioTransferencia.getSueldo());
                return true;

            } else{
                System.out.println("No ha sido posible realizar la transferencia.");
                System.out.println("Error de conexión. Intente más tarde.");
                remetenteTransferencia.ingresarDinero(valorTransferencia);
                return false;
            }
        } else{
            System.out.println("No ha sido posible realizar la transferencia.");
            System.out.println("Error de conexión. Intente más tarde.");
            return false;
        }

    }

    @Override
    public String toString(){
        return String.format("Fecha de Transferencia: %s\nRemetente: %s\nDestinatario: %s\nValor: %.2f\n",fechaTransferencia, remetenteTransferencia.getTitularCuenta(), destinatarioTransferencia.getTitularCuenta(), valorTransferencia);
    }
}
