public class PassengerCars extends Car {
    private BodyType namingBodyType;

    public PassengerCars(String brand, String model, BodyType namingBodyType) {
        super(brand, model);
        this.namingBodyType = namingBodyType;
    }

    public enum BodyType {
        CD_N("Седан"),
        XCH_BK("Хетчбек"),
        KY_PE("Купе"),
        UN_SAL("Универсал"),
        VN_IK("Внедорожник"),
        KR_VER("Кроссовер"),
        PIK_P("Пикап"),
        FUR_N("Фургон"),
        MIN_VN("Минивен");
        private final String namingBodyType;

        BodyType(String namingBodyType) {
            this.namingBodyType = namingBodyType;
        }

        public String getNamingBodyType() {
            return namingBodyType;
        }

        public String[] getNameBodyType() {
            String[] type = new String[BodyType.values().length];
            for (int i = 0; i < type.length; i++) {
                type[i] = BodyType.values()[i].name();
            }
            return type;
        }

        public String toString() {
            return "\t" + " Тип кузова: " + namingBodyType;
        }
    }

    public BodyType getNamingBodyType() {
        return namingBodyType;
    }

    public String toString() {
        return super.toString() + namingBodyType;
    }

}



