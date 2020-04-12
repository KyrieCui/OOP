import java.io.Serializable;

public interface Consumer extends Serializable {
	public String getName();
	public int getPower();
	public void morePower(int amount) throws Exception;
}
