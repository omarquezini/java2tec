import java.util.Scanner;

import java.util.Random;

public class secnum {
    public static void main(String[] args) {

        Random randy = new Random();

        Scanner scanner = new Scanner(System.in);

        int chanses = 5;

        int numsec = randy.nextInt(30); 
        
         System.out.println("+----------------------+");
         System.out.println("+----------------------+");
         System.out.println("+----------------------+");
         System.out.println("+----------------------+");

        for (int i = 0; i <= chanses; i++) {
            System.out.printf("Dijite o seu chute ");
            double chute = scanner.nextDouble();
           
        }

        
}