import java.util.Date;

public class Match {
    private String matchId;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private Date matchDate;
    private String stadium;

    public Match(String matchId, String homeTeam, String awayTeam, Date matchDate, String stadium) {
        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.matchDate = matchDate;
        this.stadium = stadium;
        this.homeScore = 0;
        this.awayScore = 0;
    }
    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
    
    public void startMatch() {
        System.out.println("Match " + matchId + ": " + homeTeam + " vs " + awayTeam + " at " + stadium + " has started!");
    }

    public void updateScore(int newHomeScore, int newAwayScore) {
        this.homeScore = newHomeScore;
        this.awayScore = newAwayScore;
        System.out.println("Score updated: " + homeTeam + " " + homeScore + " - " + awayScore + " " + awayTeam);
    }

    public void displayResult() {
        System.out.println("Final Result: " + homeTeam + " " + homeScore + " - " + awayScore + " " + awayTeam);
    }

    public void recordGoal(String teamName) {
        if (teamName.equals(this.homeTeam)) {
            this.homeScore++;
            System.out.println("GOAL! " + homeTeam + " scores!");
        } else if (teamName.equals(this.awayTeam)) {
            this.awayScore++;
            System.out.println("GOAL! " + awayTeam + " scores!");
        } else {
            System.out.println("Invalid team name for this match.");
        }
    }

    
}