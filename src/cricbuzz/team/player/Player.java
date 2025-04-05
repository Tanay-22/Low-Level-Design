package cricbuzz.team.player;

import cricbuzz.team.player.score.BattingScoreCard;
import cricbuzz.team.player.score.BowlingScoreCard;

public class Player
{
    private String name;
    private PlayerType playerType;
    private final BattingScoreCard battingScoreCard;
    private final BowlingScoreCard bowlingScoreCard;

    public Player(String name, PlayerType playerType)
    {
        this.name = name;
        this.playerType = playerType;
        this.battingScoreCard = new BattingScoreCard();
        this.bowlingScoreCard = new BowlingScoreCard();
    }

    public String getName()
    {
        return name;
    }

    public PlayerType getPlayerType()
    {
        return playerType;
    }

    public BattingScoreCard getBattingScoreCard()
    {
        return battingScoreCard;
    }

    public BowlingScoreCard getBowlingScoreCard()
    {
        return bowlingScoreCard;
    }

    public void printBattingScoreCard()
    {
        System.out.println("Batter\tRuns\tBalls\t4s\t6s\tStrike Rate");
        System.out.println(name + "\t" + battingScoreCard.getRuns() + "\t" + battingScoreCard.getBallsPlayed() +
                "\t" + battingScoreCard.getFours() + "\t" + battingScoreCard.getSixes() + "\t" + battingScoreCard.getStrikeRate() );
    }

    public void printBowlingScoreCard()
    {
        String overs = "" + (bowlingScoreCard.getBallsBowled() / 6) + (bowlingScoreCard.getBallsBowled() % 6);
        System.out.println("Bowler\tOvers\tRuns\tWicket\tEconomy\tNo ball\tWide");
        System.out.println(name + "\t" + overs + "\t" + bowlingScoreCard.getRunsGiven() + "\t" +
                bowlingScoreCard.getWicketsTaken() + "\t" + bowlingScoreCard.getEconomyRate() + "\t" +
                bowlingScoreCard.getNoBallsCount() + "\t" + bowlingScoreCard.getWideBallsCount());
    }
}
