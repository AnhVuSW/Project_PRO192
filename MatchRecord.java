/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUNG NGUYEN
 */
public class MatchRecord {
    private String matchId;
    private String date;
    private String opponentTeam;
    private String matchType; 

    
    public MatchRecord(String matchId, String date, String opponentTeam, String matchType) {
        this.matchId = matchId;
        this.date = date;
        this.opponentTeam = opponentTeam;
        this.matchType = matchType;
    }

    
    public abstract void displayMatchDetails();

    public String getMatchId() { 
        return matchId; 
    }

    public void setMatchId(String matchId) { 
        this.matchId = matchId; 
    }

    public String getDate() { 
        return date; 
    }

    public void setDate(String date) { 
        this.date = date; 
    }

    public String getOpponentTeam() { 
        return opponentTeam; 
    }

    public void setOpponentTeam(String opponentTeam) { 
        this.opponentTeam = opponentTeam; 
    }

    public String getMatchType() { 
        return matchType; 
    }

    public void setMatchType(String matchType) { 
        this.matchType = matchType; 
    }
    
}
