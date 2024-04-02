public class Car extends WheeledVehicles {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        serviceWheels();
        checkEngine();
    }
}