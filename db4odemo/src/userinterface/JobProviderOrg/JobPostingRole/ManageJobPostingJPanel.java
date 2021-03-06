/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.JobProviderOrg.JobPostingRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.JobProviderEnterprise;
import Business.JobDetails.JobDetails;
import Business.Network.Network;
import Business.Organization.JobProviderOrganization.JobPostingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ApplicationProcessWorkRequest;
import Business.WorkQueue.JobPostingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahaksingh
 */
public class ManageJobPostingJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private JobPostingOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form ManageJobPostingJPanel
     */
    public ManageJobPostingJPanel(JPanel userProcessContainer, UserAccount account, JobPostingOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
public void populateRequestTable() {

         DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Network network : business.getNetworkList()){
            System.out.println(network);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof JobProviderEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof JobPostingOrganization) {
                        for (WorkRequest workreq : organization.getWorkQueue().getWorkRequestList()) {
                            if (workreq instanceof JobPostingWorkRequest) {
                                JobPostingWorkRequest jpWorkreq = (JobPostingWorkRequest) workreq;
//                                if (JobPostingWorkRequest.getStatus()!="Completed"){
                                Object[] row = new Object[6];
                                row[0] = jpWorkreq;
                                if (jpWorkreq != null) {
                                    
                                    JobDetails jobdetails=jpWorkreq.getJobdetails();
                                    System.out.println(jobdetails);
                                    row[1] = jobdetails.getLocation();
                                    row[2] = jpWorkreq.getRequestDate();
                                    row[3] = jpWorkreq.getStatus();
                                    row[4] = jobdetails.getJobDescription();
                                
                                                          
                                }
                                row[5] = jpWorkreq.getStatus();

                                model.addRow(row);
                            }
                        }
                    }
                }

                }
            }

        }

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addJobRequirement = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company Name", "Location", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        enterpriseLabel.setBackground(new java.awt.Color(0, 102, 102));
        enterpriseLabel.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 51, 255));
        enterpriseLabel.setText("ENTERPRISE :");

        valueLabel.setFont(new java.awt.Font("Chalkboard", 0, 14)); // NOI18N
        valueLabel.setText("<value>");

        requestTestJButton.setFont(new java.awt.Font("Superclarendon", 0, 12)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(0, 51, 255));
        requestTestJButton.setText("View");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("WELCOME TO JOB MANAGEMENT WORKAREA");

        backJButton.setFont(new java.awt.Font("Superclarendon", 0, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 51, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addJobRequirement.setFont(new java.awt.Font("Superclarendon", 0, 12)); // NOI18N
        addJobRequirement.setForeground(new java.awt.Color(0, 51, 255));
        addJobRequirement.setText("Add Job Requirement");
        addJobRequirement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJobRequirementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addJobRequirement)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(requestTestJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(requestTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addJobRequirement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backJButton)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        JobPostingWorkRequest request = (JobPostingWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

//        request.setStatus("Processing");
        PostedJobJPanel postedJobJPanel = new PostedJobJPanel(userProcessContainer, request , enterprise, userAccount,business);
        userProcessContainer.add("PostedJobJPanel", postedJobJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        JobPostingWorkAreaJPanel dwjp = (JobPostingWorkAreaJPanel) component;
//        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJobRequirementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJobRequirementActionPerformed
        // TODO add your handling code here:
        JobPostingJPanel jpjp = new JobPostingJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("JobPostingJPanel",jpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addJobRequirementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJobRequirement;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
