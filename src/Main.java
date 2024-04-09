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





        }
    }


    public static int findingMin(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findingMin(n - 1, arr));
    }
    public static double avarageArr(int n, int[] arr){
        if(n == 1){
            return arr[0];
        }
        return (arr[n-1] + (n-1)*avarageArr(n-1, arr)) / n;
    }
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
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int fibonachi(int n){
        if(n <= 1){
            return n;
        }
        return fibonachi(n-1) + fibonachi(n-2);
    }
    public static int apower(int number, int power){
        if(power == 1){
            return number;
        }
        return number * apower(number, power-1);
    }
    public static void reverseArr(int n, int[] arr){
        if(n == 1){
            System.out.print(arr[0] + " ");
            return;
        }
        System.out.println(arr[n-1] + " ");
        reverseArr(n-1, arr);
    }





}
