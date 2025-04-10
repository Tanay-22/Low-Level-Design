package water_sort_puzzle;

import java.util.List;

public class Game
{
    private final List<Tube> tubes;
    private int incompleteTubesLeft;

    public Game(List<Tube> tubes)
    {
        this.tubes = tubes;
        this.incompleteTubesLeft = tubes.size() - 2;
        printTubes();
    }

    public boolean pour(int fromIndex, int toIndex)
    {
        if (isIndexInvalid(fromIndex) || isIndexInvalid(toIndex))
            return false;

        Tube from = tubes.get(fromIndex);
        Tube to = tubes.get(toIndex);

        if (from.isEmpty() || to.isFull())
            return false;

        boolean pouredAny = false;
        // Keep pouring while:
        // 1. Source and destination colors match (or destination is empty)
        // 2. Source is not empty
        // 3. Destination is not full
        while (!from.isEmpty() && !to.isFull() && (to.isEmpty() || from.peekColor().equals(to.peekColor())))
        {
            Color color = from.popColor();
            to.pushColor(color);
            pouredAny = true; // At least one transfer happened
        }
        // Update game state if any pour occurred
        if (pouredAny)
        {
            if (to.isCompleted())
            {
                incompleteTubesLeft--;
            }
            printTubes();
            return true;
        }
        return false; // No pour happened
    }

    private boolean isIndexInvalid(int index)
    {
        return index < 0 || index >= tubes.size();
    }

    private void printTubes()
    {
        for (int i = 0; i < tubes.size(); i++)
        {
            tubes.get(i).printTube(i);
        }
    }

    public boolean isWon()
    {
        return incompleteTubesLeft == 0;
    }
}
