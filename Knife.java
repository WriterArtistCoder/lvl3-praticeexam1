
public class Knife {
	
	public static void main(String args[]) {
		// #1
		Knife[] knifeboard = new Knife[5];
		
		// #2
		for (int i = 0; i < knifeboard.length; i++) {
			knifeboard[i] = new Knife();
		}
		
		// #3
		for (int i = 0; i < knifeboard.length; i++) {
			knifeboard[i].cut();
		}
	}

	public void cut() {}

}
