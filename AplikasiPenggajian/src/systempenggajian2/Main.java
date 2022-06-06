
package systempenggajian2;

import com.sun.istack.internal.NotNull;



public class Main extends javax.swing.JFrame{
    
    /**
     * Creates new form SystempenggajianGUI
     */
    public Main() {
        initComponents();
        
    }

   // atribute initComponents
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbnamakaryawan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfjabatan = new javax.swing.JTextField();
        tfgajipokok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfpenjualan = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarincian = new javax.swing.JTextArea();
        clearbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 11)); // NOI18N
        jLabel1.setText("System penggajian PT NGX SEA");

        jLabel2.setText("NAMA KARYAWAN");

        cbnamakaryawan.setEditable(true);
        cbnamakaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih nama...", "Mamat Supandi", "Bambang Jatmiko", "Sunarto ", "Alvin ibrahim", "Dinosius ", "Rizky farish", "Hinayah ", "Monica Nia", "Ismayah ", "Jamal Jamadi", "sodiqin", " ", " " }));
        cbnamakaryawan.setName(""); // NOI18N
        cbnamakaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnamakaryawanActionPerformed(evt);
            }
        });

        jLabel3.setText("JABATAN");

        tfjabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfjabatanActionPerformed(evt);
            }
        });

        tfgajipokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfgajipokokActionPerformed(evt);
            }
        });

        jLabel4.setText("GAJI POKOK");

        jLabel5.setText("JUMLAH PENJUALAN");

        tfpenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpenjualanActionPerformed(evt);
            }
        });

        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        tarincian.setColumns(20);
        tarincian.setRows(5);
        tarincian.setText("fitur program aplikasi penggajian :\n1. otomatis memunculkan gaji pokok dan jabatan karyawan\" +\n2. menghitung rincian gaji ,tunjangan dan potongan-potongan nya: \n berikut adalah rincian potongan :    \n  a. potongan bpjs kesehatan\n  b. potongan bpjs ketenagakerjaan\n  c. koperasi\n berikut adalah rincian tunjagan :    \n  a. uang makan\n  b. transportasi\n  khusus sales*");
        tarincian.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tarincianAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tarincian);

        clearbutton.setText("CLEAR");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfpenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfgajipokok)
                            .addComponent(tfjabatan)
                            .addComponent(cbnamakaryawan, javax.swing.GroupLayout.Alignment.TRAILING, 0, 117, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbnamakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tfjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfgajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitbtn))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfpenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfgajipokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfgajipokokActionPerformed
        
    }//GEN-LAST:event_tfgajipokokActionPerformed

    private void tfjabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfjabatanActionPerformed
        
    }//GEN-LAST:event_tfjabatanActionPerformed
    
    private void cbnamakaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnamakaryawanActionPerformed
        // jika memilih salah satu nama yang ada pada combobox
        // maka Textfield jabatan dan gaji pokok akan terisi otomatis
        // sesuai dengan jabatan karyawan tsb
        DataKaryawan data = new DataKaryawan();
       
        tfpenjualan.setVisible(true);
        switch (cbnamakaryawan.getSelectedIndex()){
            case 0 :
            tfjabatan.setText("");
            tfgajipokok.setText("");
            break;
            case 1 :
                manager();
            break;
            case 2 :
                itStaff();
            break;
            case 3 :
                itStaff();
            break;
            case 4 :
                admin();
            break;
            case 5 :
                admin();
            break;
            case 6 :
                sales();
            break;
            case 7 :
                sales();
            break;
            case 8 :
                sales();
            break;
            case 9 :
                sales();
            break;
            case 10 :
                officeBoy();
            break;
            case 11 :
                officeBoy();
            break;
        }
    }//GEN-LAST:event_cbnamakaryawanActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
       //jika submit button diklik. 
       //maka textarea akan menampilkan rincian gaji karyawan sesuai jabatannya.
       
        DataKaryawan data = new DataKaryawan();
        if ("Manager".equals(tfjabatan.getText())) {
            showManagerSalaryDetails();
        }
        else if ("IT Staff".equals(tfjabatan.getText())){
            showItSalaryDetails();
        }
        else if ("Admin".equals(tfjabatan.getText())){
        showAdminSalarydetails();
        }   
        else if ("Sales".equals(tfjabatan.getText())){
            showSalesSalaryDetails();
        }
        else if ("Office boy".equals(tfjabatan.getText())){
           showOfficBoySalaryDetails();
        }
        else{tarincian.setText("data tidak ada");}
        submitbtn.setVisible(false);
     
        
      
    }//GEN-LAST:event_submitbtnActionPerformed

    private void tarincianAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tarincianAncestorAdded
      
    }//GEN-LAST:event_tarincianAncestorAdded

    private void tfpenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpenjualanActionPerformed

    }//GEN-LAST:event_tfpenjualanActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
    // jika clear button diklik.
    // maka semua textField dan textArea nya akan dikosongkan.
    clear();
    }//GEN-LAST:event_clearbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
            
           
        });
    }
        
      
