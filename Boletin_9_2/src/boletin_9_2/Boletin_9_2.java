package boletin_9_2;

public class Boletin_9_2{

    public static void main(String[] args){
        int sumNumeros = 0;
        int prodNumeros = 1;
        for(int i = 10; i < 90; i++){
            sumNumeros += i;
            prodNumeros = prodNumeros * i;
        }
        System.out.println("[*] El sumatorio de todos los números comprendidos entre 10 y 90 es: " + sumNumeros);
        System.out.println("[*] El producto total de todos los números comprendidos entre 10 y 90 es: " + prodNumeros); //Desbordamiento de memoria
    }
    
}
