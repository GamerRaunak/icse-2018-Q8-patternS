import java.util.*;
public class stringPattern
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for pattern 1: ");
        System.out.print("Enter 2 for pattern 2: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            String s="ABCDE";
            for(int i=s.length();i>0;i--)
            {
                System.out.println(s.substring(0,i));
            }
            break;

            case 2:
            s="BLUE";
            for(int i=0;i<s.length();i++)
            {
                for(int j=0;j<=i;j++)
                System.out.print(s.charAt(i));
                System.out.println();
            }
            break;

            default:
            System.out.println("WRONG CHOICE ENTERED");
        }//end of switch-case
    }//end of main()
}//end of class
