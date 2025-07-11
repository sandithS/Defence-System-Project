/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem;

/**
 *
 * @author User
 */
public class SubmarineWindow extends javax.swing.JFrame implements DefenceObserver {

    private int position;

    /**
     * Creates new form SubmarineWindow
     */
    public SubmarineWindow() {
        initComponents();
        setTitle("Subamrine");
        setSize(798, 600);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnSonarOperation = new javax.swing.JButton();
        btnTomahawkMissile = new javax.swing.JButton();
        positionCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgTextArea = new javax.swing.JTextArea();
        msgTextField = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnTridentMissille = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        btnShoot1 = new javax.swing.JButton();
        btnMissileOperation1 = new javax.swing.JButton();
        btnRedarOperation1 = new javax.swing.JButton();
        positionCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgTextArea1 = new javax.swing.JTextArea();
        msgTextField1 = new javax.swing.JTextField();
        btnSend1 = new javax.swing.JButton();
        btnRotateShooting1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnShoot.setBackground(new java.awt.Color(0, 255, 255));
        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });
        getContentPane().add(btnShoot);
        btnShoot.setBounds(80, 110, 162, 35);

        btnSonarOperation.setBackground(new java.awt.Color(0, 255, 255));
        btnSonarOperation.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSonarOperation.setText("Sonar Operation");
        btnSonarOperation.setEnabled(false);
        btnSonarOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarOperationActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonarOperation);
        btnSonarOperation.setBounds(260, 110, 160, 35);

        btnTomahawkMissile.setBackground(new java.awt.Color(0, 255, 255));
        btnTomahawkMissile.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnTomahawkMissile.setText("Tomahawk Missile");
        btnTomahawkMissile.setEnabled(false);
        btnTomahawkMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawkMissileActionPerformed(evt);
            }
        });
        getContentPane().add(btnTomahawkMissile);
        btnTomahawkMissile.setBounds(80, 160, 162, 35);

        positionCheckBox.setBackground(new java.awt.Color(11, 26, 46));
        positionCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        positionCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        positionCheckBox.setText("Position");
        positionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(positionCheckBox);
        positionCheckBox.setBounds(590, 60, 124, 38);

        msgTextArea.setColumns(20);
        msgTextArea.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        msgTextArea.setRows(5);
        msgTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        msgTextArea.setEnabled(false);
        jScrollPane1.setViewportView(msgTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 220, 537, 204);

        msgTextField.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        msgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(msgTextField);
        msgTextField.setBounds(80, 440, 420, 38);

        btnSend.setBackground(new java.awt.Color(255, 255, 51));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend);
        btnSend.setBounds(520, 440, 99, 38);

        btnTridentMissille.setBackground(new java.awt.Color(0, 255, 255));
        btnTridentMissille.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnTridentMissille.setText("Trident-2 Missille");
        btnTridentMissille.setEnabled(false);
        btnTridentMissille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentMissilleActionPerformed(evt);
            }
        });
        getContentPane().add(btnTridentMissille);
        btnTridentMissille.setBounds(260, 160, 164, 35);

        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Area Not Cleared");
        getContentPane().add(lblArea);
        lblArea.setBounds(70, 50, 210, 37);

        btnShoot1.setBackground(new java.awt.Color(0, 255, 255));
        btnShoot1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnShoot1.setText("Shoot");
        btnShoot1.setEnabled(false);
        btnShoot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShoot1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnShoot1);
        btnShoot1.setBounds(80, 110, 162, 35);

        btnMissileOperation1.setBackground(new java.awt.Color(0, 255, 255));
        btnMissileOperation1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMissileOperation1.setText("Missile Operation");
        btnMissileOperation1.setEnabled(false);
        btnMissileOperation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileOperation1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMissileOperation1);
        btnMissileOperation1.setBounds(260, 110, 164, 35);

        btnRedarOperation1.setBackground(new java.awt.Color(0, 255, 255));
        btnRedarOperation1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRedarOperation1.setText("Redar Operation");
        btnRedarOperation1.setEnabled(false);
        btnRedarOperation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedarOperation1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRedarOperation1);
        btnRedarOperation1.setBounds(80, 160, 162, 35);

        positionCheckBox1.setBackground(new java.awt.Color(11, 26, 46));
        positionCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        positionCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        positionCheckBox1.setText("Position");
        positionCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(positionCheckBox1);
        positionCheckBox1.setBounds(590, 60, 124, 38);

        msgTextArea1.setColumns(20);
        msgTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        msgTextArea1.setRows(5);
        msgTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        msgTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(msgTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(80, 220, 537, 204);

        msgTextField1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        msgTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(msgTextField1);
        msgTextField1.setBounds(80, 440, 420, 38);

        btnSend1.setBackground(new java.awt.Color(255, 255, 51));
        btnSend1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSend1.setText("Send");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend1);
        btnSend1.setBounds(520, 440, 99, 38);

        btnRotateShooting1.setBackground(new java.awt.Color(0, 255, 255));
        btnRotateShooting1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRotateShooting1.setText("Rotate Shooting");
        btnRotateShooting1.setEnabled(false);
        btnRotateShooting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateShooting1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRotateShooting1);
        btnRotateShooting1.setBounds(260, 160, 164, 35);

        jLabel1.setBackground(new java.awt.Color(11, 26, 46));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defencesystem/resized_frame_780x650.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 790, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed

    }//GEN-LAST:event_btnShootActionPerformed

    private void btnSonarOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonarOperationActionPerformed

    private void btnTomahawkMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawkMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomahawkMissileActionPerformed

    private void positionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionCheckBoxActionPerformed

    private void msgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgTextFieldActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg = "Submarine : " + msgTextField.getText();
        MainController.setDefenceMsg(msg);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnTridentMissilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTridentMissilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTridentMissilleActionPerformed

    private void btnShoot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShoot1ActionPerformed

    private void btnMissileOperation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileOperation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMissileOperation1ActionPerformed

    private void btnRedarOperation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedarOperation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedarOperation1ActionPerformed

    private void positionCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionCheckBox1ActionPerformed

    private void msgTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgTextField1ActionPerformed

    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
        String msg = "Submarine : " + msgTextField.getText();
        MainController.setDefenceMsg(msg);
        try {
            javax.swing.text.Document doc = msgTextArea.getDocument();
            doc.insertString(doc.getLength(), "You: " + msgTextField.getText() + "\n", null);
            msgTextArea.setCaretPosition(doc.getLength());
        } catch (javax.swing.text.BadLocationException e) {

        }
    }//GEN-LAST:event_btnSend1ActionPerformed

    private void btnRotateShooting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateShooting1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRotateShooting1ActionPerformed

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
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmarineWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmarineWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMissileOperation1;
    private javax.swing.JButton btnRedarOperation1;
    private javax.swing.JButton btnRotateShooting1;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSend1;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnShoot1;
    private javax.swing.JButton btnSonarOperation;
    private javax.swing.JButton btnTomahawkMissile;
    private javax.swing.JButton btnTridentMissille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JTextArea msgTextArea;
    private javax.swing.JTextArea msgTextArea1;
    private javax.swing.JTextField msgTextField;
    private javax.swing.JTextField msgTextField1;
    private javax.swing.JCheckBox positionCheckBox;
    private javax.swing.JCheckBox positionCheckBox1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void update(int position) {
        this.position = position;
        updateButtons();
    }

    @Override
    public void getMsgMain(String msg) {
        try {
            javax.swing.text.Document doc = msgTextArea.getDocument();
            doc.insertString(doc.getLength(), "Maincontroller: " + msg + "\n", null);
            msgTextArea.setCaretPosition(doc.getLength());

        } catch (javax.swing.text.BadLocationException e) {

        }
    }

    @Override
    public void areaClearLabel(boolean clearStatus) {
        if (clearStatus) {
            lblArea.setText("Area Cleared");
        } else {
            lblArea.setText("Area Not Cleared");
        }
    }

    @Override
    public void updateButtons() {
        if (positionCheckBox.isSelected()) {
            if (position > 80) {
                btnTridentMissille.setEnabled(true);
                btnTomahawkMissile.setEnabled(true);
                btnSonarOperation.setEnabled(true);
                btnShoot.setEnabled(true);
            } else if (position > 60) {
                btnTomahawkMissile.setEnabled(true);
                btnSonarOperation.setEnabled(true);
                btnShoot.setEnabled(true);
            } else if (position > 40) {
                btnSonarOperation.setEnabled(true);
                btnShoot.setEnabled(true);
            } else if (position > 20) {
                btnShoot.setEnabled(true);
            }

            if (position < 20) {
                btnTridentMissille.setEnabled(false);
                btnTomahawkMissile.setEnabled(false);
                btnSonarOperation.setEnabled(false);
                btnShoot.setEnabled(false);
            } else if (position < 40) {
                btnTridentMissille.setEnabled(false);
                btnTomahawkMissile.setEnabled(false);
                btnSonarOperation.setEnabled(false);
            } else if (position < 60) {
                btnTridentMissille.setEnabled(false);
                btnTomahawkMissile.setEnabled(false);
            } else if (position < 80) {
                btnTridentMissille.setEnabled(false);
            }
        }
    }

}
