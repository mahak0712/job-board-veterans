/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.ConsultancyOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ConsultancyOrganization.ConsultantOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ConsultancyOrg.ConsultantRole.ConsultantWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class ConsultantRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ConsultantWorkAreaJPanel(userProcessContainer, account, (ConsultantOrganization)organization, enterprise,business);
    }
    public String toString(){
        return Role.RoleType.Consultant.getValue();
    }
}
