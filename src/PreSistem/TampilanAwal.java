package PreSistem;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class TampilanAwal extends javax.swing.JFrame {

    
    TampilanIdentitas TID = new TampilanIdentitas();
    TampilanLihatData LData = new TampilanLihatData();
    TampilanKalender Kalender = new TampilanKalender();
    boolean menu = true;
    int TimeRun = 0;
    
    public TampilanAwal() {
        initComponents();
        new Thread(){
            public void run(){
                while(TimeRun == 0){
                    Calendar cal = new GregorianCalendar();
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    
                    String hari = "";
                    if(AM_PM == 1){
                        hari = "PM";
                    }else{
                        hari = "AM";
                    }
                    String time = hour +":"+min+":"+sec+" "+hari;
                    Jam.setText(time);
                }
            }
        }.start();
        Menu.setVisible(false);
        Profil.setVisible(false);
        SetAkun.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jam = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Minimaze = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        Login = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        CreatAkun = new javax.swing.JButton();
        BackgroundLogin = new javax.swing.JLabel();
        Profil = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        BackgroundProfil = new javax.swing.JLabel();
        SetAkun = new javax.swing.JPanel();
        SetUsername = new javax.swing.JTextField();
        SetPassword = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();
        CreatAkunButton = new javax.swing.JButton();
        BackgroundCreatAkun = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Tanggal = new javax.swing.JButton();
        InputData = new javax.swing.JButton();
        LihatData = new javax.swing.JButton();
        Akun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Menu1 = new javax.swing.JLabel();
        TombolMenu = new javax.swing.JLabel();
        Backround1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jam.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Jam.setForeground(new java.awt.Color(0, 165, 255));
        Jam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 220, 40));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Exit.png"))); // NOI18N
        Exit.setContentAreaFilled(false);
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 40, 40));

        Minimaze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Minimize.png"))); // NOI18N
        Minimaze.setContentAreaFilled(false);
        Minimaze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimaze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimazeActionPerformed(evt);
            }
        });
        getContentPane().add(Minimaze, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 40));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/LogOut.png"))); // NOI18N
        Logout.setContentAreaFilled(false);
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 70, 60, 60));

        Login.setMaximumSize(new java.awt.Dimension(1350, 720));
        Login.setMinimumSize(new java.awt.Dimension(1350, 720));
        Login.setOpaque(false);
        Login.setPreferredSize(new java.awt.Dimension(1350, 720));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setBackground(new java.awt.Color(0, 0, 0));
        Username.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setBorder(null);
        Username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Username.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Username.setSelectionColor(new java.awt.Color(255, 255, 255));
        Login.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 217, 260, 60));

        Password.setBackground(new java.awt.Color(0, 0, 0));
        Password.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        Password.setCaretColor(new java.awt.Color(255, 255, 255));
        Password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Password.setMaximumSize(new java.awt.Dimension(260, 60));
        Password.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Password.setSelectionColor(new java.awt.Color(255, 255, 255));
        Login.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 328, 260, 60));

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        Login.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 443, 100, 50));

        CreatAkun.setText("Creat Akun");
        CreatAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatAkunActionPerformed(evt);
            }
        });
        Login.add(CreatAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 443, 100, 50));

        BackgroundLogin.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/01Login.png"))); // NOI18N
        BackgroundLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackgroundLogin.setOpaque(true);
        Login.add(BackgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, 591));

        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 720));

        Profil.setOpaque(false);
        Profil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        Profil.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 87, 260, 60));

        Pass.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Profil.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 198, 260, 60));

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        Profil.add(OKButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 100, 50));

        BackgroundProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/01Login.png"))); // NOI18N
        BackgroundProfil.setToolTipText("");
        Profil.add(BackgroundProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getContentPane().add(Profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, -1));

        SetAkun.setMaximumSize(new java.awt.Dimension(1350, 720));
        SetAkun.setMinimumSize(new java.awt.Dimension(1350, 720));
        SetAkun.setOpaque(false);
        SetAkun.setPreferredSize(new java.awt.Dimension(1350, 720));
        SetAkun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SetUsername.setBackground(new java.awt.Color(0, 0, 0));
        SetUsername.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        SetUsername.setForeground(new java.awt.Color(255, 255, 255));
        SetUsername.setToolTipText("");
        SetUsername.setBorder(null);
        SetUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        SetUsername.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        SetUsername.setMaximumSize(new java.awt.Dimension(260, 60));
        SetUsername.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        SetUsername.setSelectionColor(new java.awt.Color(255, 255, 255));
        SetAkun.add(SetUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 217, 260, 60));

        SetPassword.setBackground(new java.awt.Color(0, 0, 0));
        SetPassword.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        SetPassword.setForeground(new java.awt.Color(255, 255, 255));
        SetPassword.setBorder(null);
        SetPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        SetPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        SetPassword.setMaximumSize(new java.awt.Dimension(260, 60));
        SetPassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        SetPassword.setSelectionColor(new java.awt.Color(255, 255, 255));
        SetAkun.add(SetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 328, 260, 60));

        ConfirmPassword.setBackground(new java.awt.Color(0, 0, 0));
        ConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        ConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPassword.setBorder(null);
        ConfirmPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        ConfirmPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ConfirmPassword.setMaximumSize(new java.awt.Dimension(260, 60));
        ConfirmPassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ConfirmPassword.setSelectionColor(new java.awt.Color(255, 255, 255));
        SetAkun.add(ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 438, 260, 60));

        CreatAkunButton.setText("Creat Akun");
        CreatAkunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatAkunButtonActionPerformed(evt);
            }
        });
        SetAkun.add(CreatAkunButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 553, 120, 50));

        BackgroundCreatAkun.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundCreatAkun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/0CreatAkun.png"))); // NOI18N
        BackgroundCreatAkun.setOpaque(true);
        SetAkun.add(BackgroundCreatAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, 591));

        getContentPane().add(SetAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 720));

        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tanggal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/IconTanggal1.png"))); // NOI18N
        Tanggal.setContentAreaFilled(false);
        Tanggal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tanggal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tanggal.setMaximumSize(new java.awt.Dimension(205, 181));
        Tanggal.setMinimumSize(new java.awt.Dimension(205, 181));
        Tanggal.setPreferredSize(new java.awt.Dimension(205, 181));
        Tanggal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TanggalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TanggalMouseExited(evt);
            }
        });
        Tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalActionPerformed(evt);
            }
        });
        Menu.add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 180, 170, 170));

        InputData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/InputData.png"))); // NOI18N
        InputData.setContentAreaFilled(false);
        InputData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InputData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InputDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InputDataMouseExited(evt);
            }
        });
        InputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDataActionPerformed(evt);
            }
        });
        Menu.add(InputData, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 170, 170));

        LihatData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/LihatData.png"))); // NOI18N
        LihatData.setContentAreaFilled(false);
        LihatData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LihatData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LihatData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LihatDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LihatDataMouseExited(evt);
            }
        });
        LihatData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LihatDataActionPerformed(evt);
            }
        });
        Menu.add(LihatData, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 190, 170, 170));

        Akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Akun.png"))); // NOI18N
        Akun.setContentAreaFilled(false);
        Akun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Akun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Akun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AkunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AkunMouseExited(evt);
            }
        });
        Akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AkunActionPerformed(evt);
            }
        });
        Menu.add(Akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 180, 170, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lihat Data");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Profile");
        Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal");
        Menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Input Data");
        Menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        Menu1.setBackground(new java.awt.Color(255, 255, 255));
        Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/2BackroundMenu.jpg"))); // NOI18N
        Menu1.setOpaque(true);
        Menu.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1350, -1));

        TombolMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TombolMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Rounded Rectangle 1.png"))); // NOI18N
        TombolMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TombolMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TombolMenuMouseExited(evt);
            }
        });
        getContentPane().add(TombolMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 640, 50, 40));

        Backround1.setBackground(new java.awt.Color(255, 255, 255));
        Backround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/1MenuAwal.png"))); // NOI18N
        Backround1.setOpaque(true);
        getContentPane().add(Backround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void TombolMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolMenuMouseClicked
        if(menu == true){
            Menu.setVisible(true);
            menu = false;
        }else if(menu == false){
            Menu.setVisible(false);
            menu = true;
        }
    }//GEN-LAST:event_TombolMenuMouseClicked

    
    
    
    
    LogIn login = new LogIn();
    boolean AkunLogin = false;
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if(Username.getText() != "" ||Username.getText() != null  ||Password.getText() != null||Password.getText() != ""){
          login.SetLogin(Username.getText(), Password.getText());
            if(login.Next == true){
                Login.setVisible(false);
                AkunLogin = true;
            }  
        }
        User.setText(Username.getText());
        Pass.setText(Password.getText());
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CreatAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatAkunActionPerformed
        SetAkun.setVisible(true);
        Login.setVisible(false);
    }//GEN-LAST:event_CreatAkunActionPerformed

    private void CreatAkunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatAkunButtonActionPerformed
        if(SetUsername.getText() != "" && SetPassword.getText() != "" && ConfirmPassword.getText() != ""){
         login.SetMater(SetUsername.getText(), SetPassword.getText(), ConfirmPassword.getText());
            if(login.Next == true){
                Login.setVisible(true);
                SetAkun.setVisible(false);
            }
        }
        
    }//GEN-LAST:event_CreatAkunButtonActionPerformed

    
    
    private void TanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanggalActionPerformed
        Kalender.Kalender();
        Menu.setVisible(false);
        TombolMenu.setVisible(true);
        menu = true;
    }//GEN-LAST:event_TanggalActionPerformed

    private void InputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDataActionPerformed
        TID.Input();
        Menu.setVisible(false);
        TombolMenu.setVisible(true);
        menu = true;
    }//GEN-LAST:event_InputDataActionPerformed

    private void LihatDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LihatDataActionPerformed
        LData.Data();
        Menu.setVisible(false);
        TombolMenu.setVisible(true);
        menu = true;
    }//GEN-LAST:event_LihatDataActionPerformed

    private void AkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AkunActionPerformed
        Profil.setVisible(true);
        Menu.setVisible(false);
        menu = true;
    }//GEN-LAST:event_AkunActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        Profil.setVisible(false);
        TombolMenu.setVisible(true);
    }//GEN-LAST:event_OKButtonActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Username.setText("");
        Password.setText("");
        Login.setVisible(true);
        Menu.setVisible(false);
        Profil.setVisible(false);
        SetAkun.setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

    private void MinimazeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimazeActionPerformed
        setState(ICONIFIED);
    }//GEN-LAST:event_MinimazeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/LogOut2.png")));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
         Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/LogOut.png")));
    }//GEN-LAST:event_LogoutMouseExited

    private void TanggalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TanggalMouseEntered
        Tanggal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/IconTanggal2.png")));
    }//GEN-LAST:event_TanggalMouseEntered

    private void TanggalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TanggalMouseExited
        Tanggal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/IconTanggal1.png")));
    }//GEN-LAST:event_TanggalMouseExited

    private void InputDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputDataMouseEntered
        InputData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/InputData2.png"))); // NOI18N
    }//GEN-LAST:event_InputDataMouseEntered

    private void InputDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputDataMouseExited
        InputData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/InputData.png"))); // NOI18N
    }//GEN-LAST:event_InputDataMouseExited

    private void LihatDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatDataMouseEntered
        LihatData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/LihatData2.png"))); // NOI18N
    }//GEN-LAST:event_LihatDataMouseEntered

    private void LihatDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatDataMouseExited
        LihatData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/LihatData.png"))); // NOI18N
    }//GEN-LAST:event_LihatDataMouseExited

    private void AkunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AkunMouseEntered
        Akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Akun2.png"))); // NOI18N
    }//GEN-LAST:event_AkunMouseEntered

    private void AkunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AkunMouseExited
        Akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Akun.png"))); // NOI18N
    }//GEN-LAST:event_AkunMouseExited

    private void TombolMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolMenuMouseEntered
        TombolMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Rounded Rectangle 2.png"))); // NOI18N
    }//GEN-LAST:event_TombolMenuMouseEntered

    private void TombolMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolMenuMouseExited
        TombolMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreSistem/Images/Rounded Rectangle 1.png"))); // NOI18N
    }//GEN-LAST:event_TombolMenuMouseExited
         
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Akun;
    private javax.swing.JLabel BackgroundCreatAkun;
    private javax.swing.JLabel BackgroundLogin;
    private javax.swing.JLabel BackgroundProfil;
    private javax.swing.JLabel Backround1;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JButton CreatAkun;
    private javax.swing.JButton CreatAkunButton;
    private javax.swing.JButton Exit;
    private javax.swing.JButton InputData;
    private javax.swing.JLabel Jam;
    private javax.swing.JButton LihatData;
    private javax.swing.JPanel Login;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Menu1;
    private javax.swing.JButton Minimaze;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel Pass;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Profil;
    private javax.swing.JPanel SetAkun;
    private javax.swing.JPasswordField SetPassword;
    private javax.swing.JTextField SetUsername;
    private javax.swing.JButton Tanggal;
    private javax.swing.JLabel TombolMenu;
    private javax.swing.JLabel User;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
