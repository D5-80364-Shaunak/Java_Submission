class Invoice{
	private String part_number;
	private String part_desc;
	private int qty_item;
	private double price_per_item;
	public String getPart_number() {
		return part_number;
	}
	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}
	public String getPart_desc() {
		return part_desc;
	}
	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}
	public int getQty_item() {
		return qty_item;
	}
	public void setQty_item(int qty_item) {
		if(qty_item <= 0) {
			this.qty_item = 0;
		}
		else
		{
			this.qty_item = qty_item;
		}
		
	}
	public double getPrice_per_item() {
		return price_per_item;
	}
	public void setPrice_per_item(double price_per_item) {
		if(price_per_item <= 0.0) {
			this.price_per_item = 0.0;
		}
		else
		{
			this.price_per_item = price_per_item;
		}
		
	}
	
	public double getTotalPrice() {
		return (this.qty_item * this.price_per_item);
	}
	
	public Invoice(String num, String desc, int qty, double price)
	{
		this.part_number = num;
		this.part_desc = desc;
		this.qty_item = qty;
		this.price_per_item = price;
	}
	
}


public class ProblemOne {

	public static void main(String[] args) {
		Invoice i1 = new Invoice("0011", "ScrewDriver",5, 20.50 );
		System.out.println("Part number =" + i1.getPart_number());
		System.out.println("Part_desc :" + i1.getPart_desc());
		System.out.println("part quantity :" + i1.getQty_item());
		System.out.println("total price :" + i1.getTotalPrice());
	}

}
