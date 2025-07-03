public class LoggerFactory{
	public boolean isFileLoggingEnabled(){
		System.out.println("reading from logger.proporties");
		String fileLoggingValue="getPropertiy(FileLogging)";
		if(fileLoggingValue.equalsIgnoreCase("ON"))
			return true;
		else return false;
	}
	//Factory Method
	public Logger getLogger(){
		if(isFileLoggingEnabled())
			return new FileLogger();
		else 
			return new ConsoleLogger();
	}
}
