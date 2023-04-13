public abstract class Transport implements Maintainable {
        private final String modelName;
        private final int wheelsCount;

        public Transport(String modelName, int wheelsCount) {
                this.modelName = modelName;
                this.wheelsCount = wheelsCount;
        }

        public String getModelName() {
                return modelName;
        }

        public int getWheelsCount() {
                return wheelsCount;
        }

        public void updateTyre() {
                System.out.println(getModelName() + " Меняем покрышку " + getWheelsCount() + " раз");

        }


}