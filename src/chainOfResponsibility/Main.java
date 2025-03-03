package chainOfResponsibility;

import chainOfResponsibility.logger.DebugLogProcessor;
import chainOfResponsibility.logger.ErrorLogProcessor;
import chainOfResponsibility.logger.InfoLogProcessor;
import chainOfResponsibility.logger.LogProcessor;
import chainOfResponsibility.logger.DebugLevel;

public class Main
{
    public static void main(String[] args)
    {
        LogProcessor log = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
        // chain is info -> error -> debug

        log.log(DebugLevel.ERROR, "Exception !!");
        log.log(DebugLevel.DEBUG, "Needs to debug this");
        log.log(DebugLevel.INFO, "just for info");
        log.log(56, "hui");
    }
}
