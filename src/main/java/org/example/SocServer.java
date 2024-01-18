package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class SocServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Server is started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("Server is waiting for client request");
        Socket s = ss.accept(); /// if server get any client request then it will create socket object

        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println("Client Data: "+str);
    }
}
