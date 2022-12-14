import java.util.Set;

public class SponsorList {

    private Set<Sponsor> sponsors1;

    public SponsorList(Set<Sponsor> sponsors) {
        this.sponsors1 = sponsors;
    }

    public void add(Sponsor sponsor) {
        Sponsor existent = get(sponsor.getName());
        if (existent != null) {
            throw new RuntimeException("Такой спонсор есть - это повтор");
        }
        sponsors1.add(sponsor);
    }

    public Sponsor get(String name) {
        for (Sponsor sponsor : sponsors1) {
            if (sponsor.getName().equals(name)) {
                return sponsor;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return sponsors1.toString();
    }
}

