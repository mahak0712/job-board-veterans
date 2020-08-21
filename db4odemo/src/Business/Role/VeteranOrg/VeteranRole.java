/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.VeteranOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VeteranOrganization.VeteranOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VeteranOrg.VeteranRole.VeteranWorkAreaJPanel;

/**
 *
 * @author bhargavisabbisetty
 */
public class VeteranRole extends Role {
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VeteranWorkAreaJPanel(userProcessContainer, account, (VeteranOrganization)organization, enterprise, business);
    }
     public String toString(){
        return Role.RoleType.Veteran.getValue();
    }
    
}
