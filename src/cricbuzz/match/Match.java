package cricbuzz.match;

import cricbuzz.innings.InningDetails;
import cricbuzz.team.Team;

import java.util.Date;

public class Match
{
    private final Team homeTeam;
    private final Team awayTeam;
    private Date date;
    private String venue;
    private final InningDetails[] inningDetails;
}
