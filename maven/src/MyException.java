import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		InputStream in = null;
//		try{
//			try {
//				in = new FileInputStream("D:\\test2.txt");
//				int s =0;
//				while((s=in.read()) != -1){
//					System.out.print((char)s);
//				}
//			} finally {
//				if(in != null) in.close();
//				System.out.println("finally----2");
//			}
//		} catch (FileNotFoundException e) {
//			//System.out.println("FileNotFoundException");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("IOException");
//			//e.printStackTrace();
//		}
		
		List list1 = new ArrayList();
		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}
		List list2 = list1;
		
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			Integer name = (Integer) iterator.next();
			if(name%2==0){
				iterator.remove();
			}
		}
		
		for (Object object : list2) {
			System.out.print(object +"\t");
		}
		
		for (Object object : list1) {
			System.out.print(object +"\t");
		}
	}

}
