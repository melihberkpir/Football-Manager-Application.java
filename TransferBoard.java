
import java.util.ArrayList;

public class TransferBoard {

    ArrayList<Contract> contracts = new ArrayList<Contract>();
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Team> teams = new ArrayList<Team>();

    public TransferBoard() {
        populateTeams();
        populatePlayers();
 
        makeContract("Muslera", "GS", "Permanent", 60000);
        makeContract("Kaan", "GS", "Permanent", 8000);
        makeContract("Toreira", "GS", "Permanent", 5000);
        makeContract("Icardi", "GS", "Permanent", 55000);
        makeContract("Kerem", "GS", "Permanent", 45000);
        makeContract("Abdulkerim", "GS", "Permanent", 34000);
        makeContract("Oliveira", "GS", "Permanent", 23000);
        makeContract("Mertens", "GS", "Permanent", 56000);
        makeContract("Bakambu", "GS", "Permanent", 78000);
        makeContract("Nellson", "GS", "Permanent", 45900);
        makeContract("Boey", "GS", "Permanent", 65000);

        makeContract("İrfan Can", "FB", "Permanent", 76000);
        makeContract("Osayi", "FB", "Permanent", 10000);
        makeContract("Oosterwolde", "FB", "Permanent", 47000);
        makeContract("Djiku", "FB", "Permanent", 90000);
        makeContract("Serdar", "FB", "Permanent", 230000);
        makeContract("King", "FB", "Permanent", 67000);
        makeContract("Dzeko", "FB", "Permanent", 92000);
        makeContract("Krunic", "FB", "Permanent", 87000);
        makeContract("Zajc", "FB", "Permanent", 45700);
        makeContract("Fred", "FB", "Permanent", 76000);
        makeContract("İsmail", "FB", "Permanent", 34000);
        makeContract("Peres", "FB", "Permanent", 23700);
        makeContract("Szymanski", "FB", "Permanent", 76000);
        makeContract("Becao", "FB", "Permanent", 54800);
        makeContract("Çağlar", "FB", "Permanent", 48700);

        makeContract("Masuaku", "BJK", "Permanent", 96000);
        makeContract("Amartey", "BJK", "Permanent", 30400);
        makeContract("Rashica", "BJK", "Permanent", 62000);
        makeContract("Gökhan", "BJK", "Permanent", 23700);
        makeContract("Tayfur", "BJK", "Permanent", 23400);
        makeContract("Muci", "BJK", "Permanent", 92400);
        makeContract("Emrecan", "BJK", "Permanent", 27400);
        makeContract("Umut", "BJK", "Permanent", 34900);
        makeContract("Salih", "BJK", "Permanent", 28700);
        makeContract("Muleka", "BJK", "Permanent", 34890);
        makeContract("Hadziahmetovic", "BJK", "Permanent", 37900);
        makeContract("Ghezzal", "BJK", "Permanent", 234500);
        makeContract("Al-Musrati", "BJK", "Permanent", 92360);
    }

