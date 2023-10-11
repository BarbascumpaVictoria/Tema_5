package Sarcina3_SumeazaSerii;
public class Main {
    public static void main(String[] args) {
        float i = 1F;
        float a = 3F;
        System.out.println(i);
        System.out.println(a);
        float fractie = i/a;
        System.out.println(fractie);
        while (a <=97 && i <=95) {
            i=i+2;
            a=a+2;
            System.out.println(i);
            System.out.println(a);
            fractie = fractie +i/a;
           System.out.println("Suma partiala este :"+ fractie);
        }
           System.out.println("Suma totala este :"+ fractie);
    }
}





