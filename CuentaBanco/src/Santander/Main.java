package Santander;

import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){

        // teste cuenta ahorro
        // Sacar (cantidad mayor que el sueldo), ingresar, status de la cuenta, rendimiento y simulación de rendimiento
        CuentaAhorro persona1 = new CuentaAhorro("Vitor Aguiar Lopez","02/10/1998", 10000, "4578632H", "jddodjfs!");

        persona1.estadoActual();
        persona1.ingresarDinero(3000);
        persona1.estadoActual();
        persona1.sacarDinero(500);
        persona1.estadoActual();
        persona1.generadorRendimiento();
        persona1.generadorRendimiento(1500);


        // teste cuenta corriente
        // ingresar, sacar (cantidad mayor que el sueldo), status de la cuenta, pago de anuidad y pago de factura
        CuentaCorriente persona2 = new CuentaCorriente("Caroline", "05/03/2024",3000,"42375892F", "ihsofhdsofhs");

        persona2.estadoActual();
        persona2.ingresarDinero(200);
        persona2.pagarAnuidad();
        persona2.pagarFactura();
        persona2.sacarDinero(943.59f);


        // teste de la cuenta universitaria
        // ingresar, sacar (- de 15€, + de 15€ y cantidad mayor que el sueldo, sacar con la cuenta cerrada), status de la cuenta
        // actualizar cadastro (periodo mayor que el limite, periodo menor y conclusion del curso)
        CuentaEstudiante persona3 = new CuentaEstudiante("Roberto","30/04/2024", 250, "4444589G","UIB", "27/09/2021", "Farmacia", 6, "dfnsljfn");

        persona3.estadoActual();
        persona3.sacarDinero(50);
        persona3.actualizarCadastro("UIB", "02/05/2024", "Enfermería", 15, false, "ihiuhsdfisuhfiuh");
        persona3.sacarDinero(250);
        persona3.estadoActual();


        persona3.actualizarCadastro("UIV", "10/10/1990", "Direito", 20, false, "sldjhasdj");













    }
}
