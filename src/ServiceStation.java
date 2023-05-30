public class ServiceStation {
    public static void check(Car mersedes, Bicycle mers, Truck mersedes1) {
        if (mersedes != null) {
            System.out.println("Обслуживаем " + mersedes.modelName);
            for (int i = 0; i < mersedes.wheelsCount; i++) {
                mersedes.updateTyre(mersedes);
            }
            mersedes.checkEngine(mersedes);
        } else if (mersedes1 != null) {
            System.out.println("Обслуживаем " + mersedes1.modelName);
            for (int i = 0; i < mersedes1.wheelsCount; i++) {
                mersedes1.updateTyre(mersedes1);
            }
            mersedes1.checkEngine(mersedes1);
            mersedes1.checkTrailer(mersedes1);
        } else if (mers != null) {
            System.out.println("Обслуживаем " + mers.modelName);
            for (int i = 0; i < mers.wheelsCount; i++) {
                mers.updateTyre(mers);
            }
        }
    }
}
