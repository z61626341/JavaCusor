public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;

			for (String string : args) {
				sum += Long.parseLong(string);
			}
			System.out.printf("平均值: %f%n",(float) sum / args.length);
			
		
	}

}
