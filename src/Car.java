import java.util.*;

import java.util.List;

public class Car {
    private String brand;
    private String model;
    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor<?>> sponsors = new ArrayList<>();

    public Car(String brand, String model) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        setModel(model);
    }

    public Car() {
    }

    public void performMaintenance() {
    }

    public void fixCar() {
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));

    }

    public void addSponsor(Sponsor<?>... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));

    }

    public String toString() {
        return "\t" + getBrand() + " " + getModel();
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        }
    }
}


