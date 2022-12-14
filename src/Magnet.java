import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Magnet {
    private final int MAXSIZE = 5;
    private List<String> nameShopper = new ArrayList<>();

    Magnet() {

    }

    public Queue<String> number1 = new ArrayDeque<>();
    public Queue<String> number2 = new ArrayDeque<>();

    public void addShopper(String name) {
        if (number1.size() == MAXSIZE && number2.size() == MAXSIZE) {
            System.out.println("Позвать администратора Галю и открыть новую кассу!");
            return;
        } else if (number1.size() < number2.size()) {
                  number1.offer(name);
            } else {
                number2.offer(name);
            }
        }



    public List<String> getNameShopper() {
        return nameShopper;
    }

    public Queue<String> getNumber1() {
        return number1;
    }

    public Queue<String> getNumber2() {
        return number2;
    }

    @Override
    public String toString() {
        return "количество людей " + getNumber1() + " " + getNumber2();
    }
}
