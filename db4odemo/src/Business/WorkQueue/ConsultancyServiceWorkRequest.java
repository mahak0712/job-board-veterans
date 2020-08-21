/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class ConsultancyServiceWorkRequest extends WorkRequest{
    
    Integer max_Salary;
    Integer min_Salary;
    String JobType;
    String Location;
    String JobName;
    UserAccount User;
    Enterprise enterprise;
    private ArrayList<JobPostingWorkRequest> job_posting_work_req;

     public ConsultancyServiceWorkRequest() {
//        this.job_posting_work_req_array = new ArrayList<JobPostingWorkRequest>();
        job_posting_work_req = new ArrayList<>();
    }
     
    public Integer getMax_Salary() {
        return max_Salary;
    }

    public void setMax_Salary(Integer max_Salary) {
        this.max_Salary = max_Salary;
    }

    public Integer getMin_Salary() {
        return min_Salary;
    }

    public void setMin_Salary(Integer min_Salary) {
        this.min_Salary = min_Salary;
    }

    public String getJobType() {
        return JobType;
    }

    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public ArrayList<JobPostingWorkRequest> getJob_posting_work_req() {
        return job_posting_work_req;
    }

    public void setJob_posting_work_req(ArrayList<JobPostingWorkRequest> job_posting_work_req) {
        this.job_posting_work_req = job_posting_work_req;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String JobName) {
        this.JobName = JobName;
    }
    public String toString(){
        return "JobName"+JobName+"      enterprise"+enterprise;
    }

    public UserAccount getUser() {
        return User;
    }

    public void setUser(UserAccount User) {
        this.User = User;
    }
    
}
