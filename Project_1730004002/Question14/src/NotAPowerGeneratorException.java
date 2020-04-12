import java.io.Serializable;

public class NotAPowerGeneratorException extends Exception implements Serializable {
	public NotAPowerGeneratorException(String msg){
		super(msg);
	}
}
