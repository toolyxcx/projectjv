package Retos;
import java.util.Scanner;

public class Reto2Dosis {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        double meses,peso,formula;

        System.out.println("ingrese la edad de su bebé en meses");
        meses=leer.nextDouble();

        System.out.println("ingrese el peso de su bebé en kg");
        peso=leer.nextDouble();
        formula=(peso+10/meses*10)*8;
        System.out.println("la dosis que debe aplicar es \n"+formula);
        
        leer.close();








    }
}
