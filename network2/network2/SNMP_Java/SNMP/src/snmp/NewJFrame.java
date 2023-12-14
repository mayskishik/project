/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snmp;

import java.net.*;
import java.io.*;
//import static jdk.nashorn.internal.objects.NativeString.trim;
/**
 *
 * @author Dr. Raed Alqadi
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        addURLsToCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        information = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        list = new javax.swing.JComboBox<>();
        selectURL = new javax.swing.JButton();
        url = new javax.swing.JTextField();
        send_post = new javax.swing.JButton();
        contact = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("List : ");
        jLabel1.setPreferredSize(new java.awt.Dimension(23, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 20));

        information.setColumns(20);
        information.setRows(5);
        jScrollPane1.setViewportView(information);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 750, 350));

        jButton1.setText("Send (GET)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 120, 60));

        list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "http://localhost/networking2/page1.php" }));
        list.setToolTipText("");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        getContentPane().add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 350, 30));

        selectURL.setText("Select URL");
        selectURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectURLActionPerformed(evt);
            }
        });
        getContentPane().add(selectURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 130, 60));

        url.setPreferredSize(new java.awt.Dimension(60, 20));
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2, 350, 30));

        send_post.setText("Send Post (Edit)");
        send_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_postActionPerformed(evt);
            }
        });
        getContentPane().add(send_post, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, 40));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 178, 30));
        getContentPane().add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 178, 30));

        jLabel2.setText("Conntact :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 71, 20));

        jLabel3.setText("Location :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 71, 20));

        jLabel5.setText("URL :");
        jLabel5.setPreferredSize(new java.awt.Dimension(23, 20));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 860, 10));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 178, 30));

        jLabel4.setText("name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 71, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    String[] strURLs = {
        
        "http://localhost/network2/functions/p1.php?api=1",
        "http://localhost/network2/functions/p2.php?api=1",
        "http://localhost/network2/functions/p3.php?api=1",
        "http://localhost/network2/functions/p4.php?api=1",
        
    };
    void addURLsToCombo(){
        
        int i =0;
        this.list.removeAllItems();
        for (i =0; i <strURLs.length; i++){
            this.list.addItem(strURLs[i]);
        }
        this.list.setSelectedIndex(0);
        String str = (String) this.list.getSelectedItem();
        this.url.setText(str);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: GET
        sendData_GET();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listActionPerformed

    private void selectURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectURLActionPerformed
        // TODO add your handling code here:
        String str = (String)this.list.getSelectedItem();
        this.url.setText(str);
    }//GEN-LAST:event_selectURLActionPerformed

    private void send_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_postActionPerformed
        // TODO add your handling code here:
    String conn = this.contact.getText().toString();
    String loc = this.location.getText().toString();
    String nam = this.name.getText().toString();
    addParameter( conn,loc ,nam);
    
        try {
    // open a connection to the site
    URL url = new URL("http://localhost/network2/functions/p1.php");
    URLConnection con = url.openConnection();
    // activate the output
    con.setDoOutput(true);
    PrintStream ps = new PrintStream(con.getOutputStream());
    // send your parameters to your site
    ps.print("contact="+conn);
    ps.print("&location="+loc);
    ps.print("&name="+nam);
 
    // we have to get the input stream in order to actually send the request
    con.getInputStream();
 
    // close the print stream
    ps.close();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
        
        
    }//GEN-LAST:event_send_postActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed
  
    String dataStr = "";
   
    String contentStr = "application/x-www-form-urlencoded";

    public void addParameter(String ps, String vs,String n) {
        if (ps == null || vs == null || n == null|| ps.length() == 0 || vs.length() == 0 || n.length() == 0) {
            return;
        }
        if (dataStr.length() > 0) {
            dataStr += "&";
        }
        try {
            dataStr += ps + "=" + URLEncoder.encode(vs, "ASCII");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    void sendData_POST() {
        dataStr = "data";
        OutputStream os;
        InputStream is;
     
      
        String urlStr = this.url.getText();
        try {
            URL myURL = new URL(urlStr);
            URLConnection myConn = myURL.openConnection();
            myConn.setDoOutput(true);
            myConn.setDoInput(true);
            myConn.setRequestProperty("Content-Type", contentStr);
            myConn.setUseCaches(false);
            //dataStr = "T1=67&T2=88";

            BufferedOutputStream out = new BufferedOutputStream(myConn.getOutputStream());
            out.write(dataStr.getBytes());//"ACTION=add&NUMPTS=2&DATA=L0001\nL0002");
            out.close();

            //out.close();
            String SS = "";
            int b = -1;

            String t = "";
            is = myConn.getInputStream();
            while ((b = is.read()) != -1) {
                if ((char) b == '\r') {
                    SS += "\n";
                } else {
                    SS = SS + (char) b;
                };
            }
            // this.jTextField1.setText(SS);
            this.information.setText(SS);
        } catch (Exception e) {
            System.out.println(e.toString());
          
        }

    }
    int kkk =1;
    void sendData_GET() {
        DataInputStream dis;
      
        try {
           
            String str = this.url.getText() ;
            URL u = new URL(str);
           

            dis = new DataInputStream(u.openConnection().getInputStream());
            
            int b;
            String t = "";
            String SS = "";

            URLConnection myConn = u.openConnection();
            InputStream is = myConn.getInputStream();
            
            while ((b = is.read()) != -1) {
                if ((char) b == '\r') {
                    SS += "\n";
                } else {
                    SS = SS + (char) b;
                };

            }
            this.information.setText(SS);
            //  this.jTextArea1.setText(trim(SS));

        } catch (Exception e) {
            System.out.println(e.toString());
            this.information.setText("Faild: exception");
        }

    }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JTextArea information;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> list;
    private javax.swing.JTextField location;
    private javax.swing.JTextField name;
    private javax.swing.JButton selectURL;
    private javax.swing.JButton send_post;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}