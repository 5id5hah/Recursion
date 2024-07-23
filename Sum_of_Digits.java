public class Sum_of_Digits {
    public static void main(String[] args) {
        int n = 12345;
        int x =  Sum(n);
        System.out.println(x);
    }

    public static int Sum(int n) {
        int num = 0;
        if (n == 0){
            return 0;
        }
            int rem = n % 10;
            int N = n/ 10;
            num=rem+Sum(N);


        return num;
    }
}
