import java.util.Date;

public class Projects {

    // Setting the project attributes

    String name;
    int number;
    String building_type;
    String proj_address;
    int erf_num;
    int proj_fee;
    int amount_paid;
    String deadline;

    public Projects(String name, int number, String building_type, String proj_address, int erf_num, int proj_fee, int amount_paid, String deadline) {

        this.name = name;
        this.number = number;
        this.building_type = building_type;
        this.proj_address = proj_address;
        this.erf_num = erf_num;
        this.proj_fee = proj_fee;
        this.amount_paid = amount_paid;
        this.deadline = deadline;
    }

    // Name
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    // Project number
    public int setNumber(int number) {
        this.number = number;
        return number;
    }

    public int getNumber() {
        return number;
    }

    // Building type
    public String setBuilding_type(String building_type) {
        this.building_type = building_type;
        return building_type;
    }

    public String getBuilding_type() {
        return building_type;
    }

    // Project address
    public String setProject_address(String proj_address) {
        this.proj_address = proj_address;
        return proj_address;
    }

    public String getProj_address() {
        return proj_address;
    }

    // ERF number
    public int setErf_num(int erf_num) {
        this.erf_num = erf_num;
        return erf_num;
    }

    public int getErf_num() {
        return erf_num;
    }

    // Project fee
    public int setProj_fee(int proj_fee) {
        this.proj_fee = proj_fee;
        return proj_fee;
    }

    public int getProj_fee() {
        return proj_fee;
    }

    public int setAmount_paid(int amount_paid) {
        this.amount_paid = amount_paid;
        return amount_paid;
    }

    public int getAmount_paid() {
        return amount_paid;
    }

    //Deadline
    public String getDeadline() {
        return deadline;
    }


    // toString
    public String toString() {

        String output = "";

        output += "\n---Project Details---";
        output += "\nProject name - " + name;
        output += "\nProject number " + number;
        output += "\nBuilding type - " + building_type;
        output += "\nProject Address - " + proj_address;
        output += "\nERF number - " + erf_num;
        output += "\nProject fee - R" + proj_fee;
        output += "\nAmount paid - R" + amount_paid;
        output += "\nProject deadline - " + deadline;

        return output;
    }

}
