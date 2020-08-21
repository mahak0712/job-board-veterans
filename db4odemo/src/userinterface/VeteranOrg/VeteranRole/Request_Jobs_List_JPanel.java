/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.JobProviderEnterprise;
import Business.JobDetails.JobDetails;
import Business.Network.Network;
import Business.Organization.JobProviderOrganization.JobPostingOrganization;
import Business.Organization.Organization;
import Business.Organization.VeteranOrganization.VeteranOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JobPostingWorkRequest;
//import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhargavisabbisetty
 */
public class Request_Jobs_List_JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private VeteranOrganization organization;

    /**
     * Creates new form JobsJPanel
     */
    public Request_Jobs_List_JPanel(JPanel userProcessContainer, UserAccount account,VeteranOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.organization=organization;
        populateJobWorkQueueTable("All");
    }

    /**
     * Creates new form EventsJPanel
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Job_List_JTable = new javax.swing.JTable();
        filter_CB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        search_keyword_TB = new javax.swing.JTextField();
        Back_btn = new javax.swing.JButton();
        View_Btn = new javax.swing.JButton();
        Search_Btn = new javax.swing.JButton();
        analysisReportBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        Job_List_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company Name", "Job Title", "Job Type", "Salary", "Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Job_List_JTable);

        filter_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Job Title", "Location", "Salary(High - Low)", "Salary(Low - High)" }));
        filter_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_CBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel1.setText("Search by:");

        Back_btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Back_btn.setForeground(new java.awt.Color(0, 51, 255));
        Back_btn.setText("Back");
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        View_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        View_Btn.setForeground(new java.awt.Color(0, 51, 255));
        View_Btn.setText("View");
        View_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_BtnActionPerformed(evt);
            }
        });

        Search_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Search_Btn.setForeground(new java.awt.Color(0, 51, 255));
        Search_Btn.setText("Search");
        Search_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BtnActionPerformed(evt);
            }
        });

        analysisReportBtn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        analysisReportBtn.setForeground(new java.awt.Color(0, 51, 255));
        analysisReportBtn.setText("Analysis Report");
        analysisReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(search_keyword_TB, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filter_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(View_Btn))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Search_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(analysisReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(filter_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(search_keyword_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View_Btn)
                    .addComponent(Search_Btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(analysisReportBtn)
                    .addComponent(Back_btn))
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
//        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_Back_btnActionPerformed

    private void View_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_BtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = Job_List_JTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select atleast one row","Caution",JOptionPane.ERROR_MESSAGE);
            return;
        }

        JobPostingWorkRequest request = (JobPostingWorkRequest) Job_List_JTable.getValueAt(selectedRow, 0);

//        request.setStatus("Processing");
        View_Job_JPanel processWorkRequestJPanel = new View_Job_JPanel(userProcessContainer, request , enterprise, userAccount,business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_View_BtnActionPerformed

    private void filter_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_CBActionPerformed
        // TODO add your handling code here:
//        String selectedcategory=(String)filter_CB.getSelectedItem();
//        populateJobWorkQueueTable(selectedcategory);
    }//GEN-LAST:event_filter_CBActionPerformed

    private void Search_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BtnActionPerformed
        // TODO add your handling code here:
        String selectedcategory = (String) filter_CB.getSelectedItem();

        populateJobWorkQueueTable(selectedcategory);
    }//GEN-LAST:event_Search_BtnActionPerformed

    private void analysisReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisReportBtnActionPerformed
        // TODO add your handling code here:
        VeteranAnalysisJPanel veteranAnalysisJPanel = new VeteranAnalysisJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("processWorkRequestJPanel", veteranAnalysisJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_analysisReportBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JTable Job_List_JTable;
    private javax.swing.JButton Search_Btn;
    private javax.swing.JButton View_Btn;
    private javax.swing.JButton analysisReportBtn;
    private javax.swing.JComboBox filter_CB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_keyword_TB;
    // End of variables declaration//GEN-END:variables

    void populateJobWorkQueueTable(String selectedcategory) {
        DefaultTableModel model = (DefaultTableModel) Job_List_JTable.getModel();
        model.setRowCount(0);
        int flag = 0;
        ArrayList<JobPostingWorkRequest> job_req_array = new ArrayList<JobPostingWorkRequest>();

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof JobProviderEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof JobPostingOrganization) {
                            for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                                if (work instanceof JobPostingWorkRequest) {
                                    JobPostingWorkRequest jobPostingWorkRequest = (JobPostingWorkRequest) work;
                                    System.out.println(jobPostingWorkRequest.getStatus() + " " + jobPostingWorkRequest.getJobdetails().getCompanyName());

                                    if (jobPostingWorkRequest.getStatus().equals("Applied")) {
                                        System.out.println("hi");
                                    } else {
                                        if (selectedcategory.equals("All")) {
                                            search_keyword_TB.setText("");
                                            Object[] row = new Object[8];
                                            row[0] = jobPostingWorkRequest;
                                            if (jobPostingWorkRequest.getJobdetails() != null) {
                                                JobDetails jd = jobPostingWorkRequest.getJobdetails();
                                                row[1] = jd.getJobTitle();
                                                row[2] = jd.getJobType();
                                                row[3] = jd.getMaxSalary();
                                                row[4] = jd.getLocation();
                                                row[5] = jobPostingWorkRequest.getStatus();
                                                System.out.println(jobPostingWorkRequest.getStatus());
                                                model.addRow(row);
                                            }
                                        } else if (selectedcategory.equals("Job Title")) {
                                            String search = search_keyword_TB.getText();
                                            if (search.equals("")) {
                                                JOptionPane.showMessageDialog(userProcessContainer, "Keyword box should not be empty", "Warning", JOptionPane.WARNING_MESSAGE);
                                                flag = 1;
                                                break;
                                            } else {
                                                Object[] row = new Object[8];
                                                row[0] = jobPostingWorkRequest;
                                                if (jobPostingWorkRequest.getJobdetails() != null) {
                                                    JobDetails jd = jobPostingWorkRequest.getJobdetails();
                                                    if (jd.getJobTitle().equals(search)) {
                                                        row[1] = jd.getJobTitle();
                                                        row[2] = jd.getJobType();
                                                        row[3] = jd.getMaxSalary();
                                                        row[4] = jd.getLocation();
                                                        row[5] = jobPostingWorkRequest.getStatus();
                                                        System.out.println(jobPostingWorkRequest.getStatus());
                                                        model.addRow(row);
                                                    }
                                                }
                                            }
                                        } else if (selectedcategory.equals("Location")) {
                                            String search = search_keyword_TB.getText();
                                            if (search.equals("")) {
                                                JOptionPane.showMessageDialog(userProcessContainer, "Keyword box should not be empty", "Warning", JOptionPane.WARNING_MESSAGE);
                                                flag = 1;
                                                break;
                                            } else {

                                                Object[] row = new Object[8];
                                                row[0] = jobPostingWorkRequest;
                                                if (jobPostingWorkRequest.getJobdetails() != null) {
                                                    JobDetails jd = jobPostingWorkRequest.getJobdetails();
                                                    if (jd.getLocation().equals(search)) {
                                                        row[1] = jd.getJobTitle();
                                                        row[2] = jd.getJobType();
                                                        row[3] = jd.getMaxSalary();
                                                        row[4] = jd.getLocation();
                                                        row[5] = jobPostingWorkRequest.getStatus();
                                                        System.out.println(jobPostingWorkRequest.getStatus());

                                                        model.addRow(row);
                                                    }
                                                }
                                            }
                                        } else if (selectedcategory.equals("Salary(High - Low)") || selectedcategory.equals("Salary(Low - High)")) {
                                            job_req_array.add(jobPostingWorkRequest);
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (selectedcategory.equals("Salary(High - Low)") || selectedcategory.equals("Salary(Low - High)")) {
            pop(job_req_array, model, selectedcategory);
        }
        if (model.getRowCount() == 0 && flag == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "No matching result found", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }

    void pop(ArrayList job_req_array, DefaultTableModel model, String selectedcategory) {
        System.out.println(job_req_array);
        Collections.sort(job_req_array, new JobPostingWorkRequest());
        System.out.println(job_req_array);
        if (selectedcategory.equals("Salary(High - Low)")) {
            for (int i = 0; i < job_req_array.size(); i++) {
                Object[] row = new Object[8];
                row[0] = job_req_array.get(i);
                JobPostingWorkRequest jobPostingWorkRequest = (JobPostingWorkRequest) job_req_array.get(i);
                if (jobPostingWorkRequest.getJobdetails() != null) {
                    JobDetails jd = jobPostingWorkRequest.getJobdetails();
                    row[1] = jd.getJobTitle();
                    row[2] = jd.getJobType();
                    row[3] = jd.getMaxSalary();
                    row[4] = jd.getLocation();
                    row[5] = jobPostingWorkRequest.getStatus();
                    System.out.println(jobPostingWorkRequest.getStatus());
                    model.addRow(row);
                }
            }
        } else {
            for (int i = job_req_array.size() - 1; i >= 0; i--) {
                Object[] row = new Object[8];
                row[0] = job_req_array.get(i);
                JobPostingWorkRequest jobPostingWorkRequest = (JobPostingWorkRequest) job_req_array.get(i);
                if (jobPostingWorkRequest.getJobdetails() != null) {
                    JobDetails jd = jobPostingWorkRequest.getJobdetails();
                    row[1] = jd.getJobTitle();
                    row[2] = jd.getJobType();
                    row[3] = jd.getMaxSalary();
                    row[4] = jd.getLocation();
                    row[5] = jobPostingWorkRequest.getStatus();
                    System.out.println(jobPostingWorkRequest.getStatus());
                    model.addRow(row);
                }
            }
        }
    }

}
