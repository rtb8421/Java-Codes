package Lab2;

public class Qs12 {
    public static void main(String[] args) {

        for(int i =1; i<=1000; i++){
            if(isStrong(i)){
                System.out.print(i+", ");
            }
        }
    }
    public static boolean isStrong(int n){
        int num = n;
        int sum=0;
        while(num!=0){
            int rem = num%10;
            int fact=1;
            for(int i=1; i<=rem; i++){
                fact = fact*i;
            }
            sum = sum+fact;
            num/=10;
        }
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }
}
