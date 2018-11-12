package boletin_9_6;

public class Trabajador{
    private double sueldo;
    
    public Trabajador(){
    }
    
    public Trabajador(double sueldo){
        this.sueldo = sueldo;
    }
    
    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
}
