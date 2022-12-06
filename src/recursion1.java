import java.util.Scanner;

public class recursion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 1;
        int e = sc.nextInt();
        recur(s,e);
    }

    static public void recur(int start, int end){
        if(start > end){
            return;
        }
        System.out.println(start);
//        System.out.println("Shiwam");
        recur(start+1,end);
    }
}
