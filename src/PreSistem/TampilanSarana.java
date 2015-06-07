package PreSistem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TampilanSarana extends javax.swing.JFrame {

    SaranaTest SaranaTest = new SaranaTest();
    SaranaRuangan SetSarana = new SaranaRuangan();
    TampilanSarana2 Sarana2 = new TampilanSarana2();
    
    public TampilanSarana() {
        initComponents();
        Sarana.setVisible(true);
        TombolSarana.setVisible(false);
        Tabel.setVisible(false);
    }
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabel = new javax.swing.JPanel();
        TabelLCD = new javax.swing.JScrollPane();
        TableLampu = new javax.swing.JTable();
        TabelSteker = new javax.swing.JScrollPane();
        TableSteker = new javax.swing.JTable();
        Sarana = new javax.swing.JPanel();
        SJumlahSteker = new javax.swing.JSlider();
        SKondisiStekerB = new javax.swing.JSlider();
        SKondisiStekerR = new javax.swing.JSlider();
        SPosisiStekerDD = new javax.swing.JSlider();
        SPosisiStekerPJ = new javax.swing.JSlider();
        TJumlahSteker = new javax.swing.JTextField();
        TKondisiStekerB = new javax.swing.JTextField();
        TKondisiStekerR = new javax.swing.JTextField();
        TPosisiStekerDD = new javax.swing.JTextField();
        TPosisiStekerPJ = new javax.swing.JTextField();
        SJumlahLampu = new javax.swing.JSlider();
        SKondisiLampuB = new javax.swing.JSlider();
        SKondisiLampuR = new javax.swing.JSlider();
        SPosisiLampuL = new javax.swing.JSlider();
        TJumlahLampu = new javax.swing.JTextField();
        TKondisiLampuB = new javax.swing.JTextField();
        TKondisiLampuR = new javax.swing.JTextField();
        TPosisiLampuL = new javax.swing.JTextField();
        SJumlahLCD = new javax.swing.JSlider();
        SKondisiLCDB = new javax.swing.JSlider();
        SKondisiLCDR = new javax.swing.JSlider();
        SPosisiLCDDD = new javax.swing.JSlider();
        TJumlahLCD = new javax.swing.JTextField();
        TKondisiLCDB = new javax.swing.JTextField();
        TKondisiLCDR = new javax.swing.JTextField();
        TPosisiLCDDD = new javax.swing.JTextField();
        NextSarana1 = new javax.swing.JButton();
        BackgroundSarana = new javax.swing.JLabel();
        TombolSarana = new javax.swing.JPanel();
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

        TableLampu.setAutoCreateRowSorter(true);
        TableLampu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah Kabel Lampu", "Kondisi Kabel Lampu Baik", "Kondisi Kabel Lampu Rusak", "Posisi Kabel Lampu", "Rata - Rata Sesuai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelLCD.setViewportView(TableLampu);

        Tabel.add(TabelLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1310, 180));

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

        Tabel.add(TabelSteker, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 1310, 290));

        getContentPane().add(Tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Sarana.setMaximumSize(new java.awt.Dimension(1350, 504));
        Sarana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SJumlahSteker.setMajorTickSpacing(1);
        SJumlahSteker.setMaximum(5);
        SJumlahSteker.setMinorTickSpacing(1);
        SJumlahSteker.setValue(0);
        SJumlahSteker.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahStekerStateChanged(evt);
            }
        });
        Sarana.add(SJumlahSteker, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        SKondisiStekerB.setMajorTickSpacing(1);
        SKondisiStekerB.setMaximum(5);
        SKondisiStekerB.setMinorTickSpacing(1);
        SKondisiStekerB.setValue(0);
        SKondisiStekerB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiStekerBStateChanged(evt);
            }
        });
        Sarana.add(SKondisiStekerB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        SKondisiStekerR.setMajorTickSpacing(1);
        SKondisiStekerR.setMaximum(5);
        SKondisiStekerR.setMinorTickSpacing(1);
        SKondisiStekerR.setValue(0);
        SKondisiStekerR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiStekerRStateChanged(evt);
            }
        });
        Sarana.add(SKondisiStekerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        SPosisiStekerDD.setMajorTickSpacing(1);
        SPosisiStekerDD.setMaximum(5);
        SPosisiStekerDD.setMinorTickSpacing(1);
        SPosisiStekerDD.setValue(0);
        SPosisiStekerDD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiStekerDDStateChanged(evt);
            }
        });
        Sarana.add(SPosisiStekerDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        SPosisiStekerPJ.setMajorTickSpacing(1);
        SPosisiStekerPJ.setMaximum(5);
        SPosisiStekerPJ.setMinorTickSpacing(1);
        SPosisiStekerPJ.setValue(0);
        SPosisiStekerPJ.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiStekerPJStateChanged(evt);
            }
        });
        Sarana.add(SPosisiStekerPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        TJumlahSteker.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahSteker.setText("0");
        Sarana.add(TJumlahSteker, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 50, 26));

        TKondisiStekerB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiStekerB.setText("0");
        Sarana.add(TKondisiStekerB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 50, 26));

        TKondisiStekerR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiStekerR.setText("0");
        Sarana.add(TKondisiStekerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 50, 26));

        TPosisiStekerDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiStekerDD.setText("0");
        Sarana.add(TPosisiStekerDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 50, 26));

        TPosisiStekerPJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiStekerPJ.setText("0");
        Sarana.add(TPosisiStekerPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 50, 26));

        SJumlahLampu.setMajorTickSpacing(1);
        SJumlahLampu.setMaximum(20);
        SJumlahLampu.setMinorTickSpacing(1);
        SJumlahLampu.setValue(0);
        SJumlahLampu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahLampuStateChanged(evt);
            }
        });
        Sarana.add(SJumlahLampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, -1, -1));

        SKondisiLampuB.setMajorTickSpacing(1);
        SKondisiLampuB.setMaximum(20);
        SKondisiLampuB.setMinorTickSpacing(1);
        SKondisiLampuB.setValue(0);
        SKondisiLampuB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiLampuBStateChanged(evt);
            }
        });
        Sarana.add(SKondisiLampuB, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));

        SKondisiLampuR.setMajorTickSpacing(1);
        SKondisiLampuR.setMaximum(20);
        SKondisiLampuR.setMinorTickSpacing(1);
        SKondisiLampuR.setValue(0);
        SKondisiLampuR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiLampuRStateChanged(evt);
            }
        });
        Sarana.add(SKondisiLampuR, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, -1, -1));

        SPosisiLampuL.setMajorTickSpacing(1);
        SPosisiLampuL.setMaximum(20);
        SPosisiLampuL.setMinorTickSpacing(1);
        SPosisiLampuL.setValue(0);
        SPosisiLampuL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiLampuLStateChanged(evt);
            }
        });
        Sarana.add(SPosisiLampuL, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, -1));

        TJumlahLampu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahLampu.setText("0");
        Sarana.add(TJumlahLampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 80, 50, 26));

        TKondisiLampuB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiLampuB.setText("0");
        Sarana.add(TKondisiLampuB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 120, 50, 26));

        TKondisiLampuR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiLampuR.setText("0");
        Sarana.add(TKondisiLampuR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 160, 50, 26));

        TPosisiLampuL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiLampuL.setText("0");
        Sarana.add(TPosisiLampuL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 200, 50, 26));

        SJumlahLCD.setMajorTickSpacing(1);
        SJumlahLCD.setMaximum(2);
        SJumlahLCD.setMinorTickSpacing(1);
        SJumlahLCD.setValue(0);
        SJumlahLCD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SJumlahLCDStateChanged(evt);
            }
        });
        Sarana.add(SJumlahLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        SKondisiLCDB.setMajorTickSpacing(1);
        SKondisiLCDB.setMaximum(2);
        SKondisiLCDB.setMinorTickSpacing(1);
        SKondisiLCDB.setValue(0);
        SKondisiLCDB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiLCDBStateChanged(evt);
            }
        });
        Sarana.add(SKondisiLCDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        SKondisiLCDR.setMajorTickSpacing(1);
        SKondisiLCDR.setMaximum(2);
        SKondisiLCDR.setMinorTickSpacing(1);
        SKondisiLCDR.setValue(0);
        SKondisiLCDR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SKondisiLCDRStateChanged(evt);
            }
        });
        Sarana.add(SKondisiLCDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        SPosisiLCDDD.setMajorTickSpacing(1);
        SPosisiLCDDD.setMaximum(2);
        SPosisiLCDDD.setMinorTickSpacing(1);
        SPosisiLCDDD.setValue(0);
        SPosisiLCDDD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPosisiLCDDDStateChanged(evt);
            }
        });
        Sarana.add(SPosisiLCDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        TJumlahLCD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TJumlahLCD.setText("0");
        Sarana.add(TJumlahLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 50, 26));

        TKondisiLCDB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiLCDB.setText("0");
        Sarana.add(TKondisiLCDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 50, 26));

        TKondisiLCDR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TKondisiLCDR.setText("0");
        Sarana.add(TKondisiLCDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 50, 26));

        TPosisiLCDDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TPosisiLCDDD.setText("0");
        Sarana.add(TPosisiLCDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 50, 26));

        NextSarana1.setText("Next");
        NextSarana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextSarana1ActionPerformed(evt);
            }
        });
        Sarana.add(NextSarana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 400, 80, 60));

        BackgroundSarana.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundSarana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/3Sarana1.jpg"))); // NOI18N
        BackgroundSarana.setOpaque(true);
        Sarana.add(BackgroundSarana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getContentPane().add(Sarana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, 504));

        TombolSarana.setOpaque(false);
        TombolSarana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        TombolSarana.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 50));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        TombolSarana.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 100, 50));

        getContentPane().add(TombolSarana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 1290, 70));

        Backround1.setBackground(new java.awt.Color(255, 255, 255));
        Backround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/1MenuAwal.png"))); // NOI18N
        Backround1.setOpaque(true);
        getContentPane().add(Backround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextSarana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextSarana1ActionPerformed
    try{
        SetSarana.setJumlahSteker(Integer.parseInt(TJumlahSteker.getText()));
        SetSarana.setKondisiSteker(Integer.parseInt(TKondisiStekerB.getText()));
        SetSarana.setKondisiStekerR(Integer.parseInt(TKondisiStekerR.getText()));
        SetSarana.setPosisiStekerDD(Integer.parseInt(TPosisiStekerDD.getText()));
        SetSarana.setPosisiStekerPR(Integer.parseInt(TPosisiStekerPJ.getText()));
        
        SetSarana.setJumlahLampu(Integer.parseInt(TJumlahLampu.getText()));
        SetSarana.setKondisiLampu(Integer.parseInt(TKondisiLampuB.getText()));
        SetSarana.setKondisiLampuR(Integer.parseInt(TKondisiLampuR.getText()));
        SetSarana.setPosisiLampuL(Integer.parseInt(TPosisiLampuL.getText()));
        
        SetSarana.setJumlahKabelLCD(Integer.parseInt(TJumlahLCD.getText()));
        SetSarana.setKondisiKabelLCD(Integer.parseInt(TKondisiLCDB.getText()));
        SetSarana.setKondisiKabelLCDR(Integer.parseInt(TKondisiLCDR.getText()));
        SetSarana.setPosisiKabelLCDDD(Integer.parseInt(TPosisiLCDDD.getText()));
        
        SaranaTest.input(SetSarana.getJumlahSteker(), SetSarana.getKondisiSteker(), SetSarana.getKondisiStekerR(), SetSarana.getPosisiStekerDD(),SetSarana.getPosisiStekerPR(),
                SetSarana.getJumlahLampu(), SetSarana.getKondisiLampu(), SetSarana.getKondisiLampuR(),SetSarana.getPosisiLampuL(),
                SetSarana.getJumlahKabelLCD(), SetSarana.getKondisiKabelLCD(), SetSarana.getKondisiKabelLCDR(), SetSarana.getPosisiKabelLCDDD());
        SaranaTest.Analisis();
        SaranaTest.Sesuai();
        
        DefaultTableModel modelSteker = (DefaultTableModel) TableSteker.getModel();
        modelSteker.addRow(new Object[]{SetSarana.getJumlahSteker(),SetSarana.getKondisiSteker(),SetSarana.getKondisiStekerR(),
            SetSarana.getPosisiStekerDD(),SetSarana.getPosisiStekerPR(),SetSarana.getJumlahKabelLCD(),SetSarana.getKondisiKabelLCD(),
            SetSarana.getKondisiKabelLCDR(),SetSarana.getPosisiKabelLCDDD()});
        
        DefaultTableModel modelLampu = (DefaultTableModel) TableLampu.getModel();
        modelLampu.addRow(new Object[]{SetSarana.getJumlahSteker(),SetSarana.getKondisiSteker(),SetSarana.getKondisiStekerR(),
            SetSarana.getPosisiStekerDD(),SaranaTest.SaranaRuang_Sesuai});
        Tabel.setVisible(true);
        Sarana.setVisible(false);
        TombolSarana.setVisible(true);
        
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_NextSarana1ActionPerformed

    
    
    
    private void SJumlahStekerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahStekerStateChanged
        TJumlahSteker.setText(String.valueOf(SJumlahSteker.getValue()));
        SKondisiStekerB.setMaximum(SJumlahSteker.getValue());
        SPosisiStekerDD.setMaximum(SJumlahSteker.getValue());
    }//GEN-LAST:event_SJumlahStekerStateChanged

    private void SKondisiStekerBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiStekerBStateChanged
        SKondisiStekerB.setMaximum(SJumlahSteker.getValue());
        SKondisiStekerR.setMaximum(SJumlahSteker.getValue() - SKondisiStekerB.getValue());
        SKondisiStekerR.setMinimum(0);
        TKondisiStekerB.setText(String.valueOf(SKondisiStekerB.getValue()));
        TKondisiStekerR.setText(String.valueOf(SKondisiStekerR.getValue()));
    }//GEN-LAST:event_SKondisiStekerBStateChanged

    private void SKondisiStekerRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiStekerRStateChanged
        TKondisiStekerR.setText(String.valueOf(SKondisiStekerR.getValue()));
    }//GEN-LAST:event_SKondisiStekerRStateChanged

    private void SPosisiStekerDDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiStekerDDStateChanged
        SPosisiStekerDD.setMaximum(SJumlahSteker.getValue());
        SPosisiStekerPJ.setMaximum(SJumlahSteker.getValue() - SPosisiStekerDD.getValue());
        SPosisiStekerPJ.setMinimum(0);
        TPosisiStekerDD.setText(String.valueOf(SPosisiStekerDD.getValue()));
        TPosisiStekerPJ.setText(String.valueOf(SPosisiStekerPJ.getValue()));
    }//GEN-LAST:event_SPosisiStekerDDStateChanged

    private void SPosisiStekerPJStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiStekerPJStateChanged
        TPosisiStekerPJ.setText(String.valueOf(SPosisiStekerPJ.getValue()));
    }//GEN-LAST:event_SPosisiStekerPJStateChanged

    
    
    
    private void SJumlahLCDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahLCDStateChanged
        TJumlahLCD.setText(String.valueOf(SJumlahLCD.getValue()));
        SKondisiLCDB.setMaximum(SJumlahLCD.getValue());
    }//GEN-LAST:event_SJumlahLCDStateChanged

    private void SKondisiLCDBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiLCDBStateChanged
        SKondisiLCDB.setMaximum(SJumlahLCD.getValue());
        SKondisiLCDR.setMaximum(SJumlahLCD.getValue() - SKondisiLCDB.getValue());
        SKondisiLCDR.setMinimum(0);
        TKondisiLCDB.setText(String.valueOf(SKondisiLCDB.getValue()));
        TKondisiLCDR.setText(String.valueOf(SKondisiLCDR.getValue()));
    }//GEN-LAST:event_SKondisiLCDBStateChanged

    private void SKondisiLCDRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiLCDRStateChanged
        TKondisiLCDR.setText(String.valueOf(SKondisiLCDR.getValue()));
    }//GEN-LAST:event_SKondisiLCDRStateChanged

    private void SPosisiLCDDDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiLCDDDStateChanged
        SPosisiLCDDD.setMaximum(SJumlahLCD.getValue());
        TPosisiLCDDD.setText(String.valueOf(SPosisiLCDDD.getValue()));
    }//GEN-LAST:event_SPosisiLCDDDStateChanged

    
    
       
    private void SJumlahLampuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SJumlahLampuStateChanged
        TJumlahLampu.setText(String.valueOf(SJumlahLampu.getValue()));
        SKondisiLampuB.setMaximum(SJumlahLampu.getValue());
    }//GEN-LAST:event_SJumlahLampuStateChanged
  
    private void SKondisiLampuBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiLampuBStateChanged
        SKondisiLampuB.setMaximum(SJumlahLampu.getValue());
        SKondisiLampuR.setMaximum(SJumlahLampu.getValue() - SKondisiLampuB.getValue());
        SKondisiLampuR.setMinimum(0);
        TKondisiLampuB.setText(String.valueOf(SKondisiLampuB.getValue()));
        TKondisiLampuR.setText(String.valueOf(SKondisiLampuR.getValue()));
    }//GEN-LAST:event_SKondisiLampuBStateChanged

    private void SKondisiLampuRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SKondisiLampuRStateChanged
        TKondisiLampuR.setText(String.valueOf(SKondisiLampuR.getValue()));
    }//GEN-LAST:event_SKondisiLampuRStateChanged

    private void SPosisiLampuLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPosisiLampuLStateChanged
        SPosisiLampuL.setMaximum(SJumlahLampu.getValue());
        TPosisiLampuL.setText(String.valueOf(SPosisiLampuL.getValue()));
    }//GEN-LAST:event_SPosisiLampuLStateChanged

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Sarana2.Sarana2();
        SaranaTest.Save();
        this.setVisible(false);
        Tabel.setVisible(false);
        Sarana.setVisible(true);
        TombolSarana.setVisible(false);
    }//GEN-LAST:event_SaveActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Sarana.setVisible(true);
        Tabel.setVisible(false);
        TombolSarana.setVisible(false);
    }//GEN-LAST:event_EditActionPerformed

     /*public void Tablee(){
        Backround1.setVisible(false);
        BackgroundSarana.setVisible(false);
        this.setVisible(true);
        yhis.setVi
        Tabel.setVisible(true);
    }*/
    
    
    public void Sarana() {
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
            java.util.logging.Logger.getLogger(TampilanSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundSarana;
    private javax.swing.JLabel Backround1;
    private javax.swing.JButton Edit;
    private javax.swing.JButton NextSarana1;
    private javax.swing.JSlider SJumlahLCD;
    private javax.swing.JSlider SJumlahLampu;
    private javax.swing.JSlider SJumlahSteker;
    private javax.swing.JSlider SKondisiLCDB;
    private javax.swing.JSlider SKondisiLCDR;
    private javax.swing.JSlider SKondisiLampuB;
    private javax.swing.JSlider SKondisiLampuR;
    private javax.swing.JSlider SKondisiStekerB;
    private javax.swing.JSlider SKondisiStekerR;
    private javax.swing.JSlider SPosisiLCDDD;
    private javax.swing.JSlider SPosisiLampuL;
    private javax.swing.JSlider SPosisiStekerDD;
    private javax.swing.JSlider SPosisiStekerPJ;
    private javax.swing.JPanel Sarana;
    private javax.swing.JButton Save;
    private javax.swing.JTextField TJumlahLCD;
    private javax.swing.JTextField TJumlahLampu;
    private javax.swing.JTextField TJumlahSteker;
    private javax.swing.JTextField TKondisiLCDB;
    private javax.swing.JTextField TKondisiLCDR;
    private javax.swing.JTextField TKondisiLampuB;
    private javax.swing.JTextField TKondisiLampuR;
    private javax.swing.JTextField TKondisiStekerB;
    private javax.swing.JTextField TKondisiStekerR;
    private javax.swing.JTextField TPosisiLCDDD;
    private javax.swing.JTextField TPosisiLampuL;
    private javax.swing.JTextField TPosisiStekerDD;
    private javax.swing.JTextField TPosisiStekerPJ;
    private javax.swing.JPanel Tabel;
    private javax.swing.JScrollPane TabelLCD;
    private javax.swing.JScrollPane TabelSteker;
    private javax.swing.JTable TableLampu;
    private javax.swing.JTable TableSteker;
    private javax.swing.JPanel TombolSarana;
    // End of variables declaration//GEN-END:variables
}
