package kz.epam.exception.action;

public class Action {
  
    public void showDigits(double digits[]){
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]+" ");
        }
        System.out.println("");
    }
    
    public double summ(double digits[]){
        double summ=0;
        for (int i = 0; i < digits.length; i++) {
            summ=summ+digits[i];
        }
        return summ;
    }
    public double avg(double digits[]){
        double avg=0;
        avg=summ(digits)/digits.length;
        return avg;
    }
}
