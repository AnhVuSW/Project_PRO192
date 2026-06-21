
public class Player extends Person {
    private String playerId;
    private String position;
    private int jerseyNumber;
    private int goals;
    private int matchesPlayed;
    private double marketValue;
    public Player(String playerId, String name, int age, String nationality, double height,double weight, String position, int jerseyNumber, int goals, int matchesPlayed, double marketValue, double salary) {
        super(name, age, nationality, height, weight, salary);
        this.playerId = playerId;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.goals = goals;
        this.matchesPlayed = matchesPlayed;
        this.marketValue = marketValue;
    }   
    public Player(){
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public String getPlayerId() {
        return playerId;
    }
  
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getGoals() {
        return goals;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }
       public void scoreGoal(){
        //tang so ban thang len 1
        goals++;
    }
    public void playMatch(){
        // tang so tran dau len 1
         matchesPlayed++;
    }
    public void updatePlayer(String playerName, int age, String nationality, String position, double marketValue, double height, double weight, double salary ){
        setName(playerName);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setSalary(salary);
        setNationality(nationality);
        setPosition(position);
        setMarketValue(marketValue);
    }
@Override
   public String toString(){
       return "Player ID: "  + playerId  
               + ", name: " + getName() 
               + ", Age: " + getAge() 
               + ", Nationality: " + getNationality() 
               + ", Height: " + getHeight() 
               + ", Weight: " + getWeight() 
               + ", Position: " + position
               + ", jerseyNumber: " + jerseyNumber
               + ", Goals: " +goals
               + ", MatchesPlayed: " + matchesPlayed 
               + ", Salary: $" + getSalary()
               + ", MarketValue: $" + marketValue + "M";
   }
}