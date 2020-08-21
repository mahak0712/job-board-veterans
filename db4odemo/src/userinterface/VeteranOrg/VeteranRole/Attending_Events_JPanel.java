/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EventManagementEnterprise;
import Business.Network.Network;
import Business.Organization.EventManagementOrganization.EventManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhargavisabbisetty
 */
public class Attending_Events_JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    /**
     * Creates new form EventsAttendingJPanel
     */
    public Attending_Events_JPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
           populateNetwork();
    }

    private void populateNetwork() {
        networkCB.removeAllItems();
        System.out.println(business);
        for (Network network : business.getNetworkList()) {
            System.out.println(network);
            networkCB.addItem(network);
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

        jLabel1 = new javax.swing.JLabel();
        Back_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Event_Work_Request_JTable = new javax.swing.JTable();
        networkCB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Superclarendon", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Events Attending");

        Back_Btn.setBackground(new java.awt.Color(0, 51, 255));
        Back_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Back_Btn.setText("Back");
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });

        Event_Work_Request_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sno", "Name", "Theme", "Date", "Time", "Location", "Description", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Event_Work_Request_JTable);

        networkCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkCBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Network:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(networkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1))
                    .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Back_Btn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkCBActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkCB.getSelectedItem();

        populateAttendingEventWorkQueueTable(network);
    }//GEN-LAST:event_networkCBActionPerformed

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_Back_BtnActionPerformed

    
    public void populateAttendingEventWorkQueueTable(Network network) {

        if (network == null) {
            return;
        }
        DefaultTableModel model = (DefaultTableModel) Event_Work_Request_JTable.getModel();
        model.setRowCount(0);
        System.out.println("hi");
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof EventManagementEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof EventManagementOrganization) {
                        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                            if (work instanceof EventWorkRequest) {
                                EventWorkRequest EventWorkRequest = (EventWorkRequest) work;
                                if (EventWorkRequest.getStatus().equals("Completed")){
                                Object[] row = new Object[8];
                                row[0] = EventWorkRequest;
                                if (EventWorkRequest.getEvent() != null) {
                                    row[1] = EventWorkRequest.getEvent().getEventName();
                                    row[2] = EventWorkRequest.getEvent().getEventTheme();
                                    row[3] = EventWorkRequest.getEvent().getEventDate();
                                    row[4] = EventWorkRequest.getEvent().getEventTime();
                                    row[5] = EventWorkRequest.getEvent().getLocation();
                                    row[6] = EventWorkRequest.getEvent().getDescription();
//                                    if (jCheckBox1.isSelected()) {
//                                        educationEventsWorkRequest.setClaimedMoney(educationEventsWorkRequest.getEvent().getConveyanceAllowance());
//                                    }
                                }
                                row[7] = EventWorkRequest.getStatus();

                                model.addRow(row);
                                }
                            }
                        }
                    }

                }
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Btn;
    private javax.swing.JTable Event_Work_Request_JTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkCB;
    // End of variables declaration//GEN-END:variables
}
