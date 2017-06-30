/*
 * CONTROLLER
 */

package addressbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author sd_tutor19
 */
public class ArrayListManager implements AddressBookDataDAO {
    
    /* The ArrayList holding all AddressBookData entries */
    private ArrayList<AddressBookData> listOfData = new ArrayList<>();    
    
    public void populateAddressBookList() {
        /* Creating individual AddressBookData objects */ 
        AddressBookData data1 = new AddressBookData("Mary", "Jones", 
                                "mary@jones.ie", "018140200");
        AddressBookData data2 = new AddressBookData("Fred", "Fly", 
                                "fred@fly.ie", "0861234567");
        AddressBookData data3 = new AddressBookData("Ted", "Black", 
                                "ted@black.com", "0872223334");
        AddressBookData data4 = new AddressBookData("John", "Smyth", 
                                "john@smyth.ie", "086456874");
        AddressBookData data5 = new AddressBookData("Mark", "White", 
                                "mark@white.eu", "0839876543");
        AddressBookData data6 = new AddressBookData("Pat", "Jones", 
                                "pat@jones.ie", "019998877");
        AddressBookData data7 = new AddressBookData("Sue", "Tall", 
                                "sue@tall.ie", "0864445556");
        
        /* Puts all AddressBookData objects into an array */
        AddressBookData [] arrayOfData = {data1, data2, data3, 
                                          data4, data5, data6, data7};
        /* Arrays.asList() takes an array and converts it into a
        List. addAll() add the content of a list into my listOfData*/
        listOfData.addAll(Arrays.asList(arrayOfData));
    }
    
    /* getAllAddressBookEntries() populates an ArrayList with
    AddressBookData objects and returns that ArrayList. */
    public ArrayList<AddressBookData> getAllEntries() {
        
        return listOfData;
    }
    
    public ArrayList<AddressBookData> searchByLastName(String lastname) {
        // Declare an ArrayList to hold the matching Entries,
        // i.e. those entries with the same lastname as the parameter
        ArrayList<AddressBookData> list = new ArrayList<>();
        
        // Loop though the arraylist (global variable)
        for (AddressBookData data : listOfData) {
            // See if the lastname of the current element in the
            // loop matches the parameter
            if (data.getLastname().equals(lastname)) {
                // If there's a match, add that entry into the new arrayList
                list.add(data);
            }
        }
        
        // After the loop, return the new array list.
        return list;
    }

    @Override
    public boolean insert(String firstname, String lastname, 
            String email, String phoneNumber) {
        
        // Take all the parameters and construct a new 
        // AddressBookData object.
        AddressBookData data = new AddressBookData(
                firstname, lastname, email, phoneNumber);
        
        // Add that object to the arraylist and return its success.
        // The ArrayList's add() method returns true if successful.
        return listOfData.add(data);
    }

    @Override
    public boolean update(int id, String firstname, String lastname, String email, String phoneNumber) {
        // Search the arraylist for an entry with a matching
        // id. When a match is found, change each field to
        // that of the parameters
        
        return true;
    }

    @Override
    public boolean delete(int id) {
        // loop through the array list, find the matching
        // id and delete that element. HINT: use an iterator
        Iterator<AddressBookData> i = listOfData.iterator();
        
        while(i.hasNext()) {
            AddressBookData data = i.next();
            if (data.getId() == id) { // if the ids match
                i.remove(); // removes the current element in the list
                return true;
            }
        }
        
        return false; // id not found/ Addressbookdata object not removed
    }
}
