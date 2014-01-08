package tr.edu.metu.ii.sm.dp.shopping;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String name;
	private int cost;
	
	private List<String> followers;
	private List<String> negativeComments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<String> getFollowers() {
		if(followers == null) {
			followers = new ArrayList<>();
		}
		return followers;
	}
	
	public List<String> getNegativeComments() {
		if(negativeComments == null) {
			negativeComments = new ArrayList<>();
		}
		return negativeComments;
	}


}
