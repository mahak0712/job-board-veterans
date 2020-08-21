/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.JobProviderOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JobProviderOrganization.JobPostingOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.JobProviderOrg.JobPostingRole.JobPostingWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class JobPostingRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new JobPostingWorkAreaJPanel(userProcessContainer, account, (JobPostingOrganization)organization, enterprise, business);
    }
    public String toString(){
        return Role.RoleType.JobPosting.getValue();
    }
    
}
