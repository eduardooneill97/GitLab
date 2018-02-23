public class Area{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		boolean isDone=false;

		while(!isDone){
			int radius = in.nextInt();
			System.out.println(circleArea(radius);
			System.out.println("If you want to exit press -1, otherwise press 1");
			int continue = in.nextInt();
			if(continue == -1) isDone = true;
		}
	}
	
	public static double circleArea(double r){
		return Math.PI * r*r;
	}
}
