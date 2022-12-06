package sorting;

public class stringQuestion {
    public static void main(String[] args) {
        String aws = skip2("baccad");
        System.out.println(aws);
//        for (int i =0; i < word.length(); i++){
//            char ch = word.charAt(i);
//            if(ch == 'a'){
//                ans = ans + "";
//            }
//            else {
//                ans = ans + ch;
//            }
//        }
//        System.out.println(ans);
    }

    static void skip(String ans, String word){
        if(word.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = word.charAt(0);
        if(ch == 'a'){
            skip(ans, word.substring(1));
        }else {
            skip(ans + ch, word.substring(1));
        }
    }

    static String skip2(String word){
        if(word.isEmpty()){
            return "";
        }

        char ch = word.charAt(0);
        if(ch == 'a'){
            return skip2(word.substring(1));
        }else{
            return ch + skip2(word.substring(1));
        }
    }

//    skip a string

    static String skipApple(String word){
        if(word.isEmpty()){
            return "";
        }
        if(word.startsWith("apple")){
            return skipApple(word.substring(5));
        }else {
            return word.charAt(0)  + skipApple(word.substring(1));
        }
    }

    static String skipAppNotApple(String word){
        if(word.isEmpty()){
            return "";
        }
        if(word.startsWith("app") && !word.startsWith("apple")){
            return skipAppNotApple(word.substring(3));
        }else {
            return word.charAt(0)  + skipAppNotApple(word.substring(1));
        }
    }
}
