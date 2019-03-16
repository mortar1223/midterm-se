class Movie {
	String name;
	String detail;
	double price;
	String showTime;

	public Movie(String name, String detail, double price, String showTime){
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.showTime = showTime;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getDetail(){
		return detail;
	}

	public void setDetail(String detail){
		this.detail = detail
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public String getShowTime(){
		return showTime;
	}

	public void setShowTime(String showTime){
		this.showTime = showTime
	}
}