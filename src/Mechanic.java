import java.util.*;

public class Mechanic <T extends Car> {
    private String name;
    private String company;
    private List<T> mechanics;

    Mechanic (String name, String company) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
            if (company != null && !company.isBlank() && !company.isEmpty()) {
                this.company = company;
            }
        }
    }

    public void performMaintenance (T car) {
        System.out.println("Механик " + getName() + " - прорводит техобслуживание автомобиля " + car.getBrand() + " " + car.getModel());
    }

    public void fixCar (T car) {
        System.out.println("Механик " + getName() + " чинит машину " + car.getBrand() + " " + car.getModel());
    }

    public void addMechanic (Mechanic<?>...mechanics) {
    }

    public String getName() {
        return name;
    }

    public List<T> getMechanic() {
        return mechanics;
    }

    public String getCompany() {
        return company;
    }

    public String toString () {
        return "Механик: " + getName() + ", работает в компании " + getCompany();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    public int size() {
        return 0;
    }
}
