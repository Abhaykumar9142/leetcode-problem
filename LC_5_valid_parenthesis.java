//import java.util.Stack;
//
//public class LC_5_valid_parenthesis {
//    public static void main(String[] args) {
//        String s="[{{{{({()})}}}}]";
//        Stack<Character>st=new Stack<>();
//        int i=0;
//        int half=s.length()/2;
//        while(i<half){
//          char match= rev(s.charAt(i));
//            st.push(match);
//            i++;
//        }

import java.util.Stack;

////        System.out.println(st);
//        i=half;
//        while(i<s.length()){
//            if(st.peek()==s.charAt(i)){
//                System.out.println("match");
//                st.pop();
//            }else{
//                System.out.println("Invalid parenthesis order");
//                break;
//            }
//            i++;
//        }
//    }
//    public static Character rev(char c){
//        switch (c){
//            case '[':return ']';
//            case '(':return ')';
//            case '{':return '}';
//        }
//        return c;
//    }
//}

public class LC_5_valid_parenthesis {
    public static void main(String[] args) {
        String s = "({{}})";
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ')' && top != '(') {
                    return false;
                }
            }
        }
        return false;
    }
}