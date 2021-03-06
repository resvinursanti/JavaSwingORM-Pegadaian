/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AngsuranGadaiController;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author TAMU
 */
public class ViewAngsuranGadai extends javax.swing.JInternalFrame {
    
    private String header[] = {"ID Angsuran", "ID Gadai", "ID Customer", "Tanggal Angsur","Jumlah Angsuran", "Denda"};
//    private String headerTable[] = {"ID_ANGSURAN", "ID_GADAI", "ID_CUST", "TGL_ANGSUR", "JML_ANGSUR", "DENDA"};
    public AngsuranGadaiController cc;
    /**
     * Creates new form ViewAngsuranGadai
     */
    public ViewAngsuranGadai() {
        initComponents();
        cc = new AngsuranGadaiController();
        cc.bindingAll(TBLAngsuranGadai, header);
//        cc.loadRegion(comboxCari);
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLAngsuranGadai = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblIDAngsuran = new javax.swing.JLabel();
        lblIDGadai = new javax.swing.JLabel();
        lblIDCust = new javax.swing.JLabel();
        lblTanggalAngsur = new javax.swing.JLabel();
        lblJumlahAngsur = new javax.swing.JLabel();
        lblDenda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDAngsuran = new javax.swing.JTextField();
        txtIDGadai = new javax.swing.JTextField();
        txtIDCust = new javax.swing.JTextField();
        txtJumlahAngsur = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        txtTanggalAngsur = new com.toedter.calendar.JDateChooser();
        txtCari = new javax.swing.JTextField();
        comboxCari = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Angsuran Gadai");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                closing(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        TBLAngsuranGadai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBLAngsuranGadai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLAngsuranGadaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLAngsuranGadai);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblIDAngsuran.setText("ID Angsuran");

        lblIDGadai.setText("ID Gadai");

        lblIDCust.setText("ID Customer");

        lblTanggalAngsur.setText("Tanggal Angsur");

        lblJumlahAngsur.setText("Jumlah Angsur");

        lblDenda.setText("Denda");

        jLabel1.setText(":");

        jLabel2.setText(":");

        jLabel3.setText(":");

        jLabel4.setText(":");

        jLabel5.setText(":");

        jLabel6.setText(":");

        txtIDAngsuran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDAngsuranKeyPressed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtTanggalAngsur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTanggalAngsurMouseClicked(evt);
            }
        });
        txtTanggalAngsur.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTanggalAngsurPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIDCust)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDCust))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTanggalAngsur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTanggalAngsur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDAngsuran)
                            .addComponent(lblIDGadai))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDGadai))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJumlahAngsur)
                            .addComponent(lblDenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDenda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtJumlahAngsur, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIDAngsuran)
                                    .addComponent(jLabel1)
                                    .addComponent(txtIDAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIDGadai)
                                    .addComponent(jLabel2)
                                    .addComponent(txtIDGadai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDCust)
                            .addComponent(jLabel3)
                            .addComponent(txtIDCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTanggalAngsur)
                                .addComponent(jLabel4))
                            .addComponent(txtTanggalAngsur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJumlahAngsur)
                    .addComponent(jLabel5)
                    .addComponent(txtJumlahAngsur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDenda)
                    .addComponent(jLabel6)
                    .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        comboxCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Angsuran", "ID Gadai", "Tanggal", "Jumlah", "Denda" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comboxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String kolom = "";
        switch (comboxCari.getSelectedIndex()) {
            case 0:
                kolom = "ID_ANGSURAN";
                break;
            case 1:
                kolom = "ID_GADAI";
                break;
            case 2:
                kolom = "ID_CUST";
                break;
            case 3:
                kolom = "TGL_ANGSUR";
                break;
            default:
                throw new AssertionError();
        }
        cc.bindingSearch(TBLAngsuranGadai, header, kolom,
                txtCari.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        boolean hasil = false;
        if(!txtIDAngsuran.isEnabled()){
            hasil = cc.update(txtIDAngsuran.getText(),
                    txtIDGadai.getText(),
                    txtIDCust.getText(),
                    txtTanggalAngsur.getDate().getTime()+"",
                    Long.parseLong(txtJumlahAngsur.getText()),
                    Long.parseLong(txtDenda.getText()));
                    txtIDAngsuran.setEnabled(true);
        }else{
            hasil = cc.insert(txtIDAngsuran.getText(),
                    txtIDGadai.getText(),
                    txtIDCust.getText(),
                    txtTanggalAngsur.getDate().getTime()+"",
                    Long.parseLong(txtJumlahAngsur.getText()),
                    Long.parseLong(txtDenda.getText()));
        }
        String pesan = "Gagal menambahkan data";
        if (hasil) {
            try {
                pesan = "Berhasil menambahkan Data";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(this, pesan);
        cc.bindingAll(TBLAngsuranGadai, header);
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtTanggalAngsurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTanggalAngsurMouseClicked
     
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalAngsurMouseClicked

    private void txtTanggalAngsurPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTanggalAngsurPropertyChange

        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalAngsurPropertyChange

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin dihapus?");
        if (i == 0) {
            try {
                String pesan = "Gagal hapus";
                boolean hasil = cc.delete(txtIDAngsuran.getText());
                if (hasil) {
                    pesan = "Hore Berhasil";
                    reset();
                }
                JOptionPane.showMessageDialog(this, pesan);
                cc.bindingAll(TBLAngsuranGadai, header);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void TBLAngsuranGadaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLAngsuranGadaiMouseClicked
        txtIDAngsuran.setText("" + TBLAngsuranGadai.getValueAt(TBLAngsuranGadai.getSelectedRow(), 0) + "");
        txtIDGadai.setText("" + TBLAngsuranGadai.getValueAt(TBLAngsuranGadai.getSelectedRow(), 1) + "");
        txtIDCust.setText("" + TBLAngsuranGadai.getValueAt(TBLAngsuranGadai.getSelectedRow(), 2) + "");
        txtTanggalAngsur.setDate((Date) TBLAngsuranGadai.getValueAt(TBLAngsuranGadai.getSelectedRow(), 3));
        txtJumlahAngsur.setText("" + TBLAngsuranGadai.getValueAt(TBLAngsuranGadai.getSelectedRow(), 4) + "");
        txtDenda.setText("" + TBLAngsuranGadai.getValueAt(TBLAngsuranGadai.getSelectedRow(), 5) + "");
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_TBLAngsuranGadaiMouseClicked

    private void txtIDAngsuranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDAngsuranKeyPressed
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDAngsuranKeyPressed

    private void closing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_closing
     // TODO add your handling code here:
    }//GEN-LAST:event_closing

    public void reset() {
        txtIDAngsuran.setText("");
        txtIDGadai.setText("");
        txtIDCust.setText("");
        txtJumlahAngsur.setText("");
        txtTanggalAngsur.setDate(new Date());
        txtDenda.setText("");
        txtCari.setText("");
        txtIDAngsuran.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLAngsuranGadai;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> comboxCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDenda;
    private javax.swing.JLabel lblIDAngsuran;
    private javax.swing.JLabel lblIDCust;
    private javax.swing.JLabel lblIDGadai;
    private javax.swing.JLabel lblJumlahAngsur;
    private javax.swing.JLabel lblTanggalAngsur;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtIDAngsuran;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtIDGadai;
    private javax.swing.JTextField txtJumlahAngsur;
    private com.toedter.calendar.JDateChooser txtTanggalAngsur;
    // End of variables declaration//GEN-END:variables
}
