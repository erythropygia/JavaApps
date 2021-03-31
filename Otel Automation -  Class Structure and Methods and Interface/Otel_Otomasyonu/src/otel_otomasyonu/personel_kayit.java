package otel_otomasyonu;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;

public class personel_kayit extends javax.swing.JFrame {

    /**
     * yeni form oluþturma personel_kayit
     */
    
    public void personel(){
        
        try {
            String baslik[] = new String[]{ "TC NO", "Adi", "Soyadi", "Dogum Tarihi", "Cep Telefonu", "Adres Bilgileri", "Görevi", "Maas", "Mesai Saati","Mesai Ücreti","Ýþe Giriþ Tarihi"};  
            
           

            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
           

            con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
            st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);             
            rs = st.executeQuery("select * from personel_listesi ORDER BY id DESC");
            rs.last();
            
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();
           
            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("tc"), 
                    rs.getString("ad"),  
                    rs.getString("soyad"),
                    rs.getString("dogum_tarihi"),
                    rs.getString("telefon"),  
                    rs.getString("adres"),
                    rs.getString("cocuk_sayisi"),
                    rs.getString("maas"), 
                    rs.getString("mesai_saati"),                    
                    rs.getString("mesai_ucreti"),
                    rs.getString("ise_giris_tarihi"),
                    
                };
                i++;
            }
           
            con.close();
            table_personel.setModel(new DefaultTableModel(data, baslik));
            
       
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanina Baglanti Saglanamadi! " + ex.toString());
        }
        
    }
    
    public personel_kayit() {
        initComponents();
        otel_kontrol();
        
       
        
    }
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0 , 15)); // NOI18N
        jLabel12.setForeground(Color.RED);
        
        otel_listesi = new javax.swing.JComboBox<>();
        txt_tc = new javax.swing.JTextField();
        txt_padi = new javax.swing.JTextField();
        txt_psoyadi = new javax.swing.JTextField();
        txt_dtarihi = new javax.swing.JTextField();
        txt_cep = new javax.swing.JTextField();
        txt_adres = new javax.swing.JTextField();
        txt_cocuk = new javax.swing.JTextField();
        txt_saati = new javax.swing.JTextField();
        txt_ucret = new javax.swing.JTextField();
        txt_maas = new javax.swing.JTextField();
        txt_ise_tarih = new javax.swing.JTextField();
         
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        
        jScrollPane1 = new javax.swing.JScrollPane();
        
        table_personel = new javax.swing.JTable();
        ListSelectionModel model = table_personel.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() { 
        	@Override
        	public void valueChanged(ListSelectionEvent e) {
        		
        		if (! model.isSelectionEmpty()) {
        			 txt_tc.setText(table_personel.getValueAt(table_personel.getSelectedRow(),0).toString());
     				 txt_padi.setText(table_personel.getValueAt(table_personel.getSelectedRow(),1).toString());
     				 txt_psoyadi.setText(table_personel.getValueAt(table_personel.getSelectedRow(),2).toString());
     				 txt_dtarihi.setText(table_personel.getValueAt(table_personel.getSelectedRow(),3).toString());
     				 txt_cep.setText(table_personel.getValueAt(table_personel.getSelectedRow(),4).toString());
     				 txt_adres.setText(table_personel.getValueAt(table_personel.getSelectedRow(),5).toString());
     				 txt_cocuk.setText(table_personel.getValueAt(table_personel.getSelectedRow(),6).toString());
     				 txt_maas.setText(table_personel.getValueAt(table_personel.getSelectedRow(),7).toString());
     				 txt_saati.setText(table_personel.getValueAt(table_personel.getSelectedRow(),8).toString());
     				 txt_ucret.setText(table_personel.getValueAt(table_personel.getSelectedRow(),9).toString());				 
     				 txt_ise_tarih.setText(table_personel.getValueAt(table_personel.getSelectedRow(),10).toString());
        			
        		}
        	}
        	
        	
        	
        });
        
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        

        txt_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tcActionPerformed(evt);
                
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("TC Kimlik No:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Personelin Adý:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Personelin Soyadý: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Doðum Tarihi:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Telefon:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Adres:");

        txt_padi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_padiActionPerformed(evt);
            }
        });


        txt_psoyadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_psoyadiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Görevi:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Maaþ:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Mesai Saati:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Mesai Ücreti:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Ýþe Giriþ Tarihi:");

        txt_saati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saatiActionPerformed(evt);
                
            }
        });

        
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Yeni Kayýt");
        
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        
        
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton8.setText("Geri");
        
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
                dispose();
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Bilgileri Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
  
            }
        });
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_personel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Personelin Adý", "Personelin Soyadý", "Doðum Tarihi", "Telefon", "Adres", "Görevi", "Maaþ", "Mesai Saati", "Mesai Ücreti", "Ýþe Giriþ Tarihi", "Otel Adý"
            }
        ));
        personel();
        jScrollPane1.setViewportView(table_personel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_adres, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_dtarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_padi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_psoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))	
                        	.addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(otel_listesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ise_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_maas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_saati, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cocuk, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_saati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_cocuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txt_padi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(txt_maas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txt_psoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txt_dtarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            
                                            .addComponent(txt_ise_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel12)
                                        .addComponent(otel_listesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        jMenu1.setText("  Personel Kaydý");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_padiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_padiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_padiActionPerformed

    private void txt_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tcActionPerformed

    private void txt_psoyadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_psoyadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_psoyadiActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
            String tc=txt_tc.getText();
            String adi=txt_padi.getText();
            String soyadi=txt_psoyadi.getText();
            String dtarih=txt_dtarihi.getText();
            String cep=txt_cep.getText();
            String adres=txt_adres.getText();
            
            String cocuk_sayisi=txt_cocuk.getText();
            String maas=txt_maas.getText();
            String mesai_saati=txt_saati.getText();
            
            String ucret=txt_ucret.getText();
            String giris_tarihi=txt_ise_tarih.getText();
            
                
            try {
                    
                if (tc.equals("") || adi.equals("") || soyadi.equals("") || dtarih.equals("")|| cep.equals("")|| adres.equals("")|| 
                		cocuk_sayisi.equals("")|| maas.equals("")|| mesai_saati.equals("")|| ucret.equals("")|| giris_tarihi.equals("")) {

                    javax.swing.JOptionPane.showMessageDialog(this, "Lütfen Boþ Alanlarý Doldurunuz!");

                } else {            
                    
                   

                    Connection con = null;
                    Statement st = null;
                    
                    
                    con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
                    st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    
                    String sql = "INSERT INTO personel_listesi (tc,ad,soyad,dogum_tarihi,telefon,adres,cocuk_sayisi,maas,mesai_saati,mesai_ucreti,ise_giris_tarihi)" 
                            + " VALUES ('"+tc+"', '"+adi+"', '"+soyadi+"',   '"+dtarih+"', '"+cep+"', '"+adres+"','"+cocuk_sayisi+"', '"+maas+"', '"+mesai_saati+"', '"+ucret+"', '"+giris_tarihi+"')";

                    st.executeUpdate(sql);
                    
                    ArrayList<String> veri = new ArrayList<String>();
                    veri.add(tc);
                    veri.add(adi);
                    veri.add(soyadi);
                    veri.add(dtarih);
                    veri.add(cep);
                    veri.add(adres);
                    veri.add(cocuk_sayisi);
                    veri.add(maas);
                    veri.add(mesai_saati);
                    veri.add(ucret);
                    veri.add(giris_tarihi);
                    veri.add("Otel Adý:"+String.valueOf(otel_listesi.getSelectedItem()));
                    
                    ArrayList<String> veri_oncu=new ArrayList<String>();
                    veri_oncu.add("TC Kimlik No:");
                    veri_oncu.add("Adý:");
                    veri_oncu.add("Soyadý:");
                    veri_oncu.add("Doðum Tarihi:");
                    veri_oncu.add("Cep Telefonu:");
                    veri_oncu.add("Adres:");
                    veri_oncu.add("Görevi:");
                    veri_oncu.add("Maaþý:");
                    veri_oncu.add("Mesai Saati:");
                    veri_oncu.add("Mesai Ücreti:");
                    veri_oncu.add("Ýþe Giriþ Tarihi:");
                    veri_oncu.add("");
                    
                    
                    File file= new File("Personeller.txt");
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
                    
                 
                    javax.swing.JOptionPane.showMessageDialog(null, "Kayýt Gerçekleþtirilmiþ ve Personeller.txt Dosyasýna Ýþlenmiþtir. ");
           
                }
            
      
            } catch (SQLException ex) {
                 javax.swing.JOptionPane.showMessageDialog(this,"Veritabanýna Baðlantý Saðlanamadý! " + ex.toString());
            }  
            
            personel();
            temizle();

    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    	
    	
   	 	String tc=txt_tc.getText();
        String adi=txt_padi.getText();
        String soyadi=txt_psoyadi.getText();
        String dtarih=txt_dtarihi.getText();
        String cep=txt_cep.getText();
        String adres=txt_adres.getText();
        
        String cocuk_sayisi=txt_cocuk.getText();
        String maas=txt_maas.getText();
        String mesai_saati=txt_saati.getText();
        
        String ucret=txt_ucret.getText();
        String giris_tarihi=txt_ise_tarih.getText();
        
            
        try {
                
            if (tc.equals("") || adi.equals("") || soyadi.equals("") || dtarih.equals("")|| cep.equals("")|| adres.equals("")|| 
            		cocuk_sayisi.equals("")|| maas.equals("")|| mesai_saati.equals("")|| ucret.equals("")|| giris_tarihi.equals("")) {

                javax.swing.JOptionPane.showMessageDialog(this, "Lütfen Boþ Alanlarý Doldurunuz!");

            } else {            
                
               

                Connection con = null;
                Statement st = null;
                
                
                con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
                st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                
                String sql = "UPDATE personel_listesi set ad='"+adi+"',soyad='"+soyadi+"',dogum_tarihi='"+dtarih+"',telefon='"+cep+"',adres='"+adres+"',cocuk_sayisi='"+cocuk_sayisi+"',maas='"+maas+"',mesai_saati='"+mesai_saati+"',mesai_ucreti='"+ucret+"',ise_giris_tarihi='"+giris_tarihi+"' where tc='"+txt_tc.getText()+"'";
                st.executeUpdate(sql);
                
                
                ArrayList<String> veri = new ArrayList<String>();
                veri.add(tc);
                veri.add(adi);
                veri.add(soyadi);
                veri.add(dtarih);
                veri.add(cep);
                veri.add(adres);
                veri.add(cocuk_sayisi);
                veri.add(maas);
                veri.add(mesai_saati);
                veri.add(ucret);
                veri.add(giris_tarihi);
                veri.add("Otel Adý:"+String.valueOf(otel_listesi.getSelectedItem()));
               
                
                ArrayList<String> veri_oncu=new ArrayList<String>();
                veri_oncu.add("TC Kimlik No:");
                veri_oncu.add("Adý:");
                veri_oncu.add("Soyadý:");
                veri_oncu.add("Doðum Tarihi:");
                veri_oncu.add("Cep Telefonu:");
                veri_oncu.add("Adres:");
                veri_oncu.add("Görevi:");
                veri_oncu.add("Maaþý:");
                veri_oncu.add("Mesai Saati:");
                veri_oncu.add("Mesai Ücreti:");
                veri_oncu.add("Ýþe Giriþ Tarihi:");
                veri_oncu.add("");
                
                
                File file= new File("Personeller.txt");
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
               
                javax.swing.JOptionPane.showMessageDialog(this,tc + " Tc Kimlik Numarasýyla Kayýtlý Çalýþan Mevcut ise Bilgileri Güncellendi ve .txt Dosyasýna Ýþlendi");
              
               
            }
        

        } catch (SQLException ex) {
             javax.swing.JOptionPane.showMessageDialog(this,"Veritabanýna Baðlantý Saðlanamadý! " + ex.toString());
        }  
        
        personel();
        temizle();
           
           
       }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_saatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saatiActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        butonlar ac = new butonlar();
        ac.setVisible(true);
        
    }//GEN-LAST:event_jButton8ActionPerformed
    
    
    private void temizle() {
    	 
        txt_tc.setText("");
        txt_padi.setText("");
        txt_psoyadi.setText("");
        txt_dtarihi.setText("");
        txt_cep.setText(""); 
        txt_adres.setText("");
        txt_cocuk.setText("");
        txt_saati.setText("");
        txt_ucret.setText("");
        txt_maas.setText("");
        txt_ise_tarih.setText("");

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


                	jLabel12.setText(" Otel Seçimi:");
            		otel_listesi.addItem(rs.getString("otel_adi"));
	                    

	                i++;
	            }
	           
	            con.close();
	           
	            
	       
	        } catch (SQLException ex) {
	            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanina Baglanti Saglanamadi! " + ex.toString());
	        }
	        
		
	}
	
	 
	
    
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
            java.util.logging.Logger.getLogger(personel_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personel_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personel_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personel_kayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Form oluþturma ve görüntüleme */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personel_kayit().setVisible(true);
            }
        });
    }
    
 //pencere ayarlarý fonksiyonu
private butonlar atapencere;
public personel_kayit (butonlar ata){
    this.atapencere=ata;
initComponents();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_personel;
    private javax.swing.JTextField txt_adres;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cocuk;
    private javax.swing.JTextField txt_dtarihi;
    private javax.swing.JTextField txt_ise_tarih;
    private javax.swing.JTextField txt_maas;
    private javax.swing.JTextField txt_padi;
    private javax.swing.JTextField txt_psoyadi;
    private javax.swing.JTextField txt_saati;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_ucret;
    private javax.swing.JComboBox<String> otel_listesi;
    // End of variables declaration//GEN-END:variables
}
