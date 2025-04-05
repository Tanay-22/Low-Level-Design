package cricbuzz.match;

public class T20Match implements MatchType
{
    @Override
    public int getTotalNoOfOvers()
    {
        return 20;
    }

    @Override
    public int getNoOfOversPerBowler()
    {
        return 4;
    }
}
