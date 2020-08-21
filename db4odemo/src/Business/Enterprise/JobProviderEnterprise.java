/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhargavisabbisetty
 */
public class JobProviderEnterprise extends Enterprise {

    public JobProviderEnterprise(String name) {
    super(name,EnterpriseType.JobProvider);    //this class is inheriting the properties of parent class enterprise
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {  //Roles of specifiv enterprise
        return null;
    }
    
}
