package cricbuzz.match;

public class OneDayMatch implements MatchType
{
    @Override
    public int getTotalNoOfOvers()
    {
        return 50;
    }

    @Override
    public int getNoOfOversPerBowler()
    {
        return 10;
    }
}
