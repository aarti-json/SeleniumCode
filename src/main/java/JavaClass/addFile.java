package JavaClass;

public class addFile {
	int a ;
	int b;
	int c;
	
	public void add(int a , int b){
	
		this.a= a;
		this.b=b;
		
		c= a+b;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		
		addFile add = new addFile();
		
		add.add(12, 78);
	
	}

}
