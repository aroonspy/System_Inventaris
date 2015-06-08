package PreSistem;

public class TampilanLihatData extends javax.swing.JFrame {

    TampilanIdentitas Ide = new TampilanIdentitas();
    TampilanSarana Sar = new TampilanSarana();
    TampilanSarana2 Sar2 = new TampilanSarana2();
    TampilanKeadaan Kea = new TampilanKeadaan();
    
    public TampilanLihatData() {
        initComponents();
        TabelSarana2.setVisible(false);
        TabelSarana.setVisible(false);
        TabelID.setVisible(false);
        TabelKeadaan.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        TabelSarana = new javax.swing.JPanel();
        TabelLCD = new javax.swing.JScrollPane();
        TableLampu = new javax.swing.JTable();
        TabelSteker = new javax.swing.JScrollPane();
        TableSteker = new javax.swing.JTable();
        TabelSarana2 = new javax.swing.JPanel();
        TabelAC = new javax.swing.JScrollPane();
        TableAC = new javax.swing.JTable();
        TebelCCTV = new javax.swing.JScrollPane();
        TableCCTV = new javax.swing.JTable();
        TabelKipas = new javax.swing.JScrollPane();
        TableKipas = new javax.swing.JTable();
        TabelID = new javax.swing.JPanel();
        TabelKebersihan = new javax.swing.JScrollPane();
        TableKebersihan = new javax.swing.JTable();
        TabelKenyamanan = new javax.swing.JScrollPane();
        TableKenyamanan = new javax.swing.JTable();
        TabelKeamanan = new javax.swing.JScrollPane();
        TableKeamanan = new javax.swing.JTable();
        TabelKeadaan = new javax.swing.JPanel();
        TabelKebersihan1 = new javax.swing.JScrollPane();
        TableKebersihan1 = new javax.swing.JTable();
        TabelKenyamanan1 = new javax.swing.JScrollPane();
        TableKenyamanan1 = new javax.swing.JTable();
        TabelKeamanan1 = new javax.swing.JScrollPane();
        TableKeamanan1 = new javax.swing.JTable();
        RID = new javax.swing.JRadioButton();
        RSarana = new javax.swing.JRadioButton();
        RSarana2 = new javax.swing.JRadioButton();
        RKeadaan = new javax.swing.JRadioButton();
        Backround1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setText("HOME");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 70, 130, 60));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Exit.png"))); // NOI18N
        Exit.setContentAreaFilled(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 40, 40));

        TabelSarana.setOpaque(false);
        TabelSarana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableLampu.setAutoCreateRowSorter(true);
        TableLampu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah Kabel Lampu", "Kondisi Kabel Lampu Baik", "Kondisi Kabel Lampu Rusak", "Posisi Kabel Lampu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelLCD.setViewportView(TableLampu);

        TabelSarana.add(TabelLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1310, 180));

        TableSteker.setAutoCreateRowSorter(true);
        TableSteker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah Steker", "Kondisi Steker Baik", "Kondisi Steker Buruk", "Posisi Steker Dekat Dosen", "Posisi Steker Pojok Ruang", "Jumlah Kabel LCD", "Kondisi Kabel LCD Baik", "Kondiisi Kabel LCD Rusak", "Posisi Kabel LCD Langit - Langit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelSteker.setViewportView(TableSteker);

        TabelSarana.add(TabelSteker, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 1310, 460));

        getContentPane().add(TabelSarana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TabelSarana2.setOpaque(false);
        TabelSarana2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableAC.setAutoCreateRowSorter(true);
        TableAC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah AC", "Kondisi AC Baik", "Kondisi AC Buruk", "Posisi AC Di Belakang", "Posisi AC Di Samping"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAC.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TabelAC.setViewportView(TableAC);

        TabelSarana2.add(TabelAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 1310, 140));

        TableCCTV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah CCTV", "Kondisi CCTV Baik", "Kondisi CCTV Buruk", "Posisi CCTV Di Depan", "Posisi CCTV Di Belakang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TebelCCTV.setViewportView(TableCCTV);

        TabelSarana2.add(TebelCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1310, 130));

        TableKipas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah Kipas Angin", "Kondisi Kipas Angin Baik", "Kondisi Kipas Angin Rusak", "Posisi Kipas Angin Di Atap Ruangan", "SSID", "Bandwith"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelKipas.setViewportView(TableKipas);

        TabelSarana2.add(TabelKipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1310, 200));

        getContentPane().add(TabelSarana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TabelID.setOpaque(false);
        TabelID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        TabelID.add(TabelKebersihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 1310, 140));

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

        TabelID.add(TabelKenyamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 303, 1310, 130));

        TableKeamanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sirkulasi Udara", "Pencahayaan", "Kelembapan", "Suhu", "Kekokohan Ruang", "Kunci Pintu dan Jendela", "Keamanan Ruang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelKeamanan.setViewportView(TableKeamanan);

        TabelID.add(TabelKeamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 430, 1309, 200));

        getContentPane().add(TabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TabelKeadaan.setOpaque(false);
        TabelKeadaan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableKebersihan1.setAutoCreateRowSorter(true);
        TableKebersihan1.setModel(new javax.swing.table.DefaultTableModel(
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
        TableKebersihan1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TabelKebersihan1.setViewportView(TableKebersihan1);

        TabelKeadaan.add(TabelKebersihan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 1310, 140));

        TableKenyamanan1.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelKenyamanan1.setViewportView(TableKenyamanan1);

        TabelKeadaan.add(TabelKenyamanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 303, 1310, 130));

        TableKeamanan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sirkulasi Udara", "Pencahayaan", "Kelembapan", "Suhu", "Kekokohan Ruang", "Kunci Pintu dan Jendela", "Keamanan Ruang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelKeamanan1.setViewportView(TableKeamanan1);

        TabelKeadaan.add(TabelKeamanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 430, 1309, 200));

        getContentPane().add(TabelKeadaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RID.setForeground(new java.awt.Color(255, 255, 255));
        RID.setText("Table Identitas Ruang Kelas");
        RID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIDActionPerformed(evt);
            }
        });
        getContentPane().add(RID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, -1, -1));

        RSarana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RSarana.setForeground(new java.awt.Color(255, 255, 255));
        RSarana.setText("Table Sarana Ruang Kelas");
        RSarana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSaranaActionPerformed(evt);
            }
        });
        getContentPane().add(RSarana, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, -1, -1));

        RSarana2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RSarana2.setForeground(new java.awt.Color(255, 255, 255));
        RSarana2.setText("Table Sarana Ruang Kelas 2");
        RSarana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSarana2ActionPerformed(evt);
            }
        });
        getContentPane().add(RSarana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        RKeadaan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RKeadaan.setForeground(new java.awt.Color(255, 255, 255));
        RKeadaan.setText("Table Keadaan Ruang Kelas");
        RKeadaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RKeadaanActionPerformed(evt);
            }
        });
        getContentPane().add(RKeadaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 650, -1, -1));

        Backround1.setBackground(new java.awt.Color(255, 255, 255));
        Backround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/1MenuAwal.png"))); // NOI18N
        Backround1.setOpaque(true);
        getContentPane().add(Backround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void RSaranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSaranaActionPerformed
        if(RSarana.isSelected()){
           TabelSarana.setVisible(true);
           TabelSarana2.setVisible(false);
           TabelID.setVisible(false);
           TabelKeadaan.setVisible(false);
           
           
           RID.setSelected(false);
           RSarana2.setSelected(false);
           RKeadaan.setSelected(false);
        }
    }//GEN-LAST:event_RSaranaActionPerformed

    private void RSarana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSarana2ActionPerformed
        if(RSarana2.isSelected()){
           TabelSarana2.setVisible(true);
           TabelSarana.setVisible(false);
           TabelID.setVisible(false);
           TabelKeadaan.setVisible(false);
           
           RID.setSelected(false);
           RSarana.setSelected(false);
           RKeadaan.setSelected(false);
        }
    }//GEN-LAST:event_RSarana2ActionPerformed

    private void RKeadaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RKeadaanActionPerformed
        if(RKeadaan.isSelected()){
           TabelKeadaan.setVisible(true);
           TabelSarana.setVisible(false);
           TabelSarana2.setVisible(false);
           TabelID.setVisible(false);
           
           RID.setSelected(false);
           RSarana.setSelected(false);
           RSarana2.setSelected(false);
        }
    }//GEN-LAST:event_RKeadaanActionPerformed

    private void RIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIDActionPerformed
        if(RID.isSelected()){
           TabelID.setVisible(true);
           TabelSarana.setVisible(false);
           TabelSarana2.setVisible(false);
           TabelKeadaan.setVisible(false);
           
           RSarana2.setSelected(false);
           RSarana.setSelected(false);
           RKeadaan.setSelected(false);
        }
    }//GEN-LAST:event_RIDActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_HomeActionPerformed

    
    
    public void Data() {
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
            java.util.logging.Logger.getLogger(TampilanLihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanLihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanLihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanLihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backround1;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Home;
    private javax.swing.JRadioButton RID;
    private javax.swing.JRadioButton RKeadaan;
    private javax.swing.JRadioButton RSarana;
    private javax.swing.JRadioButton RSarana2;
    private javax.swing.JScrollPane TabelAC;
    private javax.swing.JPanel TabelID;
    private javax.swing.JPanel TabelKeadaan;
    private javax.swing.JScrollPane TabelKeamanan;
    private javax.swing.JScrollPane TabelKeamanan1;
    private javax.swing.JScrollPane TabelKebersihan;
    private javax.swing.JScrollPane TabelKebersihan1;
    private javax.swing.JScrollPane TabelKenyamanan;
    private javax.swing.JScrollPane TabelKenyamanan1;
    private javax.swing.JScrollPane TabelKipas;
    private javax.swing.JScrollPane TabelLCD;
    private javax.swing.JPanel TabelSarana;
    private javax.swing.JPanel TabelSarana2;
    private javax.swing.JScrollPane TabelSteker;
    private javax.swing.JTable TableAC;
    private javax.swing.JTable TableCCTV;
    private javax.swing.JTable TableKeamanan;
    private javax.swing.JTable TableKeamanan1;
    private javax.swing.JTable TableKebersihan;
    private javax.swing.JTable TableKebersihan1;
    private javax.swing.JTable TableKenyamanan;
    private javax.swing.JTable TableKenyamanan1;
    private javax.swing.JTable TableKipas;
    private javax.swing.JTable TableLampu;
    private javax.swing.JTable TableSteker;
    private javax.swing.JScrollPane TebelCCTV;
    // End of variables declaration//GEN-END:variables
}
