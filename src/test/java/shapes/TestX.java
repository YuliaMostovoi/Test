package shapes;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestX {
    public static void main(String[] args) {
        X x = new X("X");
        System.out.println(x);
    }

    @Test
    public void testX() {
        X x = new X("X");
        assertEquals(10, x.shapes());
    }
}
