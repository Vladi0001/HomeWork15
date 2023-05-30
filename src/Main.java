public class Main {
    public static void main(String[] args) {

        //task 1
        Bicycle mers = new Bicycle("Mersedes", 1);
        Bicycle.updateTyre(mers);

        //task 2
       Car mersedes = new Car("Mersedes", 4);
        Car.updateTyre(mersedes);
        Car.checkEngine(mersedes);

        //task 4
        Truck mersedes1 = new Truck ("Mersedes", 4);
        Truck.updateTyre(mersedes1);
        Truck.checkEngine(mersedes1);
        Truck.checkTrailer(mersedes1);

        // task 3
        ServiceStation.check(mersedes,mers, mersedes1);

    }
    
}