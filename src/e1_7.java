public class e1_7{
	public static void main(String[] args){
	System.out.println("智科1班 赖楚芸 222020335220187");
	double a=1;
	double times=1e+9;
	for (double i=3;i<times ;i+=4) {
		a=a-1/i;
	}
	for (double j=5;j<times ;j+=4 ) {
			a=a+1/j;
			}	
	System.out.println(4*a);
	}
}