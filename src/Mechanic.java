import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Mechanic <T extends Car> {
    private String name;
    private String company;
    private LinkedList<T> mechanic;

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

    public LinkedList <T> getMechanic(Mechanic mechanics) {
        return mechanic;
    }

    public String getName() {
        return name;
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
        Mechanic<?> mechanic1 = (Mechanic<?>) o;
        return Objects.equals(name, mechanic1.name) && Objects.equals(company, mechanic1.company) && Objects.equals(mechanic, mechanic1.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, mechanic);
    }

    public int size() {
        return 0;
    }
}
