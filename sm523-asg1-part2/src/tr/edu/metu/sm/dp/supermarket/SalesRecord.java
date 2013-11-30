package tr.edu.metu.sm.dp.supermarket;

import java.util.Date;

public class SalesRecord {

	private int id;
	private int cashierName;

	private String customerUniversalId;
	private String customerName;

	private String productUniversalBarcode;
	private String productBarcode;

	private int paymentType;
	private double price;
	private Date date;
	
	private String category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCashierName() {
		return cashierName;
	}

	public void setCashierName(int cashierName) {
		this.cashierName = cashierName;
	}

	public String getCustomerUniversalId() {
		return customerUniversalId;
	}

	public void setCustomerUniversalId(String customerUniversalId) {
		this.customerUniversalId = customerUniversalId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductUniversalBarcode() {
		return productUniversalBarcode;
	}

	public void setProductUniversalBarcode(String productUniversalBarcode) {
		this.productUniversalBarcode = productUniversalBarcode;
	}

	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
