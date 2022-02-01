import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Cat {
    public String meow(String name){
        try {
            name = name.toUpperCase();
        } catch(NullPointerException e) {
            e.printStackTrace();
            throw e;
        }
        return name + " Meow";
    }
    public Date convertToDate(String s) throws ParseException{
        //try {
            if(s.matches("<appropriate regex>"))
                ; //then do the conversion to a date
            return new SimpleDateFormat().parse(s);
//        } catch(ParseException pe){
//            pe.printStackTrace();
//            return null;
//        }
    }
}
