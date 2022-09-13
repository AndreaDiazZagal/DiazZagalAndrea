package Ejer2.server;

public class Methods {
    public String addition ( double num1,double num2,double num3,double num4){
        double suma = (num1+num2+num3+num4);
        double producto =(num1*num2*num3*num4);
        double promedio =(suma)/(4);
        return "Hola el producto es: "+producto+" , la suma es:"+suma+" y el promedio es: "+promedio;
    }
}