import java.util.ArrayList;
import java.util.Date;


public class Dates {
   private Date date;
   
   public Date getDate() {
       return date;
   }
   
   public void setDate(Date date) {
       this.date = date;
   }
   
   public Dates() {
       date = null;
   }
   
   public Dates(Date date){
       this.date = date;
   }
   
   public ArrayList<Date> getAllDates() {
       ArrayList<Date> allDates = null;
       allDates = Database.getAllDatesFromDataBase();
       return allDates;
   }
   
   public void addDate(Dates date) {
       Database.addDateToDatabase(date);
   }
   
}
