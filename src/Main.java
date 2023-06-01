public class Main {
    public static void main(String[] args) {

        //task 1
        Bicycle mers = new Bicycle("Mersedes", 1);


        //task 2
       Car mersedes = new Car("Mersedes", 4);
        Car.checkEngine(mersedes);

        //task 4
        Truck mersedes1 = new Truck ("Mersedes", 4);
        Truck.checkEngine(mersedes1);
        Truck.checkTrailer(mersedes1);

        // task 3
        ServiceStation.updateTyre(mersedes,mers, mersedes1);
        ServiceStation.check(mersedes,mers, mersedes1);

    }
    
}