package otel_otomasyonu;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;

public class rezervasyon extends javax.swing.JFrame {
    Connection conn;
    Statement komut;
    ResultSet rs;

    /**
     * yeni form oluşturma Rezervasyon
     */
    
    public void musteriler(){
        
         try {
            String baslik[] = new String[]{ "Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konaklama Süresi","Oda Numarası","Ödenecek Tutar","Para Birimi" };  
            
          

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
            st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);               
            rs = st.executeQuery("select * from musteri_listesi ORDER BY id DESC");
            rs.last();
           
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    
                    rs.getString("adi"),  
                    rs.getString("soyadi"),
                    rs.getString("cep_telefonu"),
                    rs.getString("adres_bilgileri"),  
                    rs.getString("giris_tarihi"),
                    rs.getString("cikis_tarihi"),
                    rs.getString("konaklama_suresi"), 
                    rs.getString("oda_numarasi"), 
                    rs.getString("odeme"),
                    rs.getString("para_birimi"),
                };
                i++;
            }
           
            con.close();
            table_musteriler.setModel(new DefaultTableModel(data, baslik));
      

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
         
         otel_kontrol();
         
        
    }
    
    public rezervasyon() {
        super("Rezervasyon");
        
        initComponents();

        musteriler();
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	
         JTabbedPane jTabbedPane5 = new javax.swing.JTabbedPane();      
         jPanel2 = new javax.swing.JPanel();
         jTabbedPane3 = new javax.swing.JTabbedPane();
         jLabel16 = new javax.swing.JLabel();
         jTextField9 = new javax.swing.JTextField();
         jPanel3 = new javax.swing.JPanel();
         jTabbedPane1 = new javax.swing.JTabbedPane();
         jPanel4 = new javax.swing.JPanel();
         jScrollPane2 = new javax.swing.JScrollPane();
         table_musteriler = new javax.swing.JTable();
         jPanel1 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         txt_tc = new javax.swing.JTextField();
         txt_adi = new javax.swing.JTextField();
         txt_soyadi = new javax.swing.JTextField();
         jLabel4 = new javax.swing.JLabel();
         c_kisi_sayisi = new javax.swing.JComboBox<>();
         jLabel6 = new javax.swing.JLabel();
         jLabel7 = new javax.swing.JLabel();
         txt_cep = new javax.swing.JTextField();
         jLabel14 = new javax.swing.JLabel();
         jScrollPane1 = new javax.swing.JScrollPane();
         txt_adres = new javax.swing.JTextArea();
         jLabel17 = new javax.swing.JLabel();
         jLabel19 = new javax.swing.JLabel();
         jLabel20 = new javax.swing.JLabel();
         jLabel21 = new javax.swing.JLabel();
         jLabel22 = new javax.swing.JLabel();
         
         jLabel30 = new javax.swing.JLabel(); 
         jLabel30.setFont(new java.awt.Font("Times New Roman", 0 , 15)); // NOI18N
         jLabel30.setForeground(Color.RED);
         
         
         
         txt_giris_tarihi = new javax.swing.JTextField();
         txt_cikis_tarihi = new javax.swing.JTextField();
         txt_oda_no = new javax.swing.JTextField();
         c_odenecek_tutar = new javax.swing.JComboBox<>();
         jButton5 = new javax.swing.JButton();
         jButton8 = new javax.swing.JButton();
         c_konaklama_suresi = new javax.swing.JComboBox<>();
         otel_listesi = new javax.swing.JComboBox<>();
         
        jPanel1.setBackground(new Color(255,255,255));
        jPanel2.setBackground(new Color(255,255,255));
        jPanel3.setBackground(new Color(255,255,255));
        jPanel4.setBackground(new Color(255,255,255));
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel16.setText("jLabel16");
        jTabbedPane3.addTab("tab1", jLabel16);

        jTextField9.setText("jTextField9");
        jTabbedPane5.addTab("tab1", jTextField9);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_musteriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null,null},
                {null, null, null, null, null, null, null, null, null,null},
                {null, null, null, null, null, null, null, null, null,null},
                {null, null, null, null, null, null, null, null, null,null}
            },
            new String [] {
                "ID", "Adı", "Soyadı", "Cep Telefonu", "Adres Bilgileri", "Giriş Tarihi", "Çıkış Tarihi", "Konaklama Süresi", "Oda Numarası", "Ödenecek Tutar","Para Birimi" 
                      
            }
        ));
        jScrollPane2.setViewportView(table_musteriler);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Müşteri Listesi", jPanel4);

        jLabel1.setText("*Adı:");

        jLabel2.setText("*Soyadı:");

        jLabel3.setText("*TC Kimlik No:");

        txt_soyadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soyadiActionPerformed(evt);
            }
        });

        jLabel4.setText("Konak Sayısı:");

        c_kisi_sayisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tek Kişilik", "Çift Kişilik","Çocuklu Çift" }));
        

        jLabel7.setText("*Cep Telefonu:");

        txt_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cepActionPerformed(evt);
            }
        });

        jLabel14.setText("Adres Bilgileri:");

        txt_adres.setColumns(0);
        txt_adres.setRows(10);
        jScrollPane1.setViewportView(txt_adres);

        jLabel17.setText("*Giriş Tarihi:");

        jLabel19.setText("Çıkış Tarihi:");

        jLabel20.setText("Konaklama Süresi:");

        jLabel21.setText("Ödenecek Tutar:    ");

        jLabel22.setText("*Oda Numarası:");
        

        txt_giris_tarihi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_giris_tarihiActionPerformed(evt);
            }
        });

        txt_cikis_tarihi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cikis_tarihiActionPerformed(evt);
            }
        });

        c_odenecek_tutar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Belirtmedi","Türk Lirası", "Dolar", "Euro"}));
        
        

        jButton5.setText("Kayıt Oluştur");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("Geri");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
                dispose();
            }
        });

        c_konaklama_suresi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belirtmedi","1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13","14","15"}));
        c_konaklama_suresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_konaklama_suresiActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(c_kisi_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(300,300,300))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            			.addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43,43,43)
                                .addComponent(txt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))	
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_cep))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                		.addComponent(jLabel30)
                                		.addComponent(otel_listesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c_konaklama_suresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)                         
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(20, 20, 20)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_oda_no)
                                            .addComponent(c_odenecek_tutar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 33, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel17))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cikis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_giris_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                       
                                    		.addGap(11,11,11)
                                        .addComponent(jButton5)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_giris_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txt_cikis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(c_konaklama_suresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_kisi_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(c_odenecek_tutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_oda_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addComponent(jLabel30)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(otel_listesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Müşteri Bilgileri", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cepActionPerformed

    private void txt_soyadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soyadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_soyadiActionPerformed

    private void txt_cikis_tarihiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cikis_tarihiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cikis_tarihiActionPerformed

    private void txt_giris_tarihiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_giris_tarihiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_giris_tarihiActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
            String tc=txt_tc.getText();
            String adi=txt_adi.getText();
            String soyadi=txt_soyadi.getText();
            String cep=txt_cep.getText();
            
            String kisi_sayisi=String.valueOf(c_kisi_sayisi.getSelectedItem());
            String tgiris=txt_giris_tarihi.getText();
            String tcikis=txt_cikis_tarihi.getText();
            String adres=txt_adres.getText();
            
            String konaklama_suresi=String.valueOf(c_konaklama_suresi.getSelectedItem());
            String odenecek_tutar=String.valueOf(c_odenecek_tutar.getSelectedItem());
            String oda_no=txt_oda_no.getText();
                     
                
            try {
            		   
                if (tc.equals("") || adi.equals("") || soyadi.equals("") || tgiris.equals("") || cep.equals("") || Integer.valueOf(oda_no)>10 ){

                    javax.swing.JOptionPane.showMessageDialog(this, "Lütfen Yıldızlı Alanları Doldurunuz ve Oda Numarasını Tekrar Kontrol Ediniz!");
                    
                    
    

                } else {            
                   

                    Connection con = null;
                    Statement st = null;
                  
                    con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
                    st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    
                             
                    double ucret_hesapla = 0;
                    if(odenecek_tutar=="Belirtmedi" || konaklama_suresi=="Belirtmedi") {
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi Gereken Ücret Bilgileri Hesaplanmadı, Çıkış Esnasında Kontrol Ediniz");
                    }
                    
                    else if(odenecek_tutar=="Dolar" && kisi_sayisi=="Tek Kişilik") {
                    	ucret_hesapla= (180/7.30)*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ucret_hesapla+" Dolardır");
                    }
                    else if (odenecek_tutar=="Dolar" && kisi_sayisi=="Çift Kişilik") {
                    	ucret_hesapla= (2*180/7.30)*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla +" Dolardır");
                    }
                    else if (odenecek_tutar=="Dolar" && kisi_sayisi=="Çocuklu Çift") {
                    	ucret_hesapla= (3*180/7.30)*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla+" Dolardır");
                    }
                     
                    else if(odenecek_tutar=="Euro" && kisi_sayisi=="Tek Kişilik") {
                    	ucret_hesapla=(180/9.08)*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla+" Eurodur");
                    }
                    else if(odenecek_tutar=="Euro" && kisi_sayisi=="Çift Kişilik") {
                    	ucret_hesapla=(2*180/9.08)*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla+" Eurodur");
                    }
                    else if(odenecek_tutar=="Euro" && kisi_sayisi=="Çocuklu Çift") {
                    	ucret_hesapla=(3*180/9.08)*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla +" Eurodur");
                    }
                    else if(odenecek_tutar=="Türk Lirası" && kisi_sayisi=="Tek Kişilik") {
                    	ucret_hesapla=180*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla+" Liradır");
                    }
                    else if(odenecek_tutar=="Türk Lirası" && kisi_sayisi=="Çift Kişilik") {
                    	ucret_hesapla=2*180*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla+" Liradır");
                    }
                    else if(odenecek_tutar=="Türk Lirası" && kisi_sayisi=="Çocuklu Çift") {
                    	ucret_hesapla=3*180*Integer.valueOf(konaklama_suresi);
                    	javax.swing.JOptionPane.showMessageDialog(this,"Ödenmesi gereken Ücret: "+ ucret_hesapla+" Liradır");
                    }
                   
                    
                    ArrayList<String> veri = new ArrayList<String>();
                    veri.add(tc);
                    veri.add(adi);
                    veri.add(soyadi);
                    veri.add(cep);
                    veri.add(adres);
                    veri.add(tgiris);
                    veri.add(tcikis);
                    veri.add(konaklama_suresi);
                    veri.add(odenecek_tutar);
                    veri.add(oda_no);
                    veri.add(Double.toString(ucret_hesapla));
                    veri.add("Otel Adı:"+String.valueOf(otel_listesi.getSelectedItem()));
                    
                    
                   
                    
                    ArrayList<String> veri_oncu=new ArrayList<String>();
                    veri_oncu.add("TC Kimlik No:");
                    veri_oncu.add("Adı:");
                    veri_oncu.add("Soyadı:");
                    veri_oncu.add("Cep Telefonu:");
                    veri_oncu.add("Adres:");
                    veri_oncu.add("Otel Giriş Tarihi:");
                    veri_oncu.add("Otel Çıkış Tarihi:");
                    veri_oncu.add("Konaklanacak Süre:");
                    veri_oncu.add("Ödenecek Tutarın Para Birimi:");
                    veri_oncu.add("Oda Numarası:");
                    veri_oncu.add("Ödenecek Ücret:");
                    veri_oncu.add("");
                    
                    String sql = "INSERT INTO musteri_listesi (tc,adi,soyadi,cep_telefonu,adres_bilgileri,giris_tarihi,cikis_tarihi,konaklama_suresi,oda_numarasi,odeme,para_birimi)" 
                            + " VALUES ('"+tc+"','"+adi+"','"+soyadi+"','"+cep+"','"+adres+"','"+tgiris+"','"+tcikis+"','"+konaklama_suresi+"','"+oda_no+"','"+ucret_hesapla+"', '"+odenecek_tutar+"')";
             
                   
                    st.executeUpdate(sql);
                    ucret_hesapla=0;
                    
                    File file= new File("Musteri_Bilgileri.txt");
                    FileWriter fWriter=null;
                    BufferedWriter writer=null;
                    
                    if(!file.exists()) {
                    	try {
                    		file.createNewFile();
                    	}catch(Exception e) {
                    		e.printStackTrace();
                    	}
                    }
                    
                    
                    
                    try {
                    	fWriter= new FileWriter(file.getAbsoluteFile(),true);
                    	writer=new BufferedWriter(fWriter);
                    	for(int i=0; i<veri.size();i++) {
                    		if(i<veri.size()-1) {
                    			writer.write(veri_oncu.get(i)+veri.get(i)+", ");
                    		}
                    		else {
                    			writer.write(veri_oncu.get(i)+veri.get(i));
                    			
                    		}
                    		
                    		
                    	}
                    	writer.write("\n\n");
                    	writer.close();
       	
                    }catch(Exception e){
                    	System.err.println("Hata: " + e.getMessage());
                    }
                    
                    javax.swing.JOptionPane.showMessageDialog(this, "Kayıt İşleminiz Gerçekleşmiş ve Musteri_Bilgileri.txt'e İşlenmiştir. ");
        
                    jPanel1.revalidate();
                	repaint();
            
                }
            
           

            } catch (SQLException ex) {
                 javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
            }  
            
            musteriler();
            rezervasyon a = new rezervasyon();
            a.setVisible(true);
            dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed
    

    private void c_konaklama_suresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_konaklama_suresiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_konaklama_suresiActionPerformed

   // private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    //}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 otel_otomasyonu.butonlar ac = new otel_otomasyonu.butonlar();
        ac.setVisible(true);
          // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    
      //@param args the command line arguments
     
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rezervasyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rezervasyon().setVisible(true);
            }
        });
    }
    

	public void otel_kontrol() {

		  try {
	            
	            Connection con = null;
	            Statement st = null;
	            ResultSet rs = null;

	            con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
	            st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);             
	            rs = st.executeQuery("select * from otel_listesi ORDER BY id DESC");
	            rs.last();
	           
	    
	            rs.beforeFirst();

	            
	            int i = 0;

	            while (rs.next()) {

	                	jLabel30.setText(" Otel Seçimi:");
	            		otel_listesi.addItem(rs.getString("otel_adi"));

	                i++;
	            }
	           
	            con.close();
	           
	            
	       
	        } catch (SQLException ex) {
	            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanina Baglanti Saglanamadi! " + ex.toString());
	        }
	        
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c_kisi_sayisi;
    private javax.swing.JComboBox<String> c_konaklama_suresi;
    private javax.swing.JComboBox<String> c_odenecek_tutar;
    private javax.swing.JComboBox<String> otel_listesi;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3; 
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable table_musteriler;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextArea txt_adres;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cikis_tarihi;
    private javax.swing.JTextField txt_giris_tarihi;
    private javax.swing.JTextField txt_oda_no;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tc;
    // End of variables declaration//GEN-END:variables
}
