/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.CandidateProfile.CandidateProfile;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.JobDetails.JobDetails;
import Business.JobDetails.JobDetails.JobType;
import Business.Organization.JobProviderOrganization.JobPostingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ApplicationProcessWorkRequest;
import Business.WorkQueue.JobPostingWorkRequest;
//import Business.WorkQueue.JobWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class View_Applied_Job_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form View_Job_JPanel
     */
    private JPanel userProcessContainer;
    private JobDetails jd;
    private EcoSystem business;
    UserAccount account;
    JobPostingOrganization jpo;
    Enterprise enterprise;
    public View_Applied_Job_JPanel(JPanel userProcessContainer, JobDetails jd, Enterprise enterprise , UserAccount account, EcoSystem business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.jd = jd;
        this.account = account;
        this.enterprise = enterprise;
        display();
        
    }

    private void display() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        JobDetails jd = request.getJobdetails();
        Cmp_Name_label.setText(jd.getCompanyName());
        Job_Title_Label.setText(jd.getJobTitle());
        Job_Type_Label.setText(jd.getJobType().toString());
        Job_Description_Label.setText(jd.getJobDescription());
        Location_label.setText(jd.getLocation());
        Max_sal_Label.setText(jd.getMaxSalary().toString());
//        Min_sal_Label.setText(jd.getMinSalary().toString());

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cmp_Name_label = new javax.swing.JLabel();
        Job_Type_Label = new javax.swing.JLabel();
        Location_label = new javax.swing.JLabel();
        Job_Title_Label = new javax.swing.JLabel();
        Job_Description_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Max_sal_Label = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel8.setText("Job Description");

        jLabel9.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel9.setText("Optional Details");

        backButton.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel7.setText("Job Title");

        jLabel5.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel5.setText("Job - Type");

        jLabel6.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel6.setText("Location of Job (City, State)");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Job Details");

        jLabel4.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel4.setText("Company Name");

        Cmp_Name_label.setText("jLabel1");

        Job_Type_Label.setText("jLabel1");

        Location_label.setText("jLabel1");

        Job_Title_Label.setText("jLabel1");

        Job_Description_Label.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel1.setText("Salaray");

        Max_sal_Label.setText("Maximum Salary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(170, 170, 170)
                        .addComponent(Max_sal_Label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Job_Type_Label)
                                    .addComponent(Cmp_Name_label)
                                    .addComponent(Location_label)
                                    .addComponent(Job_Title_Label))
                                .addContainerGap(205, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Job_Description_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addComponent(Cmp_Name_label)
                        .addGap(28, 28, 28)
                        .addComponent(Job_Type_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Location_label)
                        .addGap(30, 30, 30)
                        .addComponent(Job_Title_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Job_Description_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Max_sal_Label))
                .addGap(103, 103, 103)
                .addComponent(backButton)
                .addGap(142, 142, 142))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
       Applied_Jobs_JPanel searchresult = (Applied_Jobs_JPanel) component;
        searchresult.populate();
//        System.out.println(request.getStatus());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cmp_Name_label;
    private javax.swing.JLabel Job_Description_Label;
    private javax.swing.JLabel Job_Title_Label;
    private javax.swing.JLabel Job_Type_Label;
    private javax.swing.JLabel Location_label;
    private javax.swing.JLabel Max_sal_Label;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}