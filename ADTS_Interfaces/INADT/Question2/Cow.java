public class Cow extends Dog {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Mooo!";
    }
}