private void clear(){
//method bersihkan semua komponen dari ke dafault/setelan dasar (kososng)
// salah satu bentuk enkapsulasi (private)
 cbnamakaryawan.setSelectedIndex(0);
 tfjabatan.setText("");
 tfgajipokok.setText("");
 tfpenjualan.setText("");
 tarincian.setText("fitur program aplikasi penggajian :"+
                   "\n1. otomatis memunculkan gaji pokok dan jabatan karyawan" +
                   "\n2. menghitung rincian gaji ,tunjangan dan potongan-potongan nya: "+
                   "\n berikut adalah rincian potongan :" +    
                   "\n a. potongan bpjs kesehatan"+
                   "\n b. potongan bpjs ketenagakerjaan"+
                   "\n c. koperasi"+
                   "\n berikut adalah rincian tunjagan :" +    
                   "\n a. uang makan"+
                   "\n b. transportasi"+
                   "\n khusus sales*");
submitbtn.setVisible(true);
}

// methode attribute manager 
private void manager(){
// salah satu bentuk enkapsulasi (private)
// bentuk polymorphism (memanggil methode dari class lain)
DataKaryawan data = new DataKaryawan();
 tfjabatan.setText(data.ambildatajabatandangajistring(0,0));
 tfgajipokok.setText(data.ambildatajabatandangajistring(0, 1));
 tfpenjualan.setVisible(false);

}
private void showManagerSalaryDetails(){
DataKaryawan data = new DataKaryawan();
tarincian.setText
("gaji pokok: Rp."+data.ambildatajabatandangajistring(0, 1)+
"\n====================================================="+
"\npotongan Bpjs kesehatan : Rp.250.000,- "+
"\npotongan Bpjs ketenagakerjaan  : Rp.100.000,-"+
"\npotongan uang koperasi (5% total pendapatan) : Rp." + Integer.parseInt(data.ambildatajabatandangajistring(0,1)) *0.05+
"\n====================================================="+
"\n Total gaji : Rp"+data.totalgaji(Integer.parseInt(data.ambildatajabatandangajistring(0,1))));

}

//methode attribute it staff
private void itStaff(){
// salah satu bentuk enkapsulasi (private)
// bentuk polymorphism (memanggil methode dari class lain)
DataKaryawan data = new DataKaryawan();
 tfjabatan.setText(data.ambildatajabatandangajistring(1,0));
 tfgajipokok.setText(data.ambildatajabatandangajistring(1, 1));
 tfpenjualan.setVisible(false);
}
private void showItSalaryDetails(){
 DataKaryawan data = new DataKaryawan();
tarincian.setText
("gaji pokok: Rp."+data.ambildatajabatandangajistring(1, 1)+
"\n====================================================="+
"\npotongan Bpjs kesehatan : Rp.250.000,- "+
"\npotongan Bpjs ketenagakerjaan  : Rp.100.000,-"+
"\npotongan uang koperasi (5% total pendapatan) : Rp." + Integer.parseInt(data.ambildatajabatandangajistring(1,1))*0.05+
"\n====================================================="+
"\n Total gaji : Rp"+data.totalgaji(Integer.parseInt(data.ambildatajabatandangajistring(1,1))) );

 }    

