package org.example;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.io.*;
import java.net.*;
public class GetOutputStream
{
    public static void main(String[] args)
            throws Exception
    {
        // TODO Auto-generated method stub
        int c;
        Socket s = new Socket("whois.internic.net",43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        String str = (args.length == 0 ? "osborne.com" : args[0] ) + "\n";
        byte buf[] = str.getBytes();
        out.write(buf);
        System.out.print("hey baby");
        while ((c=in.read()) != -1)
        {
            System.out.print((char) c);
        }
        s.close();
    }
}