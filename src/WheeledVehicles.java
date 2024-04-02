public abstract class WheeledVehicles {
    private String modelName;
    private int wheelsCount;

    public WheeledVehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        checkQuantityWheels();
    }

    private void checkQuantityWheels() {
        if (wheelsCount <= 0) {
            throw new RuntimeException("Поле wheelsCount заполнено не корректно");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
        checkQuantityWheels();
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");}
    public abstract void check();

    protected void serviceWheels() {
        System.out.println("Обслуживаем " + getModelName()+", количество колес ="+getWheelsCount());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public String toString() {
        return "Наименование = " + modelName + '\'' +
                ", количество колес = " + wheelsCount;
    }
}
