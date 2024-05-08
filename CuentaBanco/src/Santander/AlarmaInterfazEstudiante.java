package Santander;

public interface AlarmaInterfazEstudiante {
    public static void limiteCashout() {
        System.out.println("------------------------------------------------------");
        System.out.println("¡Limite diario excedido!");
        System.out.println("Limite diario para cuenta Estudiante: 15€.");
    }

    public static void limiteTiempo() {
        System.out.println("------------------------------------------------------");
        System.out.println("¡Has ultrapasado el tiempo limite para tener una cuenta Universitária!");
        System.out.println("Su cuenta ha sido cerrada automáticamente.");
    }

}
