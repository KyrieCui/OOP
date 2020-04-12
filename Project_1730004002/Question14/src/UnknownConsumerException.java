import java.io.Serializable;

public class UnknownConsumerException extends Exception implements Serializable{
	public UnknownConsumerException(String msg) {
		super(msg);
	}
}
