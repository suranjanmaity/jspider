package normal;
import java.util.Scanner;
public class CharToHex {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int f = s.next().charAt(0);
        int l = s.next().charAt(0);
        for(int i=f;i<=l;i++)
        {
            System.out.println(Integer.toHexString(i));
        }
    }
}
