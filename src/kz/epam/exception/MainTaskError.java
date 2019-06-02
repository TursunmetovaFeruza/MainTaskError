package kz.epam.exception;

import kz.epam.exception.checkentry.Checkentry;
import kz.epam.exception.findfile.Findfile;
import kz.epam.exception.result.Result;

public class MainTaskError {
    public static void main(String[] args) throws Exception {
       Findfile read = new Findfile("file.txt");
       Checkentry check=new Checkentry(read.getEntry());
       Result result=new Result();
       result.result(check.Check());
}
}
