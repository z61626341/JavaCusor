public class StringAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();

//最慢////////////////////////////////////////////////////////////////////////////	
		for (int i = 0; i < 100; i++) {
			System.out.print(i);  
			if ( i !=100) { 
				System.out.print('+');
				 
			}
		}
//良認為比上面快///////////////////////////////////////////////////////////////////////		
//		for(int i = 1; i < 100; i++) {
//		    System.out.printf("%d+", i);
//		}
//		System.out.println(100);
//慢//////////////////////////////////////////////////////////////////////////////	
//		for(int i = 1; i < 100; i++) {
//		    System.out.print("+"+ i);
//		}
//		System.out.println(100);
//快//////////////////////////////////////////////////////////////////////////////
//		String text = "";
//		for(int i = 1; i < 100; i++) {
//		    text = text + i + '+';
//		}
//		System.out.println(text + 100);
//最快////////////////////////////////////////////////////////////////////////////
//        StringBuilder builder = new StringBuilder();
//        for (int i = 1; i < 100; i++) {
//            builder.append(i).append('+');
//        }
//        System.out.println(builder.append(100).toString());
////////////////////////////////////////////////////////////////////////////////

		long endTime = System.nanoTime();
		System.out.println("\n執行時間 : " + (endTime - startTime) + " ns");
		
	}

}
