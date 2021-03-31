package otel_otomasyonu;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class butonlar extends javax.swing.JFrame {

    private rezervasyon Rezervasyon;
    //private rezervasyon rezervasyon;

    
     //butonlar formunu oluşturuyorum
     
    public butonlar() {
        initComponents();
        otel_kontrol();
        if(otel_listesi.getItemCount()==1) {
        	javax.swing.JOptionPane.showMessageDialog(null,"Otel Kaydı Bulunmamaktadır, Lütfen Otel Kaydı Yapınız."); 	
        	
        }
        
       
    }

  

    
    //form oluşturmak için çağrılan fonksiyon
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new java.awt.Font("Times New Roman",0,15));
        jLabel3.setText("Yeni Yetki Kaydı İçin Tıklayınız");

        jLabel3.addMouseListener(new MouseListener() {
        	public void mouseClicked(MouseEvent e) {
        		uye_ekle a = new uye_ekle();
                a.setVisible(true);
                dispose();
        		
        	}
     

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Times New Roman",0,15));
        jLabel1.setText("Yeni Otel Kaydı İçin Tıklayınız");
        
        jLabel1.addMouseListener(new MouseListener() {
        	public void mouseClicked(MouseEvent e) {
        		otel_ekle a = new otel_ekle();
                a.setVisible(true);
                dispose();
        		
        	}
     

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        
        otel_listesi= new javax.swing.JComboBox<>();
        otel_listesi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Otel Listesi"}));
        


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new Color(255,255,255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ana Menü", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otel_otomasyonu/1.banner.jpg"))); // NOI18N
        
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton3.setText("Müşteri İşlemleri");
        
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
                
                
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton2.setText("Personel İşlemleri");
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                
            }
        });

       
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton4.setText("Oda Kontrolü");
        
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
                
            }
        });

        
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton5.setText("Geri");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
                dispose();
            }
        });
        
        
        
        
        
        
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                    	.addComponent(otel_listesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)	
                        //.addGap(180,180,180)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        		
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(otel_listesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
            	.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    	if(otel_listesi.getItemCount()==1) {
        	javax.swing.JOptionPane.showMessageDialog(null,"Otel Kaydı Bulunmamaktadır, Lütfen Otel Kaydı Yapınız."); 	
        	
        }else {
        	dispose();
        	 rezervasyon a = new rezervasyon();
             a.setVisible(true);
        }
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	if(otel_listesi.getItemCount()==1) {
        	javax.swing.JOptionPane.showMessageDialog(null,"Otel Kaydı Bulunmamaktadır, Lütfen Otel Kaydı Yapınız."); 	
        	
        }else {
        	dispose();
        	 personel_kayit a = new personel_kayit();
        	 a.setVisible(true);
        }
   
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	if(otel_listesi.getItemCount()==1) {
        	javax.swing.JOptionPane.showMessageDialog(null,"Otel Kaydı Bulunmamaktadır, Lütfen Otel Kaydı Yapınız."); 	
        	
        }else {
        	dispose();
        	oda a=new oda();
            a.setVisible(true);
        }
            
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        this.setVisible(false);
        
        kullanici_girisi ac = new kullanici_girisi();
        ac.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed
    
    

      //@param args the command line arguments
     
    public static void main(String args[]) {
        /* Nimbus look and feel Çağrılıyor*/
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(butonlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(butonlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(butonlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(butonlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        //</editor-fold>

        /* Form oluşturma ve görüntüleme */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new butonlar().setVisible(true);
            }
        });
        
    }
    private kullanici_girisi atapencere;
    public butonlar(kullanici_girisi ata){
        this.atapencere=ata;
        initComponents();
    }

    public rezervasyon getRezervasyon() {
		return Rezervasyon;
	}

	public void setRezervasyon(rezervasyon rezervasyon) {
		Rezervasyon = rezervasyon;
	}
	// Variables declaration - do not modify//GEN-BEGIN:variables
	
	
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

	                	otel_listesi.addItem(rs.getString("otel_adi"));
	                    

	                i++;
	            }
	           
	            con.close();
	           
	            
	       
	        } catch (SQLException ex) {
	            javax.swing.JOptionPane.showMessageDialog(this,"Veritabanina Baglanti Saglanamadi! " + ex.toString());
	        }
	        
		
	}
	
	

	
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> otel_listesi;
    // End of variables declaration//GEN-END:variables

    private static class Gorunurluk{

        private static void setVisible(boolean b) {
            throw new UnsupportedOperationException("Desteklenmiyor!"); 
        }

    }
}
