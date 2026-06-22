import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");

        int idade = scanner.nextInt();

        if (idade < 12){
            System.out.println("seu criança, seu Bebe, seu miseravel. * sons da sua alma quebrando *");
        }
        else if (idade < 17){
            System.out.println("seu CLT, seu Univercitrio, seu falido. * sons da sua alma levemente mais velhas se quebrando *");
        }
        else if (idade < 59){
            System.out.println("seu velho, seu Atenor, seu octogenario. * sons da sua alma idosa se quebrando *");
        }
        else{
            System.out.println("seu Aciao, seu Centenario, seu Desgraçado. * sons do seus ossos quebrando ");        
        }

    }
}
