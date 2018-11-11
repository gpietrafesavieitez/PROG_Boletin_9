package boletin_9_5;

public class Fibonacci{
    
    private int tamaño;
    
    private int fibonacci(int n){
        if(n > 1){
           return fibonacci(n - 1) + fibonacci(n - 2);
        }
        else if (n == 1) {
            return 1;
        }
        else if (n == 0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }

    public Fibonacci(){
    }
    
    public Fibonacci(int tamaño){
        this.tamaño = tamaño;
    }
    
    public void getSerie(){
        System.out.print("[*]\t[");
        for(int i = 0; i < tamaño; i ++){
            System.out.print(fibonacci(i) + ", ");
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
