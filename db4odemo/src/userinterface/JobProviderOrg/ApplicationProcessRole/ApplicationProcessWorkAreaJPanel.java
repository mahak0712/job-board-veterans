/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.JobProviderOrg.ApplicationProcessRole;

import Business.CandidateProfile.CandidateProfile;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.JobProviderEnterprise;
import Business.Enterprise.VeteransEnterprise;
import Business.JobDetails.JobDetails;
import Business.Network.Network;
import Business.Organization.JobProviderOrganization.ApplicationProcessOrganization;
import Business.Organization.JobProviderOrganization.JobPostingOrganization;
import Business.Organization.Organization;
import Business.Organization.VeteranOrganization.VeteranOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ApplicationProcessWorkRequest;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.JobPostingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import userinterface.LabAssistantRole.ProcessWorkRequestJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class ApplicationProcessWorkAreaJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ApplicationProcessOrganization organization;
    private Enterprise enterprise;
    /**
     * Creates new form ApplicationProcessWorkAreaJPanel
     */
    public ApplicationProcessWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ApplicationProcessOrganization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        // this.network = network;

        populateTable();
        
        view();
        
        
    }

    

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestTable.getModel();

        model.setRowCount(0);
       
        
        for(Network network : business.getNetworkList())
        {
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
              if (enterprise instanceof JobProviderEnterprise)
              {
                  for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList())
                  {
                      if(organization instanceof ApplicationProcessOrganization)
                      {
                          for(WorkRequest work: organization.getWorkQueue().getWorkRequestList())
                          {
                              if (work instanceof ApplicationProcessWorkRequest) {
                                    ApplicationProcessWorkRequest applicationProcessWorkRequest = (ApplicationProcessWorkRequest) work;
                                   System.out.println(applicationProcessWorkRequest.getStatus() + " " + applicationProcessWorkRequest.getCandidateprofile().getFirstName());

                                    if (applicationProcessWorkRequest.getStatus().equals("Applied"))
                                    {
                                        System.out.println("hi");
                                    }
                                    else{
                                        
                                Object[] row = new Object[6];
                                
                row[0] = applicationProcessWorkRequest;
        
                if (applicationProcessWorkRequest.getCandidateprofile() != null) {
                                               
                    CandidateProfile cp = applicationProcessWorkRequest.getCandidateprofile();
                    
                    row[1] = cp.getFirstName();
                    row[2] = cp.getLastName();
//                    row[3] = applicationProcessWorkRequest.getRequestDate();
                    row[3] = cp.getLocation();
                    row[4] = applicationProcessWorkRequest.getStatus();
                    row[5] = applicationProcessWorkRequest.getJobDetails();
                    System.out.println(applicationProcessWorkRequest.getStatus());
                    model.addRow(row);
                                        
                                }
                      }
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
        workRequestTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resultTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        commentsTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        assign = new javax.swing.JButton();
        View_candidate_Profile_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Receiver", "First Name", "Last Name", "Location", "Status", "Company Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestTable);

        processJButton.setBackground(new java.awt.Color(0, 51, 255));
        processJButton.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("WELCOME TO APPLICATION PROCESS WORKAREA");

        jLabel2.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Applicant's Review");

        jLabel3.setFont(new java.awt.Font("Superclarendon", 0, 12)); // NOI18N
        jLabel3.setText("RESULT :");

        resultTxt.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Superclarendon", 0, 12)); // NOI18N
        jLabel6.setText("OTHER COMMENTS :");

        commentsTxt.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("APPLICATION PROCESS REQUEST: ");

        assign.setBackground(new java.awt.Color(0, 51, 255));
        assign.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        assign.setForeground(new java.awt.Color(255, 255, 255));
        assign.setText("Assign to me");
        assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignActionPerformed(evt);
            }
        });

        View_candidate_Profile_btn.setBackground(new java.awt.Color(0, 51, 255));
        View_candidate_Profile_btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        View_candidate_Profile_btn.setForeground(new java.awt.Color(255, 255, 255));
        View_candidate_Profile_btn.setText("View Candidate's Profile");
        View_candidate_Profile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_candidate_Profile_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(View_candidate_Profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(assign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(commentsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(processJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(View_candidate_Profile_btn)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commentsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(149, 149, 149))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void workRequestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestTableMouseClicked
        // TODO add your handling code here:
       int selectedrow = workRequestTable.getSelectedRow();

        if (selectedrow >= 0) {
        ApplicationProcessWorkRequest workRequest = (ApplicationProcessWorkRequest)workRequestTable.getValueAt(selectedrow, 0);
       

        resultTxt.setText(workRequest.getResults());
            
        commentsTxt.setText(workRequest.getComments());
            
        }
        
    }//GEN-LAST:event_workRequestTableMouseClicked

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestTable.getSelectedRow();

        if (selectedRow >= 0) {

            if (selectedRow < 0) {
                return;
            }

            ApplicationProcessWorkRequest applicationrequest = (ApplicationProcessWorkRequest) workRequestTable.getValueAt(selectedRow, 0);

            applicationrequest.setStatus("Processing");

            ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, userAccount, applicationrequest, enterprise, business);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select any row");
        }
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest apprequest = (WorkRequest) workRequestTable.getValueAt(selectedRow, 0);

        apprequest.setReceiver(userAccount);
        apprequest.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignActionPerformed

    private void View_candidate_Profile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_candidate_Profile_btnActionPerformed
        // TODO add your handling code here:
        int row = workRequestTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       ApplicationProcessWorkRequest applicationrequest = (ApplicationProcessWorkRequest) workRequestTable.getValueAt(row, 0);
        ViewVeteranInfoJPanel viewJPanel = new ViewVeteranInfoJPanel(userProcessContainer, userAccount, applicationrequest, enterprise, business);
            userProcessContainer.add("processWorkRequestJPanel", viewJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_View_candidate_Profile_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton View_candidate_Profile_btn;
    private javax.swing.JButton assign;
    private javax.swing.JTextField commentsTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables

    private void view() {
        ApplicationProcessWorkRequest applicationProcessWorkRequest = new ApplicationProcessWorkRequest();
        
        //interviewDateText.setText(applicationProcessWorkRequest.getInterviewDate());
        resultTxt.setText(applicationProcessWorkRequest.getResults());
        commentsTxt.setText(applicationProcessWorkRequest.getComments());
                
    }
}
