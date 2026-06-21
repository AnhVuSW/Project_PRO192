public class LeagueMatch extends MatchRecord {
    private int roundNumber; // Unique attribute for league matches (e.g., Round 5)

    // Constructor calling the superclass constructor
    public LeagueMatch(String matchId, String date, String opponentTeam, int roundNumber) {
        super(matchId, date, opponentTeam, "League");
        this.roundNumber = roundNumber;
    }

    // Overriding the abstract method to display specific league match info
    @Override
    public void displayMatchDetails() {
        System.out.println("===== LEAGUE MATCH DETAILS =====");
        System.out.println("Match ID: " + getMatchId());
        System.out.println("Date: " + getDate()); // Can access directly if protected, or via getter
        System.out.println("Opponent Team: " + getOpponentTeam());
        System.out.println("Match Type: " + getMatchType());
        System.out.println("Tournament Round: " + roundNumber);
        System.out.println("Regulations: Standard FIFA rules apply. Win = 3pts, Draw = 1pt, Loss = 0pts.");
        System.out.println("=================================");
    }

    // Getter and Setter for the unique attribute
    public int getRoundNumber() { return roundNumber; }
    public void setRoundNumber(int roundNumber) { this.roundNumber = roundNumber; }
}