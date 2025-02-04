package org.example.module2_object_orientation.c01_class_and_object;

class Car {
    String brandName;
    String modelName;
    String color;
    int yearOfManufacture;
    int currentSpeed = 0;
    boolean isEngineOn = false;

    public void startEngine() {
        this.isEngineOn = true;
        System.out.println("Der Motor wurde gestartet");
    }

    public void stopEngine() {
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println("Der Motor und das Auto wurden gestoppt");
    }

    public Car (String brandName, String modelName, String color, int yearOfManufacture) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void increaseSpeed(int speed) {
        String increaseSpeedMessage = "Das Auto ist noch ausgeschaltet.";
        if(isEngineOn){
            currentSpeed += speed;
            increaseSpeedMessage = String.format("Das Auto wurde auf %s km/h beschleunigt.", currentSpeed);
        }
        System.out.println(increaseSpeedMessage);
    }
}