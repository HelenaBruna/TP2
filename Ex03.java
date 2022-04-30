import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String opcaoUsuario = "S";

        do {
            int qtdNumeros = 0;
            double soma = 0;
            double maior = 0;
            double menor = 0;
            double media = 0;
            int qtdPositivos = 0;
            int qtdNegativos = 0;
            double porcentagemPositivos = 0;
            double porcentagemNegativos = 0;

            System.out.println("Digite a qtd de numeros: ");
            qtdNumeros = Integer.parseInt(scanner.nextLine());

            if (qtdNumeros < 0 || qtdNumeros > 20) {
                do {
                    System.out.println("Digite novamente a qtd de numeros: ");
                    qtdNumeros = Integer.parseInt(scanner.nextLine());
                } while (qtdNumeros < 0 || qtdNumeros > 20);
            }

            double vetor[] = new double[qtdNumeros];

            for (int i = 0; i < qtdNumeros; i++) {
                System.out.println("Digite um valor");
                vetor[i] = Double.parseDouble(scanner.nextLine());

                soma += vetor[i];

                if (i == 0) {
                    maior = vetor[0];
                    menor = vetor[0];
                } else if (vetor[i] > maior) {
                    maior = vetor[i];
                } else if (vetor[i] < menor) {
                    menor = vetor[i];
                }

                if (vetor[i] > 0) {
                    qtdPositivos++;
                } else {
                    qtdNegativos++;
                }

            }

            media = soma / qtdNumeros;
            porcentagemPositivos = (qtdPositivos * 100) / qtdNumeros;
            porcentagemNegativos = (qtdNegativos * 100) / qtdNumeros;

            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
            System.out.println("A soma dos valoes é: " + soma);
            System.out.println("A media é: " + media);
            System.out.println("A porcentagem positivos é: " + porcentagemPositivos);
            System.out.println("A porcentagem negativos é: " + porcentagemNegativos);

            System.out.println("Deseja rodar novamente? S/N");
            opcaoUsuario = scanner.nextLine();

            if (!opcaoUsuario.equals("S") && !opcaoUsuario.equals("N")) {
                do {
                    System.out.println("Digite a opção novamente");
                    opcaoUsuario = scanner.nextLine();
                } while (!opcaoUsuario.equals("S") && !opcaoUsuario.equals("N"));
            }

        } while (opcaoUsuario.equals("S"));

    }
}
