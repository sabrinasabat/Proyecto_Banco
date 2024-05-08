package Santander;
import java.util.Scanner;

public class AtencionAlCliente {

    public static void menu(){

        System.out.println("¡Bienvenido al Banco Santander!");

        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Elijas una de las opciones a seguir: ");
            System.out.println("[1] Abrir cuenta");
            System.out.println("[2] Tipos de cuenta");
            System.out.println("[3] Ventajas de las cuentas");
            System.out.println("[4] Tasas");
            System.out.println("[0] Salir del menu");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option){
                case 1:
                    info_Abrir_Cuenta();
                    break;
                case 2:
                    info_Tipos_Cuenta();
                    break;
                case 3:
                    info_Ventajas_Cuentas();
                    break;
                case 4:
                    info_Tasas();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Digite novamente.");
            }

            if(option==0){
                break;
            }
        }


    }
    private static void info_Abrir_Cuenta(){
        System.out.println("Es super facil abrir una cuenta con nosotros.");
        System.out.println("Primero definimos su perfil dentre los tipos de cuenta que tenemos, luego nos presentará los siguientes documentos: ");
        System.out.println("1- DNI o NIE");
        System.out.println("2- Certificado de empadronamiento");
        System.out.println("3- Con los documentos presentados, ya estará listo para abrir tu cuenta.");
        System.out.println(":)");
    }

    private static void info_Tipos_Cuenta(){
        System.out.println("Dentre las cuentas que tenemos hay: ");
        System.out.println("Cuenta Ahorro: Dónde puedes ahorrar su dinero cobrando un rendimiento extra.");
        System.out.println("Cuenta Corriente: Dónde puedes gestionar las transacciones diárias y pagar posibles facturas. ");
        System.out.println("Cuenta Estudiante: Dónde puedes gestionar mejor los gastos mientras estas en la universidad, sin gastos extras, esta cuenta es totalmente gratuita.");
    }

    private static void info_Ventajas_Cuentas(){
        System.out.println("=============== Vantajas de las cuentas ===============");
        System.out.println("Cuenta Ahorro: Con esta cuenta puedes ahorrar sin tener que esconder su dinero en casa, y aparte de eso, puedes tener rendimientos mensuales de 0.03% basado en tu sueldo.");
        System.out.println("Cuenta Corriente: Con esta cuenta puedes tramitar todo de su día día más rapido, pagando facturas al momento con apenas una tasa anual de 0.05% sobre tu sueldo.");
        System.out.println("Cuenta estudiante: Con esta cuenta está más facil preocuparse apenas con los estudios: Es totalmente gratuita, teniendo apenas un limite de saque de 15€ al día. Obs: Lo puedes cambiar eso contactando su gerente.");
    }


    private static void info_Tasas(){
        System.out.println("Cuenta Ahorro: No tiene ningúna tasa.");
        System.out.println("Cuenta Corriente: Tasa de 0.05% anual basado en su sueldo del momento.");
        System.out.println("Cuenta Estudiante: No tiene ningúna tasa.");
    }




}
