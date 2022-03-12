package Package;
public class Task5 {
	public static void main(String[] args) {
		int a=84;
		int b=90;
		int c=76;
		if (a<b&&a<c) {System.out.println(a);
		
			if (b<c) {System.out.println(b);
			System.out.println(c);}
			else if(c<b) {System.out.println(c);
			System.out.println(b);}	
		}
		else if (b<a&&b<c) {System.out.println(b);

			if (a<c) {System.out.println(a);
				System.out.println(c);}
			else if (c<a) {	System.out.println(c);
			System.out.println(a);}
		}
		else if (c<a&&c<b) {System.out.println(c);
		
			if (a<b) {System.out.println(a);
			System.out.println(b);}
			else if (b<a) {System.out.println(b);
			System.out.println(a);}	
		}
		 
		
		
		}
		
//		else if (a<b&&a<c) {System.out.print(a);}
//		else if (b<a&&b<c) {System.out.print(b);}
		
	}

