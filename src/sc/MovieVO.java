package sc;

public class MovieVO {

	String name, genre;
	int kiss, action;
	
	public MovieVO(String name, String genre, int kiss, int action) {
		super();
		this.name = name;
		this.genre = genre;
		this.kiss = kiss;
		this.action = action;
	}

	@Override
	public String toString() {
		return "MovieVO [name=" + name + ", genre=" + genre + ", kiss=" + kiss + ", action=" + action + "]";
	}
	
	
	
}
