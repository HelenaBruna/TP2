import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double constante = 0;

        double m[][] = new double[3][4];
        double n[][] = new double[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um valor: ");
                m[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        System.out.println("Digite uma constante para multiplicacao: ");
        constante = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                n[i][j] = m[i][j] * constante;
                System.out.println(n[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
