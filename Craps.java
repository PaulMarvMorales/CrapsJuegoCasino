import java.util.Random;
import java.util.Scanner;

public class Craps {
    private Scanner read = new Scanner(System.in);
    private boolean game = false;
    private int suma;
    private int punto;
    private Random tirar = new Random();
    private int aleatorio;

    public Craps() {

    }

    public void pausa() {
        System.out.println("Tirar dados: (presiona enter)");
        read.nextLine();
    }

    public int tirarDados() {
        punto = 0;
        suma = 0;
        for (int i = 0; i < 2; i++) {
            aleatorio = tirar.nextInt(6) + 1;
            System.out.printf("Dado %d: %d\n", (i + 1), aleatorio);
            suma += aleatorio;
        }
        System.out.printf("la suma es: %d\n", suma);
        punto = suma;
        return punto;
    }

    public void crapsPunto(int punto) {
        
            switch (punto) {

                case 2:
                    System.out.println("Has Perdido!!");
                    game = true;
                    break;
                case 3:
                    System.out.println("Has Perdido!!");
                    game = true;
                    break;
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:

                    //pausa();
                    //tirarDados();
                    metodoPunto(punto);
                    game = true;

                    break;
                case 7:
                    System.out.println("Has ganado!!");
                    game = true;
                    break;
                case 12:
                    System.out.println("Has ganado!!");
                    game = true;
                    break;

                default:
                    break;
            }
        
    }

    public void metodoPunto(int punto) {
        boolean juego = false;
        while (!juego) {
            pausa();
            int puntoA = tirarDados();
            if (puntoA == punto) {
                System.out.println("Has ganado!!");
                juego = true;
            }
            if (puntoA == 7) {
                    System.out.println("Has Perdido!!");
                    juego = true;
            }
                
            

        }
    }

    public void gamePlay() {
        while (!game) {
            pausa();
            punto = tirarDados();
            crapsPunto(punto);

        }
    }

}