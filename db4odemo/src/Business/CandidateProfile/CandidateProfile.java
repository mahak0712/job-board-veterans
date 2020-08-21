/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CandidateProfile;

/**
 *
 * @author mahaksingh
 */
public class CandidateProfile {
    private String firstName;
    private  String lastName;
    private String email;
    private String phoneNo;
    private String location;
//    private String linkedInProfle;
//    private String website;
//    private JobSource jobSource;
//    private String EmployeeReferralName;
//    private WorkAuthorization workAuthorization;
//    private BeforeEmployed beforeEmployed;
    private String salaryExpectations;
    private String gender;
    private String veteranStatus;
    private String disabilityStatus;
    private String SSN;
    private String resume_path;
//    public CandidateProfile() {
//    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVeteranStatus() {
        return veteranStatus;
    }

    public void setVeteranStatus(String veteranStatus) {
        this.veteranStatus = veteranStatus;
    }

    public String getDisabilityStatus() {
        return disabilityStatus;
    }

    public void setDisabilityStatus(String disabilityStatus) {
        this.disabilityStatus = disabilityStatus;
    }

    public String getResume_path() {
        return resume_path;
    }

    public void setResume_path(String resume_path) {
        this.resume_path = resume_path;
    }
       

    

//    public enum JobSource {
//        Agency("Agency"), Billboard("Billboard"), CareerBuilder("CareerBuilder"), LinkedIn("LinkedIn"), EmployeeReferral("Employee Referral");
//
//        private String value;
//
//        private JobSource(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//    public enum WorkAuthorization {
//        Yes("Yes"), No("No");
//
//        private String value;
//
//        private WorkAuthorization(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//public enum BeforeEmployed {
//        Yes("Yes"), No("No");
//
//        private String value;
//
//        private BeforeEmployed(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//public enum Gender {
//        Male("Male"), Female("Female"), Decline("Decline to Self Identify");
//
//        private String value;
//
//        private Gender(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }

//public enum VeteranStatus {
//        No("I am not a protected veteran"), Yes("I identify one or more of the classifications of a protected veteran"), Decline("I don't wish to answer");
//
//        private String value;
//
//        private VeteranStatus(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//public enum DisabilityStatus {
//       No("No, I don't have any disability"), Yes("Yes,I have a disability"), Decline("I don't wish to answer");
//        private String value;
//
//        private DisabilityStatus(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public String getLinkedInProfle() {
//        return linkedInProfle;
//    }
//
//    public void setLinkedInProfle(String linkedInProfle) {
//        this.linkedInProfle = linkedInProfle;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(String website) {
//        this.website = website;
//    }
//
//    public JobSource getJobSource() {
//        return jobSource;
//    }
//
//    public void setJobSource(JobSource jobSource) {
//        this.jobSource = jobSource;
//    }
//
//    public String getEmployeeReferralName() {
//        return EmployeeReferralName;
//    }
//
//    public void setEmployeeReferralName(String EmployeeReferralName) {
//        this.EmployeeReferralName = EmployeeReferralName;
//    }
//
//    public WorkAuthorization getWorkAuthorization() {
//        return workAuthorization;
//    }
//
//    public void setWorkAuthorization(WorkAuthorization workAuthorization) {
//        this.workAuthorization = workAuthorization;
//    }
//
//    public BeforeEmployed getBeforeEmployed() {
//        return beforeEmployed;
//    }
//
//    public void setBeforeEmployed(BeforeEmployed beforeEmployed) {
//        this.beforeEmployed = beforeEmployed;
//    }

    public String getSalaryExpectations() {
        return salaryExpectations;
    }

    public void setSalaryExpectations(String salaryExpectations) {
        this.salaryExpectations = salaryExpectations;
    }

//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public VeteranStatus getVeteranStatus() {
//        return veteranStatus;
//    }
//
//    public void setVeteranStatus(VeteranStatus veteranStatus) {
//        this.veteranStatus = veteranStatus;
//    }
//
//    public DisabilityStatus getDisabilityStatus() {
//        return disabilityStatus;
//    }
//
//    public void setDisabilityStatus(DisabilityStatus disabilityStatus) {
//        this.disabilityStatus = disabilityStatus;
//    }

    
    
}
