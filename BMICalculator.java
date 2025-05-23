// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
    private double weightPounds;
    private double heightInches;
    private double weightKilos;
    private double heightMeters;

    

    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        weightPounds = 0;
        heightInches = 0;
        weightKilos = 0;
        heightMeters = 0;
    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double weightPounds, double heightInches) {
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
        return (703 * weightPounds) / (heightInches * heightInches);
    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric( double weightKilos, double heightMeters) {
        this.heightMeters = heightMeters;
        this.weightKilos = weightKilos;
        return weightKilos / (heightMeters * heightMeters);
    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {
        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi > 18.5 && bmi < 25){
            return "Normal weight";
        }
        else if(bmi > 25 && bmi < 30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }
}
