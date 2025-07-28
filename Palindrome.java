import java.util.*;
class Palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int num = 135;
        String s = "";
        while(num > 0){
            int n = num % 10;
            s += n;
            num = num / 10;
        }
        System.out.println(s);
    }
}
