/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.JobProviderOrganization;

import Business.Organization.Organization;
import Business.Role.JobProviderOrg.ApplicationProcessRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class ApplicationProcessOrganization extends Organization{
    public ApplicationProcessOrganization (){
        super(Organization.Type.ApplicationProcess.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ApplicationProcessRole());
        return roles;
    }    
    
    
}
