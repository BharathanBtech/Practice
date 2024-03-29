import java.util.ArrayList;
public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Product> objList = new ArrayList<Product>();
	
	Product obj1 = new Product();
	obj1.setproductName("Oppo V1");
	obj1.setproductpriceAndQuantity(20, 2);
	
	
	Product obj2 = new Product();	
	obj2.setproductName("Lenovo V1");
	obj2.setproductpriceAndQuantity(40, 4);
	
	
	objList.add(obj1);
	objList.add(obj2);
	
	 	
	objList.remove(obj1);	
	
	int objSize = objList.size();
	System.out.println(objSize);
	
	
	for(Product obj:objList) {
		
		System.out.println(
		"Product id is "+ obj.GetNewProductID()+
		" your product name is "+obj.getproductName()+
		" your product price is "+obj.getproductprice()+
		" your total amount to pay is "+obj.totalAmount
		);
	}
	
	

	}

}
