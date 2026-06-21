public class FriendlyMatch extends MatchRecord {
    private String stadiumName;
    
    public FriendlyMatch(String matchId, String date, String opponentTeam, String stadiumName) {
        super(matchId, date, opponentTeam, "Friendly");
        this.stadiumName = stadiumName;
    }

    @Override
    public void displayMatchDetails() {
        System.out.println("===== FRIENDLY MATCH DETAILS =====");
        System.out.println("Match ID: " + getMatchId());
        System.out.println("Date: " + getDate()); 
        System.out.println("Opponent Team: " + getOpponentTeam());
        System.out.println("Stadium: " + stadiumName);
        System.out.println("Regulations: No points awarded. Unlimited substitutions.");
        System.out.println("==================================");
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }
}