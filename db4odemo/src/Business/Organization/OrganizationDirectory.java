/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Organization.ConsultancyOrganization.ConsultantOrganization;
import Business.Organization.EventManagementOrganization.EventManagementOrganization;
import Business.Organization.JobProviderOrganization.ApplicationProcessOrganization;
import Business.Organization.JobProviderOrganization.InterviewSchedulerOrganization;
import Business.Organization.JobProviderOrganization.JobPostingOrganization;
import Business.Organization.Organization.Type;
import Business.Organization.VeteranOrganization.VeteranAdminOrganization;
import Business.Organization.VeteranOrganization.VeteranOrganization;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
//        if (type.getValue().equals(Type.Doctor.getValue())){
//            organization = new DoctorOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Lab.getValue())){
//            organization = new LabOrganization();
//            organizationList.add(organization);
//        }
//        else 
        if (type.getValue().equals(Type.JobPosting.getValue())){
            organization = new JobPostingOrganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.JobProviderAdmin.getValue())){
//            organization = new JobProviderAdminOrganization();
//            organizationList.add(organization);
//        }
        else if (type.getValue().equals(Type.ApplicationProcess.getValue())){
            organization = new ApplicationProcessOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.InterviewScheduler.getValue())){
            organization = new InterviewSchedulerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.EventManagement.getValue())){
            organization = new EventManagementOrganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.EventAttendeeManager.getValue())){
//            organization = new EventAttendeeManagerOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.EventManagementAdmin.getValue())){
//            organization = new EMAdminOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Validator.getValue())){
//            organization = new ValidatorOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.ValidatorAdmin.getValue())){
//            organization = new ValidatorAdminOrganization();
//            organizationList.add(organization);
//        }
         else if (type.getValue().equals(Type.Veteran.getValue())){
            organization = new VeteranOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.VeteranAdmin.getValue())){
            organization = new VeteranAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Consultancy.getValue())){
            organization = new ConsultantOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}