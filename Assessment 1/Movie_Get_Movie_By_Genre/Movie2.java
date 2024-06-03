package techy;

import java.util.ArrayList;
import java.util.Scanner;

class Movie2 {
    String movieName;
    String company;
    String genre;
     int budget;

    public Movie2(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

 class SolutionMM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie2[] movies = new Movie2[4];
        for (int i = 0; i < 4; i++) {
            String movieName = scanner.nextLine();
            String company = scanner.nextLine();
            String genre = scanner.nextLine();
            int budget = Integer.parseInt(scanner.nextLine());
            movies[i] = new Movie2(movieName, company, genre, budget);
        }

        String searchGenre = scanner.nextLine();

        ArrayList<Movie2> result =getMovieByGenre(movies, searchGenre);
        for (Movie2 movie : result) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }

        scanner.close();
    }

    public static ArrayList<Movie2> getMovieByGenre(Movie2[] movies, String searchGenre) {
        ArrayList<Movie2> result = new ArrayList<>();
        for (Movie2 movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                result.add(movie);
            }
        }
        return result;
    }
}
