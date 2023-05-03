package cars;

public class Ford extends BasicCar {
    public Ford() {
        super.setPrice(2222.12f);
    }

    @Override
    public void setName(String name) {
        super.setName(name + " Ford");
    }


}
