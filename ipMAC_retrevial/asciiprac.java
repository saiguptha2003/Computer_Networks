import java.util.Scanner;
public class asciiprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s=sc.next().charAt(0);
        int ascii = s;
        System.out.println("entered Character :"+s);
        System.out.println("bin :"+Integer.toBinaryString(ascii));
        System.out.println("hex :"+Integer.toHexString(ascii));
        System.out.println("ascii :"+ascii);
        String t=Integer.toBinaryString(ascii);
        int count=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='1')
            count=+1;
        }
        if(count%2==0){
            System.out.println("even padding:"+"0");
        }
        else{
            System.out.println("even padding:"+'1');
        }
    }
}