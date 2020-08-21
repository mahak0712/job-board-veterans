/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.JobDetails.JobDetails;
import java.util.Comparator;

/**
 *
 * @author mahaksingh
 */
public class JobPostingWorkRequest extends WorkRequest implements Comparator<JobPostingWorkRequest> 

{ 
    private JobDetails jobdetails;
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(JobPostingWorkRequest jwr1, JobPostingWorkRequest jwr2) 
    { 
        return (int) (jwr2.getJobdetails().getMaxSalary()-jwr1.getJobdetails().getMaxSalary()); 
    } 
    
    
    public JobDetails getJobdetails() {
        return jobdetails;
    }

    public void setJobdetails(JobDetails jobdetails) {
        this.jobdetails = jobdetails;
    }
    
      public String toString(){
        return jobdetails.getCompanyName();
    }

    public Object getJobDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
