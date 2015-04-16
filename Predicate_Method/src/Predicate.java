import acm.program.*;

public class Predicate extends ConsoleProgram {

			public void run(){
				String answer = readLine("Would you like instructions? ");
				askYesNoQuestion(answer);
				if(answer.equals("yes")) {
					println("HOORAAH!");
				}
				else if(answer.equals("no")) {
					 println("OK!");
				 }
					else {
						println("Please answer yes or no!");
						answer = readLine("Would you like instructions? ");
						}
			}
			private Boolean askYesNoQuestion(String prompt){
				return (prompt.equals("yes"));
			}
}
