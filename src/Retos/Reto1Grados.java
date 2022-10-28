package Retos;
import java.util.Scanner;

public class Reto1Grados {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double celsious,farenheit;
        System.out.println("ingrese grados farenheit");
        farenheit=leer.nextDouble();
        celsious=(farenheit-32)/1.8;
        System.out.println("los grados farenheit pasaron "+farenheit+" a "+celsious);
        leer.close();
        




    }
}
