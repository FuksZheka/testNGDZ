package model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Order{

	@SerializedName("petId")
	private int petId;

	@SerializedName("quantity")
	private int quantity;

	@SerializedName("id")
	private int id;

	@SerializedName("shipDate")
	private String shipDate;

	@SerializedName("complete")
	private boolean complete;

	@SerializedName("status")
	private String status;

	public void setPetId(int petId){
		this.petId = petId;
	}

	public int getPetId(){
		return petId;
	}


	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setShipDate(String shipDate){
		this.shipDate = shipDate;
	}

	public String getShipDate(){
		return shipDate;
	}

	public void setComplete(boolean complete){
		this.complete = complete;
	}

	public boolean isComplete(){
		return complete;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Order{" + 
			"petId = '" + petId + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",id = '" + id + '\'' + 
			",shipDate = '" + shipDate + '\'' + 
			",complete = '" + complete + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Order order = (Order) o;
		return petId == order.petId && quantity == order.quantity && id == order.id && complete == order.complete && Objects.equals(shipDate, order.shipDate) && Objects.equals(status, order.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(petId, quantity, id, shipDate, complete, status);
	}
}