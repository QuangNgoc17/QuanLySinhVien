/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlysinhvien;

import Model.MyTable;
/*import com.mysql.cj.jdbc.DatabaseMetaData;*/
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class StudentFrame extends javax.swing.JFrame {
    
    
    public StudentFrame(){
        initComponents();
        setLocationRelativeTo(this);
    
    }
    private void showStudent() {
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Input Student's Detail Information"));

        jLabel1.setText("Full Name");

        jLabel2.setText("Gender");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        jLabel3.setText("Age");

        jLabel4.setText("Email");

        jLabel5.setText("Phone Number");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save as.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accept.png"))); // NOI18N
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnShow))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge)
                            .addComponent(txtFullname)
                            .addComponent(txtEmail)
                            .addComponent(txtPhoneNumber)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addGap(61, 61, 61)
                        .addComponent(btnDelete)
                        .addGap(53, 53, 53)
                        .addComponent(btnFind)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFind)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(btnShow)
                    .addComponent(btnSave))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    String fullname = txtFullname.getText();
    String gender = cbGender.getSelectedItem().toString();
    int age = Integer.parseInt(txtAge.getText());
    String email = txtEmail.getText();
    String phoneNumber = txtPhoneNumber.getText();

    

    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "08072005")) {
        
        String query;

        DatabaseMetaData metaData;
        metaData = (DatabaseMetaData) connection.getMetaData();
        ResultSet resultSet = metaData.getTables(null, null, "student", null);
        if (resultSet.next()) {
            String tableName = resultSet.getString("TABLE_NAME");
            ResultSet columns = metaData.getColumns(null, null, tableName, "Id");
            
            if (columns.next() && columns.getString("IS_AUTOINCREMENT").equals("YES")) {
                
                query = "INSERT INTO student (Full_name, gender, age, email, Phone_Number) VALUES (?, ?, ?, ?, ?)";
            } else {
              
                String providedId = ""; // Replace ... with the Id you want to provide
                query = "INSERT INTO student (Id, Full_name, gender, age, email, Phone_Number) VALUES (?, ?, ?, ?, ?, ?)";
            }
        } else {
        
            return;
        }

        try (PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            if (query.contains("Id")) {
                int providedId = 0;
               
                preparedStatement.setInt(1, providedId);
                preparedStatement.setString(2, fullname);
                preparedStatement.setString(3, gender);
                preparedStatement.setInt(4, age);
                preparedStatement.setString(5, email);
                preparedStatement.setString(6, phoneNumber);
            } else {
               
                preparedStatement.setString(1, fullname);
                preparedStatement.setString(2, gender);
                preparedStatement.setInt(3, age);
                preparedStatement.setString(4, email);
                preparedStatement.setString(5, phoneNumber);
            }

           
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Dữ liệu đã được lưu thành công!");

                
                showStudent(); 
            } else {
                JOptionPane.showMessageDialog(this, "Không thể lưu dữ liệu!");
            
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi kết nối đến cơ sở dữ liệu hoặc thực hiện truy vấn!");
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        txtFullname.setText("");
        cbGender.setSelectedIndex(0);
        txtAge.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed

        try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "08072005");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM student;");
			ResultSet rs = ps.executeQuery();
			tblStudent.setModel(new MyTable(rs));
			tblStudent.setRowHeight(40);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
   
        // Lấy số hàng đã chọn từ bảng
    int selectedRow = tblStudent.getSelectedRow();

    // Kiểm tra xem có hàng nào được chọn không
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một sinh viên để xóa!");
        return;
    }

    // Lấy giá trị từ cột Id của hàng được chọn
    String studentId = tblStudent.getValueAt(selectedRow, 0).toString();

    // Xác nhận xóa dữ liệu
    int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sinh viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        // Gọi hàm xóa sinh viên
        deleteStudent(studentId);
    }
}


