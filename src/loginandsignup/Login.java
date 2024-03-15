
package loginandsignup;

import Home.Home;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.awt.Color;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    Statement st= null;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnum = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        LogInbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SignUpbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(6, 139, 128));
        jPanel2.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LoginAndSignUp\\src\\Icon\\snapedit_1710164001351.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Healthtrack");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 139, 128));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOG IN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 20, 150, 70);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 190, 130, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 100, 130, 30);
        jPanel1.add(pnum);
        pnum.setBounds(440, 140, 340, 40);
        jPanel1.add(pass);
        pass.setBounds(440, 230, 340, 40);

        LogInbtn.setBackground(new java.awt.Color(6, 139, 128));
        LogInbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LogInbtn.setForeground(new java.awt.Color(255, 255, 255));
        LogInbtn.setText("Log In");
        LogInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInbtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogInbtn);
        LogInbtn.setBounds(440, 300, 80, 40);

        jLabel6.setText("I don't have an account ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 360, 140, 16);

        SignUpbtn.setForeground(new java.awt.Color(255, 0, 51));
        SignUpbtn.setText("Sign Up");
        SignUpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpbtnActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpbtn);
        SignUpbtn.setBounds(590, 350, 90, 30);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpbtnActionPerformed
        // TODO add your handling code here:
        SignUp SignUpFrame= new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SignUpbtnActionPerformed

    private void LogInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInbtnActionPerformed
        // TODO add your handling code here:
       String Phone, Password, query,passdb= null;
        String SUrl, SUser,Spass;
        SUrl="jdbc:MySQL://localhost/userdb";
        SUser="root";
        Spass="";
        int notFound=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection(SUrl,SUser,Spass);
             st= conn.createStatement();
            if (("".equals(pnum.getText())) || (pnum.getText().length()!=10)){
               JOptionPane.showMessageDialog(new JFrame(),"Phone Number is require", "Error",
                       JOptionPane.ERROR_MESSAGE);
               
            }else  if ("".equals(pass.getText())){
               JOptionPane.showMessageDialog(new JFrame(),"Password is require", "Error",
                       JOptionPane.ERROR_MESSAGE);
               
            }else {
                Phone= pnum.getText();
                Password=pass.getText();
                System.out.println(Password);
                
                query="SELECT *  FROM user  WHERE phonenumber= "+ Phone;
                rs = st.executeQuery(query);
                while (rs.next()){
                    passdb= rs.getString("password");
                    notFound=1;
                }
                if ((notFound==1) && (Password.equals(passdb))){
                    Home HomeFrame= new Home();
                    HomeFrame.setVisible(true);
                    HomeFrame.pack();
                    HomeFrame.setLocationRelativeTo(null);
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(new JFrame(),"Incorrect Phonenumber or Password ", "Error",
                       JOptionPane.ERROR_MESSAGE);
                }
                
                pnum.setText("");
                pass.setText("");
              
            }
        }catch (Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_LogInbtnActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInbtn;
    private javax.swing.JButton SignUpbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField pnum;
    // End of variables declaration//GEN-END:variables
}
