package StringQuestions;

import java.util.ArrayList;

public class SubseqAscii {
        public static void main(String[] args) {
//        subseqAscii("", "abc");
            System.out.println(subseq2Ascii("", "abc"));
        }

        public static void subseqAscii(String p, String up){
            if(up.isEmpty()){
                System.out.println(p);
                return;
            }
            char ch = up.charAt(0);
            subseqAscii(p+ch, up.substring(1));
            subseqAscii(p, up.substring(1));
            subseqAscii(p+(ch+0), up.substring(1));
        }

        public static ArrayList<String> subseq2Ascii(String p, String up) {
            if (up.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            char ch = up.charAt(0);
            ArrayList<String> left = subseq2Ascii(p + ch, up.substring(1));
            ArrayList<String> right = subseq2Ascii(p, up.substring(1));
            ArrayList<String> ascii = subseq2Ascii(p+(ch+0), up.substring(1));

            left.addAll(right);
            left.addAll(ascii);
            return left;
        }
}
