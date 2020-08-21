/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
//        Doctor("Doctor"),
//        LabAssistant("Lab Assistant"),
        
        EventManager("Event Manager Role"),
        EventManagementAdmin("Event Management Admin Role"),
        
        ApplicationProcesser("Application Process Role"),
        InterviewScheduler("Interview Scheduler Role"),
        JobPosting("Job Posting Role"),
        JobProviderAdmin("Job Provider Admin Role"),
        
//        ValidatorAdmin("Validator Admin Role"),
//        Validator("Validator Role"),
        
        VeteranAdmin("Veteran Admin Role"),
        Veteran("Veteran Role"),
        
        ConsultancyAdmin("Consultancy Role"),
        Consultant("Consultant Role");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

//    @Override
//    public String toString() {
//        return this.getClass().getName();
//    }
//     @Override
//        public String toString() {
//            return value;
//       }
    
    
}