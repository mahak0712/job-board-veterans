/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.VeteranOrganization.VeteranOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class VeteranWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    private VeteranOrganization organization;
    /**
     * Creates new form VeteranWorkAreaJPanel
     */
    public VeteranWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,VeteranOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization=organization;
//        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jobs_Btn = new javax.swing.JButton();
        Events_Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        Jobs_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Jobs_Btn.setForeground(new java.awt.Color(0, 51, 255));
        Jobs_Btn.setText("Jobs");
        Jobs_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jobs_BtnActionPerformed(evt);
            }
        });

        Events_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Events_Btn.setForeground(new java.awt.Color(0, 51, 255));
        Events_Btn.setText("Events");
        Events_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Events_BtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Zapfino", 1, 24)); // NOI18N
        jLabel1.setText("WelVets");

        jLabel2.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel2.setText("for Veterans");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welvets_pictures/events.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welvets_pictures/jobs.png"))); // NOI18N
        jLabel4.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Events_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jobs_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jobs_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Events_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Jobs_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jobs_BtnActionPerformed
        // TODO add your handling code here:
        Jobs_Menu_JPanel jobsJPanel = new Jobs_Menu_JPanel(userProcessContainer, account,organization,  enterprise, business);
        userProcessContainer.add("manageOrganizationJPanel", jobsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Jobs_BtnActionPerformed

    private void Events_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Events_BtnActionPerformed
        // TODO add your handling code here:
        Events_Menu_JPanel events_menu_JPanel = new Events_Menu_JPanel(userProcessContainer, account, enterprise, business);
        userProcessContainer.add("Events Menu", events_menu_JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Events_BtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Events_Btn;
    private javax.swing.JButton Jobs_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
