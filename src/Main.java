public class Main {

    public static void main(String[] args) {
	// This app creates 2D array of size 10x10 and fills it with some numbers.
        int[][] twoD_arr = new int[10][10];
        int sum = 0;
        for (int i = 0; twoD_arr.length > i; i++)
        {
            for (int j = 0; twoD_arr.length > j; j++)
            {
                if (i == j)
                {
                    twoD_arr[i][j] = i;
                    sum += j;
                }
                else
                {
                    twoD_arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; twoD_arr.length > i; i++)
        {
            for (int j = 0; twoD_arr.length > j; j++)
            {
                System.out.print(twoD_arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Sum of the numbers on diagonal: " + sum);
    }
}
