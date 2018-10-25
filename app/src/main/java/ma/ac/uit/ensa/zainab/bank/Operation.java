package ma.ac.uit.ensa.zainab.bank;

public class Operation {
    Integer imageID;
    String operation;
    String price;
    String date;

    public Operation(Integer imageID, String operation,  String price, String date) {
        this.imageID = imageID;
        this.operation = operation;
        this.price = price;
        this.date = date;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public  String getPrice() {
        return price;
    }

    public void setPrice( String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
