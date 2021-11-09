
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Authors: Aaron, Aaron, John, Jordan 
 *  Student IDs: x19404024, x19435964, x19141301, x19765711 
 *  Created On: 10/11/2021
 *  Last Modified: 10/11/2021
 *  Description: Create an application that monitors packets 
 *  sent across 2 machines and intercepts the contents. 
 *  Using cryptography, we can encrypt the packets sent across the network, 
 *  making them unviewable outside peer-to-peer.
 */
public class PacketSniffer extends javax.swing.JFrame {

    /**
     * Creates new form PacketSnifferGUI
     */
    
    // Variables
    private String fileAddress; //
    private String command;
    private String ipAddress;
    private boolean encryption;
    
    public PacketSniffer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encryptionGrp = new javax.swing.ButtonGroup();
        commandTf = new javax.swing.JTextField();
        headLbl = new javax.swing.JLabel();
        commandLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        addressTf = new javax.swing.JTextField();
        wireSharkLbl = new javax.swing.JLabel();
        wireSharkTf = new javax.swing.JTextField();
        nEncryptionBtn = new javax.swing.JRadioButton();
        yEncryptionBtn = new javax.swing.JRadioButton();
        encryptionLbl = new javax.swing.JLabel();
        eCommandLbl = new javax.swing.JLabel();
        eCommandBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommandInputTa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommandOutputTa = new javax.swing.JTextArea();
        commandInputLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        commandOutputLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        commandTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commandTfActionPerformed(evt);
            }
        });

        headLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        headLbl.setText("Packet Sniffer");

        commandLbl.setText("Command:");

        addressLbl.setText("Ip4 Address:");

        addressTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTfActionPerformed(evt);
            }
        });

        wireSharkLbl.setText("WireShark File Path:");

        wireSharkTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wireSharkTfActionPerformed(evt);
            }
        });

        encryptionGrp.add(nEncryptionBtn);
        nEncryptionBtn.setText("No");
        nEncryptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nEncryptionBtnActionPerformed(evt);
            }
        });

        encryptionGrp.add(yEncryptionBtn);
        yEncryptionBtn.setText("Yes");

        encryptionLbl.setText("Encryption:");

        eCommandLbl.setText("Execute Command");

        eCommandBtn.setText("Yes");
        eCommandBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eCommandBtnActionPerformed(evt);
            }
        });

        CommandInputTa.setColumns(20);
        CommandInputTa.setRows(5);
        jScrollPane1.setViewportView(CommandInputTa);

        CommandOutputTa.setColumns(20);
        CommandOutputTa.setRows(5);
        jScrollPane2.setViewportView(CommandOutputTa);

        commandInputLbl.setText("Command Line input");

        commandOutputLbl.setText("Command line output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(commandInputLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(commandOutputLbl)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wireSharkLbl)
                                    .addComponent(wireSharkTf, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(commandLbl)
                                            .addComponent(commandTf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addressLbl)
                                            .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42)
                                        .addComponent(encryptionLbl))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(yEncryptionBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nEncryptionBtn)))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(eCommandBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(eCommandLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(headLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(commandLbl)
                            .addComponent(addressLbl)
                            .addComponent(encryptionLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(commandTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yEncryptionBtn)
                            .addComponent(nEncryptionBtn))
                        .addGap(26, 26, 26)
                        .addComponent(wireSharkLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wireSharkTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(eCommandLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eCommandBtn)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commandInputLbl)
                    .addComponent(commandOutputLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTfActionPerformed

    private void wireSharkTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wireSharkTfActionPerformed
        // TODO add your handling code here:
        /*
        The user types in the file address of wireshark.exe that is installed on his machine.
        Once typed in, it will take the form of a string variable and be executed
        */
        try {
            
           
         
            
            Process p = Runtime.getRuntime().exec(
                    "\"c:/program files/Wireshark/Wireshark.exe\"");    
            p.waitFor();
            
        } catch (IOException ex) {
            Logger.getLogger(PacketSniffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            
            Logger.getLogger(PacketSniffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_wireSharkTfActionPerformed

    private void commandTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandTfActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_commandTfActionPerformed

    private void nEncryptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nEncryptionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nEncryptionBtnActionPerformed

    private void eCommandBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eCommandBtnActionPerformed
        
        
            // TODO add your handling code here:
            /*
            The action button will trigger the main program
            Step 1) Take the input from the user and directions on whether to encrypt or not.
            Step 2) The application will ping (or send packets in a differnt way) to another address
            Step 3) The command line input will be displayed, as will the output
            Step 4) Wireshark will open on the user's side automatically and instructions
            will be given on how proceed
            Step 5) Whether the user decided to encrypt or not will be shown when the user sniffs
            the packets in wireshark
            Step 6) Whether the cryptographic method is successful or not will be seen here
            */
    
         
            
        /*  
        This block of code will turn on wireshark for the user 
        In the event that it's feasible, we will automate this process so the
        user doesn't have to interact with wireshark at all. If not, we display instructions on what to do
        (filter by ICMP etc.)
        */
        addressTf.setText(fileAddress); // set String fileAddress to what the user entered in addressTf
            
        try {
            Runtime.getRuntime().exec(fileAddress);
        } catch (IOException ex) {
            Logger.getLogger(PacketSniffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Above code is incomplete
        
        /*
        This block of code pings the address the user has given and will display
        both the command line input (e.g ping 194.024.214) and the output (e.g ping statistics)
        in their respective text area
        */
        
        
        
        
        
        
        /* 
        This block of code will use a cryptographic algorithm 
        to hide the user's IP, revealing information that can be 
        gotten from the ping's content and others
        */
        
 
        
        
        
    }//GEN-LAST:event_eCommandBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PacketSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacketSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacketSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacketSniffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacketSniffer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommandInputTa;
    private javax.swing.JTextArea CommandOutputTa;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTf;
    private javax.swing.JLabel commandInputLbl;
    private javax.swing.JLabel commandLbl;
    private javax.swing.JLabel commandOutputLbl;
    private javax.swing.JTextField commandTf;
    private javax.swing.JButton eCommandBtn;
    private javax.swing.JLabel eCommandLbl;
    private javax.swing.ButtonGroup encryptionGrp;
    private javax.swing.JLabel encryptionLbl;
    private javax.swing.JLabel headLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton nEncryptionBtn;
    private javax.swing.JLabel wireSharkLbl;
    private javax.swing.JTextField wireSharkTf;
    private javax.swing.JRadioButton yEncryptionBtn;
    // End of variables declaration//GEN-END:variables
}
