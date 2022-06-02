package shapes;

public class X extends Shapes {

    public X(String name) {
        super(name);
    }

    @Override
    public int shapes() {
        int height = 10;


        if (height <= 0) {
            throw new RuntimeException("Invalid Height: " + height);
        }

        int k = height * 2 - 1;
        for (int i = 1; i <= k; i++) {
            for (int star = 1; star <= k; star++) {
                if (star == i || star == k - i + 1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        return height;
    }
}

