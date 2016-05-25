
package client1;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Client1 {


    private BufferedReader Bufread;
    
    private PrintWriter prntwrite;
    
    private JFrame jframe = new JFrame("CLIENT");
    
    private JTextField textField = new JTextField( 20);
    
    private JTextArea textArea = new JTextArea(20,30 );
    
    private JButton btn= new JButton("Send");
    
    Container cont=jframe.getContentPane();
    
    JPanel panel= new JPanel();
    
    
    
    public Client1() {

   
         
         panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.setLayout(new FlowLayout());
        
        btn.setSize(50, 50);
        textArea.setEditable(false);
        
       
       
        panel.add(textField);
        panel.add(btn);
        panel.add(new JScrollPane(textArea));
       
        
         cont.add(panel,BorderLayout.CENTER);

   
        btn.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               prntwrite.println(textField.getText());
                   String response;
                try {
                    response = Bufread.readLine();
                    if (response == null || response.equals("")) {
                          System.exit(0);
                      }
                } catch (Exception ex) {
                       response = "Error: " + ex;
                }
                textArea.append(response + "\n");
                textField.selectAll();
            }
        });
    }
    
    
    public void connectToServer() throws IOException {

   
       Socket socket = new Socket("localhost", 5078);
       Bufread= new BufferedReader( new InputStreamReader(socket.getInputStream()));
       prntwrite = new PrintWriter(socket.getOutputStream(), true);
       for (int count = 0; count < 1; count++) {
           textArea.append(Bufread.readLine() + "\n");
       }
        
    }
    
    
    
    
    
    
    public static void main(String[] args)throws Exception {
        
        
        
        Client1 client = new Client1();
        client.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.jframe.pack();
        client.jframe.setVisible(true);
        client.connectToServer();
    }
    
}
