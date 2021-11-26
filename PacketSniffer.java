
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class PacketSniffer {
     public static void main(String[] args) {
        PacketSniffer rp = new PacketSniffer();
        rp.printIPInfo();
    }
     
     
 
    /**
     * Print complete IP address info using the command ipconfig /all
     */
    void printIPInfo() {                                            // Runs commands on the command line
        Runtime rt = Runtime.getRuntime();
        String[] commandAndArguments = {"ping","192.168.8.101"};    // Command "ping" and the ip address   
        try {
            Process p = rt.exec(commandAndArguments);
            String response = readProcessOutput(p);
            System.out.println(response);                           // Gets the results
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
     
    /**
     * Reads the response from the command. Please note that this works only
     * if the process returns immediately.
     * @param p
     * @return
     * @throws Exception 
     */
    private String readProcessOutput(Process p) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String response = "";
        String line;
        while ((line = reader.readLine()) != null) {
            response += line+"\r\n";
        }
        reader.close();
        return response;
    }
    
    
    
    
    
    
}
