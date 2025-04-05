package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context
{
    private final Map<String, Integer> contextMap;

    public Context()
    {
        this.contextMap = new HashMap<>();
    }

    public void put(String strVariable, int intValue)
    {
        contextMap.put(strVariable, intValue);
    }

    public int get(String strVariable)
    {
        return contextMap.get(strVariable);
    }
}
