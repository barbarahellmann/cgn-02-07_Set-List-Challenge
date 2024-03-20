// Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
// Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
// Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
// Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
// Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
// Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
// Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
//If you have already completed this task earlier, feel free to solve some tasks on Codewars.



package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String a = "Chrissy";
        String b = "Christian";
        String c = "Barbara";
        String d = "Carsten";

        Medication medication1 = new Medication("Java Pills", 6.99, true);
        Medication medication2 = new Medication("C++ Pills", 8.99, false);
        Medication medication3 = new Medication("PHP Pills", 9.99, true);
        Medication medication4 = new Medication("JavaScript Pills", 16.99, true);


        Pharmacy pharmacy = new Pharmacy();
        pharmacy.saveMedication(medication1);
        pharmacy.saveMedication(medication2);
        pharmacy.saveMedication(medication3);
        pharmacy.saveMedication(medication4);
        pharmacy.saveMedication(new Medication("Aspirin", 5.9, true));
        pharmacy.saveMedication(new Medication("Parazetamol", 6.5, true));
        pharmacy.saveMedication(new Medication("Voltaren", 10.6, false));

        // Return Medication with this name
        Medication medication = pharmacy.find("Aspirin");


        // Printing all medications before deletion
        System.out.println("\nMedications before deletion:");
        pharmacy.printMedications();



        pharmacy.delete("Voltaren");
        pharmacy.delete("Parazetamol");
        pharmacy.delete("Java Pills");



        System.out.println("\nMedications after deletion:");
        pharmacy.printMedications();



        /*
        if (medication !=null ){
            System.out.println("Medication is there: " + medication.getName() + " And price is: " + medication.getPrice());
        } else {
            System.out.println("Not found!");
        }
         */


        // Printing all medications after deletion
        List<String> students = new ArrayList<>(); //[0]
        students.add(a);
        students.add(b);
        students.add(c);
     //   System.out.println(students);
        students.add(d);
//        System.out.println(students);
        //student[0]
        // System.out.println(students.get(0));

        //students.length
        //System.out.println(students.size());

        //System.out.println("Index von Carsten = " + students.indexOf("Carsten"));
        //Lösche das x. Objekt im Array
        //students.remove(2);
        //System.out.println(students);

        //System.out.println("Index von Carsten = " + students.indexOf("Carsten"));

    }

}