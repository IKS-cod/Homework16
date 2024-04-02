public class Bicycle extends WheeledVehicles {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceWheels();
    }
}
