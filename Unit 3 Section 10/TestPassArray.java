public class TestPassArray {
    public static void main(String[] args) {
        int[] a = { 1, 2 };
        System.out.println("Before invoking swqp");
        System.out.println("array is (" + a[0] + ", " + a[1] + " )");
        swqp(a[0], a[1]);
        System.out.println("After invoking swqp");
        System.out.println("array is (" + a[0] + ", " + a[1] + " )");

        System.out.println("before invoking swapFiratTwoInArray ");
        System.out.println("array is (" + a[0] + ", " + a[1] + " )");
        swapFriratTwoInArray(a);
        System.out.println("After invoking swapFiratTwoInArray ");
        System.out.println("array is (" + a[0] + ", " + a[1] + " )");
    }

    public static void swqp(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFriratTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

}
