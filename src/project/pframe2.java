/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*; 
import java.sql.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import mondrian.olap.DriverManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author hp
 */
public class pframe2 extends javax.swing.JFrame {

    /**
     * Creates new form pframe2
     */
    public pframe2() {
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
        jLabel3 = new javax.swing.JLabel();
        textssnt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textssnp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ssnemployees = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 0, 81));
        jLabel3.setText("SSN | Trainee");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        textssnt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        textssnt.setForeground(new java.awt.Color(81, 0, 81));
        textssnt.setText("t");
        textssnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textssntActionPerformed(evt);
            }
        });
        jPanel1.add(textssnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 170, -1));

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(81, 0, 81));
        jButton3.setText("Accept");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(81, 0, 81));
        jButton4.setText("Unacceptable");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(81, 0, 81));
        jButton5.setText("Accept");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(81, 0, 81));
        jButton6.setText("Unacceptable");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(81, 0, 81));
        jLabel5.setText("SSN | Patient");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        textssnp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        textssnp.setForeground(new java.awt.Color(81, 0, 81));
        textssnp.setText("p");
        jPanel1.add(textssnp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 106, 93)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ssnemployees.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ssnemployees.setForeground(new java.awt.Color(81, 0, 81));
        ssnemployees.setText("a");
        ssnemployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnemployeesActionPerformed(evt);
            }
        });
        jPanel2.add(ssnemployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, -1));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(81, 0, 81));
        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(81, 0, 81));
        jButton2.setText("Unacceptable");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 0, 81));
        jLabel1.setText("SSN | Employee");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 380, 80));

        jPanel3.setBackground(new java.awt.Color(216, 227, 231));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(206, 31, 106)));
        jPanel3.setForeground(new java.awt.Color(167, 187, 199));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 380, 90));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 110, 130)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 380, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\msys\\Desktop\\project\\src\\project\\ICON.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Disability Department");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 376, 44));

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\msys\\Desktop\\project\\src\\project\\BACK.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton9.setText("Requist Patient");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 220, 30));

        jButton10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton10.setText("Requist Trainee");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, 30));

        jButton11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton11.setText("Requist Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\msys\\Desktop\\project\\src\\project\\back.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ssnemployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnemployeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnemployeesActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       pframe f = new pframe();
        f.show();
        dispose(); 
        

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            OracleDataSource ads = new OracleDataSource();
            ads.setURL("jdbc:oracle:thin:@localhost:1521:XE");
            ads.setUser("c##mays");
            ads.setPassword("mays123456789");
            Connection connect = ads.getConnection();
            InputStream tap = new FileInputStream (new File ("Req.jrxml"));

            JasperDesign jas = JRXmlLoader.load(tap);
            JasperReport jd =  JasperCompileManager.compileReport(jas);
            JasperPrint jp = JasperFillManager.fillReport(jd, null, connect);
            
            OutputStream output = new FileOutputStream(new File ("employeesReport.pdf"));
            JasperExportManager.exportReportToPdfStream(jp, output);
            output.close();
            tap.close();
            connect.close();
        } catch (Exception ex) {
            Logger.getLogger(pframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    /*    pframe2 jf = new pframe2();
        jf.show();
        dispose();
      */    
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectPU");
        
        EntityManager em = emf.createEntityManager();
     //   Query qur = em.createNamedQuery("Members.findAll");
        Query qurr = em.createNamedQuery("Employees.findAll");

       // List <Members>lst1 = qur.getResultList();
        List <Requiste>lst2 = qurr.getResultList();
       // interface6 inter = new interface6();
        //inter.setLocationRelativeTo(null);
        
       // for (Members m1 : lst1){
        for (Requiste e1 :lst2){
            

       if (e1.getSsn().equals(this.ssnemployees.getText())){
           Employees emplo = new Employees();
           emplo.setSsn(e1.getSsn());
           emplo.setEMail(e1.getEMail());
           emplo.setUniversityMajor(e1.getUniversityMajor());
           emplo.setUniversityName(e1.getUniversityName());
           emplo.setYearOfGraduate(e1.getYearOfGraduate());
           String codde="" ;
           codde = JOptionPane.showInputDialog("Enter the code for the new employee|");
           emplo.setEmployeeCode(codde);
           
           codde = JOptionPane.showInputDialog("Enter the salary for the new employee|");
           
           emplo.setSalary(Integer.parseInt(codde));
           codde = JOptionPane.showInputDialog("Enter the position of the new employee|");
           emplo.setWorkInDepartment(codde);
           
           em.getTransaction().begin();
           em.persist(emplo);
           em.getTransaction().commit();
           em.close();
           
        
//if (e1.getSsn().getSsn().equals(m1.getSsn())){
//namemanager.setText(m1.getFirstName()+" "+m1.getMinitName()+" "+m1.getLastName());

//codemanager.setText(h);
}  
       else{
       
       JOptionPane.showMessageDialog(null, "This person did not submit a request!");
       }
       
     //  } 
        }
        
        
        
    
        emf.close();}
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
         try {
            // TODO add your handling code here:
            OracleDataSource ads = new OracleDataSource();
            ads.setURL("jdbc:oracle:thin:@localhost:1521:XE");
            ads.setUser("c##mays");
            ads.setPassword("mays123456789");
            Connection connect = ads.getConnection();
            InputStream tap = new FileInputStream (new File ("reqt.jrxml"));

            JasperDesign jas = JRXmlLoader.load(tap);
            JasperReport jd =  JasperCompileManager.compileReport(jas);
            JasperPrint jp = JasperFillManager.fillReport(jd, null, connect);
            
            OutputStream output = new FileOutputStream(new File ("traineesReport.pdf"));
            JasperExportManager.exportReportToPdfStream(jp, output);
            output.close();
            tap.close();
            connect.close();
        } catch (Exception ex) {
            Logger.getLogger(pframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* pframe2 jf = new pframe2();
        jf.show();
        dispose();*/ 
    
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
         try {
            // TODO add your handling code here:
            OracleDataSource ads = new OracleDataSource();
            ads.setURL("jdbc:oracle:thin:@localhost:1521:XE");
            ads.setUser("c##mays");
            ads.setPassword("mays123456789");
            Connection connect = ads.getConnection();
            InputStream tap = new FileInputStream (new File ("reqp.jrxml"));

            JasperDesign jas = JRXmlLoader.load(tap);
            JasperReport jd =  JasperCompileManager.compileReport(jas);
            JasperPrint jp = JasperFillManager.fillReport(jd, null, connect);
            
            OutputStream output = new FileOutputStream(new File ("patientsReport.pdf"));
            JasperExportManager.exportReportToPdfStream(jp, output);
            output.close();
            tap.close();
            connect.close();
        } catch (Exception ex) {
            Logger.getLogger(pframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* pframe2 jf = new pframe2();
        jf.show();
        dispose();*/ 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          try{
             
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectPU");
        
        EntityManager em = emf.createEntityManager();
       Query qur = em.createNamedQuery("Members.deleteRow");
        Query qurr = em.createNamedQuery("Requiste.deleteRow");
OracleDataSource ads = new OracleDataSource();
            ads.setURL("jdbc:oracle:thin:@localhost:1521:XE");
            ads.setUser("c##mays");
            ads.setPassword("mays123456789");
            Connection connect = ads.getConnection();
            PreparedStatement pps ;
            PreparedStatement pps1 ;
        List <Members>lst1 = qur.getResultList();
        List <Requiste>lst2 = qurr.getResultList();
       // interface6 inter = new interface6();
   //     inter.setLocationRelativeTo(null);
        
       for (Members m1 : lst1){
        for (Requiste e1 :lst2){
            

       if (e1.getSsn().equals(this.ssnemployees.getText())){
         pps = connect.prepareStatement("Delete from Requiste where ssn ="+ e1.getSsn());
         pps1 = connect.prepareStatement("Delete from Members where ssn ="+e1.getSsn());
         pps.execute();
         pps1.execute();
         connect.close();
         //updateTable();
           
        
//if (e1.getSsn().getSsn().equals(m1.getSsn())){
//namemanager.setText(m1.getFirstName()+" "+m1.getMinitName()+" "+m1.getLastName());

//codemanager.setText(h);
}       
       
      } 
        }
        
        
        
    
        emf.close();}
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textssntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textssntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textssntActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(pframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pframe2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField ssnemployees;
    private javax.swing.JTextField textssnp;
    private javax.swing.JTextField textssnt;
    // End of variables declaration//GEN-END:variables
}