private void deleteStudent(String studentId) {
    // Tạo kết nối đến cơ sở dữ liệu
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "08072005")) {
        // Chuẩn bị câu truy vấn SQL
        String query = "DELETE FROM student WHERE Id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Đặt giá trị cho tham số trong câu truy vấn
            preparedStatement.setString(1, studentId);

            // Thực hiện câu truy vấn delete
            int rowsAffected = preparedStatement.executeUpdate();

            // Kiểm tra xem có hàng nào bị xóa không
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Xóa sinh viên thành công!");
                // Cập nhật bảng để phản ánh sự thay đổi
                showStudent();
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên hoặc lỗi xóa dữ liệu!");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi kết nối đến cơ sở dữ liệu hoặc thực hiện câu truy vấn!");
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

    String tuKhoaTimKiem = JOptionPane.showInputDialog(this, "Nhập tên sinh viên cần tìm kiếm:");

    if (tuKhoaTimKiem == null || tuKhoaTimKiem.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tìm kiếm đã bị hủy hoặc bạn chưa nhập thông tin tìm kiếm.");
        return;
    }

    timKiemSinhVien(tuKhoaTimKiem);
}

private void timKiemSinhVien(String tuKhoaTimKiem) {
    try (Connection ketNoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "08072005")) {
       
        String cauTruyVan = "SELECT * FROM student WHERE Full_name LIKE ?";
        try (PreparedStatement truyVanChuanBi = ketNoi.prepareStatement(cauTruyVan)) {
            // Đặt giá trị cho tham số trong câu truy vấn
            truyVanChuanBi.setString(1, "%" + tuKhoaTimKiem + "%");

            // Thực hiện câu truy vấn select
            ResultSet ketQuaTruyVan = truyVanChuanBi.executeQuery();

            // Hiển thị kết quả tìm kiếm trong bảng
            DefaultTableModel moHinhBang = new DefaultTableModel();
            tblStudent.setModel(moHinhBang);

            ResultSetMetaData duLieuMeta = ketQuaTruyVan.getMetaData();
            int soCot = duLieuMeta.getColumnCount();

            Vector<String> tenCot = new Vector<>();
            for (int i = 1; i <= soCot; i++) {
                tenCot.add(duLieuMeta.getColumnName(i));
            }
            moHinhBang.setColumnIdentifiers(tenCot);

            while (ketQuaTruyVan.next()) {
                Vector<Object> dong = new Vector<>();
                for (int i = 1; i <= soCot; i++) {
                    dong.add(ketQuaTruyVan.getObject(i));
                }
                moHinhBang.addRow(dong);
            }

            tblStudent.setRowHeight(40);

            if (moHinhBang.getRowCount() > 0) {
                JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên!");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi kết nối đến cơ sở dữ liệu hoặc thực hiện câu truy vấn!");
    }
}

private void findStudent(String searchKeyword) {
    
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "08072005")) {
        // Chuẩn bị câu truy vấn SQL
        String query = "SELECT * FROM student WHERE Full_name LIKE ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Đặt giá trị cho tham số trong câu truy vấn
            preparedStatement.setString(1, "%" + searchKeyword + "%");

            // Thực hiện câu truy vấn select
            ResultSet resultSet = preparedStatement.executeQuery();

            // Hiển thị kết quả tìm kiếm trong bảng
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            tblStudent.setModel(defaultTableModel); 

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();

            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columns; i++) {
                columnNames.add(metaData.getColumnName(i));
            }
            defaultTableModel.setColumnIdentifiers(columnNames);

            while (resultSet.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(resultSet.getObject(i));
                }
                defaultTableModel.addRow(row);
            }

            tblStudent.setRowHeight(40);

            if (defaultTableModel.getRowCount() > 0) {
                JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên!");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi kết nối đến cơ sở dữ liệu hoặc thực hiện câu truy vấn!");
    }
    }//GEN-LAST:event_btnFindActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

}
