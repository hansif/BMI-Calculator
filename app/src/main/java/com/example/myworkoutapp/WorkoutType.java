package com.example.myworkoutapp;


import java.util.ArrayList;
import java.util.List;

public class WorkoutType {
    List<String> getWorkouts(String workouttype) {
        List<String> workouts=new ArrayList<String>();
        if(workouttype.equals("Arms")) {
            workouts.add("Pick up weights frequently");
            workouts.add("Do cartwheels with your hands");
            workouts.add("BenchPress, triceps exercises are must");
            workouts.add("pullups and pushups");
        }
        else if(workouttype.equals("Chest")) {
            workouts.add("Pick up dumbels and exerting force on chest frequently");
            workouts.add("Do chest movements frequently");
            workouts.add("Plank and cobra stretch helps to enable chest movement");
            workouts.add("pullups and pushups");
        }
        else if(workouttype.equals("Legs")) {
            workouts.add("Do leg raises regularly");
            workouts.add("Running jogging cycling helps");
            workouts.add("Stretch legs and move them frequently");
            workouts.add("pullups and pushups");
        }
        else if(workouttype.equals("Abs")) {
            workouts.add("do crunches frequently");
            workouts.add("Cobra stretch , cycling do help to remove fat");
            workouts.add("Plank and other streching exercises are must");
            workouts.add("pullups and pushups");
        }
        else {
            workouts.add("Hold weights above hand");
            workouts.add("Do cartwheels with your hands");
            workouts.add("BenchPress, triceps and shoulder exercises are must");
            workouts.add("pullups and pushups");
        }
        return workouts;
    }
}
