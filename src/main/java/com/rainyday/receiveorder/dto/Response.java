package com.rainyday.receiveorder.dto;

public class Response<T> {

    private String status;
    private String message;
    private T products;

    public Response(String status, String message, T products) {
        this.status = status;
        this.message = message;
        this.products = products;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getProducts() {
		return products;
	}

	public void setProducts(T product) {
		this.products = product;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + ", product=" + products + "]";
	}
}
