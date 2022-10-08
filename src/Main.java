import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        AppleDevice iphone = createObject("Iphone");
        Objects.requireNonNull(iphone).print();

        AppleDevice macbook = createObject("Macbook");
        Objects.requireNonNull(macbook).print();

        AppleDevice watch = createObject("Watch");
        Objects.requireNonNull(watch).print();
    }

    public static AppleDevice createObject(String className) {
        switch (className) {
            case "Iphone" -> {
                return new Iphone("Iphone 14 Pro", 512, Chipset.APPLE_A16, 5, 2022);
            }
            case "Macbook" -> {
                return new Macbook("Macbook Air", 512, Chipset.APPLE_M1, 2020);
            }
            case "Watch" -> {
                return new Watch("Watch 7 Ultra", 16, Chipset.APPLE_S8, 2022);
            }
        }
        return null;
    }
}