package homework.three;

public class randNumGen {

	public static void main(String[] args) {

		
		//Generate a random number between 1-100
		
		int min=1;
		int max=100;
		int randNumber= (int) (Math.random()*(max-min)+min);
		
		System.out.println(randNumber);
		
		
		
	}

}