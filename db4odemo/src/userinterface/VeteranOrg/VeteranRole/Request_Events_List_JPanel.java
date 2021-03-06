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
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhargavisabbisetty
 */
public class Request_Events_List_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Request_Events_List_JPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("[a-zA-Z0-9]([a-zA-Z0-9]*[_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]+[._]?)+([a-zA-Z0-9]*[._][a-zA-Z]+)$", Pattern.CASE_INSENSITIVE);
    

    
    public Request_Events_List_JPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateNetwork();
    }

    public void populateNetwork() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Event_Work_Request_JTable = new javax.swing.JTable();
        networkCB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Back_Btn = new javax.swing.JButton();
        View_Btn = new javax.swing.JButton();
        Book_Btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Email_TB = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

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
        if (Event_Work_Request_JTable.getColumnModel().getColumnCount() > 0) {
            Event_Work_Request_JTable.getColumnModel().getColumn(0).setResizable(false);
            Event_Work_Request_JTable.getColumnModel().getColumn(1).setResizable(false);
            Event_Work_Request_JTable.getColumnModel().getColumn(2).setResizable(false);
            Event_Work_Request_JTable.getColumnModel().getColumn(3).setResizable(false);
            Event_Work_Request_JTable.getColumnModel().getColumn(4).setResizable(false);
            Event_Work_Request_JTable.getColumnModel().getColumn(5).setResizable(false);
            Event_Work_Request_JTable.getColumnModel().getColumn(6).setResizable(false);
            Event_Work_Request_JTable.getColumnModel().getColumn(7).setResizable(false);
        }

        networkCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkCBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel1.setText("Network:");

        Back_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(0, 51, 255));
        Back_Btn.setText("Back");
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
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

        Book_Btn.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        Book_Btn.setForeground(new java.awt.Color(0, 51, 255));
        Book_Btn.setText("Book");
        Book_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_BtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel2.setText("Enter Email id:");

        Email_TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_TBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(Email_TB, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(Book_Btn)
                .addGap(414, 414, 414))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_Btn)
                        .addGap(18, 18, 18)
                        .addComponent(View_Btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(networkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_Btn)
                    .addComponent(View_Btn))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Email_TB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Book_Btn))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkCBActionPerformed
        // TODO add your handling code here:
       Network network = (Network) networkCB.getSelectedItem();

        populateEventWorkQueueTable(network);
    }//GEN-LAST:event_networkCBActionPerformed

    private void View_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_BtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = Event_Work_Request_JTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        EventWorkRequest request = (EventWorkRequest)Event_Work_Request_JTable.getValueAt(selectedRow, 0);
     
//        request.setStatus("Processing");
        
        View_Event_JPanel processWorkRequestJPanel = new View_Event_JPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_View_BtnActionPerformed

    private void Email_TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_TBActionPerformed

    private void Book_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_BtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = Event_Work_Request_JTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row ");
            return;
        } else {
            boolean isValid = true;
            EventWorkRequest request = (EventWorkRequest) Event_Work_Request_JTable.getValueAt(selectedRow, 0);
            System.out.println("line1"+request.getStatus());
            if (request.getStatus().equals("New Event")) {
                String current_date = request.getEvent().getEventDate();
                System.out.println(current_date);
                String temp_date[] = current_date.split("[-]");
                System.out.println(Arrays.toString(temp_date));
                int y = Integer.parseInt(temp_date[0]);
                int m = Integer.parseInt(temp_date[1]);
                int d = Integer.parseInt(temp_date[2]);
                System.out.println("y"+y+"m"+m+"d"+d);
                String time = request.getEvent().getEventTime();
                System.out.println(time);
                String temp_time[] = time.split("[:]");
                System.out.println(Arrays.toString(temp_time));
                int hh = Integer.parseInt(temp_time[0]);
                System.out.println(hh);

                // check if he has registered for an event at same time
                for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
                    if (workRequest instanceof EventWorkRequest) {
                        
                        EventWorkRequest work_Request = (EventWorkRequest)workRequest;
                       System.out.println(work_Request.getEvent().getEventDate());
                        if (workRequest.getStatus() != null && workRequest.getStatus().equals("Completed")) {
                            String regDate = ((EventWorkRequest) workRequest).getEvent().getEventDate();
                            String reg_date_temp[] = regDate.split("[-]");
                            int day = Integer.parseInt(reg_date_temp[2]);
                            int month = Integer.parseInt(reg_date_temp[1]);
                            int year = Integer.parseInt(reg_date_temp[0]);
                            System.out.println(regDate);
                            System.out.println(current_date);
                            System.out.println("day"+day+"month"+month+"year"+year);
                            System.out.println("d"+d+"m"+m+"y"+y);
                            if (d == day && m == month && y == year) {
                                
                                String evetime[] = ((EventWorkRequest) workRequest).getEvent().getEventTime().split("[:]");
                                System.out.println(Arrays.toString(evetime));
                                int hour = Integer.parseInt(evetime[0]);
                                System.out.println("d"+d+"m"+m+"y"+y+"hh"+hh+"hour"+hour);
                                if(hh > hour-2 && hh< hour+2) {
                                isValid = false;
                                JOptionPane.showMessageDialog(null, "You have already registered for another event at same date", "Warning", JOptionPane.WARNING_MESSAGE);
                                break;
                                }
                            }
                        }
                    }
                }
                boolean isValidEmail = validate(Email_TB.getText());
                if (!isValidEmail) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid email address", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                if (isValid && isValidEmail) {
                    request.setReceiver(userAccount);
                    request.setStatus("Completed");
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    Network network = (Network) networkCB.getSelectedItem();
                    populateEventWorkQueueTable(network);
                    JOptionPane.showMessageDialog(null, "You have successfully registered for event!!");
                    SendMail sendEmail = new SendMail();
                    sendEmail.send("thecodingwizards2018@gmail.com", "AED@2018",Email_TB.getText(), "Congratulations !!", "We are excited to see you at the Event");
                    JOptionPane.showMessageDialog(null, "Check your Mail Inbox");
                    Email_TB.setText("");
                    populateEventWorkQueueTable(network);
                }

            } else {
                JOptionPane.showMessageDialog(null, "You have already registered for this event", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }

    }                                               

    public static boolean validate(String emailStr) {
        if (emailStr == null) {
            return false;
        }
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    
        
        
    }//GEN-LAST:event_Book_BtnActionPerformed

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_BtnActionPerformed

public void populateEventWorkQueueTable(Network network) {

        if (network == null) {
            return;
        }
        DefaultTableModel model = (DefaultTableModel) Event_Work_Request_JTable.getModel();
        model.setRowCount(0);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof EventManagementEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof EventManagementOrganization) {
                        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                            if (work instanceof EventWorkRequest) {
                                EventWorkRequest EventWorkRequest = (EventWorkRequest) work;
                                    System.out.println(EventWorkRequest.getStatus()+" "+EventWorkRequest.getEvent().getEventName());
                                if (EventWorkRequest.getStatus().equals("Completed"))
                                {
                                    System.out.println("hi");
                                }
                              else{
                                    System.out.println(EventWorkRequest.getStatus()+" "+EventWorkRequest.getEvent().getEventName());
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
    private javax.swing.JButton Book_Btn;
    private javax.swing.JTextField Email_TB;
    private javax.swing.JTable Event_Work_Request_JTable;
    private javax.swing.JButton View_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkCB;
    // End of variables declaration//GEN-END:variables
}

