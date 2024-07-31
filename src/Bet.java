import java.util.*;

public class Bet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Team 1:");
        String team1=sc.nextLine();
        //System.out.println();
        System.out.print("Enter Team 2:");
        String team2=sc.nextLine();
        System.out.print("Enter "+team1 + " team ratio:");
        float r1 = sc.nextFloat();
        System.out.print("Enter "+team2 + " team ratio:");
        float r2 = sc.nextFloat();

        float result1 = 1999.80f / r1;
        float result2 = 1999.80f / r2;
        // System.out.println();
        // System.out.println("****************************************************************");
        // System.out.println(team1+" Team: " + String.format("%.1f", result1));
        // System.out.println(team2+" Team: " + String.format("%.1f", result2));
        // System.out.println("****************************************************************");
        // System.out.println();
        System.out.println("****************************************************************");
        System.out.println("Total Invevestment-> " + String.format("%.1f", result1+result2));
        System.out.println("Loss: "+String.format("%.1f",(1999.80-result1-result2)));
        System.out.println("Profit: "+(4000-result1-result2));
        System.out.println("****************************************************************");
    }
}