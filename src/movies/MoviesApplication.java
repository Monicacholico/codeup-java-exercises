package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static Input input = new Input();
    public static Movie[] movies = MoviesArray.findAll();

    public static void theMovie (Movie movies){
        System.out.println(movies.getMovie() + " - - " + movies.getCategory());
    }

    public static void allMovies() {
        for (Movie movie : movies) {
            theMovie(movie);
        }
    }


    public static void dramaCategory(String category){
        for(Movie movie: movies){
            if(movie.getCategory().equals(category)){
                System.out.println(movie.getMovie() + " - - " +  movie.getCategory());
            }

        }
    }

    public static void animatedCategory(String category){
        for(Movie movie: movies){
            if(movie.getCategory().equals(category)){
                System.out.println(movie.getMovie() + " - - " + movie.getCategory());
            }
        }
    }

    public static void scifiCategory(String category){
        for(Movie movie: movies){
            if(movie.getCategory().equals(category)){
                System.out.println(movie.getMovie() + " - - " + movie.getCategory());
            }
        }
    }

    public static boolean wantsToContinue(){
        String answer = input.getString();
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }



    public static void menu(){

        do {
            System.out.println("What would you like to do?");
            System.out.println("1/t - exit ");
            System.out.println("2/t - view all movies");
            System.out.println("3/t - view all movies in the animated category");
            System.out.println("4/t - view all movies in the drama category");
            System.out.println("5/t - view all movies in the scifi category");
            System.out.println("Enter your choice: ");

            int userChoice = input.getInt(); // User's choice

            switch (userChoice) {
                case 1: System.out.println("exit");
                    break;
                case 2: allMovies();
                    break;
                case 3:
                    animatedCategory("animated");
                    break;
                case 4:
                    dramaCategory("drama");
                    break;
                case 5:
                    scifiCategory("scifi");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (wantsToContinue());



    }




    public static void main(String[] args) {

        menu();


    }
}
