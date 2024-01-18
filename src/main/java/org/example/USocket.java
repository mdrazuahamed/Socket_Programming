package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class USocket {
    public static void main(String[] args) throws UnknownHostException, IOException{
        Socket sock = new Socket("localhost",4800);
        DataInputStream in = new DataInputStream(sock.getInputStream());
        DataOutputStream out = new DataOutputStream(sock.getOutputStream());
        out.writeDouble(5);
        //System.out.println(in.readChar());
    }
}
