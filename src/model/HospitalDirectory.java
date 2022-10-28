/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Com
 */
public class HospitalDirectory {
     private List<Hospital> hospitalDirectory;
     
     public HospitalDirectory() {
        hospitalDirectory = new ArrayList<Hospital>();
    }

    public List<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }
    
    public int addHospital(Hospital h) {
        hospitalDirectory.add(h);
        return 1;
    }
    
    public void DeleteHospital(Hospital h){
        hospitalDirectory.remove(h);
    }
    
   
     

    
}
