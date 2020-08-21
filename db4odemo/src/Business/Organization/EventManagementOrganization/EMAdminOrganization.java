/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.EventManagementOrganization;

import Business.Organization.Organization;
import Business.Role.EventManagementOrg.EventManagementAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class EMAdminOrganization extends Organization{
    public EMAdminOrganization (){
        super(Organization.Type.EventManagementAdmin.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManagementAdminRole());
        return roles;
    }   
    
}
