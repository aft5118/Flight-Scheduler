import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Booking {
    private Flight flight; 
    private Person customer; 
    private Dates date;
    private ArrayList<Booking> allBookingEntries = new ArrayList();
    private Timestamp timeStamp;

    public Booking() {
        
    }
    public Booking(String flightName, String customerName, Date dateOfFlight, Timestamp timeOfBooking) {
       flight = new Flight(flightName);
       customer = new Person(customerName);
       date = new Dates(dateOfFlight);
       timeStamp = timeOfBooking;
    } 
    
    public Booking (String flightName, String customerName, Date dateOfFlight) {
       flight = new Flight(flightName);
       customer = new Person(customerName);
       date = new Dates(dateOfFlight);
    } 
    public Booking (String customerName, Date dateOfFlight) {
        customer = new Person(customerName);
        date = new Dates(dateOfFlight);
    }
    public String getFlightName() {
       return flight.getName();
    }
    public String getCustomerName() {
       return customer.getNameOfPerson();
    }
    public Date getDateOfFlight() {
       return date.getDate();
    }
    public Timestamp getTimeOfBooking() {
        return timeStamp;
    }
    public ArrayList<Booking> getStatusbyFlightDay() {
       ArrayList<Booking> allBookingEntries = null;
       allBookingEntries = Database.getAllBookEntries();
       return allBookingEntries;
    }
   
   
    public void addBooking(Booking bookEntry) { 
       Database.addBookingToDatabase(bookEntry);
       
   }
    
    public void deleteBooking(Booking bookEntry) {
        Database.deleteBookingFromDatabase(bookEntry);
    }
   
}
