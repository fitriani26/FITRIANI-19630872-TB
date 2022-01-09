/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_siswabaru;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Daftar
     */
    public Daftar() {
        initComponents();
        refresh();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void refresh(){
        txt_nisn.setText("");
        txt_nama.setText("");
        cmb_kelamin.setSelectedIndex(0);
        txtA_alamat.setText("");
        txt_ttl.setText("");
        txt_asal.setText("");
        txt_tahun.setText("");
        lbl_no_daftar.setText("No Daftar");
        tampil();
    }
    private void tampil(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No Pendaftaran");
        tbl.addColumn("NISN");
        tbl.addColumn("Nama Lengkap");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Alamat");
        tbl.addColumn("TTL");
        tbl.addColumn("Asal Sekolah");
        tbl.addColumn("Tahun Lulusan");
        tbl_siswa.setModel(tbl);
        try {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM tb_siswa");
            int no = 0;
            while (res.next()) {
                tbl.addRow(new Object[]{
                    
                    res.getString("no_pendaftaran"),
                    res.getString("nisn"),
                    res.getString("nama_lengkap"),
                    res.getString("kelamin"),
                    res.getString("alamat"),
                    res.getString("tempat_tgl_lahir"),
                    res.getString("asal_sekolah"),
                    res.getString("tahun_lulusan"),                  
                });
                tbl_siswa.setModel(tbl);
                no++;   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Gagal Menampilkan Data");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_tahun = new javax.swing.JTextField();
        txt_nisn = new javax.swing.JTextField();
        cmb_kelamin = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_ttl = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_asal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_siswa = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_cari = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        lbl_no_daftar = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_alamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cari Data");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 357, 0, 2);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PENDAFTARAN SISWA BARU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 817, 52);

        txt_tahun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tahunActionPerformed(evt);
            }
        });
        txt_tahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tahunKeyTyped(evt);
            }
        });
        getContentPane().add(txt_tahun);
        txt_tahun.setBounds(85, 351, 124, 23);

        txt_nisn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nisnActionPerformed(evt);
            }
        });
        txt_nisn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nisnKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nisn);
        txt_nisn.setBounds(85, 91, 153, 23);

        cmb_kelamin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_kelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- PILIH --", "Laki-laki", "Perempuan" }));
        getContentPane().add(cmb_kelamin);
        cmb_kelamin.setBounds(85, 296, 266, 23);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setText("NISN");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(85, 70, 40, 16);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(369, 83, 50, 16);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel9.setText("Tempat, Tanggal Lahir");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(85, 173, 140, 16);

        txt_ttl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_ttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ttlActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ttl);
        txt_ttl.setBounds(85, 194, 266, 23);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel10.setText("Asal Sekolah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(85, 223, 80, 16);

        txt_asal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_asal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_asalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_asal);
        txt_asal.setBounds(85, 244, 266, 23);

        tbl_siswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tbl_siswa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_siswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_siswa);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 460, 817, 251);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel11.setText("Tahun Lulusan");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(85, 330, 100, 16);

        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama);
        txt_nama.setBounds(85, 141, 266, 23);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setText("Nama Lengkap");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(85, 120, 100, 16);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(85, 275, 90, 16);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        btn_cari.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_simpan.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_ubah.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_ubah.setText("Perbarui");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        lbl_no_daftar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lbl_no_daftar.setText("No Daftar");

        txtA_alamat.setColumns(20);
        txtA_alamat.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtA_alamat.setRows(5);
        jScrollPane1.setViewportView(txtA_alamat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lbl_no_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 199, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_no_daftar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cari)
                        .addComponent(btn_refresh)))
                .addGap(249, 249, 249))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 820, 610);

        setSize(new java.awt.Dimension(833, 703));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        try {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM tb_siswa WHERE nama_lengkap LIKE '%" + txt_cari.getText() + "%'" + "or kelamin LIKE '%" + txt_cari.getText()+"%'" + "or asal_sekolah LIKE '%" + txt_cari.getText()+"%'" + "or tahun_lulusan LIKE '%" + txt_cari.getText()+"%'");
            //ResultSet res = statement.executeQuery("SELECT * FROM tb_siswa");

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("No Pendaftaran");
            tbl.addColumn("NISN");
            tbl.addColumn("Nama Lengkap");
            tbl.addColumn("Jenis Kelamin");
            tbl.addColumn("Alamat");
            tbl.addColumn("TTL");
            tbl.addColumn("Asal Sekolah");
            tbl.addColumn("Tahun Lulusan");
            tbl_siswa.setModel(tbl);

            int no = 0;
            while (res.next()) {
                tbl.addRow(new Object[]{
                    
                    res.getString("no_pendaftaran"),
                    res.getString("nisn"),
                    res.getString("nama_lengkap"),
                    res.getString("kelamin"),
                    res.getString("alamat"),
                    res.getString("tempat_tgl_lahir"),
                    res.getString("asal_sekolah"),
                    res.getString("tahun_lulusan"),
                });
                tbl_siswa.setModel(tbl);
                no++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Menampilkan Data");
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refresh();
        dispose();
        new Menu().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tahunActionPerformed

    private void txt_nisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nisnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nisnActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        String no_daftar = lbl_no_daftar.getText();
        try {
            Statement statement;
            statement = (Statement) koneksi.getConnection().createStatement();
            statement.executeUpdate("DELETE FROM tb_siswa WHERE no_pendaftaran='"+no_daftar+"'");
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");

            refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data Gagal Dihapus"+e.getMessage());
        }

    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_ttlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ttlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ttlActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String nisn,nama,kelamin,alamat,TTL,asal,tahun, INSERT;

        nisn = txt_nisn.getText();
        nama = txt_nama.getText();
        kelamin = (String) cmb_kelamin.getSelectedItem();
        alamat = txtA_alamat.getText();
        TTL = txt_ttl.getText();
        asal = txt_asal.getText();
        tahun = txt_tahun.getText();
        try {
            Statement statement;
            statement = (Statement) koneksi.getConnection().createStatement();
            INSERT = "INSERT INTO tb_siswa VALUES (null,'"+nisn+"','"+nama+"','"+kelamin+"','"+alamat+"','"+TTL+"','"+asal+"','"+tahun+"')";
            statement.executeUpdate(INSERT);
            JOptionPane.showMessageDialog(null,"Data Siswa Berhasil Disimpan");
            refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data Siswa Gagal Disimpan"+e.getMessage());
        }

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        refresh();

    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txt_asalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_asalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_asalActionPerformed

    private void tbl_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_siswaMouseClicked
        // TODO add your handling code here:
        int i = tbl_siswa.getSelectedRow();
        if (i==-1){
            return;
        }

        
         String no_daftar = (String) tbl_siswa.getValueAt(i,0);
        lbl_no_daftar.setText(no_daftar);
        
        String nisn = (String) tbl_siswa.getValueAt(i,1);
        txt_nisn.setText(nisn);

        String nama = (String) tbl_siswa.getValueAt(i,2);
        txt_nama.setText(nama);
        
        String kelamin = (String) tbl_siswa.getValueAt(i,3);
        if (kelamin.equals("Laki-laki")) {
            cmb_kelamin.setSelectedIndex(1);
        } else if (kelamin.equals("Perempuan")) {
            cmb_kelamin.setSelectedIndex(2);
        }

        String alamat = (String) tbl_siswa.getValueAt(i,4);
        txtA_alamat.setText(alamat);

        String TTL = (String) tbl_siswa.getValueAt(i,5);
        txt_ttl.setText(TTL);

        String asal = (String) tbl_siswa.getValueAt(i,6);
        txt_asal.setText(asal);

        String tahun = (String) tbl_siswa.getValueAt(i,7);
        txt_tahun.setText(tahun);

    }//GEN-LAST:event_tbl_siswaMouseClicked

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        String no_daftar,nisn,nama,kelamin,alamat,TTL,asal,tahun;
        no_daftar = lbl_no_daftar.getText();

        nisn = txt_nisn.getText();
        nama = txt_nama.getText();
        kelamin = (String) cmb_kelamin.getSelectedItem();
        alamat = txtA_alamat.getText();
        TTL = txt_ttl.getText();
        asal = txt_asal.getText();
        tahun = txt_tahun.getText();
        try {
            Statement statement;
            statement = (Statement) koneksi.getConnection().createStatement();
            statement.executeUpdate("UPDATE tb_siswa SET nisn='"+nisn+"', nama_lengkap='"+nama+"', kelamin='"+kelamin+"', alamat='"+alamat+"', tempat_tgl_lahir='"+TTL+"', asal_sekolah='"+asal+"', tahun_lulusan='"+tahun+"' WHERE no_pendaftaran='"+no_daftar+"'");
            JOptionPane.showMessageDialog(null,"Data Siswa Berhasil Diperbarui");

            refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data Siswa Gagal Diperbarui"+e.getMessage());
        }

    }//GEN-LAST:event_btn_ubahActionPerformed
     private void filter_angka(KeyEvent b){
         if(Character.isAlphabetic(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Hanya Bisa diisi dengan Angka");
        }
    }
            
    private void txt_nisnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nisnKeyTyped
        // TODO add your handling code here:
       filter_angka(evt);
    }//GEN-LAST:event_txt_nisnKeyTyped

    private void txt_tahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tahunKeyTyped
        // TODO add your handling code here:
        filter_angka(evt);
    }//GEN-LAST:event_txt_tahunKeyTyped

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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox cmb_kelamin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_no_daftar;
    private javax.swing.JTable tbl_siswa;
    private javax.swing.JTextArea txtA_alamat;
    private javax.swing.JTextField txt_asal;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nisn;
    private javax.swing.JTextField txt_tahun;
    private javax.swing.JTextField txt_ttl;
    // End of variables declaration//GEN-END:variables
}