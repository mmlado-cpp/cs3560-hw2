package HW2;

import java.util.List;

public class Person {
    private String name;
    private List<Watch> listWatch;
    public Person(String name) {
        this.name = name;
    }
}

class Movie {
    private String name;
    private String genre;
    private List<Watch> listWatch;
    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
}

class Watch {
    private int rating;
    private Person person;
    private Movie movie;
    public Watch(int rating, Person person, Movie movie) {
        this.rating = rating;
        this.person = person;
        this.movie = movie;
    }
}
