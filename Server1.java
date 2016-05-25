
package server1;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Server1 {
    
    private static JTextArea message = new JTextArea();
    private  static JFrame Frame= new JFrame("SERVER");
    private static JButton btn= new JButton("START");

    
    public static void main(String[] args) {
        message.setEditable(false);
        btn.setSize(50,50);
        Frame.getContentPane().add(btn,"West");
        
        Frame.getContentPane().add(new JScrollPane(message),"Center");
        Frame.setSize(500, 500);
        Frame.setVisible(true);
        message.append("Server has been started successfully"+"\n");
         int num = 1;
       
        ServerSocket srvrSocket = null;
                try {
                    srvrSocket = new ServerSocket(5078);
                } catch (IOException ex) {
                    Logger.getLogger(Server1.class.getName()).log(Level.SEVERE, null, ex);
                }
        try {
            while (true) {
                new MakeCapital(srvrSocket.accept(), num++).start();
            }
        }       catch (IOException ex) {
                    Logger.getLogger(Server1.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
            try {
                srvrSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(Server1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
    }
    private static class MakeCapital extends Thread {
       
        private Socket socket;
        private int clientNumber;
        public MakeCapital(Socket s, int c) {
            socket = s;
            clientNumber =c;
            message.append("Client [ "+clientNumber+" ]"+ " has joined"+"\n");
        }
        public void run() {
            
            try{
                BufferedReader Bufread = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
                PrintWriter Output = new PrintWriter(socket.getOutputStream(), true);

                
               Output.println(" ");
              
                while (true) {
                    String User = Bufread.readLine();
                    if (User == null || User.equals(".")) {
                        break;
                    }
                    Output.println("From Server: "+User.toUpperCase());
                    message.append("Client [ "+clientNumber+" ]"+" said : "+User + "\n");
                }
            } catch (Exception e) {
               
            } finally {
                try {
                    socket.close();
                } catch (Exception e) {
                }
                message.append("Client [ "+clientNumber+" ]"+" has leaved" );
            }
        }
        }

    
}
