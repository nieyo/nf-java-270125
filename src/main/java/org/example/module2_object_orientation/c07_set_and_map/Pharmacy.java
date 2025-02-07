package org.example.module2_object_orientation.c07_set_and_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {
    private HashMap<String, Medication> medications;
    private int count;

    public Pharmacy() {
        count = 0;
        this.medications = new HashMap<>();
    }

    public void save(Medication m) {
        medications.put(m.getName(), m);
        count++;
    }

    public Medication find(String medicationName) {
        if (medications.containsKey(medicationName)){
            return medications.get(medicationName);
        }
        return null;
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
        count--;
    }

    public void printMedications() {
        for (Map.Entry<String, Medication> entry : medications.entrySet()) {
            String key = entry.getKey();
            Medication value = entry.getValue();
            System.out.println(value.getName() + " " + value.getPrice() + " " + value.isAvailable());
        }
    }

    public HashMap<String, Medication> getMedications() {
        return medications;
    }

    public void setMedications(HashMap<String, Medication> medications) {
        this.medications = medications;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return count == pharmacy.count && Objects.equals(medications, pharmacy.medications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medications, count);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medications=" + medications +
                ", count=" + count +
                '}';
    }
}
