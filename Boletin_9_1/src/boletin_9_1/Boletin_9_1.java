package boletin_9_1;
import java.util.Scanner;

public class Boletin_9_1{
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args){
        boolean esc;
        byte sumNegativos,sumPositivos,sumCeros;
        sumNegativos = sumPositivos = sumCeros = 0;
        for(byte i=0; i<10; i++){
            do{
                try{
                    System.out.print("[-] Dame número "+ (i+1) +": ");
                    double num = Double.parseDouble(leer.nextLine());
                    if(num > 0){
                        sumPositivos++;
                    }else if(num == 0){
                        sumCeros++;
                    }else{
                        sumNegativos++;
                    }
                    esc = true;
                }catch(NumberFormatException e){
                    System.out.println("[!] Formato incorrecto.");
                    esc = false;
                }
            }while(esc != true);
        }
        System.out.println("\n[*] Recuento:\n"
                + "\t- Números negativos: "+sumNegativos+" \n"
                + "\t- Números positivos: "+sumPositivos+" \n"
                + "\t- Números igual a 0: "+sumCeros+"     \n");
    }
    
}
