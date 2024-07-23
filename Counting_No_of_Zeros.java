public class Counting_No_of_Zeros {
    public static void main(String[] args) {
      int n = 504020;
        System.out.println(Count(n));
    }
    public static int Count(int n){
        return Helper(n,0);
    }
    public static int Helper(int n, int c){
        if (n == 0){
            return c;
        }
        int rem = n%10;
        int N = n/10;
        if ( rem == 0){
            return Helper(N,c+1);
        }
        return Helper(N,c);
    }
}
