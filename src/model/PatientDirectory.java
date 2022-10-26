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
public class PatientDirectory {
    private List<Patient> patientDirectory;
     
    public PatientDirectory() {
        patientDirectory = new ArrayList<Patient>();
    }

    public List<Patient> getPatientDirectory() {
        return patientDirectory;
    }
    
    
     
}
