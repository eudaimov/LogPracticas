package log;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;

@Log4j
public class LombokLog4f {
    public static void mensajesLog(){
        BasicConfigurator.configure();
        log.warn("Mensaje con lombok y log4j");
    }

}
