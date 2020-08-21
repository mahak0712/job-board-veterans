/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.EventManagementOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagementOrganization.EventManagementOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EventManagementOrg.EventManagerRole.EventManagerWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class EventManagerRole extends Role {
    @Override
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EventManagerWorkAreaJPanel(userProcessContainer, account, (EventManagementOrganization)organization, enterprise,business);
    }
    public String toString(){
        return Role.RoleType.EventManager.getValue();
    }
}
