public class Truck extends Car{


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkEngine(Truck mersedes1) {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer(Truck mersedes1) {
        System.out.println("Проверяем прицеп");
    }
}
