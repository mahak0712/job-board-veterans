/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.JobProviderOrganization;

import Business.JobDetails.JobDetails;
import Business.Organization.Organization;
import Business.Role.JobProviderOrg.JobPostingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class JobPostingOrganization extends Organization{
    public JobPostingOrganization(){
        super(Organization.Type.JobPosting.getValue());
}

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new JobPostingRole());
        return roles;
    }

    public void deleteJob(JobDetails jobDetails)
    {
       
        jobDetails.deleteJob(jobDetails);
        
    }
    
}
