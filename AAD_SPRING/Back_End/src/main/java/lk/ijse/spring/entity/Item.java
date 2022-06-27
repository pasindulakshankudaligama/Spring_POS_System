package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Item {
    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private double unitPrice;

    public Item() {
    }

    public Item(String code, String description, int qtyOnHand, double unitPrice) {
        this.code = code;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("code='").append(code).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", qtyOnHand=").append(qtyOnHand);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append('}');
        return sb.toString();
    }
}
