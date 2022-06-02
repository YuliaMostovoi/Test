package shapes;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle");
        System.out.println(triangle);
    }

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle("Triangle");
        assertEquals(10, triangle.shapes());
    }
}
