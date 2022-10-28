package Ejercicios;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        try (Scanner leer = new Scanner(System.in)) {
            int op, num1,num2;
            
            

            System.out.println("menú opciones \n 1.suma \n 2. resta \n 3. multiplicación \n 4. division \n 5. potenciación \n 6. raiz \n ingrese  el numero de la opcion que desea realizar");
            op=leer.nextInt();

            System.out.println("ingrese el numero 1 ");
            num1=leer.nextInt();

            System.out.println("ingrese el numero 2");
            num2=leer.nextInt();
            

            switch(op){
                case 1:
                    int total=num1+num2;
                    System.out.println("el total es "+total);
                break;
                case 2:
                    total=num1-num2;
                    System.out.println("el total es "+total);
                break;
                case 3:
                    total=num1*num2;
                    System.out.println("el total es "+total);

                break;
                case 4:
                    total=num1/num2;
                    System.out.println("el total es "+total);

                break;
                case 5:
                    total= (int)(Math.pow(num1, num2));
                    System.out.println("el total es "+total);
                break;
                case 6:
                    total = (int)(Math.sqrt(num1) );
                    int total2 = (int)(Math.sqrt(num2));
                    System.out.println("la raiz del primer numero es "+total+" \ny la raiz del segundo numero es "+total2);
                break;

                
            }
        }




    }
    
}
