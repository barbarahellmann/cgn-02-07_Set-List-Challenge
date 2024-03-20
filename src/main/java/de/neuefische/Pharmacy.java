package de.neuefische;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    public Map<String, Medication> medicationMap = new HashMap<>();

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medicationMap=" + medicationMap +
                '}';
    }

    public int getCount () {
        return medicationMap.size();
    }

    public void saveMedication(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    public void delete(String medicationName) {
        medicationMap.remove(medicationName);
    }

    public Medication find(String medicationName) {

        if (medicationMap.containsKey(medicationName)){
            System.out.println("Medication is there: "  + medicationName);
        return medicationMap.get(medicationName);
    } else {
            System.out.println("not found");
            return null;
        }
    }

    public void printMedications() {
        for (Map.Entry<String, Medication> entry : medicationMap.entrySet()) {
            Medication medication = entry.getValue();
            System.out.println("Name: " + medication.getName() +
                    ", Price: " + medication.getPrice() +
                    ", Availability: " + (medication.isAvailability() ? "Available" : "Not available"));
        }

    }
}
