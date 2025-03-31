package behavioral.chainOfResponsibility.logger;

public abstract class LogProcessor
{

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor)
    {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message)
    {
        if(nextLogProcessor != null)
        {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
