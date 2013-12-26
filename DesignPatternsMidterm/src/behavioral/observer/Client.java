package behavioral.observer;

public class Client {
	
	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer obj1 = new MyTopicSubscriber("Subscriber1");
		Observer obj2 = new MyTopicSubscriber("Subscriber2");
		Observer obj3 = new MyTopicSubscriber("Subscriber3");
		Observer obj4 = new MyTopicWatcher("Watcher1");
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		topic.register(obj4);
		
		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		obj4.setSubject(topic);
		
		//check if any update is available
		obj1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
	}

}
