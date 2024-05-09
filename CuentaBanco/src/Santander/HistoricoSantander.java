package Santander;

import java.util.ArrayList;

public class HistoricoSantander {
    ArrayList<Transferencia> historial = new ArrayList<>();

    public void inserirTranferencia(Transferencia t){
        historial.add(t);
    }

    public void ensenaHistorial(){

        System.out.println("------------------------------------------------------");
        System.out.println("Historial Banco Santander:");
        for(int i=0; i<historial.size(); i++){
            System.out.println(historial.get(i));
            System.out.println("------------------------------------------------------");
        }

    }
}
