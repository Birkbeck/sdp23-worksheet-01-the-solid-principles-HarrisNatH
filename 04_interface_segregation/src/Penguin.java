public class Penguin implements Bird {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    /*
     * since penguin class inherits Bird class that only has molt method
     * there is no need for fly method
     */
    // @Override
    // public void fly() {
    //     throw new UnsupportedOperationException();
    // }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
