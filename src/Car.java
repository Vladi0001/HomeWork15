public class Car {

    public String modelName;
    public int wheelsCount;

    public Car(String modelName, int wheelsCount) {
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

    public static void updateTyre(Car mersedes) {
        if (mersedes.getWheelsCount() < 4) {
            System.out.println("Меняем покрышку");
        }
    }
    public static void checkEngine(Car mersedes) {
            if (mersedes.getWheelsCount() == 4) {
                System.out.println("Проверяем двигатель");
            }
        }
    }

