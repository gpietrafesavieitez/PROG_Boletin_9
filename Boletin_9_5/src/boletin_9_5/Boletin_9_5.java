package boletin_9_5;
import java.util.Scanner;

public class Boletin_9_5{
    private static Scanner leer = new Scanner(System.in);
    private static Pares seriePares = new Pares();
    private static NegaPositivo serieNegaPositivo = new NegaPositivo();
    private static Fibonacci serieFibonacci = new Fibonacci();
    
    public static void main(String[] args){
        int teclado;
        boolean esc;
        try{
            System.out.print("[-]\tBienvenido a la Calculadora de Sucesiones y Series.\n\tPorfavor, introduzca el número de elementos a continuación\n\t:");
            teclado = Integer.parseInt(leer.nextLine());
            System.out.println("");
            seriePares.setTamaño(teclado);
            seriePares.getSerie();
            serieNegaPositivo.setTamaño(teclado);
            serieNegaPositivo.getSerie();
            serieFibonacci.setTamaño(teclado);
            serieFibonacci.getSerie();
            esc = true;
        }catch(NumberFormatException e){
            System.out.println("\n[!] Formato incorrecto.");
            esc = false;
        }
    }
}
