
package PreSistem;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TampilanKeadaan extends javax.swing.JFrame {

    KeamananRuangKelas SetKeamanan = new KeamananRuangKelas() ;
    KeamananTest Keamanan = new KeamananTest();
    KebersihanRuangKelas SetKebersihan = new KebersihanRuangKelas();
    KebersihanTest Kebersihan = new KebersihanTest();
    KenyamananRuangan SetKenyamanan = new KenyamananRuangan();
    KenyamananTest Kenyamanan = new KenyamananTest();
    LingkunganRuangKelas SetLingkungan = new LingkunganRuangKelas();
    LingkunganTest Lingkungan = new LingkunganTest();
    TotalRata Total = new TotalRata();
    double Rata_rataSesuai; 
    
    
    public TampilanKeadaan() {
        initComponents();
        Keadaan.setVisible(true);
        TombolKeadaan.setVisible(false);
        Tabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Tabel = new javax.swing.JPanel();
        TabelKebersihan = new javax.swing.JScrollPane();
        TableKebersihan = new javax.swing.JTable();
        TabelKenyamanan = new javax.swing.JScrollPane();
        TableKenyamanan = new javax.swing.JTable();
        TabelKeamanan = new javax.swing.JScrollPane();
        TableKeamanan = new javax.swing.JTable();
        Keadaan = new javax.swing.JPanel();
        Kokoh = new javax.swing.JCheckBox();
        TidakKokoh = new javax.swing.JCheckBox();
        TidakAda = new javax.swing.JCheckBox();
        Ada = new javax.swing.JCheckBox();
        TidakAman = new javax.swing.JCheckBox();
        Aman = new javax.swing.JCheckBox();
        Lancar = new javax.swing.JCheckBox();
        TidakLancar = new javax.swing.JCheckBox();
        Kelembapan = new javax.swing.JTextField();
        Suhu = new javax.swing.JTextField();
        Pencahayaan = new javax.swing.JTextField();
        Derajat = new javax.swing.JLabel();
        Celcius = new javax.swing.JLabel();
        JPencahayaan = new javax.swing.JSlider();
        JKelembapan = new javax.swing.JSlider();
        JSuhu = new javax.swing.JSlider();
        TidakBising = new javax.swing.JCheckBox();
        Bising = new javax.swing.JCheckBox();
        TidakBau = new javax.swing.JCheckBox();
        Bau = new javax.swing.JCheckBox();
        TidakBocor = new javax.swing.JCheckBox();
        Bocor = new javax.swing.JCheckBox();
        TidakRusak = new javax.swing.JCheckBox();
        Rusak = new javax.swing.JCheckBox();
        TidakAus = new javax.swing.JCheckBox();
        Aus = new javax.swing.JCheckBox();
        LantaiBersih = new javax.swing.JCheckBox();
        DindingBersih = new javax.swing.JCheckBox();
        AtapBersih = new javax.swing.JCheckBox();
        PintuBersih = new javax.swing.JCheckBox();
        JendelaBersih = new javax.swing.JCheckBox();
        JendelaKotor = new javax.swing.JCheckBox();
        PintuKotor = new javax.swing.JCheckBox();
        AtapKotor = new javax.swing.JCheckBox();
        DindingKotor = new javax.swing.JCheckBox();
        LantaiKotor = new javax.swing.JCheckBox();
        NextKKKL = new javax.swing.JButton();
        BackgroundKKKL = new javax.swing.JLabel();
        TombolKeadaan = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Backround1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabel.setOpaque(false);
        Tabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableKebersihan.setAutoCreateRowSorter(true);
        TableKebersihan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kebersihan Lantai", "Kebersihan Dinding", "Kebersihan Atap", "Kebersihan Pintu", "Kebersihan Jendela"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableKebersihan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TabelKebersihan.setViewportView(TableKebersihan);

        Tabel.add(TabelKebersihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 1310, 140));

        TableKenyamanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kebisingan Ruangan", "Bau Ruangan", "Kebocoran Ruangan", "Kerusakan Ruangan", "Keausan Ruangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelKenyamanan.setViewportView(TableKenyamanan);

        Tabel.add(TabelKenyamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 303, 1310, 130));

        TableKeamanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sirkulasi Udara", "Pencahayaan", "Kelembapan", "Suhu", "Kekokohan Ruang", "Kunci Pintu dan Jendela", "Keamanan Ruang", "Rata -Rata Sesuai", "Total Rata -Rata"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelKeamanan.setViewportView(TableKeamanan);

        Tabel.add(TabelKeamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 430, 1309, 200));

        getContentPane().add(Tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Keadaan.setMaximumSize(new java.awt.Dimension(1350, 504));
        Keadaan.setMinimumSize(new java.awt.Dimension(1350, 504));
        Keadaan.setPreferredSize(new java.awt.Dimension(1350, 504));
        Keadaan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kokoh.setBackground(new java.awt.Color(13, 7, 5));
        Kokoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KokohActionPerformed(evt);
            }
        });
        Keadaan.add(Kokoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 306, -1, -1));

        TidakKokoh.setBackground(new java.awt.Color(13, 7, 5));
        TidakKokoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakKokohActionPerformed(evt);
            }
        });
        Keadaan.add(TidakKokoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 311, -1, -1));

        TidakAda.setBackground(new java.awt.Color(13, 7, 5));
        TidakAda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakAdaActionPerformed(evt);
            }
        });
        Keadaan.add(TidakAda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 349, -1, -1));

        Ada.setBackground(new java.awt.Color(13, 7, 5));
        Ada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaActionPerformed(evt);
            }
        });
        Keadaan.add(Ada, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 343, -1, -1));

        TidakAman.setBackground(new java.awt.Color(13, 7, 5));
        TidakAman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakAmanActionPerformed(evt);
            }
        });
        Keadaan.add(TidakAman, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 387, -1, -1));

        Aman.setBackground(new java.awt.Color(13, 7, 5));
        Aman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmanActionPerformed(evt);
            }
        });
        Keadaan.add(Aman, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 383, -1, -1));

        Lancar.setBackground(new java.awt.Color(13, 7, 5));
        Lancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LancarActionPerformed(evt);
            }
        });
        Keadaan.add(Lancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 304, -1, -1));

        TidakLancar.setBackground(new java.awt.Color(13, 7, 5));
        TidakLancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakLancarActionPerformed(evt);
            }
        });
        Keadaan.add(TidakLancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 304, -1, -1));

        Kelembapan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Kelembapan.setText("70");
        Kelembapan.setToolTipText("");
        Keadaan.add(Kelembapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 375, 50, 35));

        Suhu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Suhu.setText("25");
        Suhu.setToolTipText("");
        Keadaan.add(Suhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 415, 50, 35));

        Pencahayaan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pencahayaan.setText("250");
        Pencahayaan.setToolTipText("");
        Keadaan.add(Pencahayaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 335, 50, 35));

        Derajat.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        Derajat.setForeground(new java.awt.Color(255, 255, 255));
        Derajat.setText("%");
        Keadaan.add(Derajat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, 20));

        Celcius.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Celcius.setForeground(new java.awt.Color(255, 255, 255));
        Celcius.setText("C");
        Keadaan.add(Celcius, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 10, 20));

        JPencahayaan.setBackground(new java.awt.Color(15, 7, 9));
        JPencahayaan.setMajorTickSpacing(1);
        JPencahayaan.setMaximum(350);
        JPencahayaan.setMinimum(250);
        JPencahayaan.setMinorTickSpacing(1);
        JPencahayaan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JPencahayaanStateChanged(evt);
            }
        });
        Keadaan.add(JPencahayaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 220, -1));

        JKelembapan.setBackground(new java.awt.Color(13, 7, 5));
        JKelembapan.setMajorTickSpacing(1);
        JKelembapan.setMaximum(80);
        JKelembapan.setMinimum(70);
        JKelembapan.setMinorTickSpacing(1);
        JKelembapan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JKelembapanStateChanged(evt);
            }
        });
        Keadaan.add(JKelembapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 220, -1));

        JSuhu.setBackground(new java.awt.Color(13, 7, 5));
        JSuhu.setMajorTickSpacing(1);
        JSuhu.setMaximum(35);
        JSuhu.setMinimum(25);
        JSuhu.setMinorTickSpacing(1);
        JSuhu.setValue(25);
        JSuhu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSuhuStateChanged(evt);
            }
        });
        Keadaan.add(JSuhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 220, -1));

        TidakBising.setBackground(new java.awt.Color(13, 7, 5));
        TidakBising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakBisingActionPerformed(evt);
            }
        });
        Keadaan.add(TidakBising, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 78, -1, -1));

        Bising.setBackground(new java.awt.Color(13, 7, 5));
        Bising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BisingActionPerformed(evt);
            }
        });
        Keadaan.add(Bising, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 78, -1, -1));

        TidakBau.setBackground(new java.awt.Color(13, 7, 5));
        TidakBau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakBauActionPerformed(evt);
            }
        });
        Keadaan.add(TidakBau, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 117, -1, -1));

        Bau.setBackground(new java.awt.Color(13, 7, 5));
        Bau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BauActionPerformed(evt);
            }
        });
        Keadaan.add(Bau, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 117, 20, 20));

        TidakBocor.setBackground(new java.awt.Color(13, 7, 5));
        TidakBocor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakBocorActionPerformed(evt);
            }
        });
        Keadaan.add(TidakBocor, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 157, -1, -1));

        Bocor.setBackground(new java.awt.Color(13, 7, 5));
        Bocor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BocorActionPerformed(evt);
            }
        });
        Keadaan.add(Bocor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 157, -1, -1));

        TidakRusak.setBackground(new java.awt.Color(13, 7, 5));
        TidakRusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakRusakActionPerformed(evt);
            }
        });
        Keadaan.add(TidakRusak, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 196, -1, -1));

        Rusak.setBackground(new java.awt.Color(13, 7, 5));
        Rusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RusakActionPerformed(evt);
            }
        });
        Keadaan.add(Rusak, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 196, -1, -1));

        TidakAus.setBackground(new java.awt.Color(13, 7, 5));
        TidakAus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidakAusActionPerformed(evt);
            }
        });
        Keadaan.add(TidakAus, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 235, -1, -1));

        Aus.setBackground(new java.awt.Color(13, 7, 5));
        Aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AusActionPerformed(evt);
            }
        });
        Keadaan.add(Aus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 235, -1, -1));

        LantaiBersih.setBackground(new java.awt.Color(13, 7, 5));
        LantaiBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LantaiBersihActionPerformed(evt);
            }
        });
        Keadaan.add(LantaiBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 78, -1, -1));

        DindingBersih.setBackground(new java.awt.Color(13, 7, 5));
        DindingBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DindingBersihActionPerformed(evt);
            }
        });
        Keadaan.add(DindingBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 117, -1, -1));

        AtapBersih.setBackground(new java.awt.Color(13, 7, 5));
        AtapBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtapBersihActionPerformed(evt);
            }
        });
        Keadaan.add(AtapBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 157, -1, -1));

        PintuBersih.setBackground(new java.awt.Color(13, 7, 5));
        PintuBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PintuBersihActionPerformed(evt);
            }
        });
        Keadaan.add(PintuBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 196, -1, -1));

        JendelaBersih.setBackground(new java.awt.Color(13, 7, 5));
        JendelaBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JendelaBersihActionPerformed(evt);
            }
        });
        Keadaan.add(JendelaBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 233, -1, -1));

        JendelaKotor.setBackground(new java.awt.Color(13, 7, 5));
        JendelaKotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JendelaKotorActionPerformed(evt);
            }
        });
        Keadaan.add(JendelaKotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 233, -1, -1));

        PintuKotor.setBackground(new java.awt.Color(13, 7, 5));
        PintuKotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PintuKotorActionPerformed(evt);
            }
        });
        Keadaan.add(PintuKotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 196, -1, -1));

        AtapKotor.setBackground(new java.awt.Color(13, 7, 5));
        AtapKotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtapKotorActionPerformed(evt);
            }
        });
        Keadaan.add(AtapKotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 157, -1, -1));

        DindingKotor.setBackground(new java.awt.Color(13, 7, 5));
        DindingKotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DindingKotorActionPerformed(evt);
            }
        });
        Keadaan.add(DindingKotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 117, 20, 20));

        LantaiKotor.setBackground(new java.awt.Color(13, 7, 5));
        LantaiKotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LantaiKotorActionPerformed(evt);
            }
        });
        Keadaan.add(LantaiKotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 78, -1, -1));

        NextKKKL.setText("Next");
        NextKKKL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextKKKLActionPerformed(evt);
            }
        });
        Keadaan.add(NextKKKL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 440, -1, -1));

        BackgroundKKKL.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundKKKL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/4Class.jpg"))); // NOI18N
        BackgroundKKKL.setOpaque(true);
        Keadaan.add(BackgroundKKKL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getContentPane().add(Keadaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, 504));

        TombolKeadaan.setOpaque(false);
        TombolKeadaan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        TombolKeadaan.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 50));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        TombolKeadaan.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 100, 50));

        getContentPane().add(TombolKeadaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 1290, 70));

        Backround1.setBackground(new java.awt.Color(255, 255, 255));
        Backround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/1MenuAwal.png"))); // NOI18N
        Backround1.setOpaque(true);
        getContentPane().add(Backround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LantaiBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LantaiBersihActionPerformed
        if(LantaiBersih.isSelected()){
            LantaiKotor.setSelected(false);
            SetLingkungan.setKondisiLantai("Bersih");
        }
    }//GEN-LAST:event_LantaiBersihActionPerformed

    private void LantaiKotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LantaiKotorActionPerformed
        if(LantaiKotor.isSelected()){
            LantaiBersih.setSelected(false);
            SetLingkungan.setKondisiLantai("Kotor");
        }
    }//GEN-LAST:event_LantaiKotorActionPerformed

    private void DindingBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DindingBersihActionPerformed
        if(DindingBersih.isSelected()){
            DindingKotor.setSelected(false);
            SetLingkungan.setKondisiDinding("Bersih");
        }
    }//GEN-LAST:event_DindingBersihActionPerformed

    private void DindingKotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DindingKotorActionPerformed
        if(DindingKotor.isSelected()){
            DindingBersih.setSelected(false);
            SetLingkungan.setKondisiDinding("Kotor");
        }
    }//GEN-LAST:event_DindingKotorActionPerformed

    private void AtapBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtapBersihActionPerformed
        if(AtapBersih.isSelected()){
            AtapKotor.setSelected(false);
            SetLingkungan.setKondisiAtap("Bersih");
        }
    }//GEN-LAST:event_AtapBersihActionPerformed

    private void AtapKotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtapKotorActionPerformed
        if(AtapKotor.isSelected()){
            AtapBersih.setSelected(false);
            SetLingkungan.setKondisiAtap("Kotor");
        }
    }//GEN-LAST:event_AtapKotorActionPerformed

    private void PintuBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PintuBersihActionPerformed
        if(PintuBersih.isSelected()){
            PintuKotor.setSelected(false);
            SetLingkungan.setKondisiPintu("Bersih");
        }
    }//GEN-LAST:event_PintuBersihActionPerformed

    private void PintuKotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PintuKotorActionPerformed
        if(PintuKotor.isSelected()){
            PintuBersih.setSelected(false);
            SetLingkungan.setKondisiPintu("Kotor");
        }
    }//GEN-LAST:event_PintuKotorActionPerformed

    private void JendelaBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JendelaBersihActionPerformed
        if(JendelaBersih.isSelected()){
            JendelaKotor.setSelected(false);
            SetLingkungan.setKondisiJendela("Bersih");
        }
    }//GEN-LAST:event_JendelaBersihActionPerformed

    private void JendelaKotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JendelaKotorActionPerformed
        if(JendelaKotor.isSelected()){
            JendelaBersih.setSelected(false);
            SetLingkungan.setKondisiJendela("Kotor");
        }
    }//GEN-LAST:event_JendelaKotorActionPerformed

    private void LancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LancarActionPerformed
        if(Lancar.isSelected()){
            TidakLancar.setSelected(false);
            SetKebersihan.setSirkulasiUdara("Lancar");
        }
    }//GEN-LAST:event_LancarActionPerformed

    private void TidakLancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakLancarActionPerformed
        if(TidakLancar.isSelected()){
            Lancar.setSelected(false);
            SetKebersihan.setSirkulasiUdara("Tidak Lancar");
        }
    }//GEN-LAST:event_TidakLancarActionPerformed

    private void JPencahayaanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JPencahayaanStateChanged
        Pencahayaan.setText(String.valueOf(JPencahayaan.getValue()));
    }//GEN-LAST:event_JPencahayaanStateChanged

    private void JKelembapanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JKelembapanStateChanged
        Kelembapan.setText(String.valueOf(JKelembapan.getValue()));
    }//GEN-LAST:event_JKelembapanStateChanged

    private void JSuhuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSuhuStateChanged
        Suhu.setText(String.valueOf(JSuhu.getValue()));
    }//GEN-LAST:event_JSuhuStateChanged

    private void TidakBisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakBisingActionPerformed
        if(TidakBising.isSelected()){
            Bising.setSelected(false);
            SetKenyamanan.setKebisingan("Tidak Bising");
        }
    }//GEN-LAST:event_TidakBisingActionPerformed

    private void BisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BisingActionPerformed
        if(Bising.isSelected()){
            TidakBising.setSelected(false);
            SetKenyamanan.setKebisingan("Bising");
        }
    }//GEN-LAST:event_BisingActionPerformed

    private void TidakBauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakBauActionPerformed
        if(TidakBau.isSelected()){
            Bau.setSelected(false);
            SetKenyamanan.setBau("Tidak Bau");
        }
    }//GEN-LAST:event_TidakBauActionPerformed

    private void BauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BauActionPerformed
        if(Bau.isSelected()){
            TidakBau.setSelected(false);
            SetKenyamanan.setBau("Bau");
        }
    }//GEN-LAST:event_BauActionPerformed

    private void TidakBocorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakBocorActionPerformed
        if(TidakBocor.isSelected()){
            Bocor.setSelected(false);
            SetKenyamanan.setKebocoran("Tidak Bocor");
        }
    }//GEN-LAST:event_TidakBocorActionPerformed

    private void BocorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BocorActionPerformed
        if(Bocor.isSelected()){
            TidakBocor.setSelected(false);
            SetKenyamanan.setKebocoran("Bocor");
        }
    }//GEN-LAST:event_BocorActionPerformed

    private void TidakRusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakRusakActionPerformed
        if(TidakRusak.isSelected()){
            Rusak.setSelected(false);
            SetKenyamanan.setKerusakan("Tidak Rusak");
        }
    }//GEN-LAST:event_TidakRusakActionPerformed

    private void RusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RusakActionPerformed
        if(Rusak.isSelected()){
            TidakRusak.setSelected(false);
            SetKenyamanan.setKerusakan("Rusak");
        }
    }//GEN-LAST:event_RusakActionPerformed

    private void TidakAusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakAusActionPerformed
        if(TidakAus.isSelected()){
            Aus.setSelected(false);
            SetKenyamanan.setKeausan("Tidak Aus");
        }
    }//GEN-LAST:event_TidakAusActionPerformed

    private void AusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AusActionPerformed
        if(Aus.isSelected()){
            TidakAus.setSelected(false);
            SetKenyamanan.setKeausan("Aus");
        }
    }//GEN-LAST:event_AusActionPerformed

    private void KokohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KokohActionPerformed
        if(Kokoh.isSelected()){
            TidakKokoh.setSelected(false);
            SetKeamanan.setKekokohan("Kokoh");
        }
    }//GEN-LAST:event_KokohActionPerformed

    private void TidakKokohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakKokohActionPerformed
        if(TidakKokoh.isSelected()){
            Kokoh.setSelected(false);
            SetKeamanan.setKekokohan("Tidak Kokoh");
        }
    }//GEN-LAST:event_TidakKokohActionPerformed

    private void AdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaActionPerformed
        if(Ada.isSelected()){
            TidakAda.setSelected(false);
            SetKeamanan.setKunci("Ada");
        }
    }//GEN-LAST:event_AdaActionPerformed

    private void TidakAdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakAdaActionPerformed
        if(TidakAda.isSelected()){
            Ada.setSelected(false);
            SetKeamanan.setKunci("Tidak Ada");
        }
    }//GEN-LAST:event_TidakAdaActionPerformed

    private void AmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmanActionPerformed
        if(Aman.isSelected()){
            TidakAman.setSelected(false);
            SetKeamanan.setBahaya("Aman");
        }
    }//GEN-LAST:event_AmanActionPerformed

    private void TidakAmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidakAmanActionPerformed
        if(TidakAman.isSelected()){
            Aman.setSelected(false);
            SetKeamanan.setBahaya("Tidak Aman");
        }
    }//GEN-LAST:event_TidakAmanActionPerformed

    private void NextKKKLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextKKKLActionPerformed
    try{
        Keamanan.Input(SetKeamanan.getKekokohan(), SetKeamanan.getKunci(), SetKeamanan.getBahaya());
        Keamanan.Analisis();
        Keamanan.Sesuai();
        System.out.println(Keamanan.Keamanan_Sesuai);
        
        SetKebersihan.setNilaiPencahayaan(Integer.parseInt(Pencahayaan.getText()));
        SetKebersihan.setKelembapan(Integer.parseInt(Kelembapan.getText()));
        SetKebersihan.setSuhu(Integer.parseInt(Suhu.getText()));
        Kebersihan.Input(SetKebersihan.getSirkulasiUdara(), SetKebersihan.getNilaiPencahayaan(),
                SetKebersihan.getKelembapan(), SetKebersihan.getSuhu());
        Kebersihan.Analisis();
        Kebersihan.Sesuai();
        System.out.println(Kebersihan.Kebersihan_Sesuai);
        
        Kenyamanan.Input(SetKenyamanan.getKebisingan(), SetKenyamanan.getBau(), SetKenyamanan.getKebocoran(),
                SetKenyamanan.getKerusakan(), SetKenyamanan.getKeausan());
        Kenyamanan.Analisis();
        Kenyamanan.Sesuai();
        System.out.println(Kenyamanan.Kenyamanan_Sesuai);
        
        Lingkungan.Input(SetLingkungan.getKondisiLantai(), SetLingkungan.getKondisiDinding(), SetLingkungan.getKondisiAtap(),
                SetLingkungan.getKondisiPintu(), SetLingkungan.getKondisiJendela());
        Lingkungan.Analisis();
        Lingkungan.Sesuai();
        System.out.println(Lingkungan.Lingkungan_Sesuai);
        
        Total.Rata();
        Total.Save();
        
        Rata_rataSesuai = Keamanan.Keamanan_Sesuai + Kebersihan.Kebersihan_Sesuai + Kenyamanan.Kenyamanan_Sesuai+Lingkungan.Lingkungan_Sesuai;
        DefaultTableModel modelKebersihan = (DefaultTableModel) TableKebersihan.getModel();
        modelKebersihan.addRow(new Object[]{SetLingkungan.getKondisiLantai(), SetLingkungan.getKondisiDinding(), SetLingkungan.getKondisiAtap(),
                SetLingkungan.getKondisiPintu(), SetLingkungan.getKondisiJendela()});
        
        DefaultTableModel modelKenyamanan = (DefaultTableModel) TableKenyamanan.getModel();
        modelKenyamanan.addRow(new Object[]{SetKenyamanan.getKebisingan(), SetKenyamanan.getBau(), SetKenyamanan.getKebocoran(),
                SetKenyamanan.getKerusakan(), SetKenyamanan.getKeausan()});
        
        DefaultTableModel modelKeamanan = (DefaultTableModel) TableKeamanan.getModel();
        modelKeamanan.addRow(new Object[]{SetKebersihan.getSirkulasiUdara(), SetKebersihan.getNilaiPencahayaan(),
                SetKebersihan.getKelembapan(), SetKebersihan.getSuhu(),SetKeamanan.getKekokohan(), 
                SetKeamanan.getKunci(), SetKeamanan.getBahaya(), Rata_rataSesuai, Total.rata_rata});
        
        Tabel.setVisible(true);
        Keadaan.setVisible(false);
        TombolKeadaan.setVisible(true);
        }catch(Exception e){
            System.out.println("ERROR");
        }
   /* try{
            Connection konek = Koneksi.getKoneksi();
            String query = "INSERT INTO identitas VALUES(?,?,?)";
            PreparedStatement prepare;
            prepare = (PreparedStatement) konek.prepareStatement(query);
            prepare.setString(1, TNamaRuangan.getText());
            prepare.setString(2, CLokasiRuang.getName());
            prepare.setString(3, CprogramStudi.getName());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
            //Sarana.setVisible(true);
        }catch(Exception e){
            
        }*/
    }//GEN-LAST:event_NextKKKLActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Keamanan.Save();
        Kebersihan.Save();
        Kenyamanan.Save();
        Lingkungan.Save();
        //setState(ICONIFIED);
        this.setVisible(false);
        Tabel.setVisible(false);
        Keadaan.setVisible(true);
        TombolKeadaan.setVisible(false);
    }//GEN-LAST:event_SaveActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Keadaan.setVisible(true);
        Tabel.setVisible(false);
        TombolKeadaan.setVisible(false);
    }//GEN-LAST:event_EditActionPerformed

    public void Keadaan() {
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
            java.util.logging.Logger.getLogger(TampilanKeadaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanKeadaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanKeadaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanKeadaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ada;
    private javax.swing.JCheckBox Aman;
    private javax.swing.JCheckBox AtapBersih;
    private javax.swing.JCheckBox AtapKotor;
    private javax.swing.JCheckBox Aus;
    private javax.swing.JLabel BackgroundKKKL;
    private javax.swing.JLabel Backround1;
    private javax.swing.JCheckBox Bau;
    private javax.swing.JCheckBox Bising;
    private javax.swing.JCheckBox Bocor;
    private javax.swing.JLabel Celcius;
    private javax.swing.JLabel Derajat;
    private javax.swing.JCheckBox DindingBersih;
    private javax.swing.JCheckBox DindingKotor;
    private javax.swing.JButton Edit;
    private javax.swing.JSlider JKelembapan;
    private javax.swing.JSlider JPencahayaan;
    private javax.swing.JSlider JSuhu;
    private javax.swing.JCheckBox JendelaBersih;
    private javax.swing.JCheckBox JendelaKotor;
    private javax.swing.JPanel Keadaan;
    private javax.swing.JTextField Kelembapan;
    private javax.swing.JCheckBox Kokoh;
    private javax.swing.JCheckBox Lancar;
    private javax.swing.JCheckBox LantaiBersih;
    private javax.swing.JCheckBox LantaiKotor;
    private javax.swing.JButton NextKKKL;
    private javax.swing.JTextField Pencahayaan;
    private javax.swing.JCheckBox PintuBersih;
    private javax.swing.JCheckBox PintuKotor;
    private javax.swing.JCheckBox Rusak;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Suhu;
    private javax.swing.JPanel Tabel;
    private javax.swing.JScrollPane TabelKeamanan;
    private javax.swing.JScrollPane TabelKebersihan;
    private javax.swing.JScrollPane TabelKenyamanan;
    private javax.swing.JTable TableKeamanan;
    private javax.swing.JTable TableKebersihan;
    private javax.swing.JTable TableKenyamanan;
    private javax.swing.JCheckBox TidakAda;
    private javax.swing.JCheckBox TidakAman;
    private javax.swing.JCheckBox TidakAus;
    private javax.swing.JCheckBox TidakBau;
    private javax.swing.JCheckBox TidakBising;
    private javax.swing.JCheckBox TidakBocor;
    private javax.swing.JCheckBox TidakKokoh;
    private javax.swing.JCheckBox TidakLancar;
    private javax.swing.JCheckBox TidakRusak;
    private javax.swing.JPanel TombolKeadaan;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
