/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GadaiController;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author TAMU
 */
public class ViewGadai extends javax.swing.JInternalFrame {
    private String header[] = {"ID Gadai", "ID Customer", "ID Barang", "Jumlah Pinjaman","Tanggal Pengajuan", "Status", "Sisa Pinjaman"};
//    private String headerTable[] = {"ID_ANGSURAN", "ID_GADAI", "ID_CUST", "TGL_ANGSUR", "JML_ANGSUR", "DENDA"};
    public GadaiController gc;
    /**
     * Creates new form ViewGadai
     */
    public ViewGadai() {
        initComponents();
        gc = new GadaiController();
        gc.bindingAll(TBLGadai, header);
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

        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblIDGadai = new javax.swing.JLabel();
        lblIDCust = new javax.swing.JLabel();
        lblIDBarang = new javax.swing.JLabel();
        lblJumlahPinjaman = new javax.swing.JLabel();
        lblTanggalPengajuan = new javax.swing.JLabel();
        lblSisaPinjman = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDGadai = new javax.swing.JTextField();
        txtIDCust = new javax.swing.JTextField();
        txtIDBarang = new javax.swing.JTextField();
        txtJumlahPinjaman = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        txtTanggalPengajuan = new com.toedter.calendar.JDateChooser();
        lblSisaPinjman1 = new javax.swing.JLabel();
        txtSisaPinjaman1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboxCari = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLGadai = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gadai");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblIDGadai.setText("ID Gadai");

        lblIDCust.setText("ID Customer");

        lblIDBarang.setText("ID Barang");

        lblJumlahPinjaman.setText("Jumlah Pinjaman");

        lblTanggalPengajuan.setText("Tanggal Pengajuan");

        lblSisaPinjman.setText("Status");

        jLabel1.setText(":");

        jLabel2.setText(":");

        jLabel3.setText(":");

        jLabel4.setText(":");

        jLabel5.setText(":");

        jLabel6.setText(":");

        txtIDGadai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDGadaiKeyPressed(evt);
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

        txtTanggalPengajuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTanggalPengajuanMouseClicked(evt);
            }
        });
        txtTanggalPengajuan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTanggalPengajuanPropertyChange(evt);
            }
        });

        lblSisaPinjman1.setText("Sisa Pinjaman");

        jLabel7.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDBarang)
                    .addComponent(lblJumlahPinjaman)
                    .addComponent(lblIDGadai)
                    .addComponent(lblIDCust)
                    .addComponent(lblTanggalPengajuan)
                    .addComponent(lblSisaPinjman)
                    .addComponent(lblSisaPinjman1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTanggalPengajuan, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txtIDCust)
                    .addComponent(txtIDBarang)
                    .addComponent(txtIDGadai)
                    .addComponent(txtJumlahPinjaman)
                    .addComponent(txtStatus)
                    .addComponent(txtSisaPinjaman1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDGadai)
                            .addComponent(jLabel1)
                            .addComponent(txtIDGadai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDCust)
                            .addComponent(jLabel2)
                            .addComponent(txtIDCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDBarang)
                            .addComponent(jLabel3)
                            .addComponent(txtIDBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJumlahPinjaman)
                            .addComponent(jLabel4)
                            .addComponent(txtJumlahPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTanggalPengajuan)
                        .addComponent(jLabel5))
                    .addComponent(txtTanggalPengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSisaPinjman)
                    .addComponent(jLabel6)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSisaPinjman1)
                    .addComponent(jLabel7)
                    .addComponent(txtSisaPinjaman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        comboxCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Gadai", "Jumlah", "Tanggal Pengajuan" }));

        TBLGadai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBLGadai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLGadaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLGadai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
            kolom = "ID_Gadai";
            break;
            case 1:
            kolom = "JUMLAH_PINJAMAN";
            break;
            case 2:
            kolom = "TANGGAL_PENGAJUAN";
            break;
            default:
            throw new AssertionError();
        }
        gc.bindingSearch(TBLGadai, header, kolom,
            txtCari.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtIDGadaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDGadaiKeyPressed
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDGadaiKeyPressed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin dihapus?");
        if (i == 0) {
            try {
                String pesan = "Gagal hapus";
                boolean hasil = gc.delete(txtIDGadai.getText());
                if (hasil) {
                    pesan = "Hore Berhasil";
                    reset();
                }
                JOptionPane.showMessageDialog(this, pesan);
                gc.bindingAll(TBLGadai, header);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String Status = "Belum Lunas";
        if (txtSisaPinjaman1.getText().equals("0")){
            Status = "Lunas";
        }
        boolean hasil = false;
        if(!txtIDGadai.isEnabled()){
            hasil = gc.update(txtIDGadai.getText(),
                txtIDCust.getText(),
                txtIDBarang.getText(),
                Long.parseLong(txtJumlahPinjaman.getText()),
                txtTanggalPengajuan.getDate().getTime()+"",
                Status,
                Long.parseLong(txtSisaPinjaman1.getText()));
                txtIDGadai.setEnabled(true);
        }else{
            hasil = gc.insert(txtIDGadai.getText(),
                txtIDCust.getText(),
                txtIDBarang.getText(),
                Long.parseLong(txtJumlahPinjaman.getText()),
                txtTanggalPengajuan.getDate().getTime()+"",
                txtStatus.getText(),
                Long.parseLong(txtSisaPinjaman1.getText()));
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
        gc.bindingAll(TBLGadai, header);
        //        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtTanggalPengajuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTanggalPengajuanMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalPengajuanMouseClicked

    private void txtTanggalPengajuanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTanggalPengajuanPropertyChange

        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalPengajuanPropertyChange

    private void TBLGadaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLGadaiMouseClicked
        txtIDGadai.setText("" + TBLGadai.getValueAt(TBLGadai.getSelectedRow(), 0) + "");
        txtIDCust.setText("" + TBLGadai.getValueAt(TBLGadai.getSelectedRow(), 1) + "");
        txtIDBarang.setText("" + TBLGadai.getValueAt(TBLGadai.getSelectedRow(), 2) + "");
        txtJumlahPinjaman.setText("" + TBLGadai.getValueAt(TBLGadai.getSelectedRow(), 3) + "");
        txtTanggalPengajuan.setDate((Date) TBLGadai.getValueAt(TBLGadai.getSelectedRow(), 4));
        txtStatus.setText("" + TBLGadai.getValueAt(TBLGadai.getSelectedRow(), 5) + "");
        txtSisaPinjaman1.setText("" + TBLGadai.getValueAt(TBLGadai.getSelectedRow(), 6) + "");
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_TBLGadaiMouseClicked
    public void reset(){
        txtIDGadai.setText("");
        txtIDCust.setText("");
        txtIDBarang.setText("");
        txtJumlahPinjaman.setText("");
        txtTanggalPengajuan.setDate(new Date());
        txtStatus.setText("");
        txtIDGadai.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLGadai;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIDBarang;
    private javax.swing.JLabel lblIDCust;
    private javax.swing.JLabel lblIDGadai;
    private javax.swing.JLabel lblJumlahPinjaman;
    private javax.swing.JLabel lblSisaPinjman;
    private javax.swing.JLabel lblSisaPinjman1;
    private javax.swing.JLabel lblTanggalPengajuan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIDBarang;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtIDGadai;
    private javax.swing.JTextField txtJumlahPinjaman;
    private javax.swing.JTextField txtSisaPinjaman1;
    private javax.swing.JTextField txtStatus;
    private com.toedter.calendar.JDateChooser txtTanggalPengajuan;
    // End of variables declaration//GEN-END:variables
}
