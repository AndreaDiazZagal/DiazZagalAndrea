package Ejer2.client;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        //Díaz Zagal Andrea 4°A
        Scanner teclado = new Scanner(System.in);
        double num1, num2,num3, num4;
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.println("Ingresar un numero:");
        num1=teclado.nextDouble();
        System.out.println("Ingresar un numero:");
        num2=teclado.nextDouble();
        System.out.println("Ingresar un numero:");
        num3=teclado.nextDouble();
        System.out.println("Ingresar un numero:");
        num4=teclado.nextDouble();
        Object[] data = {num1, num2, num3, num4};
        String response = (String) client.execute("Methods.addition", data);
        System.out.println( response);
    }
}
