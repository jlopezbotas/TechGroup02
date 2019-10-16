public class Utils {
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
