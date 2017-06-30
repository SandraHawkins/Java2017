/*
 * CONTROLLER
 * This Class implements the AddressBookDataDAO. The AddressBookDataDAO
 * is a contract that says, if you want to access data for the 
 * Address Book, you must implement the following methods:
 *
 *      - getAllEntries()
 *      - insert()
 *      - update()
 *      - delete()
 *      - searchByLastName()
 *      
 * DAO stands for Data Access Object: it is a design pattern. 
 */

package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatabaseManager implements AddressBookDataDAO {

    @Override
    public ArrayList<AddressBookData> getAllEntries() {
        
        /* Create an ArrayList to hold the entries from the database */
        ArrayList<AddressBookData> listOfData = new ArrayList<>();
        /* URL for connecting to the database */
        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";
        /* Creating the Connection */
        try (Connection conn = DriverManager.getConnection(url)) {
            /* SQL to get records from the database */
            String sql = "SELECT * FROM AddressBookEntries";
            /* PreparedStatement is used to execute SQL against the DB */
            PreparedStatement stmt = conn.prepareStatement(sql);
            /* A select stmt gives back a ResultSet = table of data */
            ResultSet rs = stmt.executeQuery();
            /* Looping through the ResultSet */
            while (rs.next()) {
                /* Getting the value from each field */
                int id = rs.getInt(1);
                String firstname = rs.getString(2);
                String lastname = rs.getString(3);
                String email = rs.getString(4);
                String phoneNumber = rs.getString(5);
                
                /* Using the data from one row in the resultset to
                create an AddressBookData object */
                AddressBookData data = new AddressBookData(id,
                        firstname, lastname, email, phoneNumber);
                /* Add that data object to the arraylist  */
                listOfData.add(data);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(null, "Unable to connect");
        }
        /* Return the ArrayList */
        return listOfData;
    }

    @Override
    public ArrayList<AddressBookData> searchByLastName(String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(String firstname, String lastname, String email, String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(int id, String firstname, String lastname, String email, String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
