package Retos;
import java.util.Scanner;

public class Reto6Noe {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int  ball;
        ball=(int)(Math.random()*4 +1);
        double valor,total;
        

        System.out.println("ingrese el valor de su compra");
        valor=leer.nextDouble();

        if(ball==1 && valor>=50000){
            total=valor*0.10;
            System.out.println("felicidades ha ganado el 10% de descuento su valor a pagar es \n"+total);

        }
        else if(ball==2 && valor>=50000.00){
            total=valor*0.30;
            System.out.println("felicidades ha ganado el 30% de desuento su valor a pagar es \n"+total);
            

        }
        else if(ball==3 && valor>=50000){
            total=valor*0.50;
            System.out.println("felicidades ha ganado el 50% de descuento su valor a pagar es \n"+total);
        }
        else if(ball==4 && valor>=50000){
            System.out.println("felicidades tu compra es totalmente gratis");
        }
        else if(valor<50000){
            System.out.println("su valor es menor a 50000, no obtiene descuento");
        }

        leer.close();
    }
}
