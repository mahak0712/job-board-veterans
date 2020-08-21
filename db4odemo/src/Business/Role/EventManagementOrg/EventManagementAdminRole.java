/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.EventManagementOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagementOrganization.EMAdminOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EventManagementOrg.EventManagementAdminRole.EventManagementAdminWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class EventManagementAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EventManagementAdminWorkAreaJPanel(userProcessContainer, account, (EMAdminOrganization) organization, enterprise);
    }
}
