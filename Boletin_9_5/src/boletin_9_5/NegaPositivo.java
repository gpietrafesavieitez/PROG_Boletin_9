package boletin_9_5;

public class NegaPositivo{
    
    private int tamaño;
    
    private int negaPositivo(int n){
        if(n % 2 != 0){
            n = -n;
        }
        return n;
    }
    
    public NegaPositivo(){
    }
    
    public NegaPositivo(int tamaño){
        this.tamaño = tamaño;
    }
    
    public void getSerie(){
        System.out.print("[*]\t[");
        for(int i = 1 ; i < tamaño; i ++){
            System.out.print(negaPositivo(i) + ", ");
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
