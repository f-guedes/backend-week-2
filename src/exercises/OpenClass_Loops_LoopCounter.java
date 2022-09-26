package exercises;

public class OpenClass_Loops_LoopCounter {
	
	public static void main(String[] args) {
        int counter = 0;
        

        
        // create your for loop here
        for (int i = 1; i < 100; i += 2) {
            counter++;
            
            System.out.println("Iteration # " + counter + " - " + i);
        }
           

    }
}


