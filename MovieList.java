import java.util.ArrayList;

class MovieList {
	ArrayList<Movie> movies = new ArrayList<Movie>();

	public void addMovie(Movie m){
		movies.add(m);
	}

	public String showAllMovies(){
		String ouput = ""
		for(int i = 0; i < movies.size(); i++){
			output = movies.get(i).getName() + " " + movies.get(i).getDetail() + " " + movies.get(i).getPrice() + " " + movies.get(i).getShowTime() + " \n";
		}
		return output;
	}

	public void changeMoviePriceByName(String movie, double price){
		for(int i = 0; i < movies.size(); i++){
			if(movies.get(i).getName().equals(movie)){
				movies.get(i).setPrice(price);
				return;
			}
		}
	}
}