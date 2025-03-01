package chainoftesponsibility.logger;

import static chainoftesponsibility.logger.DebugLevel.ERROR;

public class ErrorLogProcessor extends LogProcessor
{
    public ErrorLogProcessor(LogProcessor nextLogProcessor)
    {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message)
    {
        if(logLevel == ERROR)
        {
            System.out.println("ERROR: " + message);
        }
        else
            super.log(logLevel, message);
    }
}
