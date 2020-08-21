/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class Events_Menu_JPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    /**
     * Creates new form EventsJPanel
     */
    public Events_Menu_JPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EventsListBtn = new javax.swing.JButton();
        EventsAttendingBtn = new javax.swing.JButton();
        Back_Btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        EventsListBtn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        EventsListBtn.setForeground(new java.awt.Color(0, 51, 255));
        EventsListBtn.setText("List of Events");
        EventsListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventsListBtnActionPerformed(evt);
            }
        });

        EventsAttendingBtn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        EventsAttendingBtn.setForeground(new java.awt.Color(0, 51, 255));
        EventsAttendingBtn.setText("Events Attending");
        EventsAttendingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventsAttendingBtnActionPerformed(evt);
            }
        });

        Back_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(0, 51, 255));
        Back_Btn.setText("Back");
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EventsListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventsAttendingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(EventsListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EventsAttendingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EventsListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventsListBtnActionPerformed
        // TODO add your handling code here:
         Request_Events_List_JPanel reqeventlistJPanel = new Request_Events_List_JPanel(userProcessContainer, userAccount,  enterprise, business);
        userProcessContainer.add("reqeventlist", reqeventlistJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_EventsListBtnActionPerformed

    private void EventsAttendingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventsAttendingBtnActionPerformed
        // TODO add your handling code here:
        Attending_Events_JPanel eventsattendingJPanel = new Attending_Events_JPanel(userProcessContainer, userAccount,  enterprise, business);
        userProcessContainer.add("attending_events_list", eventsattendingJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_EventsAttendingBtnActionPerformed

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_BtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn;
    private javax.swing.JButton EventsAttendingBtn;
    private javax.swing.JButton EventsListBtn;
    // End of variables declaration//GEN-END:variables
}
