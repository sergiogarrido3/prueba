import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int right, wrong, blank;
        System.out.print("Respuestas correctas: ");
        right = sc.nextInt();
        System.out.print("Respuestas incorrectas: ");
        wrong = sc.nextInt();
        System.out.print("Respuestas en blanco: ");
        blank = sc.nextInt();

      //CALCULO  DE NOTAS

        int puntuajefinal = (right * 5) + (wrong * -1);

        System.out.println("Tu nota es: "+puntuajefinal);


    }
}
