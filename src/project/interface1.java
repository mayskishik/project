/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author msys
 */
public class interface1 extends javax.swing.JFrame {

    /**
     * Creates new form interface1
     */
    public interface1() {
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

        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        welcome2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        signIn = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Welcome to the ");
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        welcome2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        welcome2.setForeground(new java.awt.Color(255, 255, 255));
        welcome2.setText("Disability Department ");
        jPanel1.add(welcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        signIn.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        signIn.setForeground(new java.awt.Color(51, 0, 51));
        signIn.setText("Sign In");
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jPanel1.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 270, 30));

        signUp.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        signUp.setForeground(new java.awt.Color(51, 0, 51));
        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 270, 30));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\msys\\Desktop\\project\\src\\project\\interface1.jpg")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 680, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
        interface6 jf = new interface6();
        jf.show();
        dispose();
    }//GEN-LAST:event_signInActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
        interface2 jf = new interface2();
        jf.show();
        dispose();

    }//GEN-LAST:event_signUpActionPerformed

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
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signIn;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel welcome2;
    // End of variables declaration//GEN-END:variables
}
