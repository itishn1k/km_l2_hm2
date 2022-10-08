public class Macbook extends AppleDevice {
    private final Integer batteryLife;

    public Integer getBatteryLife() {
        return batteryLife;
    }

    public Macbook(String name, Integer storage, Chipset chipset, Integer releaseYear) {
        super(name, storage, chipset, releaseYear);
        this.batteryLife=14;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Up to: "+getBatteryLife()+" hours of battery life\n");
    }
}
