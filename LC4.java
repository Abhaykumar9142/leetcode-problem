//Roman to Integer conversion problem

//import java.util.Scanner;
//
//public class LC4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the roman number");
//        String roman = sc.nextLine();
//        int res = 0;
//        int[] val = new int[roman.length()];
//        for (int j = 0; j <roman.length(); j++) {
//            switch (roman.charAt(j)) {
//                case 'I':
//                    val[j] = 1;
//                    break;
//                case 'V':
//                    val[j] = 5;
//                    break;
//                case 'X':
//                    val[j] = 10;
//                    break;
//                case 'L':
//                    val[j] = 50;
//                    break;
//                case 'C':
//                    val[j] = 100;
//                    break;
//                case 'M':
//                    val[j] = 500;
//                    break;
//                case 'D':
//                    val[j] = 1000;
//                    break;
//                default:
//                    val[j] = 0;
//            }
//
//        }
//       for(int k=0;k<val.length-1;k++){
//    if(val[k]<val[k+1]){
//        res=res-val[k];
//    }
//    if(val[k]>=val[k+1])
//        res=res+val[k];
//    }
//
//       res+=val[val.length-1];
//        System.out.println(res);
//
//    }
//}
//
 //optimal solution
public class LC4 {

    public static void main(String[] args) {
        String s = "XLIX";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            int cur=value(s.charAt(i));
            if(i+1<s.length()){
                int next=value(s.charAt(i+1));
                if(cur<next){
                    res-=cur;
                }else {
                    res+=cur;
                }
            }else{
                res+=cur; //last character
            }
        }
        return res;}
    public static int value(char c){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'M':return 1000;
            case 'D':return 500;

        }
  return 0;
    }
}
