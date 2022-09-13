package Ejer4.server;


import java.util.Arrays;

public class Methods {
    public String addition(int num1, int num2, int num3, int num4, int num5) {
        int resul[] = {num1, num2, num3, num4, num5};
        Arrays.sort(resul);
        for (int i = 0; i < resul.length; i++){
            System.out.println("" + resul[i]);
            return "forma ascendente"+resul[0]+ ", "+resul[1]+ ", "+resul[2]+ ", "+resul[3]+ ", "+resul[4]+ ", ";
        }
        return null;
    }
}
