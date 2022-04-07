package model;

import java.sql.Date;

public class Orders {

	private Date today;
	private int idOrder;
	private float total;
	private int idCstm;
	
	public Orders() {		
		today = new Date(System.currentTimeMillis());		
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getIdCstm() {
		return idCstm;
	}

	public void setIdCstm(int idCstm) {
		this.idCstm = idCstm;
	}
	
}
