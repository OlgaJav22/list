import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <O extends Car> {
    private Queue<O> queue = new ArrayDeque<>();


    public void addCar (O car) {
        queue.offer(car);
    }

    public void spendMaintenanceCar(O car) {
        if (!queue.isEmpty()) {
            car = queue.poll();
        }

    }

    public Queue<O> getQueue() {
        return queue;
    }

    @Override
    public String toString() {
        return  "Всего в очереди " + queue.size() + "шт.";
    }
}