    public void populateTeams() {
        teams.add(new Team("FB", "Fenerbahçe"));
        teams.add(new Team("GS", "Galatasaray"));
        teams.add(new Team("BJK", "Beşiktaş"));
        teams.add(new Team("TS", "Trabzonspor"));
        teams.add(new Team("ANK", "Ankaragücü"));
        teams.add(new Team("BSK", "Başakşehir"));
        teams.add(new Team("KGM", "Karagümrük"));

        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).toString());
        }
    }

    public void populatePlayers() {
        players.add(new Player("Muslera", 1, "Goalkeeper"));
        players.add(new Player("Kaan", 22, "Defence"));
        players.add(new Player("Toreira", 34, "Midfield"));
        players.add(new Player("Icardi", 99, "Forward"));
        players.add(new Player("Kerem", 7, "Midfield"));
        players.add(new Player("Abdulkerim", 17, "Defence"));
        players.add(new Player("Oliveira", 20, "Midfield"));
        players.add(new Player("Mertens", 10, "Midfield"));
        players.add(new Player("Bakambu", 9, "Forward"));
        players.add(new Player("Nellson", 4, "Defence"));
        players.add(new Player("Boey", 2, "Defence"));
        players.add(new Player("İrfan Can", 97, "Goalkeeper"));
        players.add(new Player("Osayi", 21, "Defence"));
        players.add(new Player("Oosterwolde", 24, "Defence"));
        players.add(new Player("Djiku", 6, "Defence"));
        players.add(new Player("Serdar", 97, "Forward"));
        players.add(new Player("King", 15, "Forward"));
        players.add(new Player("Dzeko", 30, "Forward"));
        players.add(new Player("Krunic", 33, "Midfield"));
        players.add(new Player("Zajc", 26, "Midfield"));
        players.add(new Player("Fred", 35, "Midfield"));
        players.add(new Player("İsmail", 5, "Midfield"));
        players.add(new Player("Peres", 14, "Defence"));
        players.add(new Player("Szymanski", 53, "Midfield"));
        players.add(new Player("Becao", 50, "Defence"));
        players.add(new Player("Masuaku", 98, "Defence"));
        players.add(new Player("Amartey", 12, "Defence"));
        players.add(new Player("Rashica", 11, "Forward"));
        players.add(new Player("Gökhan", 88, "Midfield"));
        players.add(new Player("Tayfur", 75, "Midfield"));
        players.add(new Player("Muci", 23, "Midfield"));
        players.add(new Player("Emrecan", 79, "Defence"));
        players.add(new Player("Umut", 77, "Defence"));
        players.add(new Player("Salih", 8, "Midfield"));
        players.add(new Player("Çağlar", 3, "Defence"));
        players.add(new Player("Muleka", 40, "Forward"));
        players.add(new Player("Hadziahmetovic", 19, "Midfield"));
        players.add(new Player("Ghezzal", 18, "Midfield"));
        players.add(new Player("Al-Musrati", 28, "Midfield"));

        players.add(new Player("Colley", 90, "Defence"));
        players.add(new Player("Ege", 81, "Midfield"));
        players.add(new Player("Efekan", 70, "Midfield"));
        players.add(new Player("Aurier", 92, "Defence"));
        players.add(new Player("Efe", 94, "Forward"));
        players.add(new Player("Emre", 24, "Midfield"));
        players.add(new Player("Ertuğrul", 85, "Goalkeeper"));
        players.add(new Player("Ali", 58, "Defence"));
        players.add(new Player("Ziyech", 22, "Forward"));
        players.add(new Player("Ndombele", 91, "Midfield"));

        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).toString());
        }
    }

    public String makeContract(String playerName, String teamName, String contractType, double contractValue) {
       
        Player player = null;
        Team team = null;
        Contract contract = null;

        boolean player_found = false;

        for (int i = 0; i < players.size(); i++) {
            player = players.get(i);
            if (player.getName().equals(playerName)) {
                player_found = true;
                break;
            }
        }
        if (!player_found) {
            return "Unknown Player";
        }
        boolean team_found = false;
        for (int i = 0; i < teams.size(); i++) {
            team = teams.get(i);
            if (team.getFullName().equals(teamName) || team.getShortName().equals(teamName)) {
                team_found = true;
                break;
            }

        }
        if (!team_found) {
            return "Unknown Team";
        }
        boolean contract_found = false;
        for (int i = 0; i < contracts.size(); i++) {
            contract = contracts.get(i);
            if (contract.getPlayer().getName().equals(playerName) && contract.getType().equals("Rented")) {
                return "Contract not possible";

            }
            if (contract.getPlayer().getName().equals(playerName)
                    && contract.getTeam().getShortName().equals(teamName)
                    || contract.getTeam().getFullName().equals(teamName)) {
                contract_found = true;
                break;

            }

        }
        if (team.getSize() >= team.getMAX_SIZE()) {
            return "ExceedingMaxNumPlayers";
        }
        if (contract_found) {
            return "Existing Contract";
        }
        if (null == player.getCurrent_team() && contractType.equals("Rented")) {
            return "InvalidContractType";

        }
        if (player.getCurrent_team()!=null) {
            terminateContract(playerName,player.getCurrent_team().getFullName());
        }
        contracts.add(new Contract(player, team, contractType, contractValue));
        player.setCurrent_team(team);
        player.setMarketValue(contractValue);
        team.setSize(team.getSize() + 1);
        team.setTotalValue(team.getTotalValue() + contractValue);

        return "SuccessfullyContracted";

    }

    public String terminateContract(String playerName, String teamName) {       
        Player player_Term = null;
        Team team_Term = null;
        Contract current_contract = null;
        Contract new_contract = null;

        boolean player_found = false;
        for (int i = 0; i < players.size(); i++) {
            player_Term = players.get(i);
            if (player_Term.getName().equals(playerName)) {
                player_found = true;
                break;
            }
        }
        if (!player_found) {
            return "Unknown Player";
        }
        boolean team_found = false;
        for (int i = 0; i < teams.size(); i++) {
            team_Term = teams.get(i);
            if (team_Term.getFullName().equals(teamName) || team_Term.getShortName().equals(teamName)) {
                team_found = true;
                break;
            }
        }
        if (!team_found) {
            return "Unknown Team";
        }
        boolean contract_found = false;
        for (int i = 0; i < contracts.size(); i++) {
            current_contract = contracts.get(i);
            if ((current_contract.getTeam().getFullName().equals(teamName)
                    || current_contract.getTeam().getShortName().equals(teamName))
                    && current_contract.getPlayer().getName().equals(playerName)) {
                contract_found = true;
                break;
            }

        }
        if (!contract_found) {
            return "there is no such contract";
        }
        
        
        if (current_contract.getType().equals("Permanent")) {
            team_Term.setSize(team_Term.getSize() - 1);
            team_Term.setTotalValue(team_Term.getTotalValue() - current_contract.getValue());      
            player_Term.setPrevious_team(player_Term.getCurrent_team());
            player_Term.setCurrent_team(null);          
            player_Term.setMarketValue(0);            
            contracts.remove(current_contract);

        } else if (current_contract.getType().equals("Rented")) {
            Team previousTeam = player_Term.getPrevious_team();
            new_contract = new Contract(player_Term, previousTeam, "Permanent", player_Term.getMarket_value());
            player_Term.getPrevious_team().setSize(player_Term.getPrevious_team().getSize() + 1);   
            team_Term.setSize(team_Term.getSize() - 1);
            player_Term.getPrevious_team().setTotalValue(player_Term.getPrevious_team().getTotalValue() + current_contract.getValue());
            team_Term.setTotalValue(team_Term.getTotalValue() - current_contract.getValue());  
            contracts.remove(current_contract);
            contracts.add(new_contract);
            player_Term.setPrevious_team(team_Term);
            player_Term.setCurrent_team(previousTeam);

        } else {
            return "Contract Termination Is Not Successful.The Player Doesn't Have A Contract";
        }

        return "Contract Termination Successful";

    }
    public String changePosition(String playerName,String position){
        Player player=null;
        boolean player_found = false;

        for (int i = 0; i < players.size(); i++) {
            player = players.get(i);
            if (player.getName().equals(playerName)) {
                player_found = true;
                break;
            }
        }
        if (!player_found) {
            return "Unknown Player";
        }
        
        
        if(player.getPosition().equals(position)){
            return "Player's position is already that";
        }
        else if ("Goalkeeper".equals(position)||"Defence".equals(position)
                ||"Midfield".equals(position)||"Forward".equals(position)) {
            player.setPosition(position);
            return "Position has been changed";   
        }
        else{
            return "Invalid position";
       
        
        }
    }
    public String changeValue(String playerName,double new_value){
    Player player=null;
        boolean player_found = false;

        for (int i = 0; i < players.size(); i++) {
            player = players.get(i);
            if (player.getName().equals(playerName)) {
                player_found = true;
                break;
            }
        }
        if (!player_found) {
            return "Unknown Player";
        }
        if (player.getMarket_value()==new_value) {
            return "Player's value is already same";
        }
        else{
            player.getCurrent_team().setTotalValue(player.getCurrent_team().getTotalValue() - player.getMarket_value());
            player.setMarketValue(new_value);
            player.getCurrent_team().setTotalValue(player.getCurrent_team().getTotalValue() + player.getMarket_value());
            return "The player's value has been changed";
        }
        
    }
    public void ShowAllPlayers(){
    for (int i = 0; i < players.size(); i++) {                       
       System.out.println(players.get(i).getName());                
                            
    }
    }
    public void ShowAllTeams(){
    for (int i = 0; i < teams.size(); i++) {                       
       System.out.println(teams.get(i).getFullName());                
                            
    }                
    }
    public void ShowContracts() {
        for (int i = 0; i < contracts.size(); i++) {
            System.out.println(contracts.get(i).toString());
        }

    }
}
