import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int NumeroAleatorio = random.nextInt(max - min);
        System.out.println("Adivinhe o número: ");
        int NumeroAdivinhado = scanner.nextInt();



        while(NumeroAdivinhado != NumeroAleatorio){
            System.out.println("Adivinhe o número: ");
            NumeroAdivinhado = scanner.nextInt();
            if (NumeroAdivinhado == NumeroAleatorio) {
                System.out.println("Voce Acertou!! O número escondido era " + NumeroAleatorio);
            } else if ( NumeroAdivinhado < NumeroAleatorio) {
                System.out.println("Este número é Menor!!");
            } if ( NumeroAdivinhado > NumeroAleatorio) {
                System.out.println("Este número é Maior");
            }
        }




    }
    }
