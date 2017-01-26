import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int lvlOfChamp=0;
//		int userChampNumChoice;
//		int NumOfChampions=134;
		ArrayList<String> ChampList = new ArrayList<String>();
		MethodHold.champLC(ChampList);
		MethodHold.champPrint(ChampList);
		System.out.println();
		System.out.println();
    	ChampionSpecificAatrox Aatrox = new ChampionSpecificAatrox("Aatrox",537.8,85,
    			6.59,0.5,
    			105,45,
    			150,"Melee",
    			60.376,3.2,0.651,0.03,
    			24.384,3.8,32.1,1.25,
    			345);
		Champion$ManaUser Ahri = new Champion$ManaUser("Ahri",
				514.4,80,
				6.5,0.6,
				334,50,
				6,0.8,
				550,"Range",
				53.04,3,
				0.668,0.02,
				20.88,3.5,
				30,0,
				330);
    	
    	ArrayList<Hero> ChampionList = new ArrayList<Hero>();
    	ChampionList.add(Aatrox);
    	ChampionList.add(Ahri);
 

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
