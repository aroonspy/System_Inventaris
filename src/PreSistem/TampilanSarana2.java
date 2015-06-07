
package PreSistem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TampilanSarana2 extends javax.swing.JFrame {
    
    SaranaTest2 Sarana2 = new SaranaTest2();
    SaranaRuangan2 SetSarana2 = new SaranaRuangan2();
    TampilanKeadaan Keadaan = new TampilanKeadaan();
    
    public TampilanSarana2() {
        initComponents();
        Sarana_2.setVisible(true);
        Tabel.setVisible(false);
        TombolSarana2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabel = new javax.swing.JPanel();
        TabelAC = new javax.swing.JScrollPane();
        TableAC = new javax.swing.JTable();
        TebelCCTV = new javax.swing.JScrollPane();
        TableCCTV = new javax.swing.JTable();
        TabelKipas = new javax.swing.JScrollPane();
        TableKipas = new javax.swing.JTable();
        Sarana_2 = new javax.swing.JPanel();
        SJumlahAC = new javax.swing.JSlider();
        SKondisiACB = new javax.swing.JSlider();
        SKondisiACR = new javax.swing.JSlider();
        SPosisiACB = new javax.swing.JSlider();
        SPosisiACS = new javax.swing.JSlider();
        TJumlahAC = new javax.swing.JTextField();
        TKondisiACB = new javax.swing.JTextField();
        TKondisiACR = new javax.swing.JTextField();
        TPosisiACB = new javax.swing.JTextField();
        TPosisiACS = new javax.swing.JTextField();
        SJumlahCCTV = new javax.swing.JSlider();
        SKondisiCCTVB = new javax.swing.JSlider();
        SKondisiCCTVR = new javax.swing.JSlider();
        SPosisiCCTVD = new javax.swing.JSlider();
        SPosisiCCTVB = new javax.swing.JSlider();
        TJumlahCCTV = new javax.swing.JTextField();
        TKondisiCCTVB = new javax.swing.JTextField();
        TKondisiCCTVR = new javax.swing.JTextField();
        TPosisiCCTVD = new javax.swing.JTextField();
        TPosisiCCTVB = new javax.swing.JTextField();
        SJumlahKipas = new javax.swing.JSlider();
        SKondisiKipasB = new javax.swing.JSlider();
        SKondisiKipasR = new javax.swing.JSlider();
        SPosisiKipasA = new javax.swing.JSlider();
        TJumlahKipas = new javax.swing.JTextField();
        TKondisiKipasB = new javax.swing.JTextField();
        TKondisiKipasR = new javax.swing.JTextField();
        TPosisiKipasA = new javax.swing.JTextField();
        CSSID = new javax.swing.JComboBox();
        SBandwith = new javax.swing.JSlider();
        TBandwith = new javax.swing.JTextField();
        NextSarana2 = new javax.swing.JButton();
        BackgroundSarana2 = new javax.swing.JLabel();
        TombolSarana2 = new javax.swing.JPanel();
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

        Tabel.add(TabelAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 1310, 140));

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

        Tabel.add(TebelCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1310, 130));

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

        Tabel.add(TabelKipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1310, 200));

        getContentPane().add(Tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Sarana_2.setMaximumSize(new java.awt.Dimension(1350, 504));
        Sarana_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SJumlahAC.setMajorTickSpacing(1);
        SJumlahAC.setMaximum(2);
        SJumlahAC.setMinorTickSpacing(1);
        SJumlahAC.setValue(0);
        SJumlahAC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahACStateChanged(evt);
            }
        });
        Sarana_2.add(SJumlahAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        SKondisiACB.setMajorTickSpacing(1);
        SKondisiACB.setMaximum(2);
        SKondisiACB.setMinorTickSpacing(1);
        SKondisiACB.setValue(0);
        SKondisiACB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiACBStateChanged(evt);
            }
        });
        Sarana_2.add(SKondisiACB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        SKondisiACR.setMajorTickSpacing(1);
        SKondisiACR.setMaximum(2);
        SKondisiACR.setMinorTickSpacing(1);
        SKondisiACR.setValue(0);
        SKondisiACR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiACRStateChanged(evt);
            }
        });
        Sarana_2.add(SKondisiACR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        SPosisiACB.setMajorTickSpacing(1);
        SPosisiACB.setMaximum(2);
        SPosisiACB.setMinorTickSpacing(1);
        SPosisiACB.setValue(0);
        SPosisiACB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiACBStateChanged(evt);
            }
        });
        Sarana_2.add(SPosisiACB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        SPosisiACS.setMajorTickSpacing(1);
        SPosisiACS.setMaximum(2);
        SPosisiACS.setMinorTickSpacing(1);
        SPosisiACS.setValue(0);
        SPosisiACS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiACSStateChanged(evt);
            }
        });
        Sarana_2.add(SPosisiACS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        TJumlahAC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahAC.setText("0");
        Sarana_2.add(TJumlahAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 50, 26));

        TKondisiACB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiACB.setText("0");
        Sarana_2.add(TKondisiACB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 50, 26));

        TKondisiACR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiACR.setText("0");
        Sarana_2.add(TKondisiACR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 50, 26));

        TPosisiACB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiACB.setText("0");
        Sarana_2.add(TPosisiACB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 50, 26));

        TPosisiACS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiACS.setText("0");
        Sarana_2.add(TPosisiACS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 50, 26));

        SJumlahCCTV.setMajorTickSpacing(1);
        SJumlahCCTV.setMaximum(5);
        SJumlahCCTV.setMinorTickSpacing(1);
        SJumlahCCTV.setValue(0);
        SJumlahCCTV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahCCTVStateChanged(evt);
            }
        });
        Sarana_2.add(SJumlahCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, -1, -1));

        SKondisiCCTVB.setMajorTickSpacing(1);
        SKondisiCCTVB.setMaximum(5);
        SKondisiCCTVB.setMinorTickSpacing(1);
        SKondisiCCTVB.setValue(0);
        SKondisiCCTVB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiCCTVBStateChanged(evt);
            }
        });
        Sarana_2.add(SKondisiCCTVB, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));

        SKondisiCCTVR.setMajorTickSpacing(1);
        SKondisiCCTVR.setMaximum(5);
        SKondisiCCTVR.setMinorTickSpacing(1);
        SKondisiCCTVR.setValue(0);
        SKondisiCCTVR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiCCTVRStateChanged(evt);
            }
        });
        Sarana_2.add(SKondisiCCTVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, -1, -1));

        SPosisiCCTVD.setMajorTickSpacing(1);
        SPosisiCCTVD.setMaximum(5);
        SPosisiCCTVD.setMinorTickSpacing(1);
        SPosisiCCTVD.setValue(0);
        SPosisiCCTVD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiCCTVDStateChanged(evt);
            }
        });
        Sarana_2.add(SPosisiCCTVD, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, -1));

        SPosisiCCTVB.setMajorTickSpacing(1);
        SPosisiCCTVB.setMaximum(5);
        SPosisiCCTVB.setMinorTickSpacing(1);
        SPosisiCCTVB.setValue(0);
        SPosisiCCTVB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiCCTVBStateChanged(evt);
            }
        });
        Sarana_2.add(SPosisiCCTVB, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, -1, -1));

        TJumlahCCTV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahCCTV.setText("0");
        Sarana_2.add(TJumlahCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 80, 50, 26));

        TKondisiCCTVB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiCCTVB.setText("0");
        Sarana_2.add(TKondisiCCTVB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 120, 50, 26));

        TKondisiCCTVR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiCCTVR.setText("0");
        Sarana_2.add(TKondisiCCTVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 160, 50, 26));

        TPosisiCCTVD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiCCTVD.setText("0");
        Sarana_2.add(TPosisiCCTVD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 200, 50, 26));

        TPosisiCCTVB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiCCTVB.setText("0");
        Sarana_2.add(TPosisiCCTVB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 240, 50, 26));

        SJumlahKipas.setMajorTickSpacing(1);
        SJumlahKipas.setMaximum(5);
        SJumlahKipas.setMinorTickSpacing(1);
        SJumlahKipas.setValue(0);
        SJumlahKipas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahKipasStateChanged(evt);
            }
        });
        Sarana_2.add(SJumlahKipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        SKondisiKipasB.setMajorTickSpacing(1);
        SKondisiKipasB.setMaximum(5);
        SKondisiKipasB.setMinorTickSpacing(1);
        SKondisiKipasB.setValue(0);
        SKondisiKipasB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiKipasBStateChanged(evt);
            }
        });
        Sarana_2.add(SKondisiKipasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        SKondisiKipasR.setMajorTickSpacing(1);
        SKondisiKipasR.setMaximum(5);
        SKondisiKipasR.setMinorTickSpacing(1);
        SKondisiKipasR.setValue(0);
        SKondisiKipasR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiKipasRStateChanged(evt);
            }
        });
        Sarana_2.add(SKondisiKipasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        SPosisiKipasA.setMajorTickSpacing(1);
        SPosisiKipasA.setMaximum(5);
        SPosisiKipasA.setMinorTickSpacing(1);
        SPosisiKipasA.setValue(0);
        SPosisiKipasA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiKipasAStateChanged(evt);
            }
        });
        Sarana_2.add(SPosisiKipasA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        TJumlahKipas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahKipas.setText("0");
        Sarana_2.add(TJumlahKipas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 50, 26));

        TKondisiKipasB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiKipasB.setText("0");
        Sarana_2.add(TKondisiKipasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 50, 26));

        TKondisiKipasR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiKipasR.setText("0");
        Sarana_2.add(TKondisiKipasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 50, 26));

        TPosisiKipasA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiKipasA.setText("0");
        Sarana_2.add(TPosisiKipasA, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 50, 26));

        CSSID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UMM Hotspot", "Item 2", "Item 3", "Item 4" }));
        Sarana_2.add(CSSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 270, 30));

        SBandwith.setMajorTickSpacing(1);
        SBandwith.setMaximum(1000);
        SBandwith.setMinorTickSpacing(1);
        SBandwith.setValue(0);
        SBandwith.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SBandwithStateChanged(evt);
            }
        });
        Sarana_2.add(SBandwith, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, -1, -1));

        TBandwith.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TBandwith.setText("0");
        Sarana_2.add(TBandwith, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 340, 50, 26));

        NextSarana2.setText("Next");
        NextSarana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextSarana2ActionPerformed(evt);
            }
        });
        Sarana_2.add(NextSarana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 403, 80, 60));

        BackgroundSarana2.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundSarana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/3Sarana2.jpg"))); // NOI18N
        BackgroundSarana2.setOpaque(true);
        Sarana_2.add(BackgroundSarana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getContentPane().add(Sarana_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, 504));

        TombolSarana2.setOpaque(false);
        TombolSarana2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        TombolSarana2.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 50));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        TombolSarana2.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 100, 50));

        getContentPane().add(TombolSarana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 1290, 70));

        Backround1.setBackground(new java.awt.Color(255, 255, 255));
        Backround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/1MenuAwal.png"))); // NOI18N
        Backround1.setOpaque(true);
        getContentPane().add(Backround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextSarana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextSarana2ActionPerformed
        try{
        SetSarana2.setJumlahKipasAngin(Integer.parseInt(TJumlahKipas.getText()));
        SetSarana2.setKondisiKipasAngin(Integer.parseInt(TKondisiKipasB.getText()));
        SetSarana2.setKondisiKipasAnginBuruk(Integer.parseInt(TKondisiKipasR.getText()));
        SetSarana2.setPosisiKipasAngin(Integer.parseInt(TPosisiKipasA.getText()));
        
        SetSarana2.setJumlahAC(Integer.parseInt(TJumlahAC.getText()));
        SetSarana2.setKondisiAC(Integer.parseInt(TKondisiACB.getText()));
        SetSarana2.setKondisiACBuruk(Integer.parseInt(TKondisiACR.getText()));
        SetSarana2.setPosisiACBelakang(Integer.parseInt(TPosisiACB.getText()));
        SetSarana2.setPosisiACSamping(Integer.parseInt(TPosisiACS.getText()));
        
        SetSarana2.setSSID(CSSID.getSelectedItem().toString());
        SetSarana2.setBandwith(Integer.parseInt(TBandwith.getText()));
        
        SetSarana2.setJumlahCCTV(Integer.parseInt(TJumlahCCTV.getText()));
        SetSarana2.setKondisiCCTV(Integer.parseInt(TKondisiCCTVB.getText()));
        SetSarana2.setKondisiCCTVBuruk(Integer.parseInt(TKondisiCCTVR.getText()));
        SetSarana2.setPosisiCCTVBelakang(Integer.parseInt(TPosisiCCTVB.getText()));
        SetSarana2.setPosisiCCTVDepan(Integer.parseInt(TPosisiCCTVD.getText()));
        
        Sarana2.input(SetSarana2.getJumlahKipasAngin(), SetSarana2.getKondisiKipasAngin(), SetSarana2.getKondisiKipasAnginBuruk(), SetSarana2.getPosisiKipasAngin(),
                SetSarana2.getJumlahAC(), SetSarana2.getKondisiAC(), SetSarana2.getKondisiACBuruk(),SetSarana2.getPosisiACBelakang(), SetSarana2.getPosisiACSamping(),
                SetSarana2.getJumlahCCTV(), SetSarana2.getKondisiCCTV(), SetSarana2.getKondisiCCTVBuruk(), SetSarana2.getPosisiCCTVBelakang(),SetSarana2.getPosisiCCTVDepan(),
                SetSarana2.getSSID(),SetSarana2.getBandwith());
        Sarana2.Analisis();
        Sarana2.Sesuai();
        
        DefaultTableModel modelAC = (DefaultTableModel) TableAC.getModel();
        modelAC.addRow(new Object[]{SetSarana2.getJumlahAC(), SetSarana2.getKondisiAC(), 
            SetSarana2.getKondisiACBuruk(),SetSarana2.getPosisiACBelakang(), SetSarana2.getPosisiACSamping()});
        
        DefaultTableModel modelCCTV = (DefaultTableModel) TableCCTV.getModel();
        modelCCTV.addRow(new Object[]{SetSarana2.getJumlahCCTV(), SetSarana2.getKondisiCCTV(), 
            SetSarana2.getKondisiCCTVBuruk(),SetSarana2.getPosisiCCTVDepan(), SetSarana2.getPosisiCCTVBelakang()});
        
        DefaultTableModel modelKA = (DefaultTableModel) TableKipas.getModel();
        modelKA.addRow(new Object[]{SetSarana2.getJumlahKipasAngin(), SetSarana2.getKondisiKipasAngin(), 
            SetSarana2.getKondisiKipasAnginBuruk(), SetSarana2.getPosisiKipasAngin(),SetSarana2.getSSID(),SetSarana2.getBandwith()});
        
        Tabel.setVisible(true);
        Sarana_2.setVisible(false);
        TombolSarana2.setVisible(true);
        
        
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_NextSarana2ActionPerformed

    
    
    private void SJumlahACStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahACStateChanged
        TJumlahAC.setText(String.valueOf(SJumlahAC.getValue()));
        SKondisiACB.setMaximum(SJumlahAC.getValue());
        SPosisiACB.setMaximum(SJumlahAC.getValue());
    }//GEN-LAST:event_SJumlahACStateChanged

    private void SKondisiACBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiACBStateChanged
        SKondisiACB.setMaximum(SJumlahAC.getValue());
        SKondisiACR.setMaximum(SJumlahAC.getValue() - SKondisiACB.getValue());
        SKondisiACR.setMinimum(0);
        TKondisiACB.setText(String.valueOf(SKondisiACB.getValue()));
        TKondisiACR.setText(String.valueOf(SKondisiACR.getValue()));
    }//GEN-LAST:event_SKondisiACBStateChanged

    private void SKondisiACRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiACRStateChanged
        TKondisiACR.setText(String.valueOf(SKondisiACR.getValue()));
    }//GEN-LAST:event_SKondisiACRStateChanged

    private void SPosisiACBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiACBStateChanged
        SPosisiACB.setMaximum(SJumlahAC.getValue());
        SPosisiACS.setMaximum(SJumlahAC.getValue() - SPosisiACB.getValue());
        SPosisiACS.setMinimum(0);
        TPosisiACB.setText(String.valueOf(SPosisiACB.getValue()));
        TPosisiACS.setText(String.valueOf(SPosisiACS.getValue()));
    }//GEN-LAST:event_SPosisiACBStateChanged

    private void SPosisiACSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiACSStateChanged
        TPosisiACS.setText(String.valueOf(SPosisiACS.getValue()));
    }//GEN-LAST:event_SPosisiACSStateChanged

        
    
    
    
    private void SJumlahKipasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahKipasStateChanged
        TJumlahKipas.setText(String.valueOf(SJumlahKipas.getValue()));
        SKondisiKipasB.setMaximum(SJumlahKipas.getValue());
    }//GEN-LAST:event_SJumlahKipasStateChanged

    private void SKondisiKipasBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiKipasBStateChanged
        SKondisiKipasB.setMaximum(SJumlahKipas.getValue());
        SKondisiKipasR.setMaximum(SJumlahKipas.getValue() - SKondisiKipasB.getValue());
        SKondisiKipasR.setMinimum(0);
        TKondisiKipasB.setText(String.valueOf(SKondisiKipasB.getValue()));
        TKondisiKipasR.setText(String.valueOf(SKondisiKipasR.getValue()));
    }//GEN-LAST:event_SKondisiKipasBStateChanged

    private void SKondisiKipasRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiKipasRStateChanged
        TKondisiKipasR.setText(String.valueOf(SKondisiKipasR.getValue()));
    }//GEN-LAST:event_SKondisiKipasRStateChanged

    private void SPosisiKipasAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiKipasAStateChanged
        SPosisiKipasA.setMaximum(SJumlahKipas.getValue());
        TPosisiKipasA.setText(String.valueOf(SPosisiKipasA.getValue()));
    }//GEN-LAST:event_SPosisiKipasAStateChanged

    
    
    
    
    private void SJumlahCCTVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahCCTVStateChanged
        TJumlahCCTV.setText(String.valueOf(SJumlahCCTV.getValue()));
        SKondisiCCTVB.setMaximum(SJumlahCCTV.getValue());
        SPosisiCCTVD.setMaximum(SJumlahCCTV.getValue());
    }//GEN-LAST:event_SJumlahCCTVStateChanged

    private void SKondisiCCTVBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiCCTVBStateChanged
        SKondisiCCTVB.setMaximum(SJumlahCCTV.getValue());
        SKondisiCCTVR.setMaximum(SJumlahCCTV.getValue() - SKondisiCCTVB.getValue());
        SKondisiCCTVR.setMinimum(0);
        TKondisiCCTVB.setText(String.valueOf(SKondisiCCTVB.getValue()));
        TKondisiCCTVR.setText(String.valueOf(SKondisiCCTVR.getValue()));
    }//GEN-LAST:event_SKondisiCCTVBStateChanged

    private void SKondisiCCTVRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiCCTVRStateChanged
        TKondisiCCTVR.setText(String.valueOf(SKondisiCCTVR.getValue()));
    }//GEN-LAST:event_SKondisiCCTVRStateChanged

    private void SPosisiCCTVDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiCCTVDStateChanged
        SPosisiCCTVD.setMaximum(SJumlahCCTV.getValue());
        SPosisiCCTVB.setMaximum(SJumlahCCTV.getValue() - SPosisiCCTVD.getValue());
        SPosisiCCTVB.setMinimum(0);
        TPosisiCCTVD.setText(String.valueOf(SPosisiCCTVD.getValue()));
        TPosisiCCTVB.setText(String.valueOf(SPosisiCCTVB.getValue()));
    }//GEN-LAST:event_SPosisiCCTVDStateChanged

    private void SPosisiCCTVBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiCCTVBStateChanged
        TPosisiCCTVB.setText(String.valueOf(SPosisiCCTVB.getValue()));
    }//GEN-LAST:event_SPosisiCCTVBStateChanged

    
    
   
    
    private void SBandwithStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SBandwithStateChanged
        TBandwith.setText(String.valueOf(SBandwith.getValue()));
    }//GEN-LAST:event_SBandwithStateChanged

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Keadaan.Keadaan();
        Sarana2.Save();
        this.setVisible(false);
        Tabel.setVisible(false);
        Sarana_2.setVisible(true);
        TombolSarana2.setVisible(false);
    }//GEN-LAST:event_SaveActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Sarana_2.setVisible(true);
        Tabel.setVisible(false);
        TombolSarana2.setVisible(false);
    }//GEN-LAST:event_EditActionPerformed

    public void Sarana2() {
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
            java.util.logging.Logger.getLogger(TampilanSarana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanSarana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanSarana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanSarana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundSarana2;
    private javax.swing.JLabel Backround1;
    private javax.swing.JComboBox CSSID;
    private javax.swing.JButton Edit;
    private javax.swing.JButton NextSarana2;
    private javax.swing.JSlider SBandwith;
    private javax.swing.JSlider SJumlahAC;
    private javax.swing.JSlider SJumlahCCTV;
    private javax.swing.JSlider SJumlahKipas;
    private javax.swing.JSlider SKondisiACB;
    private javax.swing.JSlider SKondisiACR;
    private javax.swing.JSlider SKondisiCCTVB;
    private javax.swing.JSlider SKondisiCCTVR;
    private javax.swing.JSlider SKondisiKipasB;
    private javax.swing.JSlider SKondisiKipasR;
    private javax.swing.JSlider SPosisiACB;
    private javax.swing.JSlider SPosisiACS;
    private javax.swing.JSlider SPosisiCCTVB;
    private javax.swing.JSlider SPosisiCCTVD;
    private javax.swing.JSlider SPosisiKipasA;
    private javax.swing.JPanel Sarana_2;
    private javax.swing.JButton Save;
    private javax.swing.JTextField TBandwith;
    private javax.swing.JTextField TJumlahAC;
    private javax.swing.JTextField TJumlahCCTV;
    private javax.swing.JTextField TJumlahKipas;
    private javax.swing.JTextField TKondisiACB;
    private javax.swing.JTextField TKondisiACR;
    private javax.swing.JTextField TKondisiCCTVB;
    private javax.swing.JTextField TKondisiCCTVR;
    private javax.swing.JTextField TKondisiKipasB;
    private javax.swing.JTextField TKondisiKipasR;
    private javax.swing.JTextField TPosisiACB;
    private javax.swing.JTextField TPosisiACS;
    private javax.swing.JTextField TPosisiCCTVB;
    private javax.swing.JTextField TPosisiCCTVD;
    private javax.swing.JTextField TPosisiKipasA;
    private javax.swing.JPanel Tabel;
    private javax.swing.JScrollPane TabelAC;
    private javax.swing.JScrollPane TabelKipas;
    private javax.swing.JTable TableAC;
    private javax.swing.JTable TableCCTV;
    private javax.swing.JTable TableKipas;
    private javax.swing.JScrollPane TebelCCTV;
    private javax.swing.JPanel TombolSarana2;
    // End of variables declaration//GEN-END:variables
}
