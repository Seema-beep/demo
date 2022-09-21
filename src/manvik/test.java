package manvik;
import java.io.*;


public class test {
	
	public static void main(String []args)
	{
		FileWriter fw=new FileWriter("C:\\Users\\catch\\OneDrive\\Desktop");
		fw.write("\nurga Software Solutions");
		fw.write(100);
		fw.write('\n');
		char[]ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write('\n');
		fw.flush();
		fw.close();
	}
		
		
	
}
	

}
