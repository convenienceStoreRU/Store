/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convenience;

/**
 *
 * @author Student554
 */
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
public class Program extends javax.swing.JFrame {

    /**
     * Creates new form Program
     */
    public Program() {
        initComponents();
        Query name = new Query();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        Pagewelcome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Query().Items);
        jComboBox1 = new javax.swing.JComboBox(model);
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pagewelcome.setBackground(new java.awt.Color(0, 0, 0));
        Pagewelcome.setPreferredSize(new java.awt.Dimension(1024, 768));
        Pagewelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome");
        Pagewelcome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Pagewelcome.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 260, 40));

        jLabel3.setFont(new java.awt.Font("X-Files", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username : ");
        Pagewelcome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jTextField1.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        Pagewelcome.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 260, 40));

        jLabel5.setFont(new java.awt.Font("X-Files", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");
        Pagewelcome.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("X-Files", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Copy right 2017...");
        Pagewelcome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 750, 110, -1));

        jButton1.setFont(new java.awt.Font("X-Files", 1, 18)); // NOI18N
        jButton1.setText("Login");
        Pagewelcome.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 100, 40));

        jButton2.setFont(new java.awt.Font("X-Files", 0, 11)); // NOI18N
        jButton2.setText("Reset password");
        Pagewelcome.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 130, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Project\\Project(การพัฒนาซอฟต์แวร์บริหารงานขายหน้าร้านสะดวกซื้อ)\\Untitlessd.gif")); // NOI18N
        jLabel9.setText("jLabel9");
        Pagewelcome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 680, 150, 90));

        getContentPane().add(Pagewelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pagewelcome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
