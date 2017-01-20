import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;


public class Database {
    private static final String URL = "jdbc:derby://localhost:1527/FlightSchedulerAllisonThongkhamaft5118";
    private static final String USERNAME = "java";
    private static final String PASSWORD = "java";
    private static Connection connection;
    private static PreparedStatement numberOfSeats;
    private static PreparedStatement flightNames;
    private static PreparedStatement datesOfFlights;
    private static PreparedStatement getOccupiedSeats;
    private static PreparedStatement insertNewBooking;
    private static PreparedStatement insertNewWaitlist;
    private static PreparedStatement insertNewFlight;
    private static PreparedStatement insertNewDate;
    private static PreparedStatement searchBookingByCustomer;
    private static PreparedStatement getBookingForFlight;
    private static PreparedStatement searchWaitlistByCustomer;
    private static PreparedStatement searchWaitlist;
    private static PreparedStatement orderBookingByTimestamp;
    private static PreparedStatement orderWaitlistByTimestamp;
    private static PreparedStatement deleteFlight;
    private static PreparedStatement deleteBookingByFlight;
    private static PreparedStatement deleteBookingByCustomer;
    private static PreparedStatement deleteWaitlistByCustomer;
    private static PreparedStatement allBookingEntriesFromDatabase;
    private static PreparedStatement allWaitlistEntriesFromDatabase;
    
    
    public static Connection getConnection() {
        if(connection == null) {
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            numberOfSeats = connection.prepareStatement("SELECT Seat FROM Flight WHERE Name = ?"); 
            flightNames = connection.prepareStatement("SELECT Name FROM Flight");
            datesOfFlights = connection.prepareStatement("SELECT Day FROM Dates");
            getOccupiedSeats = connection.prepareStatement("SELECT count(Flight) FROM Booking WHERE Flight = ? and Date = ?");
            insertNewBooking = connection.prepareStatement("INSERT INTO Booking " + "(Flight, Date, Customer, Timestamp)" + " VALUES (?,?,?,?)");
            insertNewWaitlist = connection.prepareStatement("INSERT INTO Waitlist " + "(Flight, Date, Customer, Timestamp)" + " VALUES (?,?,?,?)");
            insertNewFlight = connection.prepareStatement("INSERT INTO Flight " + "(Name, Seat, Timestamp)" + " Values (?,?,?)");
            insertNewDate = connection.prepareStatement("INSERT INTO Dates " + "(Day)" + "VALUES (?)");
            searchBookingByCustomer = connection.prepareStatement("SELECT Flight FROM Booking WHERE Customer = ? and Date = ? ");
            searchWaitlistByCustomer = connection.prepareStatement("SELECT Flight FROM Waitlist WHERE Customer = ? and Date = ?");
            getBookingForFlight = connection.prepareStatement("SELECT * FROM Booking WHERE Flight = ?");
            searchWaitlist = connection.prepareStatement("SELECT * FROM Waitlist WHERE Flight = ? and Date = ?");
            deleteFlight = connection.prepareStatement("DELETE FROM Flight WHERE Name = ?");
            orderBookingByTimestamp = connection.prepareStatement("SELECT * FROM Booking ORDER BY Timestamp DESC");
            orderWaitlistByTimestamp = connection.prepareStatement("SELECT * FROM Waitlist ORDER BY Timestamp DESC");
            deleteBookingByFlight = connection.prepareStatement("DELETE FROM Booking WHERE Flight = ?");
            deleteBookingByCustomer = connection.prepareStatement("DELETE FROM Booking WHERE Customer = ? and Date = ?");
            deleteWaitlistByCustomer = connection.prepareStatement("DELETE FROM Waitlist WHERE Customer = ? and Date = ?");
            allBookingEntriesFromDatabase = connection.prepareStatement("SELECT * FROM Booking");
            allWaitlistEntriesFromDatabase = connection.prepareStatement("SELECT * FROM Waitlist");

        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return connection;
    } 
    
    public static void addBookingToDatabase(Booking bookEntry) {
        String flightName = bookEntry.getFlightName();
        Date date = bookEntry.getDateOfFlight();
        java.util.Date utildate = date;  
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        String customerName = bookEntry.getCustomerName();
        Timestamp timestamp = bookEntry.getTimeOfBooking();
        int resultSet = 0;
        try {
            insertNewBooking.setString(1, flightName);
            insertNewBooking.setDate(2, sqlDate);
            insertNewBooking.setString(3, customerName);
            insertNewBooking.setTimestamp(4, timestamp);
            resultSet = insertNewBooking.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        
    }
    
     public static void addWaitlistToDatabase(Waitlist waitlistEntry) { 
        String flightName = waitlistEntry.getFlightName();
        String customerName = waitlistEntry.getCustomerName();
        Date date = waitlistEntry.getDateOfFlight();
        java.util.Date utildate = date;  
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        Timestamp timestamp = waitlistEntry.getTimeOfWaitlist();
        int resultSet = 0;
        try {
            insertNewWaitlist.setString(1, flightName);
            insertNewWaitlist.setDate(2, sqlDate);
            insertNewWaitlist.setString(3, customerName);
            insertNewWaitlist.setTimestamp(4, timestamp);
            resultSet = insertNewWaitlist.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        
    }
     
    public static void addFlightToDatabase(Flight flight) {
        String flightName = flight.getName();
        int seats = flight.getSeats();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
        int resultSet = 0;
        try {
            insertNewFlight.setString(1, flightName);
            insertNewFlight.setInt(2, seats);
            insertNewFlight.setTimestamp(3, currentTimestamp);
            resultSet = insertNewFlight.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public static void addDateToDatabase(Dates date) {
        Date addedDate = date.getDate();
        java.util.Date utildate = addedDate;  
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        int resultSet = 0;
        try {
            insertNewDate.setDate(1, sqlDate);
            resultSet = insertNewDate.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public static void deleteFlightFromDatabase(Flight flight) {
        String flightName = flight.getName();
        ResultSet resultSet = null;
        int result = 0;
        try {
            //getBookingForFlight.setString(1,flightName);
            //resultSet = getBookingForFlight.executeQuery();
            deleteFlight.setString(1, flightName);
            deleteBookingByFlight.setString(1, flightName); 
            result = deleteFlight.executeUpdate();
            result = deleteBookingByFlight.executeUpdate();
            
            /*while(resultSet.next()) {
                String customerName = resultSet.getString("Customer");
                System.out.println(customerName);
                Date dateOfFlight = resultSet.getDate("Date");
                ArrayList <String> flightNames = getFlightNamesFromDataBase();
                System.out.println(flightNames.size());
                for(int i = 0; i < flightNames.size(); i++) {
                    String currentFlight = flightNames.get(i);
                    int seats = getNumberOfSeatsForFlight(currentFlight);
                    int seatsOccupied = getSeatsOccupiedFromBooking(currentFlight, dateOfFlight);
                    if (seats > seatsOccupied ) {
                        Booking bookEntry = new Booking(currentFlight, customerName, dateOfFlight);
                        addBookingToDatabase(bookEntry); 
                        break;
                    }
                }
                
            }*/
            
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    
    public static ArrayList<Booking> getBookingForFlight(String flightName) {  //
        
        ArrayList<Booking> bookEntriesForFlight = null;
        Booking bookEntry;
        ResultSet resultSet = null;
        getConnection();
        try {
            System.out.println(flightName);
            orderBookingByTimestamp.executeQuery();
            getBookingForFlight.setString(1, flightName);
            resultSet = getBookingForFlight.executeQuery();
            bookEntriesForFlight = new ArrayList<Booking>();
                while(resultSet.next()) {
                    System.out.println("added");
                    bookEntry = new Booking(resultSet.getString("Customer"), resultSet.getDate("Date"));
                    bookEntriesForFlight.add(bookEntry);
                }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
       }
        return bookEntriesForFlight;
       
    }
    public static void deleteBookingFromDatabase(Booking bookEntry) {
        Waitlist nextCustomer = new Waitlist();
        Booking waitlistToBookingCustomer = new Booking();
        String customerName = bookEntry.getCustomerName();
        Date date = bookEntry.getDateOfFlight();
        java.util.Date utildate = date;  
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        String flightName = getFlightForBooking(customerName, sqlDate);
        int result = 0;
        try {
            deleteBookingByCustomer.setString(1, customerName);
            deleteBookingByCustomer.setDate(2, sqlDate);
            result = deleteBookingByCustomer.executeUpdate();
           
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
       nextCustomer = searchWaitlistEntries(flightName, date);
       waitlistToBookingCustomer = new Booking(nextCustomer.getFlightName(), nextCustomer.getCustomerName(), nextCustomer.getDateOfFlight());
       deleteWaitlistFromDatabase(nextCustomer);
       addBookingToDatabase(waitlistToBookingCustomer);
    }
    
    
    public static boolean searchBookingByCustomer(String customerName, java.sql.Date date) {
        ResultSet resultSet = null;
        String results = null;
        try {
        searchBookingByCustomer.setString(1, customerName);
        searchBookingByCustomer.setDate(2, date);
        resultSet = searchBookingByCustomer.executeQuery();
            if (resultSet.next()) {
                results = resultSet.getString("Flight");
            } 
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if (results == null) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static String getFlightForBooking(String customerName, java.sql.Date date) {
        ResultSet resultSet = null;
        String results = null;
        try {
        searchBookingByCustomer.setString(1, customerName);
        searchBookingByCustomer.setDate(2, date);
        resultSet = searchBookingByCustomer.executeQuery();
            if (resultSet.next()) {
                results = resultSet.getString("Flight");
            } 
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return  results;
    }
    
    public static boolean searchWaitlistByCustomer(String customerName, java.sql.Date date) {
        ResultSet resultSet = null;
        String results = null;
        try {
        searchWaitlistByCustomer.setString(1, customerName);
        searchWaitlistByCustomer.setDate(2, date);
        resultSet = searchWaitlistByCustomer.executeQuery();
            if (resultSet.next()) {
                results = resultSet.getString("Flight");
            } 
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if (results == null) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static void deleteWaitlistFromDatabase(Waitlist waitlistEntry) {
        String customerName = waitlistEntry.getCustomerName();
        Date date = waitlistEntry.getDateOfFlight();
        java.util.Date utildate = date;  
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        int result = 0;
        try {
            deleteWaitlistByCustomer.setString(1, customerName);
            deleteWaitlistByCustomer.setDate(2, sqlDate);
            result = deleteWaitlistByCustomer.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public static int getSeatsOccupiedFromBooking(String flight, Date day) {
        ResultSet resultSet = null;
        int results = 0;
        java.util.Date utildate = day;  
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        try {
            getOccupiedSeats.setString(1, flight); 
            getOccupiedSeats.setDate(2, sqlDate);
            resultSet = getOccupiedSeats.executeQuery();
            if(resultSet.next()) { 
                results = resultSet.getInt(1);
            }
            else {
            
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
       return results;
    }
 
    public static int getNumberOfSeatsForFlight(String flightName) { 
        ResultSet resultSet = null;
        int results = 0;
        try {
            numberOfSeats.setString(1, flightName);
            resultSet = numberOfSeats.executeQuery();
            if (resultSet.next()) {
                results = resultSet.getInt("Seat");
            } 
            else {
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
       return results;
    }
    
   
   public static ArrayList<String> getFlightNamesFromDataBase() {
       ArrayList <String> allFlightNames = null;
       ResultSet resultSet = null;
       getConnection();
       try{
        resultSet = flightNames.executeQuery();
        allFlightNames = new ArrayList <String>();
            while(resultSet.next()) {
                allFlightNames.add(resultSet.getString("Name"));
            }
       }
       catch (SQLException sqlException) {
            sqlException.printStackTrace();
       }
    return allFlightNames;
   }
   
   public static Waitlist searchWaitlistEntries(String flightName, Date date) {
       ArrayList <Waitlist> waitlistEntries = null;
       Waitlist waitlistEntry = new Waitlist();
       Waitlist currentWaitlistEntry = new Waitlist();
       ResultSet resultSet = null;
       java.util.Date utildate = date;  
       java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
       getConnection();
       try {
          orderWaitlistByTimestamp.executeQuery();
          searchWaitlist.setString(1, flightName);
          searchWaitlist.setDate(2, sqlDate);
          resultSet = searchWaitlist.executeQuery();
          waitlistEntries = new ArrayList<Waitlist>();
          while(resultSet.next()) {
               waitlistEntry = new Waitlist(resultSet.getString("Flight"), resultSet.getString("Customer"), resultSet.getDate("Date"), resultSet.getTimestamp("Timestamp"));
               waitlistEntries.add(waitlistEntry);
               System.out.println("added");
           }
       }
       catch (SQLException sqlException) {
           sqlException.printStackTrace();
       }
       if (!(waitlistEntries.isEmpty())) {
       currentWaitlistEntry = waitlistEntries.get(0);  
       }
       return waitlistEntry;
   }
   
   public static ArrayList<Date> getAllDatesFromDataBase() {
       ArrayList <Date> allDates = null;
       ResultSet resultSet = null;
       getConnection();
       try{
           resultSet = datesOfFlights.executeQuery();
           allDates = new ArrayList<Date>();
          
             while(resultSet.next()) {
                 allDates.add(resultSet.getDate("Day"));
           }
       }
       catch (SQLException sqlException) {
           sqlException.printStackTrace();
       }
       return allDates;
   }
   
   
   
   public static ArrayList<Booking> getAllBookEntries() {
       ArrayList <Booking> allBookingEntries = null;
       Booking bookedEntry = new Booking();
       ResultSet resultSet = null;
       getConnection();
       try {
           resultSet = allBookingEntriesFromDatabase.executeQuery();
           allBookingEntries = new ArrayList<Booking>();
           
           while(resultSet.next()) {
               bookedEntry = new Booking(resultSet.getString("Flight"), resultSet.getString("Customer"), resultSet.getDate("Date"));
               allBookingEntries.add(bookedEntry);
           }
       }
       catch (SQLException sqlException) {
           sqlException.printStackTrace();
       }
       return allBookingEntries;   
   }
   
   
   public static ArrayList<Waitlist> getAllWaitlistEntries() {
       ArrayList <Waitlist> allWaitlistEntries = null;
       Waitlist waitlistEntry = new Waitlist();
       ResultSet resultSet = null;
       getConnection();
       try {
           resultSet = allWaitlistEntriesFromDatabase.executeQuery();
           allWaitlistEntries = new ArrayList<Waitlist>();
           
           while(resultSet.next()) {
               waitlistEntry = new Waitlist(resultSet.getString("Flight"), resultSet.getString("Customer"), resultSet.getDate("Date"), resultSet.getTimestamp("Timestamp"));
               allWaitlistEntries.add(waitlistEntry);
           }
           
       }
       catch (SQLException sqlException) {
           sqlException.printStackTrace();
       }
       return allWaitlistEntries;
          
   }
   public static SortedSet<String> getAllCustomers() {
       ArrayList<String> passengers = new ArrayList();
       ResultSet resultSet = null;
       SortedSet tree = new TreeSet();
       
       try {
           resultSet = allBookingEntriesFromDatabase.executeQuery();
           while(resultSet.next()) {
               passengers.add(resultSet.getString("Customer"));
           }
           
       }
       catch (SQLException sqlException) {
           sqlException.printStackTrace();
       }
       
       try {
           resultSet = allWaitlistEntriesFromDatabase.executeQuery();
           while(resultSet.next()) {
               passengers.add(resultSet.getString("Customer"));
           }
       }
       catch (SQLException sqlException) {
           sqlException.printStackTrace();
       }
       tree = new TreeSet(passengers);
       return tree;
       
   }
   
   
   
}


