package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker
{
    private final List<ConfigurationMemento> history;

    public ConfigurationCareTaker()
    {
        this.history = new ArrayList<>();
    }

    public void addMemento(ConfigurationMemento memento)
    {
        history.add(memento);
    }

    public ConfigurationMemento undo()
    {
        if (!history.isEmpty())
        {
            ConfigurationMemento lastMemento = history.get(history.size() - 1);
            history.remove(history.size() - 1);
            return lastMemento;
        }
        return null;
    }
}
