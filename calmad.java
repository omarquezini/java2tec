import java.util.Scanner;

public class calmad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas matérias você tem? ");
        int materias = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= materias; i++) {
            System.out.printf("Digite a nota da matéria %d: ", i);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / materias;

        System.out.printf("A média final é: %.2f%n", media);

        if (media < 4.0) {
            System.out.println("Reprovado. sua vadia imunda");
        } else if (media <= 6.0) {
            System.out.println("Recuperação. seu miseravel incopetente");
        } else {
            System.out.println("Aprovado... Agora saia da minha vida");
        }

        scanner.close();
    }
}