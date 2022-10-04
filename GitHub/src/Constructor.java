
public class Constructor {
	int a ;
	int b;
	int c;
	public Constructor(int n,int m) {
		a = n;
		b =m;
		c= a+b;
	}
	public void  Addition() {
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Constructor c = new Constructor(10,20);
		         c.Addition();
	}

}
