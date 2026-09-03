import java.sql.SQLOutput;
import  java.util.Scanner;

public class Main {
public static void main(String args[]) {
    Scanner act = new Scanner(System.in);

    TV tv1 = new TV();
    int op;


    do {
        System.out.println("===== TV interfaz =====\n" +
                "1. Turn on\n" +
                "2. Turn off\n" +
                "3. setChannel\n" +
                "4. channelUp\n" +
                "5. channelDown\n" +
                "6. volumeUp\n" +
                "7. volumeDown\n");
        op = act.nextInt();
        switch (op) {
            case 1:
                tv1.turnon();
                break;
            case 2:
                tv1.turnoff();
                break;
            case 3:
                System.out.println("Ingresa el canal");
                int channel = act.nextInt();
                tv1.setChannel(channel);
                break;
            case 4:
                tv1.channelUp();
                break;
            case 5:
                tv1.channelDown();
                break;
            case 6:
                tv1.volumenUp();
                break;
            case 7:
                tv1.volumenDown();
                break;
            default:
                System.out.println("Coincidencia no encontrada");
        }

    }while (op != 0);
    System.out.println("Saliendo...");
    }
}