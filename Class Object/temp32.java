//Define an interface with variables
//part 1 Declaration part
interface sports
{
	int CRICKET_PLAYERS =11;
	int FOOTBALL_PLAYERS =11;
	int HOCKEY_PLAYERS =11;
	
	void showGame();
}

//Part-2 create class & implement interface 
class Cricket implements sports 
{
 public void showGame()
	{
		System.out.println("Game:Cricket");
		System.out.println("Total Players:"+CRICKET_PLAYERS);
	}
}


class football implements sports
{
	public void showGame()
	{
		System.out.println("Game:Cricket");

		System.out.println("Total Players:"+sports.FOOTBALL_PLAYERS);
   	}
}

//Part-3 Create Main class &object using access interface
//method & variables
public class demo
{
	public static void main(String p
	{
		Cricket c =new Cricket(); 
		c.showGame();
		football f =new football(); 
		f.showGame();
		System.out.println("Hockey players (from interface):"+sports.HOCKEY_PLAYERS);
	}
}