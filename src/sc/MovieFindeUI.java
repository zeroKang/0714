package sc;

import java.util.Scanner;

public class MovieFindeUI {
	
	MovieFinder movieFinder;
	Scanner scanner;
	

	public MovieFindeUI(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
		scanner = new Scanner(System.in);
	}


	public void inputMovieDate() {
		
		System.out.println("키스씬의 숫자");
		int kiss = scanner.nextInt();
		System.out.println("Action Scene");
		int action = scanner.nextInt();
		
		MovieVO result = movieFinder.findMovie(kiss, action);
		
		System.out.println(result);
	}
}
