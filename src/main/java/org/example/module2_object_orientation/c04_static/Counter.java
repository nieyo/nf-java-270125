package org.example.module2_object_orientation.c04_static;

public class Counter {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public Counter() {
        totalCount++;
        instanceCount++;
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public String toString(){
        return String.format("Total: %d, Instance: %d", totalCount, instanceCount);
    }
}
