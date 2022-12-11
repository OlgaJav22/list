import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bus daewoo = new Bus("DAEWOO", "BS090", Bus.BodyType.AVERAGE);
        Bus isuzu = new Bus("ISUZU", "А-092Н6", Bus.BodyType.ESPECIALLY_BIG);
        Bus mercedes = new Bus("MERCEDES", "Conecto G", Bus.BodyType.SMALL);
        Bus gazel = new Bus("Газель", "ГАЗ-560", Bus.BodyType.BIG);

        PassengerCars lada = new PassengerCars("Lada", "Granta", PassengerCars.BodyType.CD_N);
        PassengerCars audi = new PassengerCars("Audi", "A8 50L TDI quattro", PassengerCars.BodyType.VN_IK);
        PassengerCars bmw = new PassengerCars("BMW", "Z8", PassengerCars.BodyType.KR_VER);
        PassengerCars kia = new PassengerCars("Kia", "Sportage", PassengerCars.BodyType.UN_SAL);

        Trucks kamaz = new Trucks("Kamaz", "МАЗ-5432");
        Trucks jac = new Trucks("JAC", "Sunrai");
        Trucks man = new Trucks("MAN", "TGS");
        Trucks hyundai = new Trucks("Hyundai", "Mighty");

        Driver vasya = new Driver("Сажин Василий Михайлович", true, "D", 12, daewoo);
        Driver petya = new Driver("Григорьев Петр Иванович", true, "C", 7, man);
        Driver roman = new Driver("Носов Роман Евгеньевич", true, "B", 4, lada);
//        Driver vitya = new Driver<>("Крячин Виктор Николаевич", false, "", 0, null);
        Driver oleg = new Driver<>("Рогов Олег Константинович", true, "B", 5, audi);
        Driver alex = new Driver<>("Гарин Алексей Романович", true, "B", 6, bmw);
        Driver daniil = new Driver<>("Зюзин Даниил Олегович", true, "B", 8, kia);
        Driver denis = new Driver<>("Ломоносов Денис Витальевич", true, "С", 8, hyundai);
        Driver kolya = new Driver<>("Горлов Николай Валерьевич", true, "С", 7, jac);
        Driver masha = new Driver<>("Никонова Мария Алексеевна", true, "D", 11, isuzu);
        Driver olga = new Driver<>("Новикова Ольга Николаевна", true, "D", 4, gazel);
        Driver ruslan = new Driver<>("Абрамов Руслан Рашидович", true, "D", 10, mercedes);
        Driver magomed = new Driver<>("Харитонов Магомед Ибрагимович", true, "C", 9, kamaz);
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(roman);
        System.out.println(vasya.isValidDriversLicense("есть"));
        oleg.printif(audi);

        Mechanic<Car> vitya = new Mechanic<>("Виктор", "Автосервис");
        Mechanic<Car> sergei = new Mechanic<>("Сергей", "Мастер&Шин");
        Mechanic<Car> renat = new Mechanic<>("Ренат", "Спецсервис");
        Mechanic<Car> anton = new Mechanic<>("Антон", "ЧинПочин");
        Mechanic<Car> slava = new Mechanic<>("Вячеслав", "ЧетыреКолеса");
        Mechanic<Car> vlad = new Mechanic<>("Владислав", "ТоЧтоНадо");
        Mechanic<Car> zurab = new Mechanic<>("Зураб", "АвтоЗапчасти");
        Mechanic<Car> arman = new Mechanic<>("Арман", "АвтоМотоСервис");

        Sponsor<Car> start = new Sponsor<>("Start", 500_000);
        Sponsor<Car> lukoil = new Sponsor<>("Лукойл", 1_000_000);
        Sponsor<Car> system = new Sponsor<>("Система", 2_000_000);
        Sponsor<Car> michelin = new Sponsor<>("Мишлен", 3_000_000);

        System.out.println(vitya);
        vitya.fixCar(lada);
        vitya.fixCar(man);

        List<Car> car = List.of(
                hyundai, man, jac, kamaz,
                kia, audi, lada, bmw, gazel,
                mercedes, isuzu, daewoo);

        List<Mechanic> mechanics = List.of(
                vitya, sergei, renat,
                anton, slava, vlad, zurab, arman);
        System.out.println("\nВсего механиков - " + mechanics.size() + " чел.");

        List<Driver> drivers = List.of(
                vasya, magomed, ruslan, olga, masha, kolya,
                denis, daniil, alex, oleg, roman, petya);

        System.out.println("\nВсего водителей - " + drivers.size() + " чел.");


        System.out.println("\nВсего машин - " + car.size());
        audi.addDriver(oleg);
        audi.addMechanic(vitya, vlad, zurab);
        audi.addSponsor(lukoil, start);
        printInfo(audi);

        bmw.addDriver(alex);
        bmw.addMechanic(anton, slava);
        bmw.addSponsor(michelin);
        printInfo(bmw);

        List<Sponsor> sponsors = List.of(
                lukoil, michelin, start, system);

        System.out.println("\nВсего спонсоров - " + sponsors.size() + " компании.");
    }

    private static void printInfo(Car car) {
        System.out.println("Инфоомация по автомобилю " + car.getBrand() + " " + car.getModel());
        System.out.println("Водитель: " + car.getDrivers());
        System.out.println("Спонсоры: " + car.getSponsors());
        System.out.println("Механики: " + car.getMechanics());
        System.out.println();
    }
}