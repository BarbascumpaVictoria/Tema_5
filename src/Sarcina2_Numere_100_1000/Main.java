package Sarcina2_Numere_100_1000;

public class Main {
    public static void main(String[] args) {
        int CONTOR = 0;
        int i = 100;
        while(i <= 1000) {
            i++;
            if (( i%5 == 0)||(i%6 == 0)){
                System.out.print(i + " ");
                 CONTOR++;
                  if(CONTOR%10 == 0){
                      System.out.println();
                  }
                }
            }
        }
        }

