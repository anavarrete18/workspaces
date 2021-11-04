import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("\n Escriu el teu nom: ");
        String nom = in.nextLine();
        System.out.println("\n Hola " + nom + "!!\n");
        in.close();
    }
}
