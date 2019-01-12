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

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
