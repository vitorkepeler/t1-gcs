import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

<<<<<<< Updated upstream
=======
        while (sair != true) {
            System.out.println("\n Escolha a função desejada: \n 1. Calcular divisores (bee1157) \n 2. Preencher vetor com metade do valor anterior (bee 1178) \n 3. Sair");
            int s = sc.nextInt();
            switch (s) {
                case 2:
                    System.out.println("Digite o número desejado: ");
                    double x;
                    x = sc.nextDouble();
                    bee1178(x);
                    break;
                case 1:
                    System.out.println("Digite o número desejado: ");
                    int y;
                    y = sc.nextInt();
                    bee1157(y);
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    public static int[] bee1157(int y){
        int result[];
        int id = 0;
        result = new int [y];
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) {
                System.out.println(i);
                result[id] = i;
                id++;
            }
        }
        return result;
    }
    public static double[] bee1178(double x){
        double n[];
        n = new double [100];
        n[0] = x;

        for(int i = 1; i < 100; i++){
            x = x/2;
            n[i] = x;
        }

        for(int i = 0; i < 100; i++){
            System.out.print("N[" + i + "] = ");
            System.out.format("%.4f", n[i]);
            System.out.println();
        }

        return n;
>>>>>>> Stashed changes
    }
}