package Ejer3.server;

public class Methods {
    public String addition ( int num1,int num2){
        double suma = 0.0;
        for (int i=num1+1; i<num2; i++){
            suma += i;
        }
        return "Hola la suma de los numeros que se encuentran entre el numero: "+num1+" , y :"+num2+" es: "+suma;
    }
}