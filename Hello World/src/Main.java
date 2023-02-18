public class Main {
    public static void main(String[] args) {
        var randomInts = new int[10];
        var reversed = new int[randomInts.length];

        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = (int) (Math.random() * 5);
        }

        for (int i = 0; i < randomInts.length; i++) {
            reversed[reversed.length - 1 - i] = randomInts[i];
        }

        System.out.println("Old array: ");
        for (var x : randomInts) {
            System.out.println(x);
        }

        System.out.println("New array: ");
        for (var x : reversed) {
            System.out.println(x);
        }
    }
}