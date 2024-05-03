public class Contract {
    private  String type;
    private double value;
    private  Player player;
    private  Team team;

    public Contract(Player player, Team team, String type, double value) {
        this.player = player;
        this.team = team;
        this.type = type;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    
    public String toString() {
        return  "player=" + player.getName() + ", team=" + team.getFullName()+ ", type=" + type + ", value=" + value;
    }

    public Player getPlayer() {
        return player;
    }

    public Team getTeam() {
        return team;
    }
   
    
    public void setValue(double newValue){
    this.value= newValue;
    }

    public String getType() {
        return type;
    }
    
    public void setType(String type){
        if (this.type==type) {
            System.out.println("Contract type already that");
        }
        else{
        this.type=type;
        }
    }
}