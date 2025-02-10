package org.example.module2_object_orientation.c08_record;

import java.math.BigDecimal;
import java.util.ArrayList;

public record Zoo(
        ArrayList<Animal> animals
) {
    double getFoodRequirement(){
        BigDecimal totalRequirement = BigDecimal.ZERO;
        for (Animal animal : animals) {
            BigDecimal requirement;
            requirement = BigDecimal.valueOf(animal.species().requiredFoodInGramsPerDay());
            totalRequirement = totalRequirement.add(requirement);
        }
        return totalRequirement.doubleValue();
    }
}