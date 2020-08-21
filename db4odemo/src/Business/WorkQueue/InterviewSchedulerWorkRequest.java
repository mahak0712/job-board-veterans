/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.CandidateProfile.CandidateProfile;
import Business.JobDetails.JobDetails;

/**
 *
 * @author mahaksingh
 */
public class InterviewSchedulerWorkRequest extends WorkRequest{
   
    private String candidateReview;
    private String mainSkill;
    private String interviewLocation;
    private String candidateAvailability;
    private String location;
    private JobDetails jobDetails;
    private CandidateProfile candidateProfile;
    private ApplicationProcessWorkRequest app;

    public ApplicationProcessWorkRequest getApp() {
        return app;
    }

    public void setApp(ApplicationProcessWorkRequest app) {
        this.app = app;
    }

    
    public CandidateProfile getCandidateProfile() {
        return candidateProfile;
    }

    public void setCandidateProfile(CandidateProfile candidateProfile) {
        this.candidateProfile = candidateProfile;
    }
    

    public JobDetails getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }


    public String getCandidateAvailability() {
        return candidateAvailability;
    }

    public void setCandidateAvailability(String candidateAvailability) {
        this.candidateAvailability = candidateAvailability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCandidateReview() {
        return candidateReview;
    }

    public void setCandidateReview(String candidateReview) {
        this.candidateReview = candidateReview;
    }


    public String getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(String mainSkill) {
        this.mainSkill = mainSkill;
    }

    public String getInterviewLocation() {
        return interviewLocation;
    }

    public void setInterviewLocation(String interviewLocation) {
        this.interviewLocation = interviewLocation;
    }
    //InterviewSchedulerWorkRequest interviewScheduler = new InterviewSchedulerWorkRequest();
    public String toString(){
        //InterviewSchedulerWorkRequest interviewScheduler = new InterviewSchedulerWorkRequest();
        return this.candidateReview;
    }
    
}
