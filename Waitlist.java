import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;


public class Waitlist {
    private Flight flight;
    private Person customer;
    private Dates date;
    private Timestamp timestamp; 
    private ArrayList<Waitlist> allWaitListEntries = new ArrayList();
    
    public Waitlist() {
        
    }
    
    public Waitlist(String flightName, String customerName, Date dateOfFlight, Timestamp timeOfBooking) {
       flight = new Flight(flightName);
       customer = new Person(customerName);
       date = new Dates(dateOfFlight);
       timestamp = timeOfBooking;
    }
    
    public Waitlist(String customerName, Date dateOfFlight) {
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
    public Timestamp getTimeOfWaitlist() {
       return timestamp;
    }
    public ArrayList<Waitlist> getWaitListByDay() {
       ArrayList<Waitlist> allWaitlistEntries = null;
       allWaitlistEntries = Database.getAllWaitlistEntries();
       return allWaitlistEntries;
    }
    
    public void addWaitList(Waitlist waitListEntry) {
        Database.addWaitlistToDatabase(waitListEntry);
    }
    
    public void deleteWaitList(Waitlist waitListEntry) {
        Database.deleteWaitlistFromDatabase(waitListEntry);
    }
}

