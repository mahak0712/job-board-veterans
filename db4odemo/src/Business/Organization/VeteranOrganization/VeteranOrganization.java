/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VeteranOrganization;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.VeteranOrg.VeteranRole;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class VeteranOrganization extends Organization{
    public VeteranOrganization (){
        super(Organization.Type.Veteran.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VeteranRole());
        return roles;
    }
    
}
