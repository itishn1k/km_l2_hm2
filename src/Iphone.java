public class Iphone extends AppleDevice{
    private final Integer networkGen;

    public Integer getNetworkGen() {
        return networkGen;
    }

    public Iphone(String name, Integer storage, Chipset chipset, Integer networkGen, Integer releaseYear) {
        super(name, storage, chipset, releaseYear);
        this.networkGen=networkGen;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Supports: "+getNetworkGen()+"G Network\n");
    }
}
