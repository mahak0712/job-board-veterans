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
public class Jobs_Menu_JPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private VeteranOrganization organization;
    /**
     * Creates new form Jobs_Menu_JPanel
     */
    public Jobs_Menu_JPanel(JPanel userProcessContainer, UserAccount account, VeteranOrganization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.organization=organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search_job_btn = new javax.swing.JButton();
        Consultancy_btn = new javax.swing.JButton();
        applied_Job_List_btn = new javax.swing.JButton();
        Back_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        search_job_btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        search_job_btn.setForeground(new java.awt.Color(0, 51, 255));
        search_job_btn.setText("Search Job");
        search_job_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_job_btnActionPerformed(evt);
            }
        });

        Consultancy_btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Consultancy_btn.setForeground(new java.awt.Color(0, 51, 255));
        Consultancy_btn.setText("Go to Consultancy");
        Consultancy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultancy_btnActionPerformed(evt);
            }
        });

        applied_Job_List_btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        applied_Job_List_btn.setForeground(new java.awt.Color(0, 51, 255));
        applied_Job_List_btn.setText("Applied Jobs");
        applied_Job_List_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applied_Job_List_btnActionPerformed(evt);
            }
        });

        Back_btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Back_btn.setForeground(new java.awt.Color(0, 51, 255));
        Back_btn.setText("Back");
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Consultancy_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_job_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(applied_Job_List_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(search_job_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Consultancy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(applied_Job_List_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void search_job_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_job_btnActionPerformed
        // TODO add your handling code here:
        Request_Jobs_List_JPanel search_result= new Request_Jobs_List_JPanel(userProcessContainer, userAccount,organization,  enterprise, business);
        userProcessContainer.add("search result JPanel", search_result);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_search_job_btnActionPerformed

    private void Consultancy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultancy_btnActionPerformed

         Consultancy_Menu_JPanel consultancy_menu= new Consultancy_Menu_JPanel(userProcessContainer, userAccount,  enterprise, business);
        userProcessContainer.add("Consultancy Menu JPanel",consultancy_menu );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_Consultancy_btnActionPerformed

    private void applied_Job_List_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applied_Job_List_btnActionPerformed
        // TODO add your handling code here:
        Applied_Jobs_JPanel applied_jobs= new Applied_Jobs_JPanel(userProcessContainer, enterprise, business, userAccount);
        userProcessContainer.add("List of applied jobs JPanel", applied_jobs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_applied_Job_List_btnActionPerformed

    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
//        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JButton Consultancy_btn;
    private javax.swing.JButton applied_Job_List_btn;
    private javax.swing.JButton search_job_btn;
    // End of variables declaration//GEN-END:variables
}