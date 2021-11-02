package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public int actorsInTheirTwenties(){
        int num=0;
        for(Actor actor : actors){
            int age = year - actor.getYearOfBirth();
            if(age >= 20 && age<30){
                num++;
            }
        }
        return num;
    }
}
