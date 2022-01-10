

import com.sun.jdi.event.MethodExitEvent;

import javax.swing.*;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

    public static void main(String[] args) {
       try{
           ServerSocket ss=new ServerSocket(6666);
           Socket s=ss.accept();
           DataInputStream dis=new DataInputStream(s.getInputStream());
           String str=(String)dis.readUTF();
           System.out.println("Client says "+ str);
           ss.close();

       }
       catch(Exception e){
           System.out.println(e);

        }
    }
}
