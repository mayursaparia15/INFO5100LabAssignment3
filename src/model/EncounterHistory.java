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
public class EncounterHistory {
     private List<Visit> encounterHistory;
     
     public EncounterHistory() {
        encounterHistory = new ArrayList<Visit>();
    }

    public List<Visit> getEncounterHistory() {
        return encounterHistory;
    }
}
