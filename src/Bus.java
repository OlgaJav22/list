
public class Bus extends Car {
    private BodyType capacity;

    public Bus(String brand, String model, BodyType capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public enum BodyType {
        ESPECIALLY_SMALL(0, 10),
        SMALL(10, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private final int capacityFrom;
        private final int capacityTo;

        public int getCapacityFrom() {
            return capacityFrom;
        }

        public int getCapacityTo() {
            return capacityTo;
        }

        BodyType(int capacityFrom, int capacityTo) {
            this.capacityFrom = capacityFrom;
            this.capacityTo = capacityTo;
        }

        public int getCapacityBus(int capacityFrom, int capacityTo) {
            return capacityFrom + capacityTo;
        }

        public String toString() {
            return (" " + "Вместимость от " + capacityFrom + " , до " + capacityTo + " мест.");
        }
    }

    public String toString() {
        return super.toString() + capacity;
    }


    public BodyType getCapacity() {
        return capacity;
    }

}
