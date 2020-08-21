/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.JobProviderOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JobProviderOrganization.ApplicationProcessOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.JobProviderOrg.ApplicationProcessRole.ApplicationProcessWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class ApplicationProcessRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ApplicationProcessWorkAreaJPanel(userProcessContainer, account, (ApplicationProcessOrganization)organization, enterprise, business);
    }
    public String toString(){
        return Role.RoleType.ApplicationProcesser.getValue();
    }
    
}
