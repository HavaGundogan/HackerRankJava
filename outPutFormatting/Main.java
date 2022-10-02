package outPutFormatting;
import java.util.Scanner;

public class Main {

	   public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("================================");
	        for(int i=0;i<3;i++){
	            String s1=sc.next();
	            int x=sc.nextInt();
	            
	            System.out.printf("%-15s" , s1);
	            System.out.printf("%03d" , x);
	            System.out.println();
	        }
	        System.out.println("================================");

	         /*   Scanner in = new Scanner(System.in);
	            int t=in.nextInt();
	            for(int i=0;i<t;i++){
	                int a = in.nextInt();
	                int b = in.nextInt();
	                int n = in.nextInt();
	                
	             for(int j=0;j<=n-1;j++)
	             {
	                int sum=0;
	                sum+= (Math.pow(2,j))*b;
	                a=a+sum;
	                System.out.print((a)+" ");
	             }
	                System.out.println("");
	            }
	            in.close();*/
	        
	}

}
