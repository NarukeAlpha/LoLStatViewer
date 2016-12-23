import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lvlOfChamp=0;
		int userChampNumChoice;
		int NumOfChampions=133;
		ArrayList<String> ChampList = new ArrayList<String>();
		ChampList.add("Aatrox");
		ChampList.add("Ahri  ");
		ChampList.add("Akali ");
		ChampList.add("Alistar");		
		ChampList.add("Amumu  ");		
		ChampList.add("Anivia");		
		ChampList.add("Annie  ");		
		ChampList.add("Ashe");		
		ChampList.add("Aurelion Sol");		
		ChampList.add("Azir   ");		
		ChampList.add("Bard   ");		
		ChampList.add("Blitzcrank");		
		ChampList.add("Brand  ");		
		ChampList.add("Braum  ");		
		ChampList.add("Caitlyn");		
		ChampList.add("Cassiopeia");		
		ChampList.add("Cho'Gath");		
		ChampList.add("Corki  ");		
		ChampList.add("Darius");		
		ChampList.add("Diana");		
		ChampList.add("Dr.Mundo");		
		ChampList.add("Draven");		
		ChampList.add("Ekko   ");		
		ChampList.add("Elise");		
		ChampList.add("Evelynn");		
		ChampList.add("Ezreal");		
		ChampList.add("Fiddlesticks");		
		ChampList.add("Fiora");		
		ChampList.add("Fizz  ");		
		ChampList.add("Galio");		
		ChampList.add("Gangplank");		
		ChampList.add("Garen");		
		ChampList.add("Gnar  ");		
		ChampList.add("Gragas");		
		ChampList.add("Graves");		
		ChampList.add("Hecarim");		
		ChampList.add("Heimerdinger");		
		ChampList.add("Illaoi");		
		ChampList.add("Irelia");		
		ChampList.add("Invern");		
		ChampList.add("Janna");		
		ChampList.add("Jarvan IV");		
		ChampList.add("Jax  ");		
		ChampList.add("Jayce");		
		ChampList.add("Jhin ");		
		ChampList.add("Jinx ");		
		ChampList.add("Kalista");		
		ChampList.add("Karma ");		
		ChampList.add("Karthus");		
		ChampList.add("Kassadin");		
		ChampList.add("Katarina");		
		ChampList.add("Kayle ");		
		ChampList.add("Kennen");		
		ChampList.add("Kah'Zix");		
		ChampList.add("Kindred");		
		ChampList.add("Kled  ");		
		ChampList.add("Kog'Maw");		
		ChampList.add("LeBlanc");		
		ChampList.add("Lee Sin");		
		ChampList.add("Leona ");		
		ChampList.add("Lissandra");		
		ChampList.add("Lucian");		
		ChampList.add("Lulu  ");		
		ChampList.add("Lux   ");		
		ChampList.add("Malphite");		
		ChampList.add("Malzahar");		
		ChampList.add("Maokai");		
		ChampList.add("Master Yi");		
		ChampList.add("Miss Fortune");		
		ChampList.add("Mordekaiser");		
		ChampList.add("Morgana");		
		ChampList.add("Nami  ");		
		ChampList.add("Nasus ");		
		ChampList.add("Nautilus");		
		ChampList.add("Nidalee");		
		ChampList.add("Nocturne");		
		ChampList.add("Nunu  ");		
		ChampList.add("Olaf  ");		
		ChampList.add("Orianna");		
		ChampList.add("Pantheon");		
		ChampList.add("Poppy ");		
		ChampList.add("Quinn ");		
		ChampList.add("Rammus");		
		ChampList.add("Rek'Sai");		
		ChampList.add("Renekton");		
		ChampList.add("Rengar");		
		ChampList.add("Riven ");		
		ChampList.add("Rumble");		
		ChampList.add("Ryze  ");		
		ChampList.add("Sejuani");		
		ChampList.add("Shaco ");		
		ChampList.add("Shen  ");		
		ChampList.add("Shyvana");		
		ChampList.add("Singed");		
		ChampList.add("Sion  ");		
		ChampList.add("Sivir ");		
		ChampList.add("Skarner");		
		ChampList.add("Sona  ");		
		ChampList.add("Soraka");		
		ChampList.add("Swain ");		
		ChampList.add("Syndra");		
		ChampList.add("Tahm Kench");		
		ChampList.add("Taliyah");		
		ChampList.add("Talon ");		
		ChampList.add("Taric ");		
		ChampList.add("Teemo ");		
		ChampList.add("Tresh ");		
		ChampList.add("Tristana");		
		ChampList.add("Trundle");		
		ChampList.add("Tryndamere");		
		ChampList.add("TwistedFate");		
		ChampList.add("Twitch");		
		ChampList.add("Udyr  ");		
		ChampList.add("Urgot ");		
		ChampList.add("Varus ");		
		ChampList.add("Vayne ");		
		ChampList.add("Veigar");		
		ChampList.add("Vel'koz");		
		ChampList.add("Vi    ");		
		ChampList.add("Viktor");		
		ChampList.add("Vladimir");		
		ChampList.add("Volibear");		
		ChampList.add("Warwick");		
		ChampList.add("Wukong");		
		ChampList.add("Xerath");		
		ChampList.add("Xin Zhao");		
		ChampList.add("Yasuo ");		
		ChampList.add("Yorick");		
		ChampList.add("Zac   ");		
		ChampList.add("Zed   ");		
		ChampList.add("Ziggs ");		
		ChampList.add("Zilean");		
		ChampList.add("Zyra  ");		
		int x=1;
		for(String s: ChampList){
			System.out.print(x+":"+s+"\t");
			if(x%8==0)
				System.out.println();
			x++;
		}
		System.out.println();
		System.out.println();

		while(true){
			System.out.println("Enter the number of the champion to examine \t Enter 0 to exit:");
			userChampNumChoice = scanner.nextInt();
			if(userChampNumChoice == 0)
				break;
			while(true){
				System.out.println("Enter level value, number between 1 and 18");
				lvlOfChamp =scanner.nextInt();
				if(lvlOfChamp>=1 && lvlOfChamp<=18)
					break;
				System.out.println("Number is not within range");
			}
			MethodHold.championStatsDisplay(userChampNumChoice,lvlOfChamp);
			

		}
		
		
		
	}
}
