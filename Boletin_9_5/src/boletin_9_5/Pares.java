package boletin_9_5;

public class Pares {
    
    private int tamaño;
    
    private int pares(int n){
        return n * 2;
    }
    
    public Pares(){
    }
    
    public Pares(int tamaño){
        this.tamaño = tamaño;
    }
    
    public void getSerie(){
        System.out.print("[*]\t[");
        for(int i = 1 ; i < tamaño; i ++){
            System.out.print(pares(i) + ", ");
        }
        System.out.println("]");
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    
}
