public class Reverse_Recursion {
    public static void main(String[] args) {
        int n = 1234;
        Rev(n);
        System.out.println(num);
    }
    static int num = 0;
    public static void Rev(int n){
        if (n == 0){
            return ;
        }
        int rem = n%10;
        int N = n/ 10;
        num = num*10+rem;
        Rev(N);
    }
}
