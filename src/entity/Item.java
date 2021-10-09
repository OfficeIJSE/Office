package entity;

/**
 * @auther : Madhushani Gamage
 * @Data : / / 2021
 **/
public class Item {
    private  String itemCode;
    private String itemName;
    private String qty;

    public Item() {
    }

    public Item(String itemCode, String itemName, String qty) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.qty = qty;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
