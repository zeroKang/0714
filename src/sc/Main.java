package sc;

public class Main {

	public static void main(String[] args) {
		
		MovieFinder finder = new MovieFinder();
		MovieFindeUI ui = new MovieFindeUI(finder);
		
		ui.inputMovieDate();
		
	}

}
