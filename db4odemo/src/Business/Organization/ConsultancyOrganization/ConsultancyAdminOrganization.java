/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.ConsultancyOrganization;

import Business.Organization.Organization;
import Business.Role.ConsultancyOrg.ConsultancyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class ConsultancyAdminOrganization extends Organization{
    public ConsultancyAdminOrganization (){
        super(Organization.Type.ConsultancyAdmin.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ConsultancyAdminRole());
        return roles;
    }  
    
}
