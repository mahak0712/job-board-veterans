/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.JobProviderOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JobProviderOrganization.InterviewSchedulerOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.JobProviderOrg.InterviewSchedulerRole.InterviewSchedulerWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class InterviewSchedulerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InterviewSchedulerWorkAreaJPanel(userProcessContainer, account, (InterviewSchedulerOrganization)organization, enterprise);
    }
    public String toString(){
        return Role.RoleType.InterviewScheduler.getValue();
    }
}
