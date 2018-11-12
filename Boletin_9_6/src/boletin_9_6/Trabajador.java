package boletin_9_6;

public class Trabajador{
    private String iden;
    private double sueldo;
    
    public Trabajador(){
    }
    
    public Trabajador(String iden,double sueldo){
        this.iden = iden;
        this.sueldo = sueldo;
    }
    
    public String getIden(){
        return iden;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setIden(String iden){
        this.iden = iden;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
   
}
