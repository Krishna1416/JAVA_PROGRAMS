import java.io.File;

public class FileReadDemo {

	public static void main(String[] args) {
		File file= new File("E:\\Sample.txt");
		String str[]=file.list();
		System.out.println(str);

	}

}
