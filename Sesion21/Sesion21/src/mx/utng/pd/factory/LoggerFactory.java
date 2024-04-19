package mx.utng.pd.factory;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {
    public boolean isFileLoggingEnabled(){
        Properties p= new Properties();
        try{
            p.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
            String fileLoggingValue=p.getProperty("FileLogging");
            if (fileLoggingValue.equalsIgnoreCase("ON")==true ){
                return true;
            }else{
                return false;
            }
        }catch (NullPointerException e) {
            return true;
        }catch (IOException e){
            return false;
        }
    }
    public Logger getLogger(){
        if (isFileLoggingEnabled()) {
            return new FileLogger();
        }else{
            return new ConsoleLogger();
        }
    }

    public Logger getLogger(int type){
        if(type==1){
            return new FileLogger();
        }else{
            return new ConsoleLogger();
        }
    }
}
