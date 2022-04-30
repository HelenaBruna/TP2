import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        double primeiroValor = 0;
        double segundoValor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        primeiroValor = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o segundo valor: ");
        segundoValor = Double.parseDouble(scanner.nextLine());

        if (segundoValor > primeiroValor) {
            System.out.println("Digite novamente o segundo valor: ");
            segundoValor = Double.parseDouble(scanner.nextLine());
        }

    }
}
