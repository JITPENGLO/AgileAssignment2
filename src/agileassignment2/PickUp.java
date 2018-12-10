/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment2;

/**
 *
 * @author User
 */
public class PickUp {
    public String orderId;
    public String custID;
    public String custName;
    public String date;
    public String time;
    public double totalPrice;
    public String timeStamp;
    public String status;

    public PickUp(String orderId, String timeStamp, String status) {
        this.orderId = orderId;
        this.timeStamp = timeStamp;
        this.status = status;
    }
    
    public PickUp(String OrderId, String custID, String custName, String date, String time, double totalPrice, String timeStamp, String status){
        this.orderId = OrderId;
        this.custID  = custID;
        this.custName = custName;
        this.date = date;
        this.time = time;
        this.totalPrice = totalPrice;
        this.timeStamp = timeStamp;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
