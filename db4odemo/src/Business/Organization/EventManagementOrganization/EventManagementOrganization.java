/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.EventManagementOrganization;

import Business.Organization.Organization;
import Business.Role.EventManagementOrg.EventManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class EventManagementOrganization extends Organization{
    public EventManagementOrganization (){
        super(Organization.Type.EventManagement.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManagerRole());
        return roles;
    }    
    
}
