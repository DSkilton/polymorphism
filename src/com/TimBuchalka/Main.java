package com.TimBuchalka;

class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats people";
    }
}

class IndependanceDay extends Movie {
    public IndependanceDay(){
        super("Independance Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars(){
        super ("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial Forces battle for control of the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }

    // no plot
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static Movie randomMovie(){
        //random returns a double
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated is " + randomNumber);

        switch(randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependanceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }

        return null;
    }//end of randomMovie


}
