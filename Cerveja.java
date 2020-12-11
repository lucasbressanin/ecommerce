import java.util.Date;

public class Cerveja extends Produto {
	double teor_alcolico;
	Date validade;
	
	public Cerveja(String name, double value) {
		super(name, value);
	}
}
