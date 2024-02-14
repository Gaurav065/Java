public class class3 {
    int x;
    int y;
    public class3(int a, int b){
        this.x = a;
        this.y = b; 
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
            sum += sum + digit^len;
            temp/ =10;
            len--;
        }
        return sum;
    }

    
    
}
