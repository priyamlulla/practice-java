package Solve.OOPs;

class Movie {
    private String name, director ;
    private int year;

    Movie( String name , int year , String director){
        this.name=name;
        this.year = year;
        this.director=director;
    }

    @Override
    public String toString() {
        return name + director + year;
    }
}

public class P29 {
    public static void main(String[] args) {

        Movie a1 = new Movie("inception",1,"cristofer Nolan");
        System.out.println(a1);
    }
}
