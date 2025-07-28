import java.util.*;
class Palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int temp = 0;
        while(num > 0){
            int n = num % 10;
            temp = (num * 0) + n;
            num = num / 10;
        }
        System.out.println(temp);
    }
}