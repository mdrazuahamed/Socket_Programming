package org.example;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",9999);
        String str = "Razu Ahamed";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        // OutputStreamWriter convert data in stream format
        // s.getOutputStream() where to send the data, it's output port of the data
        PrintWriter out = new PrintWriter(os);
        os.write(str);
        os.flush(); // queue is full so flushing
    }
}
