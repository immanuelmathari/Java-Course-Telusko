public class Hello02 {
    public static void main(String[] args)
    {
        int num1 = 7;
        int num2 = 5;

        int result = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2; // this will only give you the 
        // to get the remainder use
        int result5 = num1 % num2;
        // this is num1 = num1 + 2
        num1 += 2;
        num1 -= 2;
        num1 *= 2;
        num1 /= 2;
        // num1 = num1 + 1
        // to increment
        num1++;

        // to pre-increment
        ++num1;

        // post-increment vs pre-increment
        // these two behave differently when you try to assign a value or fetch a value
        int num3 = 23;
        int num4 = 23;
        int result6 = ++num3;
        // pre-increment increments first then returns the result
        int result7 = num4++;
        // post-increment returns the value first then performs the operation
        // so the difference is when you try to perform an operation to fetch another value using the pre or post
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6); // answer is 24
        System.out.println(result7); // answer is 23. Post-increment first fetches the value of num4 then performs the operation later. or increments later
    }
}
