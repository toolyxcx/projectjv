package Retos;
import java.util.Random;

public class Reto4Dados {
    public static void main(String[] args){
        Random objeto1=new Random();
        int dado1= objeto1.nextInt(5);
        Random objeto2=new Random();
        int dado2= objeto2.nextInt(5);
        

        if(dado1==0 && dado2==0){
            System.out.println("Salio un par de unos en los dados, Ganaste!");
        }
        else if (dado1==0 && dado2==1 || dado2==0 && dado1==1){
            System.out.println("Salio un total de tres en los dados, Ganaste!");
        }
        else if(dado1==4 && dado2==5 || dado1==5 && dado2==4){
            System.out.println("Salio un total de once en los dados, Ganaste!");
        }
        else if(dado1==5 && dado2==5 || dado1==5 && dado2==5){
            System.out.println("Salio un total de doce en los dados, Ganaste!");
        }
        else if (dado1==2 && dado2==5 || dado1==5 && dado2==2){
            System.out.println("Salio un total de nueve en los dados, Perdiste!");
        }
        else if(dado1==1 && dado2==2 || dado1==2 && dado2==1){
            System.out.println("Salio un total de cinco en los dados, Perdiste!");
        }
        else if(dado1==2 && dado2==2 || dado1==2 && dado2==2){
            System.out.println("Salio un total de seis en los dados, Perdiste!");
        }
        else{
            System.out.println("perdiste!");
        }
        

    }
    
}