//methode attribute admin
private void admin(){
// salah satu bentuk enkapsulasi (private)
// bentuk polymorphism (memanggil methode dari class lain)
DataKaryawan data = new DataKaryawan();
tfjabatan.setText(data.ambildatajabatandangajistring(2,0));
tfgajipokok.setText(data.ambildatajabatandangajistring(2, 1));
tfpenjualan.setVisible(false);
}
private void showAdminSalarydetails(){
 DataKaryawan data = new DataKaryawan();
tarincian.setText
("gaji pokok: Rp."+data.ambildatajabatandangajistring(2, 1)+
"\n====================================================="+
"\npotongan Bpjs kesehatan : Rp.250.000,- "+
"\npotongan Bpjs ketenagakerjaan  : Rp.100.000,-"+
"\npotongan uang koperasi (5% total pendapatan) : Rp." + Integer.parseInt(data.ambildatajabatandangajistring(2,1))*0.05+
"\n====================================================="+
"\n Total gaji : Rp"+data.totalgaji(Integer.parseInt(data.ambildatajabatandangajistring(2,1))));

 }   

//methode attribute sales
private void sales(){
// salah satu bentuk enkapsulasi (private)
// bentuk polymorphism (memanggil methode dari class lain)
DataKaryawan data = new DataKaryawan();
tfpenjualan.setVisible(true);
tfjabatan.setText(data.ambildatajabatandangajistring(3,0));
tfgajipokok.setText(data.ambildatajabatandangajistring(3, 1));
tfpenjualan.setVisible(true);
}
private void showSalesSalaryDetails(){
DataKaryawan data = new DataKaryawan();
if ("".equals(tfpenjualan.getText())){
tarincian.setText("masukan data penjualan");
}
else{
tarincian.setText
("gaji pokok: Rp."+data.ambildatajabatandangajistring(3, 1)+
"\njumlah bonus penjualan : Rp."+(data.bonussales() * Integer.parseInt(tfpenjualan.getText()))+
"\n uang makan :Rp.600.000,-"+
"\n uang transportasi :Rp.300.000,-"+
"\n====================================================="+
"\npotongan Bpjs kesehatan : Rp.250.000,- "+
"\npotongan Bpjs ketenagakerjaan  : Rp.100.000,-"+
"\npotongan uang koperasi (5% total pendapatan) : Rp." 
+(Integer.parseInt(data.ambildatajabatandangajistring(3,1))+(data.bonussales() * Integer.parseInt(tfpenjualan.getText())))*0.05+ 
"\n====================================================="+
"\n Total gaji : Rp"+data.totalgaji(Integer.parseInt(data.ambildatajabatandangajistring(3,1)),Integer.parseInt(tfpenjualan.getText())));
          }
}

// methode attribute officeboy
private void officeBoy(){
// salah satu bentuk enkapsulasi (private)
// bentuk polymorphism (memanggil methode dari class lain)
DataKaryawan data = new DataKaryawan();
 tfjabatan.setText(data.ambildatajabatandangajistring(4,0));
 tfgajipokok.setText(data.ambildatajabatandangajistring(4, 1));
 tfpenjualan.setVisible(false);
}
private void showOfficBoySalaryDetails(){
DataKaryawan data = new DataKaryawan();
tarincian.setText
("gaji pokok: Rp."+data.ambildatajabatandangajistring(4, 1)+
"\n====================================================="+
"\npotongan Bpjs kesehatan : Rp.250.000,- "+
"\npotongan Bpjs ketenagakerjaan  : Rp.100.000,-"+
"\n====================================================="+
"\n Total gaji : Rp"+data.totalgaji(Integer.parseInt(data.ambildatajabatandangajistring(4,1))) );

}

    
    
        
    
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbnamakaryawan;
    private javax.swing.JButton clearbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextArea tarincian;
    private javax.swing.JTextField tfgajipokok;
    private javax.swing.JTextField tfjabatan;
    private javax.swing.JTextField tfpenjualan;
    // End of variables declaration//GEN-END:variables

   
}
