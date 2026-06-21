import java.util.ArrayList;


public class Club {
    
    private String clubId;
    private String clubName;    
    private String coachName;
    private String stadium;
    private int foundedYear;
    private ArrayList<Player> players;
    private Player topGoal;
    private Player topAssist;

    public Club() {
        this.players = new ArrayList<>();
    }


    public void addPlayer(Player player) {
        if (player != null) {
            players.add(player);
        }
    }

    public void removePlayer(Player player) {
        if (player != null) {
            players.remove(player);
           
        }
    }

    
    public void showAllPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players in the club.");
            return;
        }
        System.out.println("=== PLAYER LIST OF " + this.clubName + " ===");
        for (Player p : players) {
           
            System.out.println(p.getPlayerId() + " | " + p.getFullName());
  
        }
    }

    public void transferPlayer(Player player, Club newClub) {
        if (player != null && newClub != null) {
            if (players.remove(player)) {
                newClub.addPlayer(player);
            }
        }
    }

    public void rankPlayer() {
        if (players.isEmpty()) return;

        Player bestGoalScorer = null;
        for (Player p : players) {
           
        }
        this.topGoal = bestGoalScorer;
        
        if (topGoal != null) {
            System.out.println("Top Scorer: " + topGoal.getFullName());
        }
    }
}