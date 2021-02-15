package come.luv2code.springdemo;

public class MyApp {
    public static void main(String[] args) {
        ///TODO Auto generated method studb
        //create the object
        //This is hardcoded. Spring inversion of control will adjust this.
       Coach theCoach = new TrackCoach();

        //Use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
