
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a word:");
        String str = scanner.nextLine();
        if (polindr(str)) {
            System.out.println(str + " not palindrom");
        }else {
            System.out.println(str + " its palindrom");
        }

        scanner.close();
    }

    public static boolean polindr(String str) {

        str = str.toLowerCase();
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return polindr(str.substring(1, str.length() - 1));
        }
        return false;
    }

}*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Select the task 1-10");
        Scanner sc = new Scanner(System.in);
        int problem = sc.nextInt();

        int[] arr = {6, 9, 5, 1, 12, 43, 54, 51};
        int num = 8;

        switch (problem) {
            case 1:

                long startTime = System.nanoTime();
                System.out.println("result: " + findingMin(num, arr) +
                        "\nruntime: " + (double) (System.nanoTime() - startTime) / 1000000000 +
                        "\ntime complexity: 0(n)");
                break;
            case 2:
                System.out.println(avarageArr(num, arr));
                break;

            case 3:
                if(primeNum(17)){
                    System.out.println("Prime");
                } else{
                    System.out.println("Composite");
                }

            case 4:
                System.out.println(factorial(5));

            case 5:
                System.out.println(fibonachi(17));

            case 6:
                System.out.println(apower(2, 10));

            case 7:
                reverseArr(num, arr);

            case 8:
                System.out.println(consistDigit("123sui", 0) ? "YES" : "NO");

            case 9:
                System.out.println(binomialCoefficient(7, 3));

            case 10:
                System.out.println(Gsd(12, 3));





        }
    }

    /* Method to find the minimum element in an array recursively.
           Time complexity: O(n), where n is the input size.
           The method recursively finds the minimum element by comparing the current element with the result of the recursive call.
           @param n The number of elements in the array
           @param arr The array of integers
           @return The minimum element in the array
        */
    public static int findingMin(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findingMin(n - 1, arr));
    }
    /* Method to calculate the average of elements in an array recursively.
           Time complexity: O(n), where n is the input size.
           The method recursively calculates the sum of elements and divides by the number of elements.
           @param n The number of elements in the array
           @param arr The array of integers
           @return The average of elements in the array
        */
    public static double avarageArr(int n, int[] arr){
        if(n == 1){
            return arr[0];
        }
        return (arr[n-1] + (n-1)*avarageArr(n-1, arr)) / n;
    }
    /* Method to check if a number is prime recursively.
          Time complexity: O(sqrt(n)), where n is the input number.
          The method recursively checks divisibility up to the square root of the number.
          @param num The number to check for primality
          @return True if the number is prime, false otherwise
       */
    public static boolean primeNum(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    /* Method to calculate the factorial of a number recursively.
          Time complexity: O(n), where n is the input number.
          The method recursively calculates the factorial of a number.
          @param n The number to calculate the factorial of
          @return The factorial of the input number
       */
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    /* Method to calculate the nth Fibonacci number recursively.
          Time complexity: O(2^n), where n is the input number.
          The method recursively calculates the Fibonacci number using the definition F(n) = F(n-1) + F(n-2).
          @param n The index of the Fibonacci number to calculate
          @return The nth Fibonacci number
       */
    public static int fibonachi(int n){
        if(n <= 1){
            return n;
        }
        return fibonachi(n-1) + fibonachi(n-2);
    }
    /* Method to calculate the power of a number recursively.
           Time complexity: O(n), where n is the power.
           The method recursively calculates the power of a number.
           @param number The base number
           @param power The exponent
           @return The result of number raised to the power
        */
    public static int apower(int number, int power){
        if(power == 1){
            return number;
        }
        return number * apower(number, power-1);
    }
    /* Method to print the elements of an array in reverse order recursively.
           Time complexity: O(n), where n is the number of elements in the array.
           The method recursively prints the elements of the array in reverse order.
           @param n The number of elements in the array
           @param arr The array of integers
        */
    public static void reverseArr(int n, int[] arr){
        if(n == 1){
            System.out.print(arr[0] + " ");
            return;
        }
        System.out.println(arr[n-1] + " ");
        reverseArr(n-1, arr);
    }
    /* Method to check if a string contains a digit recursively.
           Time complexity: O(n), where n is the length of the string.
           The method recursively checks if the string contains a digit.
           @param s The input string
           @param index The current index being checked
           @return True if the string contains a digit, false otherwise
        */
    public static boolean consistDigit(String s, int index){
        if(index == s.length()){
            return false;
        }

        if(Character.isDigit(s.charAt(index))){
            return true;
        }
        return consistDigit(s, index+1);

    }
    /* Method to calculate the binomial coefficient recursively.
       Time complexity: O(2^n), where n is the input number.
       The method recursively calculates the binomial coefficient using the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
       @param n The total number of items
       @param k The number of items to choose
       @return The binomial coefficient C(n, k)
    */
    public static int binomialCoefficient(int n, int k){
        if(k == 0 || n == k){
            return 1;
        }
        return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
    }
    /* Method to calculate the greatest common divisor (GCD) of two numbers recursively.
         Time complexity: O(log(min(a, b))), where a and b are the input numbers.
         The method recursively calculates the GCD using the Euclidean algorithm.
         @param a The first number
         @param b The second number
         @return The GCD of a and b
      */
    public static int Gsd(int a, int b){
        if(b == 0){
            return a;
        }
        return Gsd(b, a%b);
    }


}
