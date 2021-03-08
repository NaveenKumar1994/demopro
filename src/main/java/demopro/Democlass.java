package demopro;

import java.util.Scanner;

public class Democlass {

	public static int findMax(int n[]) {
		int max=n[0];
		for(int i=0;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a,b,n;
        for(int i=0;i<t;i++){
            a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * int a[] = { 3, 2, 4, 5, 1, 2 }; int temp;
		 */
		/*
		 * Singleton s = Singleton.getInstance(); Singleton s1 =
		 * Singleton.getInstance();
		 * 
		 * s.str = s.str.toUpperCase(); System.out.println(s.str);
		 * System.out.println("----------------"); s.str = s.str.toLowerCase(); S
		 *ystem.out.println(s.str);

		

		/*
		 * for(int i=0;i<a.length;i++) { System.out.print(a[i]); for(int j
		 * =0;j<a.length;j++) { if(a[i]<a[j]) { temp=a[i]; a[i]=a[j]; a[j]=temp; } } }
		 * System.out.print("-----------------------------"); System.out.println();
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */

		/*
		 * int a[] = new int[] { 8, 2, 2, 3, 4, 1 }; Set<String> s = new
		 * HashSet<String>(); int b[] = new int[a.length]; int max = a[0]; for (int i =
		 * 0; i < a.length; i++) { for (int j = i + 1; j < a.length; j++) { if (max <
		 * a[i]) { max = a[i]; }
		 * 
		 * b[i] = max; } }
		 */

		/*
		 * int max=a[0]; int min=a[0]; for(int i=0;i<a.length;i++) { if(min>a[i])
		 * min=a[i]; } System.out.println(min);
		 */

		/*
		 * for (String string : names) { if (!s.add(string)) System.out.println(string);
		 * 
		 * }
		 */

		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = i + 1; j < a.length; j++) {
		 * if (a[i] == a[j]) System.out.println(); else System.out.println(a[i]); } }
		 */

	}

}
