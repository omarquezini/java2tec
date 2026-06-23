import java.util.Scanner;

import java.util.Random;

public class secnum {
    public static void main(String[] args) {

        Random randy = new Random();

        Scanner scanner = new Scanner(System.in);

        int chanses = 5;

        int numsec = randy.nextInt(30); 
        
         System.out.println("+----------------------+");
         System.out.println("|-------descubra-------|");
         System.out.println("|---o numero secreto---|");
         System.out.println("+----------------------+");

        while (chanses < 0) {
            System.out.printf("VOCÊ TEM UM TOTAL DE CHASSES DE |" + chanses);

            int chute = scanner.nextInt();

            if (chute == numsec) {
                System.out.println("isso ai porra!");
                break
            }
            else if (chute < numsec ){
                System.out.println("tente de novo, o numero secreto é menor...");
            }
            else if (chute > numsec ){
                System.out.println("tente de novo, o numero secreto é maior...");
            }
        }
           
        }
    }
        