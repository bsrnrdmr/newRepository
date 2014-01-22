
public class Player {
	private int age;
	private String name;
	private String theGames;
	
	public Player(String nerdName){
		this.age=24;
		this.name=nerdName;
		this.theGames="Candy Crush"; 
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
	public void otherNerd(String newGuy){
		if(newGuy==name){
			return;
		}
		this.name=newGuy;
	}

}
