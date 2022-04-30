import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[10]; // declaração combinada
        double soma = 0;
        double maior = 0;
        double media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = Double.parseDouble(scanner.nextLine());

            if (vetor[i] < 0) {
                do {
                    System.out.println("Digite novamente um numero positivo: ");
                    vetor[i] = Double.parseDouble(scanner.nextLine());
                } while (vetor[i] < 0);
            }

            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            soma += vetor[i];

        }

        media = soma / 10;

        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média é: " + media);

    }
}
