package Ejercicios;
import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args){
        try (Scanner leer = new Scanner(System.in)) {
            int edad;
            System.out.println("ingrese su edad");
            edad=leer.nextInt();

            if(edad>=0 ){

                System.out.println("bienvenido");
            }
            else{
                System.out.println("acceso denegado");
            }
        }

        
    }
}
