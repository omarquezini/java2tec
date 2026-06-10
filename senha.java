import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int senhaReal = 507139;

         System.out.print("Qual a senha ? ");

         int chute = scanner.nextInt();

         if (senhaReal == chute ){
            System.out.println("OK... pode entrar ");
         }
         else{
            System.out.println("Vai roubar a sua vô seu miseravel!");
         }


         
    }
}
