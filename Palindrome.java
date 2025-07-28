import java.util.*;
class Palindrome{
    public static void main(String[]args){
        int num = 0101
        String s = "";
        while(num > 0){
            int n = num % 10;
            s += n;
            num = num / 10;
        }
        System.out.println(s);
    }
}
