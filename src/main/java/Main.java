import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número desejado: ");
        double x;
        x = sc.nextDouble();
        bee1178(x);
    }

    public static void bee1178(double x){
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
    }
}