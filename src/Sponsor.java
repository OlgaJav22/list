import java.util.*;

public class Sponsor<S extends Car> {
    private String name;
    private int sumSupport;
    private List<S> sponsors;

    Sponsor(String name, int sumSupport) {
        this.name = name;
        if (sumSupport > 0) {
            this.sumSupport = sumSupport;
        } else {
            System.out.println("Внесите сумму поддержки");
        }
    }

    public List<S> getSponsors() {
        return sponsors;
    }

    public void addSponsor (Sponsor<?>...sponsor) {
          }


    public void sponsorTheRace() {
        System.out.printf("Спонсор %s проспонсировал заезд %d%n", name,sumSupport);
    }

    public String getName() {
        return name;
    }

    public int getSumSupport() {
        return sumSupport;
    }

    public void setSumSupport(int sumSupport) {
        if (sumSupport > 0) {
            this.sumSupport = sumSupport;
        } else {
            System.out.println("Внесите сумму поддержки");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + ", сумма поддержки: " + sumSupport;
    }
}
