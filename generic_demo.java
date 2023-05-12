public class generic_demo<T> {
    /**
     *
     */
    T[] data = (T[]) new Object[3];

    public static void main(String[] args) {
        generic_demo<String> gd = new generic_demo<>();

        gd.data[0] = "Hello";
        gd.data[1] = "Hi";

        String str = gd.data[0];

        System.out.println(str);
    }
}