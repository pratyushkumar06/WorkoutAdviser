package personal.project.android.workoutadviser;

import java.util.ArrayList;
import java.util.List;

public class AssignWorkout {

    List<String> getworkouts(String workouts)
    {
      List<String> workout=new ArrayList<String >();

      if(workouts.equals("Chest"))
      {
          workout.add("Barbell Bench Press 4 Sets");
          workout.add("Incline Dumbell Press 3 Sets");
          workout.add("Decline Dumbell Press 3 Sets");
          workout.add("Dumbell Flys 3 Sets");
      }

       else if(workouts.equals("Biceps"))
        {
            workout.add("Barbell Curl 4 Sets");
            workout.add("Hammer Curls 3 Sets");
            workout.add("Preacher Curls 3 Sets");
            workout.add("Concentration Curls 3 Sets");
        }
      else if(workouts.equals("Back"))
      {
          workout.add("Chin Ups 3 Sets");
          workout.add("Deadlifts 4 Sets");
          workout.add("Seated Rows 3 Sets");
          workout.add("Lat Pulldown 4 Sets");
      }
       else if(workouts.equals("Triceps"))
        {
            workout.add("Tricep Pushdown 4 Sets");
            workout.add("Tricep Dips 3 Sets");
            workout.add("Triceps Extensions 3 Sets");
        }
       else if(workouts.equals("Shoulders"))
        {
            workout.add("Overhead Barbell Press 4 Sets");
            workout.add("Dumbell Lateral Raises 4 Sets");
            workout.add("Dumbell Reverse Fly 3 Sets");
            workout.add("Upright Rows 4 Sets");
        }
        else if(workouts.equals("Legs"))
        {
            workout.add("Squats 5 Sets");
            workout.add("Lunges 3 Sets");
            workout.add("Leg Extensions 3 Sets");
            workout.add("Calf Raises 4 Sets");
        }
    return workout;}



}
