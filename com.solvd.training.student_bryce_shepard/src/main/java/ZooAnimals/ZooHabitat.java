package ZooAnimals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Map;


public class ZooHabitat {
    private static final Logger logger = LogManager.getLogger(ZooHabitat.class);
    private final EHabitat type;
    private final int capacity;
    private final Map<String, Animal> animals;
    private int staffCount;

    public ZooHabitat(EHabitat type, int capacity, int staffCount) {
        animals = new HashMap<>();
        this.type = type;
        this.capacity = capacity;
        this.staffCount = staffCount;
    }

    public EHabitat getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addAnimal(String name, Animal animal) throws HabitatCapacityExceededException {
        try {
            if (animals.size() >= capacity) {
                throw new HabitatCapacityExceededException("Habitat is at capacity");
            }
            animals.put(name, animal);
        } catch (HabitatCapacityExceededException e) {
            logger.error("Habitat capacity exceeded", e);
        }
    }

    public Animal getAnimal(String name) throws AnimalNotFoundException {
        try {
            if (!animals.containsKey(name)) {
                throw new AnimalNotFoundException("Animal not found in habitat");
            }
        } catch (AnimalNotFoundException e) {
            logger.error("Animal not found in habitat", e);
        }
        return animals.get(name);
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }
}

