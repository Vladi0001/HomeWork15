public class Main {
    public static void main(String[] args) {

        Car mers = new Car("Mersedes");
        Car bmw = new Car("BMW");

        Bicycle aist = new Bicycle("Aist");
        Bicycle schkol = new Bicycle("Schkolnik");

        Truck Wolc = new Truck("WolzWagen");
        Truck Reno = new Truck("Reno",8);

        Transport3[] transport3s = {
                mers,
                bmw,
                aist,
                schkol,
                Wolc,
                Reno
        };

        ServiceStation serviceStation = new ServiceStation();

        for (Transport3 transport3: transport3s){
            serviceStation.chek(transport3);
        }

    }
}