
package PreSistem;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;


public class TampilanIdentitas extends javax.swing.JFrame {

    IdentitasRuangkelas SetID = new IdentitasRuangkelas();
    IdentitasRuangkelastest ID = new IdentitasRuangkelastest();
    KondisiRuang SetKondisi = new KondisiRuang();
    KondisiRuangtest Kondisi = new KondisiRuangtest();
    TampilanSarana Sarana = new TampilanSarana();
    
    public TampilanIdentitas() {
        initComponents();
        Identitas.setVisible(true);
        TombolIdentitas.setVisible(false);
        Tabel.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabel = new javax.swing.JPanel();
        TabelIdentitas = new javax.swing.JScrollPane();
        TableIdentitas = new javax.swing.JTable();
        TombolIdentitas = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Identitas = new javax.swing.JPanel();
        TNamaRuangan = new javax.swing.JTextField();
        CLokasiRuang = new javax.swing.JComboBox();
        CprogramStudi = new javax.swing.JComboBox();
        TPanjangRuang = new javax.swing.JTextField();
        TLebarRuang = new javax.swing.JTextField();
        SJumlahKursi = new javax.swing.JSlider();
        SJumlahPintu = new javax.swing.JSlider();
        SJumlahJendela = new javax.swing.JSlider();
        TJumlahKursi = new javax.swing.JTextField();
        TJumlahPintu = new javax.swing.JTextField();
        TJumlahJendela = new javax.swing.JTextField();
        Backdentitas1 = new javax.swing.JButton();
        NextIdentitas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackgroundIdentitas = new javax.swing.JLabel();
        Backround1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("farme1"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabel.setOpaque(false);
        Tabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableIdentitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Ruangan", "Lokasi Ruangan", "Program Studi", "Panjang Ruang", "Lebar Ruang", "Jumlah Kursi", "Jumlah Pintu", "Jumlah Jendela", "Luas Ruang", "Rasio Ruang", "Bentuk Ruang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelIdentitas.setViewportView(TableIdentitas);

        Tabel.add(TabelIdentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1290, 460));

        getContentPane().add(Tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TombolIdentitas.setOpaque(false);
        TombolIdentitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        TombolIdentitas.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 50));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        TombolIdentitas.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 100, 50));

        getContentPane().add(TombolIdentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 1290, 70));

        Identitas.setMaximumSize(new java.awt.Dimension(1350, 504));
        Identitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Identitas.add(TNamaRuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 75, 260, 26));

        CLokasiRuang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GKB 1", "GKB 2", "GKB 3" }));
        Identitas.add(CLokasiRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 115, 260, 30));

        CprogramStudi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Syari'ah", "Tarbiyah", "Ekonomi Syari'ah", " ", "Manajemen", "Akuntansi", "IESP", "D3 Keuangan Dan Perbankan", " ", "S1 Keprawatan", "D3 Keperawatan", "Farmasi", "Fisiotrapi", " ", "Ilmu Kesejahteraan Sosial", "Ilmu Pemerintahan", "Ilmu Komunikasi", "Sosiologi", "Hubungan International", " ", "Pendidikan Dokter", "Profesi Dokter", " ", "Pendidikan Bhasa Indonesia", "Pendidikan Bhasa Inggris", "Pendidikan Bhasa Matematika", "Pendidikan Bhasa Biologi", "Pendidikan Bhasa PPKN", "Pendidikan Bhasa PGSD" }));
        Identitas.add(CprogramStudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 155, 260, 30));
        Identitas.add(TPanjangRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 75, 240, 26));
        Identitas.add(TLebarRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 115, 240, 26));

        SJumlahKursi.setMajorTickSpacing(1);
        SJumlahKursi.setMaximum(60);
        SJumlahKursi.setMinorTickSpacing(1);
        SJumlahKursi.setValue(0);
        SJumlahKursi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahKursiStateChanged(evt);
            }
        });
        Identitas.add(SJumlahKursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 155, 240, -1));

        SJumlahPintu.setMajorTickSpacing(1);
        SJumlahPintu.setMaximum(3);
        SJumlahPintu.setMinorTickSpacing(1);
        SJumlahPintu.setValue(0);
        SJumlahPintu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahPintuStateChanged(evt);
            }
        });
        Identitas.add(SJumlahPintu, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 195, 240, -1));

        SJumlahJendela.setMajorTickSpacing(1);
        SJumlahJendela.setMaximum(5);
        SJumlahJendela.setMinorTickSpacing(1);
        SJumlahJendela.setValue(0);
        SJumlahJendela.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahJendelaStateChanged(evt);
            }
        });
        Identitas.add(SJumlahJendela, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 235, 240, -1));

        TJumlahKursi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahKursi.setText("0");
        Identitas.add(TJumlahKursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 155, 50, 26));

        TJumlahPintu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahPintu.setText("0");
        Identitas.add(TJumlahPintu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 195, 50, 26));

        TJumlahJendela.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahJendela.setText("0");
        Identitas.add(TJumlahJendela, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 235, 50, 26));

        Backdentitas1.setText("Back");
        Backdentitas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Backdentitas1ActionPerformed(evt);
            }
        });
        Identitas.add(Backdentitas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, 70, 60));

        NextIdentitas.setText("Next");
        NextIdentitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextIdentitasActionPerformed(evt);
            }
        });
        Identitas.add(NextIdentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1145, 403, 70, 60));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meter");
        Identitas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 80, 50, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Meter");
        Identitas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 120, 50, 20));

        BackgroundIdentitas.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundIdentitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/3Identitas.jpg"))); // NOI18N
        BackgroundIdentitas.setOpaque(true);
        Identitas.add(BackgroundIdentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getContentPane().add(Identitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, 504));

        Backround1.setBackground(new java.awt.Color(255, 255, 255));
        Backround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/1MenuAwal.png"))); // NOI18N
        Backround1.setOpaque(true);
        getContentPane().add(Backround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextIdentitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextIdentitasActionPerformed
        try{
            SetID.setNamaruang(TNamaRuangan.getText());
            SetID.setLokasiruang(CLokasiRuang.getSelectedItem().toString());
            SetID.setProgramstudi(CprogramStudi.getSelectedItem().toString());
            ID.Input(SetID.getNamaruang(), SetID.getLokasiruang(), SetID.getProgramstudi());

            SetKondisi.setPanjang(Double.parseDouble(TPanjangRuang.getText()));
            SetKondisi.setLebar(Double.parseDouble(TLebarRuang.getText()));
            SetKondisi.setJumlahkursi(Integer.parseInt(TJumlahKursi.getText()));
            SetKondisi.setJumlahpintu(Integer.parseInt(TJumlahPintu.getText()));
            SetKondisi.setJumlahjendela(Integer.parseInt(TJumlahJendela.getText()));
            Kondisi.Input(SetKondisi.getPanjang(), SetKondisi.getLebar(),
                    SetKondisi.getJumlahkursi(), SetKondisi.getJumlahpintu(),SetKondisi.getJumlahjendela());
            Kondisi.luas();
            Kondisi.bentuk();
            Kondisi.rasio();

            Kondisi.Analisis();
            Kondisi.Sesuai();
            System.out.println(Kondisi.KondisiRuang_Sesuai);
            System.out.println(SetID.getNamaruang());
            System.out.println(SetID.getLokasiruang());
            System.out.println(SetID.getProgramstudi());
            
            
            DefaultTableModel modelID = (DefaultTableModel) TableIdentitas.getModel();
            modelID.addRow(new Object[]{SetID.getNamaruang(),SetID.getLokasiruang(),SetID.getProgramstudi(),
                SetKondisi.getPanjang(),SetKondisi.getLebar(),SetKondisi.getJumlahkursi(),
                SetKondisi.getJumlahpintu(),SetKondisi.getJumlahjendela(),Kondisi.Luas,Kondisi.Rasio,Kondisi.bentuk});
            
            Tabel.setVisible(true);
            TombolIdentitas.setVisible(true);
            Identitas.setVisible(false);
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_NextIdentitasActionPerformed

    private void SJumlahKursiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahKursiStateChanged
        TJumlahKursi.setText(String.valueOf(SJumlahKursi.getValue()));
    }//GEN-LAST:event_SJumlahKursiStateChanged

    private void SJumlahPintuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahPintuStateChanged
        TJumlahPintu.setText(String.valueOf(SJumlahPintu.getValue()));
    }//GEN-LAST:event_SJumlahPintuStateChanged

    private void SJumlahJendelaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahJendelaStateChanged
        TJumlahJendela.setText(String.valueOf(SJumlahJendela.getValue()));
    }//GEN-LAST:event_SJumlahJendelaStateChanged

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        /*try{
           FileWriter Writer = new FileWriter("Keamanan.txt");
           Writer.write((String) TableIdentitas.getValueAt(0, 1));
           Writer.close();
         }catch(IOException ex){
             ex.printStackTrace();
         }*/
        Sarana.Sarana();
        ID.Save();
        Kondisi.Save();
        TNamaRuangan.setText("");
        CLokasiRuang.setSelectedIndex(0);
        CprogramStudi.setSelectedIndex(0);
        TPanjangRuang.setText("");
        TLebarRuang.setText("");
        TJumlahKursi.setText("0");
        TJumlahPintu.setText("0");
        TJumlahJendela.setText("0");
        this.setVisible(false);
        Identitas.setVisible(true);
        Tabel.setVisible(false);
        TombolIdentitas.setVisible(false);
    }//GEN-LAST:event_SaveActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Identitas.setVisible(true);
        Tabel.setVisible(false);
        TombolIdentitas.setVisible(false);
    }//GEN-LAST:event_EditActionPerformed

    private void Backdentitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Backdentitas1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_Backdentitas1ActionPerformed

    
    
    
    
  
    public void Input() {
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
            java.util.logging.Logger.getLogger(TampilanIdentitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanIdentitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanIdentitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanIdentitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backdentitas1;
    private javax.swing.JLabel BackgroundIdentitas;
    private javax.swing.JLabel Backround1;
    private javax.swing.JComboBox CLokasiRuang;
    private javax.swing.JComboBox CprogramStudi;
    private javax.swing.JButton Edit;
    private javax.swing.JPanel Identitas;
    private javax.swing.JButton NextIdentitas;
    private javax.swing.JSlider SJumlahJendela;
    private javax.swing.JSlider SJumlahKursi;
    private javax.swing.JSlider SJumlahPintu;
    private javax.swing.JButton Save;
    private javax.swing.JTextField TJumlahJendela;
    private javax.swing.JTextField TJumlahKursi;
    private javax.swing.JTextField TJumlahPintu;
    private javax.swing.JTextField TLebarRuang;
    private javax.swing.JTextField TNamaRuangan;
    private javax.swing.JTextField TPanjangRuang;
    private javax.swing.JPanel Tabel;
    private javax.swing.JScrollPane TabelIdentitas;
    private javax.swing.JTable TableIdentitas;
    private javax.swing.JPanel TombolIdentitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
