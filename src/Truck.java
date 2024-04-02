public class Truck extends WheeledVehicles {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceWheels();
        checkEngine();
        checkTrailer();
    }
}