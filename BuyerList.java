import java.util.ArrayList;

class BuyerList {
	ArrayList<Buyer> buyers = new ArrayList<Buyer>();

	public void addBuyer(Buyer b){
		buyers.add(b);
	}

	public void deleteBuyerByName(String name){
		for(int i = 0; i < buyers.size(); i++){
			if(buyers.get(i).getName() == name){
				buyers.remove(i);
				return;
			}
		}
	}
}