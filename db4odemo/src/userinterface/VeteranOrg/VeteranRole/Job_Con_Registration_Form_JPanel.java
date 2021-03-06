/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.CandidateProfile.CandidateProfile;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.JobProviderEnterprise;
import Business.Network.Network;
import Business.Organization.JobProviderOrganization.ApplicationProcessOrganization;
import Business.Organization.Organization;
import Business.PatternMatching;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ApplicationProcessWorkRequest;
import Business.WorkQueue.JobPostingWorkRequest;
//import Business.WorkQueue.JobWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class Job_Con_Registration_Form_JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private JobPostingWorkRequest jr;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem business;
    private String resumePath;
    private int flag = 0;

    /**
     * Creates new form Registration_Form
     */
    public Job_Con_Registration_Form_JPanel(JPanel userProcessContainer, JobPostingWorkRequest jr, UserAccount userAccount, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.jr = jr;
        this.userAccount = userAccount;
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

        Gender_BG = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Phone_TB = new javax.swing.JTextField();
        Submit_Btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Email_TB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Last_Name_TB = new javax.swing.JTextField();
        veteran_CB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        FirstName_TB = new javax.swing.JTextField();
        Disability_CB = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Back_Btn = new javax.swing.JButton();
        Male_RB = new javax.swing.JRadioButton();
        Female_RB = new javax.swing.JRadioButton();
        Location_CB = new javax.swing.JComboBox();
        Upload_Resume_Btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        SSN_TB = new javax.swing.JTextField();
        resume_path_TB = new javax.swing.JTextField();

        jLabel2.setText("First Name *");

        jLabel1.setText("Job Registration Form");

        jLabel16.setText("Veteran status *");

        jLabel15.setText("Gender");

        jLabel14.setText("What are your salary expectations? *");

        jLabel6.setText("Location (City) *");

        Phone_TB.setActionCommand("null");
        Phone_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_TBActionPerformed(evt);
            }
        });

        Submit_Btn.setText("Submit");
        Submit_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_BtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone *");

        jLabel17.setText("Disability type *");

        Email_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_TBActionPerformed(evt);
            }
        });

        jLabel4.setText("Email *");

        veteran_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "disabled veteran", "special disabled veteran", "active duty wartime or campaign badge veteran", "veteran of the Vietnam era", "armed forces service medal veteran", "recently separated veteran", "I do not wish to answer", " " }));

        jLabel3.setText("Last Name *");

        FirstName_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_TBActionPerformed(evt);
            }
        });

        Disability_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "vision Impairment", "deaf or hard of hearing", "mental health conditions", "intellectual disability", "acquired brain injury", "autism spectrum disorder", "physical disability", "I am not disabled", "I do not want to answer" }));

        jLabel7.setText("Resume *");

        Back_Btn.setText("Back");
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });

        Gender_BG.add(Male_RB);
        Male_RB.setText("Male");

        Gender_BG.add(Female_RB);
        Female_RB.setText("Female");

        Location_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atlanta", "Austin", "Boston", "Charlotte", "Chicago", "Dallas", "Denver", "Detroit", "Houston", "Los Angeles", "Memphis", "New York", "Oklahoma  City", "Portland", "Raleigh", "San Antonio", "San Francisco", "San Jose", "Seattle", "Washington, D.C." }));
        Location_CB.setActionCommand("null");

        Upload_Resume_Btn.setText("Upload Resume");
        Upload_Resume_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upload_Resume_BtnActionPerformed(evt);
            }
        });

        jLabel8.setText("SSN *");

        resume_path_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resume_path_TBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Male_RB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Female_RB)
                                    .addGap(44, 44, 44))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(veteran_CB, 0, 1, Short.MAX_VALUE)
                                        .addComponent(Disability_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(resume_path_TB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Upload_Resume_Btn))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Last_Name_TB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(FirstName_TB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(Email_TB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(SSN_TB, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Phone_TB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                        .addComponent(Location_CB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(Submit_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FirstName_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Last_Name_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Email_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SSN_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Phone_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Location_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Upload_Resume_Btn)
                            .addComponent(resume_path_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Male_RB)
                            .addComponent(Female_RB)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(veteran_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Disability_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_Btn)
                    .addComponent(Back_Btn))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Phone_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phone_TBActionPerformed

    private void Submit_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_BtnActionPerformed
        // TODO add your handling code here:
        ApplicationProcessWorkRequest request = new ApplicationProcessWorkRequest();
//        request.getCandidateprofile().setFirstName(TOOL_TIP_TEXT_KEY);
        String First_Name = FirstName_TB.getText();
        String Last_Name = Last_Name_TB.getText();
        String SSN = SSN_TB.getText();
        String Email = Email_TB.getText();
        String Phone = Phone_TB.getText();
        String Location = Location_CB.getSelectedItem().toString();
        String sal_Expectation = salaryTxt.getText();
        Male_RB.setActionCommand("Male");
        Female_RB.setActionCommand("Female");
        String gender = Gender_BG.getSelection().getActionCommand();
        String veteran_Status = veteran_CB.getSelectedItem().toString();
        String disability_Status = Disability_CB.getSelectedItem().toString();

        if (First_Name.trim().isEmpty() || Last_Name.trim().isEmpty() || Email.trim().isEmpty() || Phone.trim().isEmpty() || sal_Expectation.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all details in textboxes", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        if (gender.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select an option for gender", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            PatternMatching pattern = new PatternMatching();
            if (!pattern.getPattern().matcher(First_Name).matches() || !pattern.getPattern().matcher(Last_Name).matches()
                    || !pattern.getSSN().matcher(SSN).matches() || !pattern.getEmailID().matcher(Email).matches() || !pattern.getUSPhoneNumber().matcher(Phone).matches()) {
                JOptionPane.showMessageDialog(null, "Cannot add symbols", "Caution", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            if(flag ==0){
                JOptionPane.showMessageDialog(null, "Please upload an resume","Caution",JOptionPane.ERROR_MESSAGE);
            }
            else {
                CandidateProfile cd = new CandidateProfile();
                System.out.println(cd);
                cd.setFirstName(First_Name);
                cd.setLastName(Last_Name);
                cd.setEmail(Email);
                cd.setPhoneNo(Phone);
                cd.setDisabilityStatus(disability_Status);
                cd.setLocation(Location);
                cd.setSalaryExpectations(sal_Expectation);
                cd.setVeteranStatus(veteran_Status);
                cd.setSSN(SSN);
                cd.setResume_path(resumePath);
                request.setCandidateprofile(cd);
                request.setJobDetails(jr.getJobdetails());
                request.setSender(userAccount);
                request.setStatus("Submitted");
                jr.setStatus("Applied");

                Organization org = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof JobProviderEnterprise) {

                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof ApplicationProcessOrganization) {
                                    org = organization;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
//                    userAccount.getWorkQueue().getWorkRequestList().add(jr);
                    JOptionPane.showMessageDialog(null, "Your Application is successfully submitted");
                    System.out.println("successfully submitted");
                    Submit_Btn.setEnabled(false);
                }
            }

        }
    }//GEN-LAST:event_Submit_BtnActionPerformed

    private void Email_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_TBActionPerformed

    private void FirstName_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_TBActionPerformed

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_BtnActionPerformed

    private void Upload_Resume_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upload_Resume_BtnActionPerformed
        // TODO add your handling code here:
        JFileChooser resume = new JFileChooser();
//        picture.setFileSelectionMode(JFileChooser.FILES_ONLY);
        resume.showOpenDialog(null);
        File resume_file = resume.getSelectedFile();
//        System.out.println(pic);
        resumePath = resume_file.getAbsolutePath();
        PatternMatching pattern = new PatternMatching();
        if(!pattern.getResume().matcher(resumePath).matches()){
            JOptionPane.showMessageDialog(null, "Please upload resume in PDF", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        System.out.println(resumePath);
        resume_path_TB.setText(resumePath);
        flag = 1;
        }
    }//GEN-LAST:event_Upload_Resume_BtnActionPerformed

    private void resume_path_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resume_path_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resume_path_TBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn;
    private javax.swing.JComboBox Disability_CB;
    private javax.swing.JTextField Email_TB;
    private javax.swing.JRadioButton Female_RB;
    private javax.swing.JTextField FirstName_TB;
    private javax.swing.ButtonGroup Gender_BG;
    private javax.swing.JTextField Last_Name_TB;
    private javax.swing.JComboBox Location_CB;
    private javax.swing.JRadioButton Male_RB;
    private javax.swing.JTextField Phone_TB;
    private javax.swing.JTextField SSN_TB;
    private javax.swing.JButton Submit_Btn;
    private javax.swing.JButton Upload_Resume_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField resume_path_TB;
    private javax.swing.JTextField salaryTxt;
    private javax.swing.JComboBox veteran_CB;
    // End of variables declaration//GEN-END:variables
}
