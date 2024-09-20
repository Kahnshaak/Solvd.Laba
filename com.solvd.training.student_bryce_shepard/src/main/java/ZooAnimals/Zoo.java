package ZooAnimals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Zoo {
    private static Zoo instance;
    private final Map<String, Animal> animals;
    private final Map<EHabitat, ZooHabitat> habitats;
    private final Map<EHabitat, Set<String>> habitatAnimals;

    private Zoo() {
        animals = new HashMap<>();
        habitats = new HashMap<>();
        habitatAnimals = new HashMap<>();
        for (EHabitat habitat : EHabitat.values()) {
            habitats.put(habitat, new ZooHabitat(habitat, 10, 2)); // Example capacity and staff count
            habitatAnimals.put(habitat, new HashSet<>());
        }
    }

    public static synchronized Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }

    public void addAnimal(String name, Animal animal) {
        animals.put(name, animal);
        habitatAnimals.get(animal.getHabitat()).add(animal.name);
    }

    public Animal getAnimal(String name) {
        return animals.get(name);
    }

    public Set<String> getAnimalsInHabitat(EHabitat habitat) {
        return habitatAnimals.get(habitat);
    }

    public ZooHabitat getHabitatInfo(EHabitat habitat) {
        return habitats.get(habitat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<EHabitat, Set<String>> entry : habitatAnimals.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
