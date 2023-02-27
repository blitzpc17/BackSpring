package com.gestiondocumentalserviciosdocentes.demo.modelo;

public class FileResponse {
	
	private String timestamp;
    private int status;
    private String message;
    
	public FileResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileResponse(String timestamp, int status, String message) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
}
