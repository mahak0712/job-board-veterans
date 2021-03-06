/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ConsultancyOrg.ConsultantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.JobProviderEnterprise;
import Business.JobDetails.JobDetails;
import Business.Network.Network;
import Business.Organization.JobProviderOrganization.JobPostingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ConsultancyServiceWorkRequest;
import Business.WorkQueue.JobPostingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guruisi
 */
public class ConsultantSearchJobWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private ConsultancyServiceWorkRequest request;
    DefaultTableModel model;
    private UserAccount account;
    private UserAccount sender;

    /**
     * Creates new form ConsultantSearchJobWorkAreaJPanel
     */
    public ConsultantSearchJobWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business, ConsultancyServiceWorkRequest request,UserAccount sender,UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.request = request;
        this.account = account;
        this.sender = sender;
        
        
        nameTXT.setText(request.getJobName());
        locationTXT1.setText(request.getLocation());
        typeTXT.setText(request.getJobType());
//        minTXT.setText(request.getMin_Salary().toString());
//        maxTXT.setText(request.getMax_Salary().toString());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        typeCB = new javax.swing.JCheckBox();
        locationCB = new javax.swing.JCheckBox();
        locationTXT1 = new javax.swing.JLabel();
        typeTXT = new javax.swing.JLabel();
        sendJob = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewJobJTable = new javax.swing.JTable();
        nameCB = new javax.swing.JCheckBox();
        nameTXT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        searchBTN.setBackground(new java.awt.Color(0, 51, 255));
        searchBTN.setForeground(new java.awt.Color(255, 255, 255));
        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        backBTN.setBackground(new java.awt.Color(0, 51, 255));
        backBTN.setForeground(new java.awt.Color(255, 255, 255));
        backBTN.setText("<< Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        typeCB.setText("Job Type:");

        locationCB.setText("Job Location:");

        sendJob.setBackground(new java.awt.Color(0, 51, 255));
        sendJob.setForeground(new java.awt.Color(255, 255, 255));
        sendJob.setText("Send Jobs");
        sendJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJobActionPerformed(evt);
            }
        });

        viewJobJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(viewJobJTable);

        nameCB.setText("Job Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendJob))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchBTN)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(typeCB)
                                            .addGap(30, 30, 30)
                                            .addComponent(typeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(locationCB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(locationTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 403, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBTN)
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendJob)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(locationCB)
                            .addComponent(locationTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(searchBTN)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void populate(){
        model = (DefaultTableModel) viewJobJTable.getModel();
        model.setRowCount(0);
        int flag = 0;


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
//                                        Object[] row = new Object[8];
//                                                row[0] = jobPostingWorkRequest;
                                                if (jobPostingWorkRequest.getJobdetails() != null) {
                                                    JobDetails jd = jobPostingWorkRequest.getJobdetails();
                                        if((nameCB.isSelected())&&(jd.getJobTitle().equals(nameTXT.getText())==false)) continue;
                                        if((typeCB.isSelected())&&(jd.getJobType().toString().equals(typeTXT.getText())==false)) continue;
                                        if((locationCB.isSelected())&&(jd.getLocation().equals(locationTXT1.getText())==false)) continue;
                                        //if((salaryCB.isSelected())&&jd.getMaxSalary()<min && jd.getMaxSalary()>max ) continue;
                                        System.out.println("2");
                                        Object[] row = new Object[6];
                                        System.out.println("1"+row[1]);
                                        row[0] = jobPostingWorkRequest;
                                        row[1] = jd.getJobTitle();
                                        row[2] = jd.getJobType();
                                        row[3] = jd.getMaxSalary();
                                        row[4] = jd.getLocation();
                                        row[5] = jobPostingWorkRequest.getStatus();
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
    
        
        if (model.getRowCount() == 0 && flag == 0) {
            JOptionPane.showMessageDialog(userProcessContainer, "No matching result found", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }
//    
    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        populate();
                                    
//        String fromDes = fromDesTXT.getText();
//        String toDes = toDesTXT.getText();
//        String flightNum = flightNumTXT.getText();
//        
//        DefaultTableModel dtm = (DefaultTableModel) tblViewAllFlights.getModel();
//        dtm.setRowCount(0);
//        for(Airliner airliner: airDir.getAirlinerDirectory()){
//        for(Flights flight: airliner.getFlightsDirectory()){
//            if((!fromDes.equals(""))&&(flight.getFlightFromDestination().equals(fromDes)==false)) continue;
//            if((!toDes.equals(""))&&(flight.getFlightToDestination().equals(toDes)==false)) continue;
//            if((!flightNum.equals(""))&&(flight.getFlightNum().equals(flightNum)==false)) continue;
//            //searchFlights.addFlights();
//            Object[] row = new Object[dtm.getColumnCount()];
//                row[0]=flight;
//                row[1]=flight.getFlightDepartureTime();
//                row[2]=flight.getFlightFromDestination();
//                row[3]=flight.getFlightToDestination();
//                row[4]=flight.getFlightPrice();
//                dtm.addRow(row);
//            }
//        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void sendJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJobActionPerformed
        // TODO add your handling code here:
        Vector data = model.getDataVector();
        System.out.println(data);
        Vector row = (Vector) data.elementAt(0);
        System.out.println(row);
        System.out.println( row.toArray());
        row.elementAt(1);
        System.out.println(row.elementAt(1));
        int mColIndex = 0;
        List colData = new ArrayList(viewJobJTable.getRowCount());

        for (int i = 0; i < viewJobJTable.getRowCount(); i++) {
            row = (Vector) data.elementAt(i);
      
            colData.add(row.get(mColIndex));
        }
        System.out.println(colData);
        int size_temp = colData.size();
        System.out.println("HI             "+this.sender.toString());
      for(WorkRequest work:this.sender.getWorkQueue().getWorkRequestList()){
          if(work instanceof ConsultancyServiceWorkRequest){
             ConsultancyServiceWorkRequest temp = (ConsultancyServiceWorkRequest) work;
              
              for(int j=0;j<size_temp;j++)
        {
            System.out.println(request);
//            String temp1=request.getSender().toString();
           temp.getJob_posting_work_req().add((JobPostingWorkRequest)colData.get(j));
          
           System.out.println(request);

        }
          }
      }
      for(int j=0;j<size_temp;j++)
        {
            System.out.println(request);
//            String temp1=request.getSender().toString();
           request.getJob_posting_work_req().add((JobPostingWorkRequest)colData.get(j));
          
           System.out.println(request);

        }
//      JOptionPane.showMessageDialog(null,request.getJob_posting_work_req().size());
        JOptionPane.showMessageDialog(null, "Successfully sent the jobs");
        request.setSender(account);
        request.setStatus("Suggested");
    }//GEN-LAST:event_sendJobActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox locationCB;
    private javax.swing.JLabel locationTXT1;
    private javax.swing.JCheckBox nameCB;
    private javax.swing.JLabel nameTXT;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton sendJob;
    private javax.swing.JCheckBox typeCB;
    private javax.swing.JLabel typeTXT;
    private javax.swing.JTable viewJobJTable;
    // End of variables declaration//GEN-END:variables
}
