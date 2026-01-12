public class LC3 {
//    public static boolean palindrome(int x) {
//        String str1 = "";
//        String str = str1.valueOf(x);
//        String str2 = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            str2 += str.charAt(i);
//            if (str.equals(str2)) {
//                return true;
//            }
//        }
//        return false;
//    }

public static boolean palindrome(int x){
    if(x<0){
        return false;
    }
    int rev=0;
    int original=x;
    while(x!=0){
        int digit=x%10;
        rev=rev*10+digit;
        x=x/10;
    }
    return original==rev;
}
public static void main(String[] args) {
 boolean result=palindrome(101);
    System.out.println(result);    }
}
