package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> orderItems = new ArrayList<OrderItem>();

	public Order() {

	}

	public Order(Client client, OrderStatus status) {
		this.status = status;
		this.client = client;
		this.moment = new Date();

	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItens() {
		return orderItems;
	}

	public void addOrderItem(OrderItem orderItem) {
		this.orderItems.add(orderItem);
	}

	public void removeOrderItem(OrderItem orderItem) {
		this.orderItems.remove(orderItem);
	}
	
	public double totalPrice() {
		double sum = 0;
		for (OrderItem ord : orderItems) {
			sum += (double)ord.getQuantity() * ord.getPrice();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status  + "\n");
		sb.append("Client: " + client  + "\n");

		for (OrderItem ord : orderItems) {
			sb.append(ord);
		}
		sb.append("Total price: $" + String.format("%.2f", totalPrice()));
		return sb.toString();
	}

}
