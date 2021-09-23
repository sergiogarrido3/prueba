import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas monedas tienes de 2€, de 1€, de 50 cents, de 20 cents y de 10 cents: ");

        int doseur = sc.nextInt();
        int uneur = sc.nextInt();
        int cincuentacent = sc.nextInt();
        int veintecent = sc.nextInt();
        int diezcent = sc.nextInt();
        int dinerototalcent = (doseur*200)+(uneur*100)+(cincuentacent*50)+(veintecent*20)+(diezcent*10);

        int euros = dinerototalcent/100;
        int cent = dinerototalcent-(euros*100);

        System.out.println("Tu cartera tiene: "+euros+"€ y "+cent+" cents");

    }

}
