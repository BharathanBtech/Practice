
public class Product {
	
	/* Declaring the variables required */
	
	private float productId;
	private String productName;
	private double price;
	private int quantity;
	public double totalAmount;

	
	/* Constructor of the class 
	
	public Product(float productId,String productName,double price,int quantity) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;		
	}
	
	*/
	/* Generating the new product id */
	
	public float GetNewProductID() {
		productId = (float) Math.random();
		return productId;
	}
	
	/* Setting the product name */
	
	public void setproductName(String productName)
	{
		this.productName = productName;
	}
	
	/* Getting the product name */
	
	public String getproductName()
	{
		return this.productName;
	}
	
	/* Setting the product price */
	
	public void setproductpriceAndQuantity(double price,int quantity)
	{
		this.price = price;
		this.quantity=quantity;
		this.totalAmount = getTotal(this.price,this.quantity);
		
	}
	
	/* Getting the product price */
	
	public double getproductprice()
	{
		return this.price;
	}
	
	/* Getting the product quantity */
	
	public double getproductquantity()
	{
		return this.quantity;
	}
	
	
	/* Getting the total amount   */
	
	private double getTotal(double price,int quantity) {
		totalAmount = this.price*this.quantity;
		return totalAmount;
	}

}
