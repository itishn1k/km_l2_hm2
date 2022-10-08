public class Watch extends AppleDevice {
    private final Double pulseMeterAccuracy;

    public Watch(String name, Integer storage, Chipset chipset, Integer releaseYear) {
        super(name, storage, chipset, releaseYear);
        this.pulseMeterAccuracy = 99.90;
    }

    public Double getPulseMeterAccuracy() {
        return pulseMeterAccuracy;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Accuracy of pulse detecting: " + getPulseMeterAccuracy() + "%\n");
    }
}
