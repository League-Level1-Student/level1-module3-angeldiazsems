package _05_netflix;

import javax.swing.JOptionPane;

public class netflix {
	public static void main(String[] args) {
		
	Movie HomeAlone = new Movie("Home Alone", 7);
	Movie IceAge = new Movie("Ice Age", 5);
	Movie MarvelMovies = new Movie("Marvel movies",0);
	Movie ToyStory = new Movie("Toy story",9);
	Movie Narnina = new Movie ("Narnina", 10);
	
	HomeAlone.getTicketPrice();
	IceAge.getTicketPrice();
	MarvelMovies.getTicketPrice();
	ToyStory.getTicketPrice();
	Narnina.getTicketPrice();
	
	NetflixQueue Netflix = new NetflixQueue();
	Netflix.addMovie(HomeAlone);
	Netflix.addMovie(MarvelMovies);
	Netflix.addMovie(IceAge);
	Netflix.addMovie(Narnina);
	Netflix.addMovie(ToyStory);
	Netflix.sortMoviesByRating();
	 Netflix.printMovies();
	 
System.out.println("The best movie is "+Netflix.getBestMovie());
System.out.println("The second best movie is "+Netflix.getMovie(1));
	 
	
	
	}
}
