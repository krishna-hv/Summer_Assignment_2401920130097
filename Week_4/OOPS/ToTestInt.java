package Week_4.OOPS;

interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n * n;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        int num = 8;
        System.out.println("Square of " + num + " = " + obj.square(num));
    }
}
