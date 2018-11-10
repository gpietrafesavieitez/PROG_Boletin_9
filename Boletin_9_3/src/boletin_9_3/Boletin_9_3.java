package boletin_9_3;

import java.util.Scanner;

public class Boletin_9_3{
    public static Scanner leer = new Scanner(System.in);
    public static Rectangulo rectangulo = new Rectangulo();
    
    public static void main(String[] args){
        boolean esc;
        double base,altura;
        do{
            try{
                do{
                    System.out.print("[-] Introduce la base: ");
                    base = Double.parseDouble(leer.nextLine());
                    System.out.print("[-] Introduce la altura: ");
                    altura = Double.parseDouble(leer.nextLine());
                }while(base < 0 || altura < 0);
                System.out.println("[*] El área del rectángulo es de " + rectangulo.calcularArea(base,altura) + " unidades.");
                esc = true;
            }catch(Exception e){
                System.out.println("[!] Formato incorrecto.");
                esc = false;
            }
        }while(esc != true);
    }
    
}
