package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber = 1;
    static String raceLocation = "Yeerk homeland";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;
    String location;
    String time;
    
    
    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber= nextBibNumber;
        nextBibNumber++;
       String raceLocation = location;
        raceStartTime = time;
    }

    public static void main(String[] args) {
       
    	Athlete Tobias = new Athlete("Tobias",999);
    	System.out.println(Tobias.name);
    	System.out.println(Tobias.bibNumber);
    	System.out.println(Tobias.raceLocation);
    	
    	
    	Athlete VISSER = new Athlete("VISSER",998);
    	System.out.println(VISSER.name);
    	System.out.println(VISSER.bibNumber);
    	System.out.println(VISSER.raceLocation);
    	
    	
    	//create two athletes
    	//print their names, bibNumbers, and the location of their race.
    	
    	
    	
    	
    	
    	//When the 2 constructors run the variables change with all the other varibles
    	//nextBibNumber changes by 1 when it is used. BibNumber is assigned when 
    	//you equal it to nextBibNumber.
    	
    	
    	
    	
    	
    	//You can change the location of the race by changing the raceLocation at the top
    	//this would update it for everyone that has it
    	
    	
    	
    	
    	
    	
    	
    }
}

