
public interface Subject {
	public void registerObserver(Observer) {
	}
	
	public void removeObserver(Observer) {
	}
	
	public void notifyObservers() {
	}

}


public class Channel implements Subject {
	private ArrayList<Observers> observers = new ArrayList<Observer>();
	private String channelName;
	private String status;
	
	public Channel(String name, String status) {
		this.channelName = name;
		this.status = status;
	}
	
	public String getStatus(){
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void notifyObservers() {
		for (Observer obsv : Observers) {
			obsv.update();
		}
	}
	
	public void registerObserver(Observer obsv) {
		Observers.add(obsv);
	}
	
	public void removeObserver(Observer obsv) {
		if (observers.contains(0bsv) {
			observers.remove(obsv);
		}		
	}
  
}


public interface Observer {
	public void update(String status);
}


public class Follower implements Observer {
	private String followerName;
	
	public Follower(String name) {
		this.followerName = name;
	}
	
	public void update (String status) {
		System.out.println("THE STATUS IS " + status);
	}
	
	public void play() {
		System.out.println("Plays video");
	}

}
