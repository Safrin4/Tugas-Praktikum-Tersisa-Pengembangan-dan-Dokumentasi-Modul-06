/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class No04_TcpServer extends Thread{
    public static final int SERVICE_PORT = 13;
    
    public void serviceClients() throws IOException, ClassNotFoundException{
        ServerSocket server = new ServerSocket(SERVICE_PORT);
        System.out.println("Service started");
        try {
            for (;;) {
                Socket nextClient = server.accept();
                System.out.println("Client connect : " + nextClient.getInetAddress() + " - on port " + nextClient.getPort());
                
                OutputStream os = nextClient.getOutputStream();
                PrintStream ps = new PrintStream(os);
                ps.println("Selamat Datang, Anda pengunjung ke-"+nextClient);
                    
                os.flush();
                os.close();
                nextClient.close();
            }
            
        }catch(BindException be){
            System.err.println("Service already running on port "+SERVICE_PORT);
            System.out.println("Error: "+be);
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        No04_TcpServer server = new No04_TcpServer();
        server.serviceClients();
    }
}

