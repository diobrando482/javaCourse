public class Exercise1_11 {
    public static void main(String[] args) {
        long currentPopulation = 312032486;
        long secondsPerYear = 365 * 24 * 60 * 60;
        
        
        double birthsPerYear = secondsPerYear / 7.0;
        double deathsPerYear = secondsPerYear / 13.0;
        double immigrantsPerYear = secondsPerYear / 45.0;
        
        double annualChange = birthsPerYear - deathsPerYear + immigrantsPerYear;
        
        
        for (int i = 1; i <= 5; i++) {
            currentPopulation += Math.round(annualChange);
            System.out.println("Year " + i + ": " + currentPopulation);
        }
    }
}