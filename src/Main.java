public class Main {
    public static void main(String args[]) {
//        dividing(100);
//        dividing(1000);
//        dividing(10000);

//        arrays(100);
//        arrays(1000);
//        arrays(10000);
    }

    private static void arrays(int bounds) {
        ArrayOperation operation = new ArrayOperation();
        long sum = 0;
        long temp = 0;
        long previouseTime = 0;

        previouseTime = System.nanoTime();

        for (int i = 0; i < bounds; i++) {
            temp = (System.nanoTime() - previouseTime);
            sum += temp;
            operation.getFirstElement();
            previouseTime = System.nanoTime();

        }

        System.out.println("Średni czas po wykonaniu " + bounds + " razy metody bez wyjątku " + sum / 100 + " nano sekund");


        previouseTime = System.nanoTime();

        for (int i = 0; i < bounds; i++) {
            temp = (System.nanoTime() - previouseTime);
            sum += temp;
            try {
                operation.getOutOfBoundsElement();
            } catch (ArithmeticException e) {
            }
            previouseTime = System.nanoTime();

        }

        System.out.println("Średni czas po wykonaniu " + bounds + " razy rzucanie wyjątku na zewnątrz " + sum / 100 + " nano sekund");

        previouseTime = System.nanoTime();

        for (int i = 0; i < bounds; i++) {
            temp = (System.nanoTime() - previouseTime);
            sum += temp;
            operation.getOutOfBoundsElement();
            previouseTime = System.nanoTime();

        }

        System.out.println("Średni czas po wykonaniu " + bounds + " razy metody obługującej wyjątek w środku " + sum / 100 + " nano sekund");
    }

    private static void dividing(int bounds) {
        Math math = new Math();
        long sum = 0;
        long temp = 0;
        long previouseTime = 0;

        previouseTime = System.nanoTime();

        for (int i = 0; i < bounds; i++) {
            temp = (System.nanoTime() - previouseTime);
            sum += temp;
            math.divideByOne();
            previouseTime = System.nanoTime();

        }

        System.out.println("Średni czas po wykonaniu " + bounds + " razy metody bez wyjątku " + sum / 100 + " nano sekund");


        previouseTime = System.nanoTime();

        for (int i = 0; i < bounds; i++) {
            temp = (System.nanoTime() - previouseTime);
            sum += temp;
            try {
                math.divideByZeroWithException();
            } catch (ArithmeticException e) {
            }
            previouseTime = System.nanoTime();

        }

        System.out.println("Średni czas po wykonaniu " + bounds + " razy rzucanie wyjątku na zewnątrz " + sum / 100 + " nano sekund");

        previouseTime = System.nanoTime();

        for (int i = 0; i < bounds; i++) {
            temp = (System.nanoTime() - previouseTime);
            sum += temp;
            math.divideByZero();
            previouseTime = System.nanoTime();

        }

        System.out.println("Średni czas po wykonaniu " + bounds + " razy metody obługującej wyjątek w środku " + sum / 100 + " nano sekund");
    }
}
