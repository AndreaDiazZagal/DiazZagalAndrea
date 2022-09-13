package client;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner teclado = new Scanner( System.in );
        int num1, num2,  num3, num4, num5  ;
        System.out.print("Introduzca un número1: ");
        num1=teclado.nextInt();
        System.out.print("Introduzca un número2: ");
        num2=teclado.nextInt();
        System.out.print("Introduzca un número3: ");
        num3=teclado.nextInt();
        System.out.print("Introduzca un número4: ");
        num4=teclado.nextInt();
        System.out.print("Introduzca un número5: ");
        num5=teclado.nextInt();
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Object[] data = {num1, num2,  num3, num4, num5 };
        String response = (String) client.execute("Methods.addition", data);
        System.out.println( response);
    }
}
