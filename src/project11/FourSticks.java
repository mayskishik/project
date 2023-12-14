/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project11;

import java.awt.List;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JOptionPane;
/**
 *
 * @author marah
 */
class tree {
    int [] data;
    boolean visit;
    ArrayList<tree> children;
    public tree(int [] data) {
        this.data = data.clone();
        this.children = new ArrayList<>();
        this.visit=false;
        
    }
    public tree() {
        this.children = new ArrayList<>();
        this.visit=false;
        
    }
    public void addChild(tree child) {
        this.children.add(child);
    }
}

public class FourSticks extends javax.swing.JFrame {
    private final Random random = new Random();
    boolean flag1 =true;
    boolean flag2 =true;
    boolean flagcomputer =false;
    int clickrow1=0;
    int clickrow2=0;
    ArrayList<String> rowone = new ArrayList<String>();
    ArrayList<String> rowtwo = new ArrayList<String>();
    
    
    /**
     * Creates new form TwentyFiveSticks
     */
    public FourSticks() {
        initComponents();  
        for (int i=0;i<4;i++){
            if (i==0){
                rowone.add("Stick"+(i+1));
            }
            else {
                rowtwo.add("Stick"+(i+1));
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Stick1 = new javax.swing.JLabel();
        Stick2 = new javax.swing.JLabel();
        Stick3 = new javax.swing.JLabel();
        Stick4 = new javax.swing.JLabel();
        row1 = new javax.swing.JLabel();
        row2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newgame = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back1.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wood.png"))); // NOI18N
        jPanel1.add(Stick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        Stick2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wood.png"))); // NOI18N
        jPanel1.add(Stick2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        Stick3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wood.png"))); // NOI18N
        jPanel1.add(Stick3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        Stick4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wood.png"))); // NOI18N
        jPanel1.add(Stick4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        row1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/row1.png"))); // NOI18N
        row1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row1MouseClicked(evt);
            }
        });
        jPanel1.add(row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        row2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/row2.png"))); // NOI18N
        row2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row2MouseClicked(evt);
            }
        });
        jPanel1.add(row2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hhhhhhh.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/compPlay.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/goback.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        newgame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newgame.setForeground(new java.awt.Color(255, 255, 255));
        newgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newGame.png"))); // NOI18N
        newgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newgameMouseClicked(evt);
            }
        });
        jPanel1.add(newgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));
        newgame.setVisible(false);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back1.jpg"))); // NOI18N
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        int an=JOptionPane.showConfirmDialog(rootPane, " Are you sure to exit game?");
        if (an == 0){
            NumOfStick jf = new NumOfStick();
            jf.show();
            dispose();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        int an=JOptionPane.showConfirmDialog(rootPane, " Are you sure to exit game?");
        if (an == 0){
             NewJFrame l = new NewJFrame();
             l.show();
             dispose();
        }
    }//GEN-LAST:event_homeMouseClicked

    private void row1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_row1MouseClicked
        // TODO add your handling code here:
        if (flag1 ==true){
            flagcomputer =false;
            flag2 =false;
            switch (clickrow1){
                case 0: 
                    hideStick("Stick1");
                    clickrow1++;
                    break;
            }
                endgame();
        }
    }//GEN-LAST:event_row1MouseClicked

    private void row2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_row2MouseClicked
        // TODO add your handling code here:
        if (flag2 == true){
            flagcomputer =false;
            flag1=false;
              switch (clickrow2){
                case 0: 
                    hideStick("Stick2");
                    clickrow2++;
                    break;
                case 1: 
                    hideStick("Stick3");
                    clickrow2++;
                    break;
                case 2: 
                    hideStick("Stick4");
                    clickrow2++;
                    break;
              }
              endgame();
        }
    }//GEN-LAST:event_row2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if (flagcomputer){
            JOptionPane.showMessageDialog(rootPane, "It is your turn");
        }
        else {
            flagcomputer =true;
            flag1=true;
            flag2=true;  
            int randomnum = random.nextInt(4) + 1;
            if (randomnum == 1 & rowone.size() >0 ){
                performMove (rowone,randomnum);
            } 
            else {
            performMove (rowtwo,randomnum);
            }
        }
        endgame();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void newgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newgameMouseClicked
        // TODO add your handling code here:
        FourSticks jf = new FourSticks();
        jf.show();
        dispose();
    }//GEN-LAST:event_newgameMouseClicked

    /**
     * @param args the command line arguments
     */
    public void endgame(){
        Icon win = new javax.swing.ImageIcon(getClass().getResource("/icons/youwin.png"));
        Icon lose = new javax.swing.ImageIcon(getClass().getResource("/icons/youlose.png"));
        if (rowone.isEmpty() && rowtwo.isEmpty()){
            if (flagcomputer) JOptionPane.showMessageDialog(rootPane, " ", "", HEIGHT,win);
            else JOptionPane.showMessageDialog(rootPane, "", "", HEIGHT,lose); 
            jLabel1.setVisible(false);
            newgame.setVisible(true);
        }
    }
    
    private void hideStick(String s) {
          switch (s) {
            case "Stick1":
                Stick1.setVisible(false);
                rowone.remove(s);
                row1.setVisible(false);
                break;
            case "Stick2":
                Stick2.setVisible(false);
                rowtwo.remove(s);
                break;
            case "Stick3":
                Stick3.setVisible(false);
                rowtwo.remove(s);
                break;
            case "Stick4":
                Stick4.setVisible(false);
                rowtwo.remove(s);
                row2.setVisible(false);
                break;
            }
    // Update common data structures
    }
   
    private void performMove(ArrayList<String> row,int num) {
    if (row.size() > 0 ) {
        int i=0;
        while (i<num){
            String s=row.get(i);
            hideStick(s);
            num--;
            }
        } else {
            int randomnum = 1;
            performMove (rowone,randomnum);
        }
    }

            
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
            java.util.logging.Logger.getLogger(FourSticks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FourSticks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FourSticks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FourSticks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FourSticks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Stick1;
    private javax.swing.JLabel Stick2;
    private javax.swing.JLabel Stick3;
    private javax.swing.JLabel Stick4;
    private javax.swing.JLabel back;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newgame;
    private javax.swing.JLabel row1;
    private javax.swing.JLabel row2;
    // End of variables declaration//GEN-END:variables
}
