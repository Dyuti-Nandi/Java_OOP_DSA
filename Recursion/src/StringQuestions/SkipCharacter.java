package StringQuestions;

public class SkipCharacter {
    public static void main(String[] args) {
//        skip("", "baccahd");
        System.out.println(skip2("bacchada"));
    }
//    In Java, the substring() method of the String class is used to extract a portion of a string, creating a new String object.
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    public static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           return skip2(up.substring(1));
        }else{
            return ch+skip2(up.substring(1));
        }
    }
}
