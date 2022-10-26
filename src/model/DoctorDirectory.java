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
public class DoctorDirectory {
    private List<Doctor> doctorDirectory;
     
     public DoctorDirectory() {
        doctorDirectory = new ArrayList<Doctor>();
    }

    public List<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }
}
