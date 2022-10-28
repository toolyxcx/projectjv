package Retos;
import java.util.Random;

public class Reto5Tijeras {
    public static void main(String[] args) {
        Random op1 = new Random();
        int hand1 = op1.nextInt(2);
        Random op2 = new Random();
        int hand2 = op2.nextInt(2);

        if (hand1 == 0 && hand2 == 1) {
            System.out.println("sacaste piedra y el jugador 2 papel, perdiste!");
        } else if (hand1 == 1 && hand2 == 0) {
            System.out.println("sacaste papel y el jugador 2 piedra, ganaste!");
        } else if (hand1 == 0 && hand2 == 2) {
            System.out.println("sacaste piedra y el jugador 2 tijeras, ganaste!");
        } else if (hand1 == 2 && hand2 == 0) {
            System.out.println("sacaste tijeras y el jugador 2 piedra, perdiste!");
        } else if (hand1 == 1 && hand2 == 2) {
            System.out.println("sacaste papel y el jugador 2 tijeras, perdiste!");
        } else if (hand1 == 2 && hand2 == 1) {
            System.out.println("sacaste tijera y el jugador 2 papel, ganaste!");
        } else if (hand1 == 0 && hand2 == 0 || hand1 == 1 && hand2 == 1 || hand1 == 2 && hand2 == 2) {
            System.out.println("empate!");
        }

    }
}
