package kz.epam.exception.checkentry;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;
public class Checkentry {
    private double number[];
    private String entry;
    private String info[];
    
    public Checkentry(String entry){
        this.entry=entry;
    }
    
    public double[] Check(){
        try {
           info=entry.split(",");
            number =  Arrays.stream(info)
                        .flatMap(e -> Stream.of(e.split(",")))
                        .mapToDouble(Double::parseDouble)
                        .toArray();

            } catch (NumberFormatException e) {
                System.out.println("Write only digits please : " + e);
            }
        return number; 
    }
}
