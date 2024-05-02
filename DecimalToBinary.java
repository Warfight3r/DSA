public class DecimalToBinary {
    public static void main(String args[]){
        int n = 13;
        int ans = 0;
        int l = 0;
        while(n > 0){
            int pos = n%2;
            ans += pos*Math.pow(10,l);
            n /= 2;
            l++;
        }
        System.out.println(ans);
    }
}
