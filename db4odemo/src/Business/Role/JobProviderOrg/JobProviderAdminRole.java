/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.JobProviderOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JobProviderOrganization.JobProviderAdminOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.JobProviderOrg.JobProviderAdminRole.JobProviderAdminWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class JobProviderAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new JobProviderAdminWorkAreaJPanel(userProcessContainer, account, (JobProviderAdminOrganization)organization, enterprise);
    }
    
}
