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

import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

public class oda extends javax.swing.JFrame {

    /**
     * yeni form oluşturuluyor oda
     */
    public oda() {
        initComponents();
    }

   
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0 , 13)); // NOI18N
        jLabel1.setForeground(Color.RED);
        jLabel1.setText("*Oda Adına Tıkladığınızda Müşteri Bilgileri Veritabanından Silinir.Bilgilere txt'den Ulaşılabilir.");
        
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0 , 15));
        jLabel2.setForeground(Color.RED);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        oda_kontrol();
        otel_kontrol();
        jPanel1.setBackground(new Color(255,255,255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oda Kontrol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

       
        jButton1.setText("ODA 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                sil(1);
                jButton1.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

        
        jButton2.setText("ODA 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                sil(2);
                jButton2.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

       
        jButton3.setText("ODA 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
                sil(3);
                jButton3.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

        
        jButton4.setText("ODA 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
                sil(4);
                jButton4.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

       
        jButton5.setText("ODA 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
                sil(5);
                jButton5.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

        
        jButton6.setText("ODA 6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
                sil(6);
                jButton6.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

        
        jButton7.setText("ODA 7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
                sil(7);
                jButton7.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

        
        jButton8.setText("ODA 8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
                sil(8);
                jButton8.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

       
        jButton9.setText("ODA 9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
                sil(9);
                jButton9.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

        
        jButton10.setText("ODA 10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
                sil(10);
                jButton10.setBackground(new java.awt.Color(255, 255, 255));
            }
        });
        


        jButton11.setText("Geri");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton11ActionPerformed(evt);
                dispose();
            }
        });
     

        jButton12.setText("Yenile");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	jButton12ActionPerformed(evt);
            	 oda a = new oda();
                 a.setVisible(true);
                 dispose();
                 
            }
        });
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)    
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(20,20,20)))
                .addGap(20, 20, 20))
            .addComponent(jLabel1)
            .addComponent(jLabel2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10,javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15,15,15)
                        .addComponent(jButton12)))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    	 otel_otomasyonu.butonlar ac = new otel_otomasyonu.butonlar();
    	        ac.setVisible(true);
    	          // TODO add your handling code here:
    	    }//GEN-LAST:event_jButton8ActionPerformed

    
    public void sil(int oda_numarasi) {
    	
    	try {
    		 Connection con = null;
             Statement st = null;
            
             
             con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
             st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    		
    		
    		String oda_bosalt="DELETE FROM musteri_listesi musteri_listesi where oda_numarasi="+Integer.toString(oda_numarasi);
    		st.execute(oda_bosalt);
    		JOptionPane.showMessageDialog(null, oda_numarasi+"Kayıt Başarıyla Silindi.");
    		con.close();
    	}catch(Exception e){
    		System.err.println("Hata: " + e.getMessage());
    		
    	}
    }
    
public void oda_kontrol(){
    	
        try {

           Connection con = null;
           Statement st = null;
           ResultSet rs = null;

           con = DriverManager.getConnection("jdbc:mysql://localhost/otel_otomasyonu?useTimezone=true&serverTimezone=UTC","root","1234");
           st = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);               
           rs = st.executeQuery("select * from musteri_listesi ORDER BY id DESC");
           rs.last();
           rs.beforeFirst();
           ArrayList<Integer> veri = new ArrayList<Integer>();

           int i = 0;

           while (rs.next()) {

               
        	   veri.add(rs.getInt("oda_numarasi"));
        	   i++;
               
               
           }
           
           
        	   for(int t=0;t<veri.size();t++) {
        		   
        		   if(1==Integer.valueOf(veri.get(t))){
        			   jButton1.setBackground(new java.awt.Color(255, 0, 39));
            	   }
        		   else if(2==Integer.valueOf(veri.get(t))) {
        			   jButton2.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(3==Integer.valueOf(veri.get(t))) {
        			   jButton3.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(4==Integer.valueOf(veri.get(t))) {
        			   jButton4.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(5==Integer.valueOf(veri.get(t))) {
        			   jButton5.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(6==Integer.valueOf(veri.get(t))) {
        			   jButton6.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(7==Integer.valueOf(veri.get(t))) {
        			   jButton7.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(8==Integer.valueOf(veri.get(t))) {
        			   jButton8.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(9==Integer.valueOf(veri.get(t))) {
        			   jButton9.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
        		   else if(10==Integer.valueOf(veri.get(t))) {
        			   jButton10.setBackground(new java.awt.Color(255, 0, 39));
        			   
        		   }
     	 
           }

           con.close();

       } catch (SQLException ex) {
           javax.swing.JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
       }  

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

              	jLabel2.setText("Otel Adı:"+rs.getString("otel_adi"));
                  

              i++;
          }
         
          con.close();
         
          
     
      } catch (SQLException ex) {
          javax.swing.JOptionPane.showMessageDialog(this,"Veritabanina Baglanti Saglanamadi! " + ex.toString());
      }
      
	
}

    
     // @param args the command line arguments
     
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        		

        /* Form oluşturma ve görüntüleme */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oda().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2; 
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables  
}




