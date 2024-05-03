package Santander;

import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){

        CuentaAhorro persona1 = new CuentaAhorro("Vitor","20/10/2023",1500,"Y7213753G");

        persona1.estadoActual();
        persona1.ingresarDinero(3000);
        persona1.estadoActual();
        persona1.sacarDinero(500);
        persona1.estadoActual();
        persona1.generadorRendimiento();
        persona1.generadorRendimiento(1500);


        CuentaCorriente persona2 = new CuentaCorriente("Caroline", "05/03/2024",3000,"42375892F");

        persona2.estadoActual();
        persona2.ingresarDinero(200);
        persona2.pagarAnuidad();
        persona2.pagarFactura();
        persona2.sacarDinero(943.59f);


        CuentaEstudiante persona3 = new CuentaEstudiante("Roberto","30/04/2024", 250, "4444589G","UIB", "27/09/2021", "Farmacia", 6);

        persona3.estadoActual();
        persona3.sacarDinero(50);
        persona3.actualizarCadastro("UIB", "02/05/2024", "Enfermería", 18, false);
        persona3.estadoActual();
        persona3.sacarDinero(300);









    }
}
