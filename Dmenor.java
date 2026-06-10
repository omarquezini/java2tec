import java.util.Scanner;

public class Dmenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos anos você tem? ");

        int idade = scanner.nextInt();

        if (idade >= 18 ) {
             System.out.println("Você é obviamente maior de idade.");
        }
        else{
             System.out.println("Você é um bebe ainda, volte quando decidir ser mais velho");
        }
    }
}
