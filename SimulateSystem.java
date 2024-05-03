
import java.util.Scanner;

public class SimulateSystem {

    public static void main(String[] args) {
        TransferBoard transferBoard = new TransferBoard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Football Manager Application");
        System.out.println("-----------------------------------------");
        System.out.println("RULES\n1.You can make transfers to any team you want.\n2.A team size can have maximum 22 Players."
                + "\n3.You can't re-sign with a player who is already under contract.\n4.You cannot make a contract with a rented player."
                + "\n5.Player without a contract can only make a permanent contract.\n6.Establishing a contract for a player with a team,"
                + " should terminate the current contract of the player, if any.\n7.You can change position and value of a player ");
        System.out.println("-----------------------------------------");
        int choice = 0;
        while (choice != 8) {
            System.out.println("Menu");
            System.out.println("1- Show all Players in the system.");
            System.out.println("2- Show all Teams in the system.");
            System.out.println("3- Show all teamless players.");
            System.out.println("4- Make a new contract between a player and a team.");
            System.out.println("5- Terminate the existing contract between a player and a team.");
            System.out.println("6- Change the position of a Player");
            System.out.println("7- Change the value of a Player");
            System.out.println("8- Press 7 for exit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("All Players in the system:");
                    transferBoard.ShowAllPlayers();
                    break;
                case 2:
                    System.out.println("All Teams in the system:");
                    transferBoard.ShowAllTeams();
                    break;
                case 3:
                   System.out.println("Teamless players:");
                   for (int i = 0; i < transferBoard.players.size(); i++) {                       
                       if (transferBoard.players.get(i).getCurrent_team() == null) {
                            System.out.println(transferBoard.players.get(i).getName());
                       }
                    }
                    break;
                case 4:
                    System.out.print("Enter player name, team name, contract type, contract value: ");
                    String playerName = scanner.next();
                    scanner.nextLine();
                    String teamName = scanner.next();
                    scanner.nextLine();
                    String contractType = scanner.next();
                    double contractValue = scanner.nextDouble();
                    System.out.println(transferBoard.makeContract(playerName, teamName, contractType, contractValue));
                    transferBoard.ShowContracts();
                    break;
                case 5:
                    System.out.print("Enter player name and team name to terminate contract: ");
                    playerName = scanner.next();
                    scanner.nextLine();
                    teamName = scanner.next();
                    System.out.println(transferBoard.terminateContract(playerName, teamName));
                    break;
                case 6:
                    System.out.println("Enter the name of player and the position");
                    playerName=scanner.next();
                    scanner.nextLine();
                    teamName = scanner.next();
                    System.out.println(transferBoard.changePosition(playerName, teamName));
                    break;
                case 7:
                    System.out.println("Enter the name of player and the value");
                    playerName=scanner.next();
                    double new_value = scanner.nextDouble();
                    System.out.println(transferBoard.changeValue(playerName, new_value));
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.out.println("All players who has a contract");
                    transferBoard.ShowContracts();
                    System.out.println("All Teams in the system:");                   
                    transferBoard.ShowAllTeams();
                    System.out.println("Teamless players:");
                    for (int i = 0; i < transferBoard.players.size(); i++) {                       
                       if (transferBoard.players.get(i).getCurrent_team() == null) {
                            System.out.println(transferBoard.players.get(i).getName());
                       }
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }

        scanner.close();
    
    }
    
}
