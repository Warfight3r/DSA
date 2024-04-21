
public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 1010;
        int i = 0;
        int ans = 0;
        while(n > 0){
            int pos = n%10;
            double power = Math.pow(2, i);
            ans += power*pos;
            n /= 10;
            i++;
        }
        System.out.print(ans);
    }
}