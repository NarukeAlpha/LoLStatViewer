import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> ChampList = new ArrayList<String>();
		MethodHold.champLC(ChampList); // creating champion names string list
		MethodHold.champPrint(ChampList);// printing all champions
		System.out.println();
		System.out.println();
		ArrayList<Hero> ChampionList = new ArrayList<Hero>();
		MethodHold.champOLC(ChampionList); //Champion Object ArrayList creator
		ChampionList.get(0).statPrint(4);

//		while(true){
//			System.out.println("Enter the number of the champion to examine \t Enter 0 to exit:");
//			userChampNumChoice = scanner.nextInt();
//			if(userChampNumChoice == 0)
//				break;
//			while(true){
//				System.out.println("Enter level value, number between 1 and 18");
//				lvlOfChamp =scanner.nextInt();
//				if(lvlOfChamp>=1 && lvlOfChamp<=18)
//					break;
//				System.out.println("Number is not within range");
//			}
//			MethodHold.championStatsDisplay(userChampNumChoice,lvlOfChamp);
//			
//
//		}
		
		
		
	}
}
