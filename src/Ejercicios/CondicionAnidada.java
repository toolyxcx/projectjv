package Ejercicios;
import java.util.Scanner;

public class CondicionAnidada {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        
        int num;
        System.out.println("ingrese el numero");
        num=leer.nextInt();

        if(num<0){
            System.out.println("el numero es negativo");
        }
        else if(num==0){
            System.out.println("el numero es neutro");
        }
        else if(num>0){
            System.out.println("el numero es positivo");
        }
        else{
            System.out.println("dato incorrecto");
        }

        leer.close();





    }
}
