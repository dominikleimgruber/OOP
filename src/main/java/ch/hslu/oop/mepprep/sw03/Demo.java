package ch.hslu.oop.mepprep.sw03;

public final class Demo {


    public int max(final int a, final int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public int min(final int a, final int b) {
        if (a <= b) {
            return a;
        }
        return b;
    }

    public int max(final int a, final int b, final int c) {
        return max(max(a, b), c);
    }

    public int min(final int a, final int b, final int c) {
        return min(min(a, b), c);
    }

    public void toTenFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    public void toTenWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println(++i);
        }
    }

    public void toTenDoWhile() {
        int i = 0;
        do {
            System.out.println(++i);
        } while (i < 10);
    }

    public void iterateFloat() {
        float test = 0.9f;
        int counter = 0;
        while (test < 1.0f) {
            test += 0.000025f;
            counter++;
        }

    }

    public void iterateFloat4000() {
        float test = 0.9f;
        for (int i = 0; i < 4000; i++) {
            test += 0.000025f;
        }
    }

    public void printBox(final int height, final int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == (height - 1) || j == 0 || j == (width - 1)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
