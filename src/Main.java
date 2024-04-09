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
}
