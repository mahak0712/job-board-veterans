/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.CandidateProfile.CandidateProfile;
import Business.JobDetails.JobDetails;
import java.util.Date;

/**
 *
 * @author mahaksingh
 */
public class ApplicationProcessWorkRequest extends WorkRequest{
    private CandidateProfile candidateprofile;
    private JobDetails JobDetails;
    private String results;
    private String interviewDate;
    private String comments;
    private Date date = new Date();

    public CandidateProfile getCandidateprofile() {
        return candidateprofile;
    }

    public void setCandidateprofile(CandidateProfile candidateprofile) {
        this.candidateprofile = candidateprofile;
    }

    public String getResults() {
        return results;
    }

    public JobDetails getJobDetails() {
        return JobDetails;
    }

    public void setJobDetails(JobDetails JobDetails) {
        this.JobDetails = JobDetails;
    }

    
    public void setResults(String results) {
        this.results = results;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String toString(){
        return this.candidateprofile.getFirstName();
    }
}
