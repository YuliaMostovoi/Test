package shapes;

public abstract class Shapes {
    private final String name;

    public Shapes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int shapes();


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", shapes='" + shapes() + '\'' +
                        '}';
    }

}

