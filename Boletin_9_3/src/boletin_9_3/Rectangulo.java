package boletin_9_3;

public class Rectangulo {
    private double base,altura;
    
    public Rectangulo(){
    }
    
    public Rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularArea(double base,double altura){
        return base * altura;
    }
     
}
