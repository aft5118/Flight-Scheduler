import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class FlightSchedulerGUI extends javax.swing.JFrame {
    private Person person;
    private Flight flight;
    private Dates date;
    private Booking bookEntry;
    private Waitlist waitlistEntry;
    private Booking booking;
    private Waitlist waitlist;
    private ArrayList<Booking> bookEntries = new ArrayList();
    private ArrayList<Waitlist> waitlistEntries = new ArrayList();
    private ArrayList<String> flightNames = new ArrayList();
    private SortedSet allcustomers = new TreeSet();
    private ArrayList<Date> allDates = new ArrayList();
    

    public FlightSchedulerGUI() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        Icon oahu = new ImageIcon(getClass().getResource("oahu2.jpg"));
        Icon ocean = new ImageIcon(getClass().getResource("ocean2.jpg"));
        Icon beach = new ImageIcon(getClass().getResource("beach2.jpg"));
        Icon palmtree = new  ImageIcon(getClass().getResource("palmtree.jpeg"));
        bookBackground.setIcon(oahu);
        statusBackground.setIcon(ocean);
        addBackground.setIcon(palmtree);
        jLabel17.setIcon(beach);
        person = new Person();
        flight = new Flight();
        date = new Dates();
        booking = new Booking();
        waitlist = new Waitlist();
        flightNames = flight.getAllFlightNames();
        allcustomers = Database.getAllCustomers();
        bookFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()) );
        statusCustomersCombo.setModel( new DefaultComboBoxModel (allcustomers.toArray()) );
        deleteCustomersCombo.setModel( new DefaultComboBoxModel (allcustomers.toArray()) );
        statusFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()) );
        deleteFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()));
        allDates = date.getAllDates();
        bookDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        statusDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        waitlistDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        cancelDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        statusDateTextField.setEditable(false);
        statusFlightTextField.setEditable(false);
        CustomerTextArea.setEditable(false);
        waitlistTextArea.setEditable(false);
        removeFlightTextArea.setEditable(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AddTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        statusPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        statusFlightComboBox = new javax.swing.JComboBox<>();
        jlabel = new javax.swing.JLabel();
        statusDateComboBox = new javax.swing.JComboBox<>();
        statusSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        statusFlightTextField = new javax.swing.JTextField();
        statusDateTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTextArea = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        waitlistDateComboBox = new javax.swing.JComboBox<>();
        waitlistSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        waitlistTextArea = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        FlightAndDateTextArea = new javax.swing.JTextArea();
        customerSearch = new javax.swing.JButton();
        statusCustomersCombo = new javax.swing.JComboBox<>();
        statusBackground = new javax.swing.JLabel();
        bookingPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CustomerTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bookFlightComboBox = new javax.swing.JComboBox<>();
        BookButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bookDateComboBox = new javax.swing.JComboBox<>();
        statusLabel = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        bookBackground = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addFlightButton = new javax.swing.JButton();
        addDateButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addFlightTextField = new javax.swing.JTextField();
        addSeatsTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        addDateTextField = new javax.swing.JTextField();
        addFlightLabel = new javax.swing.JLabel();
        addDateLabel = new javax.swing.JLabel();
        addBackground = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        deleteFlightComboBox = new javax.swing.JComboBox<>();
        deleteFlight = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cancelBooking = new javax.swing.JButton();
        cancelDateComboBox = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cancelBookingLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        removeFlightTextArea = new javax.swing.JTextArea();
        deleteCustomersCombo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        jLabel1.setText("Oahu's Flight Scheduler");

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        statusPanel.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel7.setText("Find Status By Flight and Day!");
        statusPanel.add(jLabel7);
        jLabel7.setBounds(10, 10, 320, 25);

        jLabel8.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel8.setText("Flight:");
        statusPanel.add(jLabel8);
        jLabel8.setBounds(340, 10, 70, 24);

        statusFlightComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F101", "G102", "H103" }));
        statusFlightComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusFlightComboBoxActionPerformed(evt);
            }
        });
        statusPanel.add(statusFlightComboBox);
        statusFlightComboBox.setBounds(410, 10, 69, 26);

        jlabel.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jlabel.setText("Date:");
        statusPanel.add(jlabel);
        jlabel.setBounds(530, 10, 50, 25);

        statusDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statusDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusDateComboBoxActionPerformed(evt);
            }
        });
        statusPanel.add(statusDateComboBox);
        statusDateComboBox.setBounds(580, 10, 110, 26);

        statusSearch.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        statusSearch.setText("Search");
        statusSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusSearchActionPerformed(evt);
            }
        });
        statusPanel.add(statusSearch);
        statusSearch.setBounds(740, 10, 100, 33);

        jLabel9.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel9.setText("Flight:");
        statusPanel.add(jLabel9);
        jLabel9.setBounds(340, 50, 70, 24);

        jLabel10.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel10.setText("Date:");
        statusPanel.add(jLabel10);
        jLabel10.setBounds(360, 90, 60, 25);

        jLabel11.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel11.setText("Customers on Flight:");
        statusPanel.add(jLabel11);
        jLabel11.setBounds(180, 150, 230, 24);
        statusPanel.add(statusFlightTextField);
        statusFlightTextField.setBounds(410, 50, 100, 26);
        statusPanel.add(statusDateTextField);
        statusDateTextField.setBounds(410, 90, 100, 26);

        CustomerTextArea.setColumns(20);
        CustomerTextArea.setRows(5);
        jScrollPane1.setViewportView(CustomerTextArea);

        statusPanel.add(jScrollPane1);
        jScrollPane1.setBounds(380, 130, 160, 80);

        jLabel12.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel12.setText("Find Status for Waitlist:");
        statusPanel.add(jLabel12);
        jLabel12.setBounds(0, 230, 250, 25);

        waitlistDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        waitlistDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitlistDateComboBoxActionPerformed(evt);
            }
        });
        statusPanel.add(waitlistDateComboBox);
        waitlistDateComboBox.setBounds(250, 230, 120, 26);

        waitlistSearch.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        waitlistSearch.setText("Search");
        waitlistSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitlistSearchActionPerformed(evt);
            }
        });
        statusPanel.add(waitlistSearch);
        waitlistSearch.setBounds(130, 270, 110, 33);

        waitlistTextArea.setColumns(20);
        waitlistTextArea.setRows(5);
        jScrollPane2.setViewportView(waitlistTextArea);

        statusPanel.add(jScrollPane2);
        jScrollPane2.setBounds(70, 320, 230, 70);

        jLabel13.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel13.setText("Find Flight for Customer!");
        statusPanel.add(jLabel13);
        jLabel13.setBounds(530, 230, 250, 25);

        jLabel14.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel14.setText("Customer's Name:");
        statusPanel.add(jLabel14);
        jLabel14.setBounds(390, 260, 170, 25);

        FlightAndDateTextArea.setColumns(20);
        FlightAndDateTextArea.setRows(5);
        jScrollPane3.setViewportView(FlightAndDateTextArea);

        statusPanel.add(jScrollPane3);
        jScrollPane3.setBounds(530, 310, 260, 80);

        customerSearch.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        customerSearch.setText("Search");
        customerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchActionPerformed(evt);
            }
        });
        statusPanel.add(customerSearch);
        customerSearch.setBounds(750, 260, 100, 33);

        statusCustomersCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statusCustomersCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCustomersComboActionPerformed(evt);
            }
        });
        statusPanel.add(statusCustomersCombo);
        statusCustomersCombo.setBounds(600, 260, 120, 26);
        statusPanel.add(statusBackground);
        statusBackground.setBounds(0, 0, 920, 480);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AddTabbedPane.addTab("Status", jPanel2);

        bookingPanel.setForeground(new java.awt.Color(0, 204, 255));
        bookingPanel.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel3.setText("Enter Name:");
        bookingPanel.add(jLabel3);
        jLabel3.setBounds(30, 60, 120, 25);

        CustomerTextField.setColumns(20);
        CustomerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerTextFieldActionPerformed(evt);
            }
        });
        bookingPanel.add(CustomerTextField);
        CustomerTextField.setBounds(150, 60, 286, 26);

        jLabel4.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel4.setText("Flight: ");
        bookingPanel.add(jLabel4);
        jLabel4.setBounds(460, 60, 70, 25);

        bookFlightComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F101", "G102", "H103" }));
        bookFlightComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightComboBoxActionPerformed(evt);
            }
        });
        bookingPanel.add(bookFlightComboBox);
        bookFlightComboBox.setBounds(530, 60, 69, 26);

        BookButton.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        BookButton.setText("Book Now!");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });
        bookingPanel.add(BookButton);
        BookButton.setBounds(350, 380, 130, 33);
        bookingPanel.add(jLabel2);
        jLabel2.setBounds(655, 146, 0, 0);

        jLabel5.setFont(new java.awt.Font("Bradley Hand ITC", 3, 28)); // NOI18N
        jLabel5.setText("Welcome! Let's book you a flight to Oahu now!");
        bookingPanel.add(jLabel5);
        jLabel5.setBounds(0, 10, 650, 36);

        jLabel6.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel6.setText("Date:");
        bookingPanel.add(jLabel6);
        jLabel6.setBounds(630, 60, 60, 25);

        bookDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bookDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDateComboBoxActionPerformed(evt);
            }
        });
        bookingPanel.add(bookDateComboBox);
        bookDateComboBox.setBounds(690, 60, 130, 26);

        statusLabel.setFont(new java.awt.Font("Brush Script MT", 3, 20)); // NOI18N
        bookingPanel.add(statusLabel);
        statusLabel.setBounds(500, 380, 340, 30);
        bookingPanel.add(picture);
        picture.setBounds(213, 70, 0, 0);
        bookingPanel.add(bookBackground);
        bookBackground.setBounds(0, 0, 910, 490);

        AddTabbedPane.addTab("Book", bookingPanel);

        jPanel1.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Bradley Hand ITC", 3, 22)); // NOI18N
        jLabel15.setText("Add A New Flight!");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(310, 230, 230, 40);

        jLabel16.setFont(new java.awt.Font("Bradley Hand ITC", 3, 22)); // NOI18N
        jLabel16.setText("Add A New Date! ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(630, 240, 250, 30);

        addFlightButton.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        addFlightButton.setText("Add");
        addFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addFlightButton);
        addFlightButton.setBounds(380, 360, 110, 33);

        addDateButton.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        addDateButton.setText("Add");
        addDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addDateButton);
        addDateButton.setBounds(660, 320, 110, 33);

        jLabel18.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel18.setText("Flight Name:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(260, 280, 130, 25);

        jLabel19.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel19.setText("Number of Seats:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(280, 310, 160, 25);

        addFlightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addFlightTextField);
        addFlightTextField.setBounds(400, 280, 160, 26);

        addSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSeatsTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addSeatsTextField);
        addSeatsTextField.setBounds(450, 310, 130, 26);

        jLabel20.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel20.setText("Date:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(620, 280, 50, 25);

        addDateTextField.setText("yyyy-mm-dd");
        addDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDateTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addDateTextField);
        addDateTextField.setBounds(680, 280, 120, 26);
        jPanel1.add(addFlightLabel);
        addFlightLabel.setBounds(360, 410, 160, 30);
        jPanel1.add(addDateLabel);
        addDateLabel.setBounds(680, 370, 150, 30);
        jPanel1.add(addBackground);
        addBackground.setBounds(0, -10, 910, 480);

        AddTabbedPane.addTab("Add", jPanel1);

        jPanel3.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel21.setText("Remove Flight!");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(120, 90, 150, 25);

        jLabel22.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel22.setText("Flight:");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(110, 130, 80, 25);

        deleteFlightComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deleteFlightComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(deleteFlightComboBox);
        deleteFlightComboBox.setBounds(210, 130, 100, 26);

        deleteFlight.setText("Delete");
        deleteFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightActionPerformed(evt);
            }
        });
        jPanel3.add(deleteFlight);
        deleteFlight.setBounds(150, 180, 77, 29);

        jLabel23.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel23.setText("Cancel your booking!");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(510, 90, 230, 25);

        jLabel24.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel24.setText("Name:");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(530, 120, 70, 25);

        cancelBooking.setText("Cancel");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });
        jPanel3.add(cancelBooking);
        cancelBooking.setBounds(580, 210, 79, 29);

        cancelDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cancelDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDateComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(cancelDateComboBox);
        cancelDateComboBox.setBounds(620, 160, 100, 26);

        jLabel25.setFont(new java.awt.Font("Bradley Hand ITC", 3, 20)); // NOI18N
        jLabel25.setText("Date:");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(550, 160, 50, 25);

        cancelBookingLabel.setFont(new java.awt.Font("Brush Script MT", 3, 20)); // NOI18N
        jPanel3.add(cancelBookingLabel);
        cancelBookingLabel.setBounds(450, 260, 380, 30);
        jPanel3.add(jLabel26);
        jLabel26.setBounds(120, 230, 160, 30);

        removeFlightTextArea.setColumns(20);
        removeFlightTextArea.setRows(5);
        jScrollPane4.setViewportView(removeFlightTextArea);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(110, 230, 166, 96);

        deleteCustomersCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deleteCustomersCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomersComboActionPerformed(evt);
            }
        });
        jPanel3.add(deleteCustomersCombo);
        deleteCustomersCombo.setBounds(630, 120, 130, 26);
        jPanel3.add(jLabel17);
        jLabel17.setBounds(-10, 0, 930, 480);

        AddTabbedPane.addTab("Remove", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(692, 692, 692)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(AddTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(744, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
       java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
       bookEntry = new Booking(flight.getName(), person.getNameOfPerson(), date.getDate(), currentTimestamp);
       
       int numberOfSeats = Flight.getNumberOfSeats(flight.getName());
       int seatsOccupied = Flight.seatsOccupied(flight.getName(), date.getDate());
       if (numberOfSeats > seatsOccupied ) {
           booking.addBooking(bookEntry);
           statusLabel.setText("Flight has been booked!");    
       }
       else {
          waitlistEntry = new Waitlist(flight.getName(), person.getNameOfPerson(), date.getDate(), currentTimestamp);
          waitlist.addWaitList(waitlistEntry);
          statusLabel.setText("You have been added to wailtist.");
       }
       CustomerTextField.setText("");
       allcustomers = Database.getAllCustomers();
       statusCustomersCombo.setModel( new DefaultComboBoxModel (allcustomers.toArray()) );
       deleteCustomersCombo.setModel( new DefaultComboBoxModel (allcustomers.toArray()) );
       
    }                                          

    private void CustomerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        String nameOfPerson = evt.getActionCommand();
        person.setNameOfPerson(nameOfPerson);
    }                                                 

    private void statusSearchActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CustomerTextArea.setText("");
        bookEntries = booking.getStatusbyFlightDay();
        String statusByFlight = flight.getName();
        Date statusByDate = date.getDate();
        statusFlightTextField.setText(flight.getName());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String statusDate = formatter.format(statusByDate);
        statusDateTextField.setText(statusDate);
        int counter =1;
        for ( int i = 0; i < bookEntries.size(); i++) {
             String bookingFlight = bookEntries.get(i).getFlightName();
             Date bookingDate = bookEntries.get(i).getDateOfFlight();
             String bookDate = formatter.format(bookingDate);
             if((bookingFlight.equals(statusByFlight)) && (statusDate.equals(bookDate)) ){
                String customerName = bookEntries.get(i).getCustomerName();
                CustomerTextArea.append(counter + ". " + customerName + "  " + "\n");
                counter++;
             }
        }
    }                                            

    private void statusFlightComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                     
       String flightName = (String) statusFlightComboBox.getSelectedItem();
       flight.setName(flightName);
    }                                                    

    private void statusDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateStatus = statusDateComboBox.getSelectedItem().toString(); 
         try {
            Date flightDate = formatter.parse(dateStatus);
            date.setDate(flightDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }                                                  

    private void bookDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfFlight = bookDateComboBox.getSelectedItem().toString(); 
         try {
            Date flightDate = formatter.parse(dateOfFlight);
            date.setDate(flightDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }                                                

    private void bookFlightComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        String flightName = (String) bookFlightComboBox.getSelectedItem();
        flight.setName(flightName);
    }                                                  

    private void waitlistDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateStatus = waitlistDateComboBox.getSelectedItem().toString(); 
         try {
            Date flightDate = formatter.parse(dateStatus);
            date.setDate(flightDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }                                                    

    private void waitlistSearchActionPerformed(java.awt.event.ActionEvent evt) {                                               
        waitlistTextArea.setText("");
        Date waitlistByDate = date.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String statusDate = formatter.format(waitlistByDate);
        waitlistEntries = waitlist.getWaitListByDay();
        for (int j = 0; j < flightNames.size(); j++) {
            waitlistTextArea.append(flightNames.get(j) + ": ");
            for ( int i = 0; i < waitlistEntries.size(); i++) {
                Date waitlistEntryDate = waitlistEntries.get(i).getDateOfFlight();
                String waitlistDate = formatter.format(waitlistEntryDate);
                String waitlistEntryFlight = waitlistEntries.get(i).getFlightName();
                if( (flightNames.get(j).equals(waitlistEntryFlight)) && statusDate.equals(waitlistDate)) {
                    waitlistTextArea.append(waitlistEntries.get(i).getCustomerName() + " ");
                }
             }
            waitlistTextArea.append("\n");
        }
    }                                              

    private void customerSearchActionPerformed(java.awt.event.ActionEvent evt) {                                               
        FlightAndDateTextArea.setText("");
        bookEntries = booking.getStatusbyFlightDay();
        waitlistEntries = waitlist.getWaitListByDay();
        String customerName = person.getNameOfPerson();
        FlightAndDateTextArea.append("Flight:           Date:" + "\n");
        for ( int i = 0; i < bookEntries.size(); i++) {
            String bookedCustomer = bookEntries.get(i).getCustomerName();
            if(customerName.equals(bookedCustomer)) {
                String flightName = bookEntries.get(i).getFlightName();
                Date flightDate = bookEntries.get(i).getDateOfFlight();
                FlightAndDateTextArea.append(flightName + "        " + flightDate + "   " + "(BOOKED)" + "\n");
             }
        }
        for ( int j = 0; j < waitlistEntries.size(); j++) {
            String waitlistCustomer = waitlistEntries.get(j).getCustomerName();
            if(customerName.equals(waitlistCustomer)) {
                String flightName = waitlistEntries.get(j).getFlightName();
                Date flightDate = waitlistEntries.get(j).getDateOfFlight();
                FlightAndDateTextArea.append(flightName + "        " + flightDate + "  " + "(WAITLISTED)" + "\n");
            }
        } FlightAndDateTextArea.append("\n");
        
        
    }                                              

    private void addFlightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        String flightName = evt.getActionCommand();
        flight.setName(flightName);
    }                                                  

    private void addSeatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        String stringSeats = evt.getActionCommand();
        int seats = Integer.parseInt(stringSeats);
        flight.setSeats(seats);
        
    }                                                 

    private void addFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        Flight newFlight = new Flight(flight.getName(), flight.getSeats());
        flight.addFlight(newFlight);
        flightNames = flight.getAllFlightNames();
        bookFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()) );
        statusFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()) );
        deleteFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()));
        addFlightLabel.setText("A new flight has been added!");
    }                                               

    private void addDateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Dates addedDate = new Dates(date.getDate());
        date.addDate(addedDate);
        allDates = date.getAllDates();
        bookDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        statusDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        waitlistDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        cancelDateComboBox.setModel( new DefaultComboBoxModel(allDates.toArray()));
        addDateLabel.setText("A new date has been added!");
    }                                             

    private void addDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       String dateEntered = evt.getActionCommand();
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
         try {
            Date addedDate = formatter.parse(dateEntered);
            date.setDate(addedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
    }                                                

    private void deleteFlightComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                     
       String flightName = (String) deleteFlightComboBox.getSelectedItem();
       flight.setName(flightName);
    }                                                    

    private void deleteFlightActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
       
       ArrayList<Booking> bookEntriesForDeletedFlight = new ArrayList<Booking>();
       bookEntriesForDeletedFlight = Database.getBookingForFlight(flight.getName());
       Flight deleteFlight = new Flight(flight.getName());
       flight.deleteFlight(deleteFlight);
       removeFlightTextArea.setText("");
       for (int i = 0; i < bookEntriesForDeletedFlight.size(); i++) {
           String customer = bookEntriesForDeletedFlight.get(i).getCustomerName();
           Date date = bookEntriesForDeletedFlight.get(i).getDateOfFlight();
           System.out.println(customer);
           System.out.println(date);
           for(int j = 0; j < flightNames.size(); j++) {
                    String currentFlight = flightNames.get(j);
                    int seats = Database.getNumberOfSeatsForFlight(currentFlight);
                    int seatsOccupied = Database.getSeatsOccupiedFromBooking(currentFlight, date);
                    if (seats > seatsOccupied ) {
                        Booking bookEntry = new Booking(currentFlight, customer, date);
                        Database.addBookingToDatabase(bookEntry); 
                        removeFlightTextArea.append(customer + " has been rebooked" + "\n");
                        break;
                    }
                }
       }
    
       flightNames = flight.getAllFlightNames();
       bookFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()) );
       statusFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()) );
       deleteFlightComboBox.setModel( new DefaultComboBoxModel(flightNames.toArray()));
   
       
    }                                            

    private void cancelDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfFlight = cancelDateComboBox.getSelectedItem().toString(); 
         try {
            Date cancelDate = formatter.parse(dateOfFlight);
            date.setDate(cancelDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }                                                  

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String deleteCustomerName = person.getNameOfPerson();
        Date deleteDate = date.getDate();
        Booking deleteBookEntry = new Booking(deleteCustomerName, deleteDate);
        Waitlist deleteWaitlistEntry = new Waitlist(deleteCustomerName, deleteDate);
        java.util.Date utildate = deleteDate;  
        java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());
        if (Database.searchBookingByCustomer(deleteCustomerName, sqlDate)) {
            booking.deleteBooking(deleteBookEntry);
            System.out.println("Found in Booking");
            cancelBookingLabel.setText(deleteCustomerName + " has been deleted from Bookings.");
        }
        else {
            if(Database.searchWaitlistByCustomer(deleteCustomerName, sqlDate)) {
                waitlist.deleteWaitList(deleteWaitlistEntry);
                System.out.println("Found in Waitlist");
                cancelBookingLabel.setText(deleteCustomerName + " has been deleted from Waitlist.");
            }
            else{
                cancelBookingLabel.setText("Customer not found.");
            }
        }
        
    }                                             

    private void statusCustomersComboActionPerformed(java.awt.event.ActionEvent evt) {                                                     
       String customer = (String) statusCustomersCombo.getSelectedItem();
       person.setNameOfPerson(customer);
    }                                                    

    private void deleteCustomersComboActionPerformed(java.awt.event.ActionEvent evt) {                                                     
       String customer = (String) deleteCustomersCombo.getSelectedItem();
       person.setNameOfPerson(customer);
    }                                                    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightSchedulerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTabbedPane AddTabbedPane;
    private javax.swing.JButton BookButton;
    private javax.swing.JTextArea CustomerTextArea;
    private javax.swing.JTextField CustomerTextField;
    private javax.swing.JTextArea FlightAndDateTextArea;
    private javax.swing.JLabel addBackground;
    private javax.swing.JButton addDateButton;
    private javax.swing.JLabel addDateLabel;
    private javax.swing.JTextField addDateTextField;
    private javax.swing.JButton addFlightButton;
    private javax.swing.JLabel addFlightLabel;
    private javax.swing.JTextField addFlightTextField;
    private javax.swing.JTextField addSeatsTextField;
    private javax.swing.JLabel bookBackground;
    private javax.swing.JComboBox<String> bookDateComboBox;
    private javax.swing.JComboBox<String> bookFlightComboBox;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JButton cancelBooking;
    private javax.swing.JLabel cancelBookingLabel;
    private javax.swing.JComboBox<String> cancelDateComboBox;
    private javax.swing.JButton customerSearch;
    private javax.swing.JComboBox<String> deleteCustomersCombo;
    private javax.swing.JButton deleteFlight;
    private javax.swing.JComboBox<String> deleteFlightComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel picture;
    private javax.swing.JTextArea removeFlightTextArea;
    private javax.swing.JLabel statusBackground;
    private javax.swing.JComboBox<String> statusCustomersCombo;
    private javax.swing.JComboBox<String> statusDateComboBox;
    private javax.swing.JTextField statusDateTextField;
    private javax.swing.JComboBox<String> statusFlightComboBox;
    private javax.swing.JTextField statusFlightTextField;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JButton statusSearch;
    private javax.swing.JComboBox<String> waitlistDateComboBox;
    private javax.swing.JButton waitlistSearch;
    private javax.swing.JTextArea waitlistTextArea;
    // End of variables declaration                   
}
