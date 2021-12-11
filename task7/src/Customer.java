public class Customer {
    // Attributes

    String name;
    int telephone;
    String email;
    String address;

    public Customer(String name, int telephone, String email, String address) {

        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    // Name
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    // Telephone
    public int setTelephone(int telephone) {
        this.telephone = telephone;
        return telephone;
    }

    public int getTelephone() {
        return telephone;
    }

    // Email
    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public String getEmail() {
        return email;
    }

    // Address
    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    public String getAddress() {
        return address;
    }

    // toString
    public String toString() {
        String output = "";

        output += "\n---Customer's Details---";
        output += "\nName - " + name;
        output += "\nTelephone - " + telephone;
        output += "\nEmail - " + email;
        output += "\nAddress - " + address;

        return output;
    }
}
