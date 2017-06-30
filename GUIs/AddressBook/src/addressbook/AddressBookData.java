/*
 * MODEL
 */

package addressbook;

/**
 *
 * @author sd_tutor19
 */
public class AddressBookData {
    
    /* private member variables */
    private int id; 
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    
    private static int idCounter = 100;
   
    public AddressBookData(String firstname, String lastname, 
                           String email, String phoneNumber) {
        this.id = idCounter++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public AddressBookData(int id, String firstname, String lastname, 
                           String email, String phoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nid=" + 
                id + ", firstname=" + 
                firstname + ", lastname=" + 
                lastname + ", email=" + 
                email + ", phoneNumber=" + 
                phoneNumber + '}';
    }
}
