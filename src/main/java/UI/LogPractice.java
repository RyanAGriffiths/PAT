/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.PracticeArray;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryang
 */
public class LogPractice extends javax.swing.JFrame
{

    /**
     * Creates new form matches
     */
    public LogPractice()
    {
        initComponents();
        //create the list model
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        String[] practice = PracticeArray.getPracticeAsArray();
        for (int i = 0; i < practice.length; i++)
        {
            listModel.addElement(practice[i]);
        }
        practiceList.setModel(listModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        practiceList = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        addPracticeButton = new javax.swing.JButton();
        deletePracticeButton = new javax.swing.JButton();
        dateTextField = new javax.swing.JTextField();
        exampleLabel = new javax.swing.JLabel();
        example2Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        exampleLabel1 = new javax.swing.JLabel();
        TimeInputLabel = new javax.swing.JLabel();
        TimeInputLabel1 = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        exampleLabel2 = new javax.swing.JLabel();
        locationInputLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(practiceList);

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });

        addPracticeButton.setText("add practice");
        addPracticeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addPracticeButtonActionPerformed(evt);
            }
        });

        deletePracticeButton.setText("delete practice");
        deletePracticeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deletePracticeButtonActionPerformed(evt);
            }
        });

        dateTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dateTextFieldActionPerformed(evt);
            }
        });

        exampleLabel.setForeground(new java.awt.Color(153, 153, 153));
        exampleLabel.setText("e.g. 1 October");

        example2Label.setForeground(new java.awt.Color(153, 153, 153));
        example2Label.setText("select a practice date");
        example2Label.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRACTICES");
        jLabel1.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("LOG");
        jLabel3.setFocusable(false);

        dateLabel.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        dateLabel.setText("Date - Time - Location");

        timeTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                timeTextFieldActionPerformed(evt);
            }
        });

        exampleLabel1.setForeground(new java.awt.Color(153, 153, 153));
        exampleLabel1.setText("e.g. 15:00-16:00 ");

        TimeInputLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TimeInputLabel.setText("Time:");

        TimeInputLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TimeInputLabel1.setText("Date:");

        locationTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                locationTextFieldActionPerformed(evt);
            }
        });

        exampleLabel2.setForeground(new java.awt.Color(153, 153, 153));
        exampleLabel2.setText("e.g. Reddam House ");

        locationInputLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        locationInputLabel.setText("Location");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TimeInputLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exampleLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(locationTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(example2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(deletePracticeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addPracticeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(timeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(TimeInputLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exampleLabel)
                                        .addGap(0, 127, Short.MAX_VALUE)))
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(locationInputLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exampleLabel2))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exampleLabel)
                    .addComponent(TimeInputLabel1)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exampleLabel1)
                            .addComponent(TimeInputLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exampleLabel2)
                            .addComponent(locationInputLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(addPracticeButton)
                        .addGap(18, 18, 18)
                        .addComponent(example2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletePracticeButton))
                    .addComponent(jScrollPane1))
                .addGap(8, 8, 8)
                .addComponent(backButton)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        new MobileManager().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    //calls addPractice() from backend
    private void addPracticeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addPracticeButtonActionPerformed
    {//GEN-HEADEREND:event_addPracticeButtonActionPerformed
        if (dateTextField.getText().isEmpty() || timeTextField.getText().isEmpty() || locationTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input values", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else
        {
            String date = (String) dateTextField.getText();
            String time = (String) timeTextField.getText();
            String location = (String) locationTextField.getText();

            PracticeArray p = new PracticeArray();
            p.addPractice(date, time, location);

            DefaultListModel<String> listModel = new DefaultListModel<String>();
            String[] practice = PracticeArray.getPracticeAsArray();
            for (int i = 0; i < practice.length; i++)
            {
                listModel.addElement(practice[i]);
            }
            practiceList.setModel(listModel);
            dateTextField.setText("");
            timeTextField.setText("");
            locationTextField.setText("");
        }
    }//GEN-LAST:event_addPracticeButtonActionPerformed

    private void deletePracticeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deletePracticeButtonActionPerformed
    {//GEN-HEADEREND:event_deletePracticeButtonActionPerformed
        //defensive programming
        if (practiceList.getSelectedValue() == null)
        {

            JOptionPane.showMessageDialog(this, "Please select a practice from the list", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else
        {
            String selected = (String) practiceList.getSelectedValue();
            PracticeArray p = new PracticeArray();

            Scanner sc = new Scanner(selected);
            String date = sc.next();

            int index = p.binarySearch(date);
            p.deletePractice(index);

            DefaultListModel<String> listModel = new DefaultListModel<String>();
            String[] practice = PracticeArray.getPracticeAsArray();
            for (int i = 0; i < practice.length; i++)
            {
                listModel.addElement(practice[i]);
            }
            practiceList.setModel(listModel);
        }

    }//GEN-LAST:event_deletePracticeButtonActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dateTextFieldActionPerformed
    {//GEN-HEADEREND:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void timeTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_timeTextFieldActionPerformed
    {//GEN-HEADEREND:event_timeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTextFieldActionPerformed

    private void locationTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_locationTextFieldActionPerformed
    {//GEN-HEADEREND:event_locationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LogPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LogPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LogPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LogPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LogPractice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TimeInputLabel;
    private javax.swing.JLabel TimeInputLabel1;
    private javax.swing.JButton addPracticeButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deletePracticeButton;
    private javax.swing.JLabel example2Label;
    private javax.swing.JLabel exampleLabel;
    private javax.swing.JLabel exampleLabel1;
    private javax.swing.JLabel exampleLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationInputLabel;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JList<String> practiceList;
    private javax.swing.JTextField timeTextField;
    // End of variables declaration//GEN-END:variables
}
