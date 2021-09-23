import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora de salida: ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        System.out.print("Tiempo de viaje(segundos): ");
        int trascursoseg = sc.nextInt();
    //  CALCULO DEL TIEMPO
        int tiempodeviajeseg = (horas*60*60)+(minutos*60)+(segundos)-(trascursoseg);
        int horasf = (tiempodeviajeseg / 3600);
        int minutosf = ((tiempodeviajeseg-horasf*3600)/60);
        int segundosf = tiempodeviajeseg-(horasf*3600+minutosf*60);
        System.out.println("La hora de llegada es: "+horasf+":"+minutosf+":"+segundosf);

    }
}
