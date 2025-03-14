package soccervs.reciever.movimentacao.config.exceptions;

public class ExceptionDetails {
	private int status;
	private String message;

	public ExceptionDetails(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public ExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
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
