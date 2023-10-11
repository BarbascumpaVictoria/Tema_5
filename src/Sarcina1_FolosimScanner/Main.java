package Sarcina1_FolosimScanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pozitiv = 0;
        int negativ =  0;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int g = scanner.nextInt();
            if (g ==0){
                System.out.println("Exit");
                break;
            }
            if (g>0){
                pozitiv++;
                System.out.println("Numarul introdus la consola este:" + g+ " si este pozitiv");
            }
            else {
                negativ++;
                System.out.println("Numarul introdus la consola este:" + g+ " si este negativ");
            }
            suma = suma +g;
        }
        System.out.println("Suma este:" + suma);
        System.out.println("Numere pozitive sint:" + pozitiv);
        System.out.println("Numere negative sint:" + negativ);
    }
}