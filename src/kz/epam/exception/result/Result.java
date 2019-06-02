package kz.epam.exception.result;

import kz.epam.exception.action.Action;

public class Result {
    Action action=new Action();
    
    public void result(double number[]){
         try {
            System.out.println("Average read numbers : " + action.avg(number));
            System.out.println("Amount of read numbers : " + action.summ(number));
        } catch (NullPointerException e) {
            System.out.println("Methods got null : " + e);
        }
    }
}
