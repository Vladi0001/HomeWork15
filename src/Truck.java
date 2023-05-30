public class Truck {
    public String modelName;
    public int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public static void updateTyre(Truck mersedes1) {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine(Truck mersedes1) {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer(Truck mersedes1) {
        System.out.println("Проверяем прицеп");
    }
}
