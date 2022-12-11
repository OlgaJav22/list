import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Driver<V extends Car>  {

    private String fullName;
    private boolean validDriversLicense;
    private int experience;
    public static final String LICENSE_BE = "есть";
    private String category;
    private final V car;
    private List<V> drivers;

    public Driver(String fullName, boolean validDriversLicense, String category, int experience, V car) {
        setFullName(fullName);
        this.validDriversLicense = validDriversLicense;
        if (category != null && !category.isEmpty() && !category.isBlank()) {
            this.category = category;
        } else {
            throw new RuntimeException("Необходимо указать категорию прав!");
        }
        this.experience = experience;
        this.car = car;
    }

    public void addDriver (Driver<V> drivers) {
    }
    public void refuelTheCar() {
        System.out.println("Необходимо заправиться");

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isBlank() && !fullName.isEmpty()) {
            this.fullName = fullName;
        } else {
            this.fullName = "не указано";
        }
    }

    public static boolean isValidDriversLicense(String licens) {
        if (licens != null && !licens.isEmpty() && !licens.isBlank()) {
            return true;
        } else {
            return false;
        }
    }

    public String getCategory() {
        return category;
    }

    public int getExperience() {
        if (experience > 3) {
            this.experience = experience;
        } else {
            System.out.println("Вы нам не подходите");
        }
        return experience;
    }

    public List<V> getDrivers() {
        return drivers;
    }

    public void setExperience(int experience) {
        if (experience > 3) {
            this.experience = experience;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return validDriversLicense == driver.validDriversLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(category, driver.category) && Objects.equals(car, driver.car) && Objects.equals(drivers, driver.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, validDriversLicense, experience, category, car, drivers);
    }

    public String toString() {
        return "ФИО: " + getFullName() + "; наличие прав - " + isValidDriversLicense(LICENSE_BE) + "; стаж: " + getExperience() + "лет."
                + "\t"
                + "Водитель - " + getFullName() + " управляет автомобилем " + this.car.getBrand() + this.car.getModel();
    }


    public String printif(V car) {
        System.out.println(" за Вами закреплена машина - " + car.getBrand() + " " + car.getModel());
        return null;
    }


}

