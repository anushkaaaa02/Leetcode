class Solution{
    public int addDigit(int num){
        int sum = 0;
        int sum2 = 0;
        if(num<=9){
            return num;
        }
        if(num>9){
            while(num>0){
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            while(sum>9){
                int digit2 = sum % 10;
                sum2 = sum2 + digit2;
                sum = sum / 10;
            }
            sum = sum2;
        }
        return sum;
    }
}