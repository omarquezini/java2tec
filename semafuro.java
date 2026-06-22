import java.util.Scanner;

public class semafuro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do seu semi Furo");

        String cor = scanner.nextLine();

        String corMais = cor.toUpperCase();

        if (corMais.equals("VERMELHO")) {
            System.out.println("Pare o carro e se renda imediatamente !!! Você está sendo preso por antecipação.");
        }
        else if (corMais.equals("AMARELO")) {
            System.out.println("Calma ai tiozão, Tá indo dá aonde com tanta pressa? ");
        }
        else if (corMais.equals("VERDE")) {
            System.out.println("passa... seu miseravel  ");
        }
        else{
            System.out.println("essa cor não tem, seu daltonico.  ");
        }
    }
    
}
