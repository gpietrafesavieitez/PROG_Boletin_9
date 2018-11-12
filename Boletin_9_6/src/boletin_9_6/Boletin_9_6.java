package boletin_9_6;
import java.util.Scanner;

public class Boletin_9_6{
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args){
        int porcentaje = 0;
        int cantidad = 0;

        Trabajador worker = new Trabajador("prueba",1); //De momento sueldo debe ser 1 para que no salga del bucle al inicio
        
        do{
            try{
                System.out.print("Introduzca sueldo del trabajador (0 para finalizar)\n:");
                worker.setSueldo(Double.parseDouble(leer.nextLine()));
                
                if(worker.getSueldo() < 0){
                    System.out.println("[!] Valor incorrecto: Debe ser un número positivo.");
                }else if(worker.getSueldo() > 0 && worker.getSueldo() < 1000){
                    porcentaje++;
                }else if(worker.getSueldo() >= 1000 && worker.getSueldo() <= 1750){
                    cantidad++;
                }
                
            }catch(NumberFormatException e){
                System.out.println("[!] Formato incorrecto: Debe ser un número.");
            }

        }while(worker.getSueldo() != 0);

        System.out.println("Cantidad de trabajadores con sueldo menor a 1000: " + porcentaje);
        System.out.println("Cantidad de trabajadores con sueldo entre 1000 y 1750: " + cantidad);
        
        
    }
    
}
