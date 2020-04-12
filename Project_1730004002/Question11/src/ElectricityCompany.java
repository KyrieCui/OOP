import java.util.ArrayList;

public class ElectricityCompany {
	private String name;
	private ArrayList<Consumer> consumers;
	private ArrayList<ModelListener> listeners;
	public ElectricityCompany(String name) {
		this.name=name;
		consumers=new ArrayList<Consumer>();
		listeners=new ArrayList<ModelListener>();
	}
	public void addConsumer(Consumer consumer) {
		consumers.add(consumer);
		notifyListeners();
	}	//add consumer
	
	public int totalConsumption() {
		int totalConsumption=0;
		for(Consumer consumer:consumers) {
			totalConsumption=totalConsumption+consumer.getPower();
		}	//calculate the totalConsumption
		return totalConsumption;
	}	//a method to calculate total consumption
	public int getPower(String name) throws UnknownConsumerException {
		int power=0;
		for(int i=0;i<consumers.size();i++) {
			Consumer consumer=consumers.get(i);
		//for(Consumer consumer:consumers) {
			if(name.equals(consumer.getName())) {
				power=consumer.getPower();
				break;
			}
			else if(i==consumers.size()-1&&name!=consumer.getName())
				throw new UnknownConsumerException("Consumer "+name+" unknown");
				}
		return power;
	}	//a method to get the consumer power
	
	public void morePower(String name,int amount) throws Exception{
		int power=0;
		for(int i=0;i<consumers.size();i++) {
			Consumer consumer=consumers.get(i);
			//for(Consumer consumer:consumers) {
			if(name.equals(consumer.getName())) {
				//power=consumer.getPower();
				//power=power+amount;
				consumer.morePower(amount);
				break;
			}
			else if(i==consumers.size()-1&&name!=consumer.getName())
				throw new UnknownConsumerException("Consumer "+name+" unknown");		
		}
		notifyListeners();
	}	//a method to more power
	
	public void addListener(ModelListener l) {
		listeners.add(l);
	}	//a method to add ModelListener into the ArrayList
	
	private void notifyListeners() {
		for(ModelListener l:listeners) {
			l.update();	// Tell the listener that something changed
		}
	}
	
	
	public static void testElectricityCompany() throws Exception {
		ElectricityCompany e1=new ElectricityCompany("Company1");	//new a e1 object to test
		e1.addConsumer(new House("Kyrie",2000));	//add a house consumer
		e1.addConsumer(new PowerPlant("UIC Power Plant", 10000));	//add a PowerPlant consumer
		e1.addConsumer(new SolarHouse("Bob",1000));	//add a solar house consumer
		System.out.println(e1.totalConsumption()==-7000);	//test the totalConsumption method
		System.out.println(e1.getPower("Kyrie")==2000);		
		System.out.println(e1.getPower("UIC Power Plant")==-10000);
		System.out.println(e1.getPower("Bob")==1000);	
		//test the getPower method
		try {
			System.out.println(e1.getPower("abc"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage().equals("Consumer abc unknown"));
		}//try the getPower method with a unknown consumer
		
		e1.morePower("Kyrie", 200);
		System.out.println(e1.getPower("Kyrie")==2200);
		e1.morePower("UIC Power Plant", 1000);
		System.out.println(e1.getPower("UIC Power Plant")==-11000);
		e1.morePower("Bob", 500);
		System.out.println(e1.getPower("Bob")==1500);
		//test the morePower method 
		

		try {
			e1.morePower("abc", 1000);	//test the morePower method with unknown consumer
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage().equals("Consumer abc unknown"));
		}

		
		
		
		
	}
	
}
