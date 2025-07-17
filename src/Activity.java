import java.sql.Date;
import java.util.Arrays;
import java.util.Comparator;

class Activity {
    double start, end;
    Activity(double start, double end) {
        this.start = start;
        this.end = end;
    }
}

class ActivitySelection {
    static char[] alphabet = {'A', 'B', 'C', 'D', 'E'};

    
    public static void selectActivities(Activity[] activities) {
        Arrays.sort(activities, Comparator.comparingDouble(a -> a.end));
        System.out.println("Selected activities:");
        
        double lastEndTime = 0;
        int count = 0;
        for (Activity activity : activities) {
            if (activity.start >= lastEndTime) {
                if(activity.start - Math.floor(activity.start) != 0){
                }else{
                System.out.println("- Activity " +alphabet[count] +": "+ activity.start + " - " + activity.end);
                lastEndTime = activity.end;
                }
            }count++;
        }

        
    }

    public static void main(String[] args) {
        Activity[] activities = {new Activity(9, 10), new Activity(10, 11), new Activity(11, 12), new Activity(9.5, 10.5), new Activity(10.5, 11.5)};
        selectActivities(activities);
        
    }
}
