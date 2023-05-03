package cars;

public class Nano extends BasicCar {
    public Nano() {
        super.setPrice(4555.45f);
    }

    @Override
    public void setName(String name) {
        super.setName(name + " Nano");
    }
}
