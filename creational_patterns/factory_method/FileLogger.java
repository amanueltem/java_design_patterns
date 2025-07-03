public class FileLogger implements  Logger{
	public void log(String msg){
		System.out.println("writing to log.txt ..."+msg);
	}
}
