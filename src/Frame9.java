
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pared
 */
public class Frame9 extends javax.swing.JFrame {

    /**
     * Creates new form Frame9
     */
    public Frame9() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMontInc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMontFin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCostLlam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Comunicaciones S.A ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Monto Inicial:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtMontInc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontIncKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontInc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese Monto Final:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtMontFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontFinKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Recargo del 20%");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Costo de la Llamada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtCostLlam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostLlamKeyTyped(evt);
            }
        });
        jPanel1.add(txtCostLlam, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 110, -1));

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        long  montllam, montfin, costllamad, op1, op2, op3, recargo=20;
        String res;
        
        if (txtMontInc.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese Monto Inicial", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtMontInc.requestFocusInWindow();
        }
        if (txtMontFin.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese Monto Final", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtMontFin.requestFocusInWindow();
        }
        else {
        montllam= Long.parseLong(txtMontInc.getText());
        montfin= Long.parseLong(txtMontFin.getText());
        
        op1= montllam-montfin;
        op2=(op1*recargo)/100;
        costllamad= op1+op2;
        
        res= String.valueOf(costllamad);
        txtCostLlam.setText(res);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMontIncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontIncKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
    }//GEN-LAST:event_txtMontIncKeyTyped

    private void txtMontFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontFinKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
    }//GEN-LAST:event_txtMontFinKeyTyped

    private void txtCostLlamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostLlamKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
          if(!Character.isLetter(c)) 
          { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtCostLlamKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtCostLlam.setText("");
        txtMontFin.setText("");
        txtMontInc.setText("");
        
        txtMontInc.requestFocusInWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCostLlam;
    private javax.swing.JTextField txtMontFin;
    private javax.swing.JTextField txtMontInc;
    // End of variables declaration//GEN-END:variables
}
