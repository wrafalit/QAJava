package junit.simpletest;

public class Quotient {

    public int quotient (int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Invalid number");
        }
        return  x/y;
    }


}
