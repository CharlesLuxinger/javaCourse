package model.exceptions;

public class DomainException extends Exception{
	/*• Exception - o compilador obriga a tratar ou propagar
	  • RuntimeException - o compilador não obriga a tratar ou propagar */
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
