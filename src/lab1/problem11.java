public class Exercise1_10 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double minutes = 45.0;
        double seconds = 30.0;
        
        double miles = kilometers / 1.6;
        
        double totalHours = (minutes / 60) + (seconds / 3600);
        
        double speedMph = miles / totalHours;
        
        System.out.println("Average speed: " + speedMph + " miles per hour");
    }
}