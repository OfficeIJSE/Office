package entity;

/**
 * @auther : Madhushani Gamage
 * @Data : / / 2021
 **/
public class Customer {

    private String  cID;
    private String name;
    private String address;

    public Customer() {
    }

    public Customer(String cID, String name, String address) {
        this.cID = cID;
        this.name = name;
        this.address = address;
    }

    /**
     * @return the cID
     */
    public String getcID() {
        return cID;
    }

    /**
     * @param cID the cID to set
     */
    public void setcID(String cID) {
        this.cID = cID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "cID=" + cID + ", name=" + name + ", address=" + address + '}';
    }


}
