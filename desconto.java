
import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o valor da sua compra");

        double compra = scanner.nextDouble();

        double descontoNUMB = 0;

        if (compra > 200){
            System.out.println("você ganhou 20% de desconto");
            descontoNUMB = 20;
        }
        else if (compra > 100 ){
            System.out.println("você ganhou 10% de desconto");
            descontoNUMB = 10;
        }
        else{
            System.out.println("Num tem desconto para jente como você! seu pobre nojento.");
        
        }

        double  desconto = compra * (descontoNUMB / 100);

        System.out.printf("Sua compra tem agora o valor de :" + (compra - desconto) );
    }
}
