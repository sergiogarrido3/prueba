import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre completo ");
        String nombre = sc.next();
        String apellido = sc.next();
        String apellido2 = sc.next();
        System.out.print("Hola "+nombre.charAt(0)+apellido.charAt(0)+apellido2.charAt(0));
    }
}
