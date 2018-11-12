package boletin_9_6;
import java.util.Scanner;

public class Boletin_9_6{
    private static Scanner leer = new Scanner(System.in);
    private static Trabajador worker = new Trabajador(1);//Para que no salga del bucle si se produce una excepcion nada mas empezar
    
    public static void main(String[] args){
        double cantPobres = 0,cantRicos = 0;
        do{
            try{
                System.out.print("\n[-]\tIntroduzca el sueldo (€) de un trabajador (0 para finalizar)\n\t:");
                worker.setSueldo(Double.parseDouble(leer.nextLine()));
                if(worker.getSueldo() < 0){
                    System.out.println("\n[!]\tValor incorrecto: Debe ser un número positivo.");
                }else if(worker.getSueldo() > 0 && worker.getSueldo() < 1000){
                    cantPobres++;
                }else if(worker.getSueldo() >= 1000 && worker.getSueldo() <= 1750){
                    cantRicos++;
                }
            }catch(NumberFormatException e){
                System.out.println("\n[!]\tFormato incorrecto: Debe ser un número.");
            }
        }while(worker.getSueldo() != 0);
        System.out.println("\n[*]\tCantidad de trabajadores con sueldo entre 1000€ y 1750€: " + (int) cantRicos + "\n\tPorcentaje de trabajadores con sueldo menor a 1000€: " + (cantPobres / (cantPobres + cantRicos) * 100) + "%");
    }
}