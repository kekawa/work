package sampleProj;

public class Abc {
    public static void main (String[] args) {
        double height = 180.0;//[2]
        double weight = 83.0;//[3]
 
        double bmi = calculateBmi(height,weight);//[4]
        System.out.println("BMI値 : " + bmi );//[5]
    }
    private static double  calculateBmi(double height,double weight){//[6]
        double bmi = weight / ((height / 100.0) * (height / 100.0));//[7]
        return bmi;//[8]
    }
}
