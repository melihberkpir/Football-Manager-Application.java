
public class Player {
    private static int backnumber=1 ; //unique unchangeable
    private String name;
    private String position;
    private double market_value;
    private Team previous_team;
    private Team current_team;
    Player(String name,int backnumber, String position) {
        this.name=name;
        this.backnumber=backnumber;
        this.position=position;
        this.current_team = null; // Initially no team
        this.previous_team = null; // Initially no team
    }   
    public int getBackNumber(){
    return backnumber;
    }

    public Team getPrevious_team() {
        return previous_team;
    }
    public Team getCurrent_team() {
        return current_team;
    }
    public String getName(){
    return name;
    }

    public String getPosition() {
        return position;
    }
    public String toString(){
    return name+",backNumber="+this.backnumber+",position="+this.position+",marketValue="+this.getMarket_value();
    }
    public void setMarketValue(double newValue){
    this.market_value=newValue;
    }
    public void setPrevious_team(Team previous_team) {
        this.previous_team = previous_team;
    }
    public void setCurrent_team(Team current_team) {
        this.current_team = current_team;
    }
    public void setPosition(String newPosition){
    this.position=newPosition;
    }
    public double getMarket_value() {
        return market_value;
    }
}
