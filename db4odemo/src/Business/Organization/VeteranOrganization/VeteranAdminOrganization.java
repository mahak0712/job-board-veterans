/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VeteranOrganization;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.VeteranOrg.VeteranAdminRole;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class VeteranAdminOrganization extends Organization{
    public VeteranAdminOrganization (){
        super(Organization.Type.VeteranAdmin.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VeteranAdminRole());
        return roles;
    }   
    
}
