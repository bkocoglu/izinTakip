/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DBcontroller;
import controller.GirisController;
import controller.KayitController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JPasswordField;
import model.GirisModel;
import model.KayitModel;

/**
 *
 * @author pC2
 */
public class AnaEkran extends javax.swing.JFrame {
    
    private DBcontroller dbc = new DBcontroller();
    private GirisController girisController = new GirisController();
    private GirisModel girisModel = girisController.getGirisModel();
    
    
    
    /**
     * Creates new form AnaEkran
     */
    public AnaEkran() {
        initComponents();
        Toolkit kit = Toolkit.getDefaultToolkit();
        int ekranX = kit.getScreenSize().width;
        int ekranY = kit.getScreenSize().height;
        int ortaNoktaX = (ekranX-this.getSize().width)/2;
        int ortaNoktaY = (ekranY-this.getSize().height)/2;
        this.setLocation(ortaNoktaX, ortaNoktaY);
        dbc.baglan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KayitOlDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kayitAd = new javax.swing.JTextField();
        kayitSoyad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kayitTc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kayitSehir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kayitDogumTarihi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kayitSifre = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kayitKullaniciAdi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        erkekToggleButton = new javax.swing.JToggleButton();
        kadinToggleButton = new javax.swing.JToggleButton();
        personelToggleButton = new javax.swing.JToggleButton();
        yoneticiToggleButton = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        birimTextField = new javax.swing.JTextField();
        cinsiyetButtonGrup = new javax.swing.ButtonGroup();
        yetkiButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        anaFrameKullaniciAdiField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        anaFrameGirisButton = new javax.swing.JButton();
        kayitOlButton = new javax.swing.JButton();
        anaFrameSifreField = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel3.setText("Ad :");

        jLabel4.setText("Soyad :");

        kayitSoyad.setColumns(5);
        kayitSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitSoyadActionPerformed(evt);
            }
        });

        jLabel6.setText("Tc. :");

        jLabel7.setText("Şehir :");

        jLabel8.setText("Doğum Tarihi :");

        kayitDogumTarihi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitDogumTarihiActionPerformed(evt);
            }
        });

        jLabel9.setText("Cinsiyet :");

        jLabel10.setText("Şifre :");

        jLabel11.setText("Yetki :");

        jButton1.setText("Kayit Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("<html><b>Tüm Bigilerin Doldurulması Gerekmektedir</b></html>");

        jLabel5.setText("Kullanıcı Adı :");

        kayitKullaniciAdi.setColumns(5);
        kayitKullaniciAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitKullaniciAdiActionPerformed(evt);
            }
        });

        jLabel13.setText("<html><b>(yyyy-aa-gg)</d></html>");

        erkekToggleButton.setText("Erkek");
        erkekToggleButton.setActionCommand("erkek");

        kadinToggleButton.setText("Kadın");
        kadinToggleButton.setActionCommand("kadin");

        personelToggleButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        personelToggleButton.setText("Personel");
        personelToggleButton.setActionCommand("personel");

        yoneticiToggleButton.setText("Yetkili");
        yoneticiToggleButton.setActionCommand("yonetici");

        jLabel14.setText("Birim :");

        javax.swing.GroupLayout KayitOlDialogLayout = new javax.swing.GroupLayout(KayitOlDialog.getContentPane());
        KayitOlDialog.getContentPane().setLayout(KayitOlDialogLayout);
        KayitOlDialogLayout.setHorizontalGroup(
            KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KayitOlDialogLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(KayitOlDialogLayout.createSequentialGroup()
                        .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(kayitSifre)
                            .addComponent(kayitAd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kayitSoyad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kayitTc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kayitKullaniciAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                    .addGroup(KayitOlDialogLayout.createSequentialGroup()
                        .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KayitOlDialogLayout.createSequentialGroup()
                                .addComponent(erkekToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kadinToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(KayitOlDialogLayout.createSequentialGroup()
                                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(birimTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, KayitOlDialogLayout.createSequentialGroup()
                                        .addComponent(personelToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yoneticiToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(kayitSehir, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kayitDogumTarihi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        KayitOlDialogLayout.setVerticalGroup(
            KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KayitOlDialogLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kayitAd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kayitKullaniciAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kayitTc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kayitSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erkekToggleButton)
                    .addComponent(kadinToggleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayitDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personelToggleButton)
                    .addComponent(yoneticiToggleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KayitOlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(birimTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cinsiyetButtonGrup.add(erkekToggleButton);
        cinsiyetButtonGrup.add(kadinToggleButton);

        yetkiButtonGroup.add(personelToggleButton);
        yetkiButtonGroup.add(yoneticiToggleButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı :");

        jLabel2.setText("Şifre : ");

        anaFrameGirisButton.setText("GİRİŞ");
        anaFrameGirisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaFrameGirisButtonActionPerformed(evt);
            }
        });

        kayitOlButton.setText("KAYIT OL");
        kayitOlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButtonActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html><b>BILAL KOCOGLU 1511012064</b></html>");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("<html><b>MUZAFFER AKIN 1511012061</b></html>");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anaFrameKullaniciAdiField)
                            .addComponent(anaFrameSifreField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anaFrameGirisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayitOlButton, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(anaFrameKullaniciAdiField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anaFrameSifreField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(anaFrameGirisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayitSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitSoyadActionPerformed
        
    }//GEN-LAST:event_kayitSoyadActionPerformed

    private void kayitDogumTarihiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitDogumTarihiActionPerformed
        
    }//GEN-LAST:event_kayitDogumTarihiActionPerformed

    private void kayitOlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButtonActionPerformed
        KayitOlDialog.setLocation(120, 120);
        KayitOlDialog.setMinimumSize(new Dimension(370, 500));
        KayitOlDialog.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_kayitOlButtonActionPerformed

    private void kayitKullaniciAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitKullaniciAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kayitKullaniciAdiActionPerformed

    private void anaFrameGirisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaFrameGirisButtonActionPerformed
        girisController.girisKonrol(anaFrameKullaniciAdiField, anaFrameSifreField);
        if(!(girisModel.getGirisHata())){
            girisController.girisYap();
            if(girisController.yetkiKontrol().equals("personel")){
                KullaniciEkrani kullaniciEkrani = new KullaniciEkrani();
                kullaniciEkrani.show();
                this.dispose();
            }
            else if(girisController.yetkiKontrol().equals("yonetici")){
                YoneticiEkrani yoneticiEkrani = new YoneticiEkrani();
                yoneticiEkrani.show();
                this.dispose();
            }
        }
    }//GEN-LAST:event_anaFrameGirisButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kayitController.kayitKontrol(kayitController.seciliDugmeleriAl(cinsiyetButtonGrup),kayitController.seciliDugmeleriAl(yetkiButtonGroup),kayitAd,kayitSoyad, kayitKullaniciAdi,  kayitSifre, kayitTc, kayitSehir, kayitDogumTarihi, birimTextField);
        if(!(kayitModel.getKayitHata())){
            kayitController.kayitYap();
            if(kayitController.getKayitModel().getKayit())
                KayitOlDialog.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog KayitOlDialog;
    private javax.swing.JButton anaFrameGirisButton;
    private javax.swing.JTextField anaFrameKullaniciAdiField;
    private javax.swing.JPasswordField anaFrameSifreField;
    private javax.swing.JTextField birimTextField;
    private javax.swing.ButtonGroup cinsiyetButtonGrup;
    private javax.swing.JToggleButton erkekToggleButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton kadinToggleButton;
    private javax.swing.JTextField kayitAd;
    private javax.swing.JTextField kayitDogumTarihi;
    private javax.swing.JTextField kayitKullaniciAdi;
    private javax.swing.JButton kayitOlButton;
    private javax.swing.JTextField kayitSehir;
    private javax.swing.JPasswordField kayitSifre;
    private javax.swing.JTextField kayitSoyad;
    private javax.swing.JTextField kayitTc;
    private javax.swing.JToggleButton personelToggleButton;
    private javax.swing.ButtonGroup yetkiButtonGroup;
    private javax.swing.JToggleButton yoneticiToggleButton;
    // End of variables declaration//GEN-END:variables

    private KayitController kayitController = new KayitController();
    private KayitModel kayitModel = kayitController.getKayitModel();
}
