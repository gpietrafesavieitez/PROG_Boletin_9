package boletin_9_4;
import java.util.Scanner;

public class Boletin_9_4{
    private static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args){
        int num = 0;
        System.out.println("\n[*] Tabla de multiplicaciones.");
        do{
            try{
                System.out.print("\n[-] Introduzca un número (0 para salir): ");
                num = Integer.parseInt(leer.nextLine());
                switch(num){
                    case 0: System.out.println("\n[*] Hasta luego! :)"); break;
                    default: 
                        for(int i = 0; i < 11; i ++){
                            System.out.println("\t- "+num+" x "+i+" = "+ num*i +"");
                        }
                }
            }catch(NumberFormatException e){
                System.out.println("\n[!] Formato incorrecto.");
            }
        }while(num != 0);
    }
}