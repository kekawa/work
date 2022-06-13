package sampleProj;

public class BMI {
    public static void main (String[] args) {    	
        double height = 180.0;
        double weight = 83.0;
        double bmi = calculateBmi(height,weight);
        System.out.println("BMI値 : " + bmi );

        outputBmi();
        
    }
    private static double  calculateBmi(double height,double weight){
        double bmi = weight / ((height / 100.0) * (height / 100.0));
        return bmi;
    }
    
    private static void outputBmi() {
    	System.out.println("BMIを表示します");
    }
    
}
