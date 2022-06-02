package shapes;

public class Triangle extends Shapes {

    public Triangle(String name) {
        super(name);
    }

    @Override
    public int shapes() {

        int height = 10;

        if (height <= 0) {
            throw new RuntimeException("Invalid Height: " + height);
        }

        for (int i = 1; i <= height; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }


        return height;
    }


}
