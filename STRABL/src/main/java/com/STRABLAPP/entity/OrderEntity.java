//package com.STRABLAPP.entity;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="order")
//public class OrderEntity {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	long Id;
//	@Column(name="customer_id")
//	long customerId;
//	@Column(name="order_detail")
//	OrderDetailEntity orderDetail;
//
//	public OrderEntity(long id, long customerId, OrderDetailEntity orderDetail) {
//		super();
//		Id = id;
//		this.customerId = customerId;
//		this.orderDetail = orderDetail;
//	}
//
//	public long getId() {
//		return Id;
//	}
//
//	public void setId(long id) {
//		Id = id;
//	}
//
//	public long getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(long customerId) {
//		this.customerId = customerId;
//	}
//
//	public OrderDetailEntity getOrderDetail() {
//		return orderDetail;
//	}
//
//	public void setOrderDetail(OrderDetailEntity orderDetail) {
//		this.orderDetail = orderDetail;
//	}
//
//}
