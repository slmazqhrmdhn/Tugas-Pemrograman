/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coba1;

/**
 *
 * @author PC RPL - R1
 */
public class Modul5 extends javax.swing.JFrame {

    /**
     * Creates new form mODUL5
     */
    public Modul5() {
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

        eNama = new javax.swing.JLabel();
        eAlamat = new javax.swing.JLabel();
        eMakanan = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        cbBakso = new javax.swing.JCheckBox();
        cbSeblak = new javax.swing.JCheckBox();
        cbMieayam = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cbEsTeh = new javax.swing.JCheckBox();
        cbAir = new javax.swing.JCheckBox();
        cbEs = new javax.swing.JCheckBox();
        ePesan = new javax.swing.JButton();
        eClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResume = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eNama.setText("Nama");

        eAlamat.setText("Alamat");

        eMakanan.setText("Makanan");

        cbBakso.setText("Bakso");
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        cbSeblak.setText("Seblak");

        cbMieayam.setText("Mie ayam");

        jLabel4.setText("Minuman");

        cbEsTeh.setText("Es Teh");
        cbEsTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEsTehActionPerformed(evt);
            }
        });

        cbAir.setText("Air");

        cbEs.setText("Es");

        ePesan.setText("Pesan");
        ePesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ePesanActionPerformed(evt);
            }
        });

        eClear.setText("Clear");
        eClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eClearActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(areaResume);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eNama)
                            .addComponent(eAlamat))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(ePesan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eMakanan)
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSeblak)
                                    .addComponent(cbBakso)
                                    .addComponent(cbMieayam)
                                    .addComponent(cbEsTeh)
                                    .addComponent(cbAir)
                                    .addComponent(cbEs))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(eClear)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNama)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eAlamat)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(eMakanan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cbBakso)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbSeblak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMieayam)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbEsTeh))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(cbAir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbEs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ePesan)
                    .addComponent(eClear))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBaksoActionPerformed

    private void cbEsTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEsTehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEsTehActionPerformed

    private void ePesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePesanActionPerformed
        // TODO add your handling code here:
        int IndexCombo;
        String daftarMakanan="";
        String daftarMinuman="";
        String nama=jTextField1.getText();
        String alamat=jTextField2.getText();
        if (cbBakso.isSelected()) {
            daftarMakanan +=cbBakso.getText()+"";           
        }if (cbSeblak.isSelected()) {
            daftarMakanan +=cbSeblak.getText()+"";   
        }
        if (cbMieayam.isSelected()) {
            daftarMakanan +=cbMieayam.getText()+""; 
        }
        if (cbEsTeh.isSelected()) {
            daftarMinuman +=cbEsTeh.getText()+"";
        }if (cbAir.isSelected()) {
            daftarMinuman +=cbAir.getText()+"";
        }
        if (cbEs.isSelected()) {
            daftarMinuman +=cbEs.getText()+"";
        }
        areaResume.setText(
        "Nama :\t"+ nama + "\n"+
        "Alamat :\t"+ alamat + "\n"+        
        "Makanan :\t"+ daftarMakanan + "\n"+     
        "Minuman :\t"+ daftarMinuman + "\n"      
                );
    }//GEN-LAST:event_ePesanActionPerformed

    private void eClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eClearActionPerformed
        // TODO add your handling code here:
        areaResume.setText(null);
    }//GEN-LAST:event_eClearActionPerformed

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
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea areaResume;
    private javax.swing.JCheckBox cbAir;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbEs;
    private javax.swing.JCheckBox cbEsTeh;
    private javax.swing.JCheckBox cbMieayam;
    private javax.swing.JCheckBox cbSeblak;
    private javax.swing.JLabel eAlamat;
    private javax.swing.JButton eClear;
    private javax.swing.JLabel eMakanan;
    private javax.swing.JLabel eNama;
    private javax.swing.JButton ePesan;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
