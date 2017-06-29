package addressbook;

import java.util.ArrayList;

/**
 * This is a Design pattern for accessing data. Here is 
 * the contract: If you want to access data from whatever
 * source, you may implement this interface and therefore
 * you must include methods to get/ insert/ delete and 
 * update.
 * 
 * Implementing classes of this interface might be:
 * 
 * - AddressBookArrayListDAO/ Manager
 * - AddressBookSqlServerDAO/ Manager
 * - AddressBookAccessDAO/ Manager
 * - AddressBookXmlDAO/ Manager
 * - AddressBookOracleDAO/ Manager
 * - AddressBookFlatFileDAO/ Manager
 * - AddressBookDerbyDAO/ Manager
*/
public interface AddressBookDataDAO {
    
    public ArrayList<AddressBookData> getAllEntries();
    
    public ArrayList<AddressBookData> searchByLastName(
            String lastname); 
    
    public boolean insert(String firstname, String lastname,
            String email, String phoneNumber);
    
    public boolean update(int id, String firstname, 
            String lastname, String email, String phoneNumber);
    
    public boolean delete(int id);  
}
