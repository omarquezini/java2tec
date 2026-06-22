
import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o valor da sua compra");

        double compra = scanner.nextDouble();

        if (compra > 100){
            System.out.println("você ganhou 10% de desconto");
        }
        else if (compra > 200){
            System.out.println("você ganhou 20% de desconto");
        }
        else{
            System.out.println("Num tem desconto para jente como você! seu pobre nojento.");
        
        }

        System.out.printf("");
    }
}
