/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.ConsultancyOrganization;

import Business.Organization.Organization;
import Business.Role.ConsultancyOrg.ConsultantRole;
import Business.Role.EventManagementOrg.EventManagementAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class ConsultantOrganization extends Organization{
    public ConsultantOrganization (){
        super(Organization.Type.Consultancy.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ConsultantRole());
        return roles;
    }  
    
}
