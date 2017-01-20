import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private String name;
    private int numberOfSeats;
    
    public Flight() {
        name = "";
        numberOfSeats = 0;
    }
    
    public Flight(String name) {
        this.name = name;
    }
    
    public Flight(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return numberOfSeats;
    }
    
    public void setSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
    public static int getNumberOfSeats(String flightName) {
       int numberOfSeats = 0;
       numberOfSeats = Database.getNumberOfSeatsForFlight(flightName);
       return numberOfSeats;
    }

    public static int seatsOccupied(String flight, Date day) {
       int seatsOccupied = 0;
       seatsOccupied = Database.getSeatsOccupiedFromBooking(flight, day);
       return seatsOccupied;
   }
    
    
    public ArrayList<String> getAllFlightNames() {
        ArrayList<String> allFlightNames = null;
        allFlightNames = Database.getFlightNamesFromDataBase();
        return allFlightNames;
        
    }
    
    public void addFlight(Flight flight) {
        Database.addFlightToDatabase(flight);
    }
    
    public void deleteFlight(Flight flight) {
        Database.deleteFlightFromDatabase(flight);
    }
    
}
