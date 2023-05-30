public class Bicycle {
    public String modelName;
    public int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
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

    public static void updateTyre(Bicycle mers) {
        if (mers.getWheelsCount() < 2) {
            System.out.println("Меняем покрышку");
        }
    }
}
