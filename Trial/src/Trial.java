
public class Trial {
	/**
	 * Prints the information about the nerd.
	 * @param args
	 */
	public static void main(String [] args){
		System.out.println("Hello babe, this program deals with");
		System.out.println("the players of a computer game!!!");
		System.out.println("Be ready!!!");
		
		Player p1 = new Player("nerd John");
		
		p1.otherNerd("Michael");
		
		
		System.out.print("Hi,my name is "+ p1.getName() +" and i am  ");
		System.out.println(p1.getAge() +" years old.");
	}
}
