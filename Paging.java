import java.util.*;
import java.lang.*;
class Paging {
    static int exponentof2(int a) {
        int c = 0;
        while (a != 1) {
            a = a / 2;
            c = c + 1;
        }
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bits in logical address : ");
        int m = sc.nextInt();
        System.out.println("Enter the page size in bytes : ");
        int p = sc.nextInt();
        int pageoffset = exponentof2(p);
        System.out.println("Enter no of bits in physical address : ");
        int n = sc.nextInt();
        int laddrspace = (int) Math.pow(2, m);
        int paddrspace = (int) Math.pow(2, n);
        int pages = laddrspace / p;
        int frames = paddrspace / p;
        int page[] = new int[pages];
        int frame[] = new int[frames];
        table(page, pages, frame, frames);
        System.out.println("Enter the logical address : ");
        int laddr = sc.nextInt();
        int paddr = physical(laddr, page, pages, frame, frames, p);
    }
    static void table(int page[], int pages, int frame[], int frames) {
        int f, i;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < frames; i++)
            frame[i] = -1;
        for (i = 0; i < pages; i++) {
            System.out.print("Enter frame number for page - " + i + ":");
            f = sc.nextInt();
            page[i] = f;
            frame[f] = i;
            System.out.println();
        }
        System.out.println("Pageno\tFrameno");
        for (i = 0; i < pages; i++) {
            System.out.println(i + "\t" + page[i]);
        }
        System.out.println("Frameno\tpageno");
        for (i = 0; i < frames; i++) {
            System.out.println(i + "\t" + frame[i]);
        }
    }
    static int physical(int laddr, int page[], int pages, int frame[], int frames, int p) {
        int pageno = laddr / p;
        int d = laddr % p;
        int paddrr = page[pageno] * p + d;
        System.out.println(paddrr);
        return paddrr;
    }
}

/*OUTPUT
Enter no of bits in logical address : 
4
Enter the page size in bytes : 
4
Enter no of bits in physical address : 
4
Enter frame number for page - 0:0

Enter frame number for page - 1:2

Enter frame number for page - 2:1

Enter frame number for page - 3:2

Pageno  Frameno
0       0
1       2
2       1
3       2
Frameno pageno
0       0
1       2
2       3
3       -1
Enter the logical address : 
5
9
*/
