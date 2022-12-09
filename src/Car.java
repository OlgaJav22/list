public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        setModel(model);
    }

    public Car() {
    }

    public String toString() {
        return "\t" + getBrand() + " " + getModel();
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


