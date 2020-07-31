public class Cat extends Dog {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Meeow!";
    }
}

