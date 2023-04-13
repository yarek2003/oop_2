public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println(getModelName() + " Проверяем двигатель");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }

}