package kz.epam.exception.findfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;
public class Findfile {
    private String filePath;
    private String entry;
    public Findfile(String filePath){
        this.filePath=filePath;
    }
    public String getEntry() throws Exception{
     try {
      File file = new File(filePath);
      if (file.length() == 0) {
          System.out.println("File is empty"); 
      } else {
          System.out.println("File is not empty"); }
      Scanner myReader = new Scanner(file); 
      while (myReader.hasNextLine()) {
         entry = myReader.nextLine();
        System.out.println(entry);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred:");
      e.printStackTrace();
    } catch(IOException e){
        System.out.println("Problem with file:: "+e);
    }
        return entry;
    
    }
}
