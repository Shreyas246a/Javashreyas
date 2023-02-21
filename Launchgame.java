import java.util.*;
class guesser{
	
	int guessnum;
	 int guessthenum(){
		 
		 System.out.println("Guesser, Guess the number");
		 Scanner sc=new Scanner(System.in);
		 guessnum=sc.nextInt();
		 return guessnum;
	 }
}
class player{
	int guessnum;
	int guessthenum() {
		
		System.out.println("Player, Guess the number");
		Scanner sc=new Scanner(System.in);
		guessnum=sc.nextInt();
		return guessnum;
	}  
	
}
class umpire{
	int guessernum;
	int player1num;
	int player2num;
	int player3num;
	
	void numFromGuesser()
	{
		guesser obj=new guesser();
		guessernum=obj.guessthenum();
	}
	void numFromPlayer()
	{
		player p1=new player();
		player p2=new player();
		player p3=new player();
		player1num=p1.guessthenum();
		player2num=p2.guessthenum();
		player3num=p3.guessthenum();
		
		
	}
	void winner()
	{
		if(player1num==guessernum)
		{
			System.out.println("Player 1 won the game");
		}
		else if(player2num==guessernum) {
			System.out.println("Player 2 won the game");
		}
		else if(player3num==guessernum) {
			System.out.println("PLayer 3 won the game");
		}
		else {
			System.out.println("Loosers");
		}
	}
}
public class Launchgame {
	

	public static void main(String[] args) {
		umpire obj3=new umpire();
		obj3.numFromGuesser();
		obj3.numFromPlayer();
		obj3.winner();

	}

}
