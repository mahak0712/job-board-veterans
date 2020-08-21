/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;

         if (type == Enterprise.EnterpriseType.Veterans) {//if requested enterprise is of particular type -->Veterans Enterprise
            enterprise = new VeteransEnterprise(name);//crete object of particular type
            enterpriseList.add(enterprise);

        }
         else if (type == Enterprise.EnterpriseType.JobProvider) {//if requested enterprise is of particular type -->Job Provider Enterprise
            enterprise = new JobProviderEnterprise(name);//crete object of particular type
            enterpriseList.add(enterprise);

        }
         else if (type == Enterprise.EnterpriseType.EventManagement) {//if requested enterprise is of particular type -->EventManagement Enterprise
            enterprise = new EventManagementEnterprise(name);//crete object of particular type
            enterpriseList.add(enterprise);

        }

         else if (type == Enterprise.EnterpriseType.Consultancy) {//if requested enterprise is of particular type  -->Consultancy Enterprise
            enterprise = new ConsultancyEnterprise(name);//crete object of particular type
            enterpriseList.add(enterprise);

        }
        return enterprise;
    }
}
