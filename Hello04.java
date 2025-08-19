public class Hello04 {
    public static void main(String[] args)
    {
        int a = 7;
        int b = 5;
        int c = 5;
        int d = 9;

        boolean result = a > b && c > b;
        boolean result2 = a > b || c > b;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(!result);
    }
}
