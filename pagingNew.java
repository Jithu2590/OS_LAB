import java.util.*;
public class paging {
	   public static void main(String args[])
	   {
		   Scanner s=new Scanner(System.in);
		  System.out.println("Enter page size : ");
		   int ps=s.nextInt();
		   System.out.println("Enter bits of logical add");
		   int n=s.nextInt();
		   int page[]=new int[(int)Math.pow(2, n)];  //logical pages
		   System.out.println("Enter bits of phy addr");
		   int m=s.nextInt();
		   int frame[]=new int[(int)Math.pow(2, m)];  // physical
		   System.out.println("Enter log add in binary : ");
		   String str=s.next();
		   int pageno=Integer.parseInt(str,2);
		   System.out.println(pageno);
		   System.out.println("Enter frame numbers : ");  
		   for (int i=0;i<4;i++)
			   page[i]=s.nextInt();
		   int num = (page[pageno/ps]*ps)+(pageno%ps);
		   System.out.println(num);
		   //System.out.println(Integer.toBinaryString(num));
	}
}
/*Enter page size : 
4
Enter bits of logical add
4
Enter bits of phy addr
4
Enter log add in binary : 
101
5
Enter frame numbers : 
0 2 1 2
9*/
