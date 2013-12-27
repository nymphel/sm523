package tr.edu.metu.ii.sm.dp.shopping;

//Subject
public interface Subject {
	
	//methods to register and unregister observers
		public void register(Observer obj);
		public void unregister(Observer obj);

		//method to notify observers of change
		public void notifyObservers();

}
