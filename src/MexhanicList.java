import java.util.Set;

public class MexhanicList {

 private Set<Mechanic> mechanics1;

    public MexhanicList(Set<Mechanic> mechanics1) {
        this.mechanics1 = mechanics1;
    }

    public void add(Mechanic mechanic) {
        Mechanic existent = get(mechanic.getName(), mechanic.getCompany());
        if (existent != null) {
            mechanics1.remove(existent);
        }
        mechanics1.add(mechanic);
    }

    public Mechanic get(String name, String company) {
        for (Mechanic mechanic : mechanics1) {
            if (mechanic.getName().equals(name) && mechanic.getCompany().equals(company)) {
                return mechanic;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return mechanics1.toString();
    }
}
