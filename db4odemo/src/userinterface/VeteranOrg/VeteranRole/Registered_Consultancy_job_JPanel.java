/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VeteranOrg.VeteranRole;

import Business.EcoSystem;
import Business.Enterprise.ConsultancyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ConsultancyOrganization.ConsultantOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhargavisabbisetty
 */
public class Registered_Consultancy_job_JPanel extends javax.swing.JPanel {
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem business;
    private UserAccount userAccount;
    /**
     * Creates new form Registered_Consultancy_job_JPanel
     */
    public Registered_Consultancy_job_JPanel(JPanel userProcessContainer,UserAccount useraccount,Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise=enterprise;
        this.business = business;
        this.userAccount = useraccount;
        populateNetwork();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sugg_cons_btn = new javax.swing.JButton();
        View_form = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Consultancy_List_JTable = new javax.swing.JTable();
        Back_btn = new javax.swing.JButton();
        Network_CB = new javax.swing.JComboBox();

        sugg_cons_btn.setText("Suggested Jobs");
        sugg_cons_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugg_cons_btnActionPerformed(evt);
            }
        });

        View_form.setText("View Form");
        View_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_formActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("List Of Consultancies");

        Consultancy_List_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Consultancy Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Consultancy_List_JTable);

        Back_btn.setText("Back");
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        Network_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Network_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Network_CBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(View_form)
                        .addGap(52, 52, 52)
                        .addComponent(sugg_cons_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Back_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Network_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(Network_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View_form)
                    .addComponent(sugg_cons_btn)
                    .addComponent(Back_btn))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     public void populateNetwork() {
        Network_CB.removeAllItems();
        System.out.println(business);
        for (Network network : business.getNetworkList()) {
            System.out.println(network);
            Network_CB.addItem(network);
        }
     }
    private void View_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_formActionPerformed
        // TODO add your handling code here:
        int selectedRow = Consultancy_List_JTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select atleast one row","Caution",JOptionPane.ERROR_MESSAGE);
            return;
        }
        ConsultancyEnterprise temp = (ConsultancyEnterprise)Consultancy_List_JTable.getValueAt(selectedRow, 0);
        System.out.println(temp);
        //        request.setStatus("Processing");
        View_Consultancy_Reg_Form view_Consultancy_Reg_Form = new View_Consultancy_Reg_Form(userProcessContainer, temp, userAccount,business);
        userProcessContainer.add("view consultancy registration form", view_Consultancy_Reg_Form );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_View_formActionPerformed

    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_btnActionPerformed

    private void Network_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Network_CBActionPerformed
        // TODO add your handling code here:
        Network network = (Network) Network_CB.getSelectedItem();

        display(network);
    }//GEN-LAST:event_Network_CBActionPerformed

    private void sugg_cons_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugg_cons_btnActionPerformed
        // TODO add your handling code here:
        int selectedRow = Consultancy_List_JTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select atleast one row","Caution",JOptionPane.ERROR_MESSAGE);
            return;
        }
        ConsultancyEnterprise temp = (ConsultancyEnterprise)Consultancy_List_JTable.getValueAt(selectedRow, 0);
        System.out.println(temp);
        //        request.setStatus("Processing");
        Consultancy_Suggested_Jobs consultancy_Suggested_Jobs = new Consultancy_Suggested_Jobs(userProcessContainer, temp, userAccount,business);
        userProcessContainer.add("Consultancy suggested jobs", consultancy_Suggested_Jobs );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
    }//GEN-LAST:event_sugg_cons_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JTable Consultancy_List_JTable;
    private javax.swing.JComboBox Network_CB;
    private javax.swing.JButton View_form;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sugg_cons_btn;
    // End of variables declaration//GEN-END:variables


 private void display(Network network) {
        if(network == null)
        {
            return;
        }
        DefaultTableModel model = (DefaultTableModel) Consultancy_List_JTable.getModel();
        model.setRowCount(0);
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof ConsultancyEnterprise){
                for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof ConsultantOrganization){
                        int size_temp = org.getWorkQueue().getWorkRequestList().size();
                        if(size_temp!=0)
                        {
                                 Object[] row = new Object[1];
                                 row[0] = enterprise;
                                 model.addRow(row);
                        }
//                        
//                        for(WorkRequest work:org.getWorkQueue().getWorkRequestList()){
//                            System.out.println(work);
//                         if(work instanceof ConsultancyServiceWorkRequest){
//                             ConsultancyServiceWorkRequest workreq = (ConsultancyServiceWorkRequest) work;
//                             System.out.println(workreq);
//                             if(enterprise.equals(workreq.getEnterprise())){
//                                 System.out.println("4"+enterprise);
//                             }
//                         }
//                         else{
//                                 System.out.println("5"+enterprise);
//                                 Object[] row = new Object[1];
//                                 row[0] = enterprise;
//                                 model.addRow(row);
//                             }
//                         
//                    }
                   
                    }
                
                }
                
            }
        }
    }
}
