/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.PlayerArray;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ryang
 */
public class PlayerManager extends javax.swing.JFrame
{

    /**
     * Creates new form matches
     */
    public PlayerManager()
    {
        initComponents();

        PlayerArray p = new PlayerArray();
        String[] players = p.getPlayers();

        DefaultListModel<String> model = new DefaultListModel<String>();

        //for every element in player, adds to list
        for (String player : players)
        {
            model.addElement(player);
        }
        lineupList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        overviewLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lineupList = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        ManagerLabel = new javax.swing.JLabel();
        PlayerLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addPlayerButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        positionTextField = new javax.swing.JTextField();
        positionLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        sortAlphabeticallyButton = new javax.swing.JButton();
        sortByAgeButton = new javax.swing.JButton();
        manageLineupsButton = new javax.swing.JButton();

        overviewLabel.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        overviewLabel.setText("TEAM MANAGER");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lineupList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lineupList);

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ManagerLabel.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        ManagerLabel.setText("MANAGER");

        PlayerLabel.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        PlayerLabel.setText("PLAYER");

        addPlayerButton.setText("add");
        addPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("name:");

        ageLabel.setText("age:");

        positionLabel.setText("position:");

        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        sortAlphabeticallyButton.setText("sort A-Z");
        sortAlphabeticallyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAlphabeticallyButtonActionPerformed(evt);
            }
        });

        sortByAgeButton.setText("sort by age");
        sortByAgeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByAgeButtonActionPerformed(evt);
            }
        });

        manageLineupsButton.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        manageLineupsButton.setText("Manage lineups");
        manageLineupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageLineupsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(483, 483, 483)
                        .addComponent(manageLineupsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ManagerLabel)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel)
                                    .addComponent(ageLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(positionLabel)
                                            .addComponent(positionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(addPlayerButton, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sortAlphabeticallyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sortByAgeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manageLineupsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(positionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(positionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addPlayerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sortAlphabeticallyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sortByAgeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        new Overview().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteButtonActionPerformed
    {//GEN-HEADEREND:event_deleteButtonActionPerformed
        String player = lineupList.getSelectedValue();
        PlayerArray p = new PlayerArray();
        p.deletePlayer(player);
        String[] players = p.getPlayers();
        lineupList.setListData(players);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sortAlphabeticallyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sortAlphabeticallyButtonActionPerformed
    {//GEN-HEADEREND:event_sortAlphabeticallyButtonActionPerformed
        PlayerArray p = new PlayerArray();
        p.sortAlphabetically();
        String[] players = p.getPlayers();
        lineupList.setListData(players);
    }//GEN-LAST:event_sortAlphabeticallyButtonActionPerformed

    private void sortByAgeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sortByAgeButtonActionPerformed
    {//GEN-HEADEREND:event_sortByAgeButtonActionPerformed
        PlayerArray p = new PlayerArray();
        //p.sortByAge();
        String[] players = p.getPlayers();
        lineupList.setListData(players);
    }//GEN-LAST:event_sortByAgeButtonActionPerformed

    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addPlayerButtonActionPerformed
    {//GEN-HEADEREND:event_addPlayerButtonActionPerformed
        PlayerArray p = new PlayerArray();
        String name = nameTextField.getText();
        int age = Integer.parseInt(nameTextField.getText());
        String position = nameTextField.getText();
        
        p.addPlayer(age, name, position);
        
        String[] players = p.getPlayers();

        lineupList.setListData(players);
    }//GEN-LAST:event_addPlayerButtonActionPerformed

    private void manageLineupsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageLineupsButtonActionPerformed
        new ViewMatches().setVisible(true);
        dispose();
    }//GEN-LAST:event_manageLineupsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PlayerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PlayerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PlayerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PlayerManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PlayerManager().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManagerLabel;
    private javax.swing.JLabel PlayerLabel;
    private javax.swing.JButton addPlayerButton;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lineupList;
    private javax.swing.JButton manageLineupsButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel overviewLabel;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JTextField positionTextField;
    private javax.swing.JButton sortAlphabeticallyButton;
    private javax.swing.JButton sortByAgeButton;
    // End of variables declaration//GEN-END:variables
}
