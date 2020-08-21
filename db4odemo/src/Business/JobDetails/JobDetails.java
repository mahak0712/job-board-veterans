/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.JobDetails;

/**
 *
 * @author mahaksingh
 */
public class JobDetails {
    String companyName;
    private JobType jobType;
    String location;
    String jobTitle;
    String jobDescription;
//    Double Salary;
//    Double maxSalary;
//     Double minSalary;
    Double maxSalary;
    public JobDetails() {

       

    }

//    public Double getMinSalary() {
//        return minSalary;
//    }
//
//    public void setMinSalary(Double minSalary) {
//        this.minSalary = minSalary;
//    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
    }


//    public Double getSalary() {
//        return Salary;
//    }
//
//    public void setSalary(Double Salary) {
//        this.Salary = Salary;
//    }

    public enum JobType {
        OnSite("On-Site"), RemoteOnly("Remote Only");

        private String value;

        private JobType(String value) {
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

//    public Double getMinslary() {
//        return minslary;
//    }
//
//    public void setMinslary(Double minslary) {
//        this.minslary = minslary;
//    }
//
//    public Double getMaxSalary() {
//        return maxSalary;
//    }
//
//    public void setMaxSalary(Double maxSalary) {
//        this.maxSalary = maxSalary;
//    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public void deleteJob(JobDetails jobDetails)
    {
       
        jobDetails.deleteJob(jobDetails);
        
    }

   public String toString(){
       return this.companyName;
   }
    
}
