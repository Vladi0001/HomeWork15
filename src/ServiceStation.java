public class ServiceStation {
    public String modelName;
    public int wheelsCount;

    public ServiceStation(String modelName, int wheelsCount) {
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

    public static void check(Car mersedes, Bicycle mers, Truck mersedes1) {
        if (mersedes != null) {
            System.out.println("Обслуживаем " + mersedes.modelName);

            }else if (mersedes1 != null) {
            System.out.println("Обслуживаем " + mersedes1.modelName);
            for (int i = 0; i < mersedes1.wheelsCount; i++) {
            }
        } else if (mers != null) {
            System.out.println("Обслуживаем " + mers.modelName);
            }
        }
    public static void updateTyre(Car mersedes, Bicycle mers, Truck mersedes1) {
        System.out.println("Меняем покрышку");
    }
    }
