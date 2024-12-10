
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("1 is neither prime nor composite");
        }
        else
        {
            for(i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    System.out.println("the number " + n + " is composite");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("the number " + n + " is prime");
            }
        }
    }
}