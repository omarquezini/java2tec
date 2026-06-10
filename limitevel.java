import java.util.Scanner;

public class limitevel {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

          System.out.print("Qual o seu limite malandro? ");

          int Km = scanner.nextInt();

          if ( Km > 80){
            System.out.println("Estejá multado seu transgresor... ** barulho de da sua masculinidade quebrando **. ");
          }
          else{
            System.out.println("vá com deus, seu pequeno mentiroso nojento.");
          }
    }
    
}
