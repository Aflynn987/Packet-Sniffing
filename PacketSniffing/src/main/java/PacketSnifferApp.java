
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class PacketSnifferApp {
    public static void main(String args[]){
        
        PacketSnifferGUI myGUI = new PacketSnifferGUI();
        myGUI.setVisible(true);
        
        
        
        
        
        
        /*
        try {
            Process p = Runtime.getRuntime().exec(
                    "\"c:/program files/Wireshark/Wireshark.exe\"");    
            p.waitFor();
        } catch (IOException ex) {
            system.out.println("Error");
        }
        */
        
        // ^ sample code for GUI, user will need to enter in the file path for wireshark
    
    }
}
