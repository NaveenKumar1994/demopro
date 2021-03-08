package demopro;

public class DataTex {

	public static void main(String[] args) {

		int a[]= {1,2,1,1,3,4,2};
		int f[] = new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++) {
			int count =1;
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					f[j]=visited;
					count++;
				}
			}
			
			if(f[i]!=visited)
				f[i]=a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			if(f[i]!=visited)
				System.out.println(f[i]);
		}
		
	}

}
