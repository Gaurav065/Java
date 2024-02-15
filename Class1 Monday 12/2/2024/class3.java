public class class3 {
    int x;
    
    public class3(int a){
        this.x = a;
        
    }
    public int count(int n){
        int len  = 0;
        while (n!=0) {
            n/=10;
            len++;
        }
        return len;
    }
    public int dis(int num, int len){
        int temp = num;
        int sum = 0;
        while(temp!=0){
            int digit  = temp%10;
            sum +=  Math.pow(digit, len);
            temp/=10;
            len--;
        }
        return sum;
    }
    public boolean check(int n){
        int len = count(n);
        int sum = dis(n, len);
        // if (sum==n){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return sum==n;
    }
    public static void main(String[] args) {
        class3 c3 = new class3(135);

        // System.out.println(c3.dis(89, 2));
        if(c3.check(c3.x)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
