public abstract class AppleDevice implements Printable{
    private final String name;
    private final Integer storage;
    private final Chipset chipset;
    private final Integer releaseYear;

    public AppleDevice(String name, Integer storage, Chipset chipset, Integer releaseYear) {
        this.name = name;
        this.storage = storage;
        this.chipset = chipset;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public Integer getStorage() {
        return storage;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void print() {
        System.out.println(
                   "Name: "+getName()
                +"\nStorage: "+getStorage()+"gb"
                +"\nChipset: "+getChipset()
                +"\nRealised in: "+getReleaseYear());
    }
}
