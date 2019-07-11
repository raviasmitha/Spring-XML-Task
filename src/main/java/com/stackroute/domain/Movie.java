package com.stackroute.domain;

public class Movie {

    com.stackroute.domain.Actor actor;

    public void setActor(com.stackroute.domain.Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
