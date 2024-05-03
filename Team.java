
import java.util.ArrayList;
public class Team {
    private String shortName; //unique unchangeable
    private String fullName; //unique unchangeable
    private double totalValue;
    private int size;
    private static final int MAX_SIZE = 22; //constant
    ArrayList<Player>players= new ArrayList<Player>();
    

    Team(String shortName,String fullName){
    this.shortName=shortName;
    this.fullName=fullName;
    this.totalValue = 0;
    this.size = 0;
    }

    public static int getMAX_SIZE() {
        return MAX_SIZE;
    }
    
    public String getShortName(){
        return shortName;
    }
    public String getFullName(){
    return fullName;
    }
    public double getTotalValue(){
        for (Player player:players) {
            this.totalValue+=player.getMarket_value();
        }
        return this.totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
    public int getSize(){
    return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String toString(){
    return shortName+",name="+fullName+",Value="+this.totalValue+",Size="+this.size;
    }
}
