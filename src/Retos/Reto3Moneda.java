package Retos;
import java.util.Random;
import java.util.Scanner;

public class Reto3Moneda {
    public static void main(String[] args){
        Random object=new Random();
        int moneda = object.nextInt(2);
        Scanner leer=new Scanner(System.in);
        int num1=1;
        int num2=2;
        System.out.println("Digite 0 para escoger cara o 1 para sello");
        num1=leer.nextInt();
      
        
        if (moneda==0 && num1==0 || num2==0){
            System.out.println("Salio cara, usted escogio cara, Ganaste!");
        }
        else if(moneda==0 && num1==1 || num2==1){
            System.out.println("Salio cara, usted escogio sello, Perdiste!");
        }
        else if(moneda==1 && num1==1 || num2==1){
            System.out.println("Salio sello, usted escogio sello, Ganaste!");
        }
        else if(moneda==1 && num1==0 || num2==0){
            System.out.println("Salio sello, usted escogio cara, Perdiste!");
        }
        else if(num1!=0 || num1!=1 || num2!=0 && num2!=1){
            System.out.println("Digitaste una opcion incorrecta");
        }
        else{
            System.out.println("dato incorrecto");
        }
        leer.close();


    }
}
