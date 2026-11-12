package practiceProgram;

public class MovieTicket {
	String movieName;
	String customerName;
	double ticketPrice;
	int numberOfTickets;
	
	MovieTicket(String movieName,String customerName,double ticketPrice,int numberOfTickets){
		this.movieName=movieName;
		this.customerName=customerName;
		this.ticketPrice=ticketPrice;
		this.numberOfTickets=numberOfTickets;
	}
	
	void calculateAmount() {
		double total=ticketPrice * numberOfTickets;
		double discount=0;
		
		if(total>1000) {
			discount=total*0.10;
		}
		
		double payable=total-discount;
		System.out.println("Movie Name : " +movieName);
		System.out.println("Customer Name : " +customerName);
		System.out.println("Total Amount : Rs. "+total);
		System.out.println("Discount : Rs. "+discount);
		System.out.println("Final payable Amount : " +payable);
	}
	
	public static void main(String[] args) {
		MovieTicket m=new MovieTicket("Ramayana","Shradha",350,4);
		m.calculateAmount();
		
	}

}
