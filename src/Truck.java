public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {

    }


    public void checkTrailer() {
        System.out.println(getModelName() + " Проверяем прицеп");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

}
