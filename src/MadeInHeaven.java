
public class MadeInHeaven implements IMadeInHeaven {
	Customer cus1;
	Customer cus2;
	Customer cus3;
	Customer cus4;
	Customer cus5;
	Customer cus6;

	Customer[] customers=new Customer[6];
	
	@Override
	public boolean validateName(String name) {
		
		if(cus1!=null && cus1.getName().equalsIgnoreCase(name))
			return true;
		else if(cus2!=null && cus2.getName().equalsIgnoreCase(name))
			return true;
		else if(cus3!=null && cus3.getName().equalsIgnoreCase(name))
			return true;
		else if(cus4!=null && cus4.getName().equalsIgnoreCase(name))
			return true;
		else if(cus5!=null && cus5.getName().equalsIgnoreCase(name))
			return true;
		else if(cus6!=null && cus6.getName().equalsIgnoreCase(name))
			return true;
		else
			return false;
	}

	int customerCount=1;
	@Override
	public boolean register(String name, String hobby, long telephone) {
		
		if(customerCount==1)
			cus1=new Customer(name,hobby,telephone);
		else if(customerCount==2)
			cus2=new Customer(name,hobby,telephone);
		else if(customerCount==3)
			cus3=new Customer(name,hobby,telephone);
		else if(customerCount==4)
			cus4=new Customer(name,hobby,telephone);
		else if(customerCount==5)
			cus5=new Customer(name,hobby,telephone);
		else if(customerCount==6)
			cus6=new Customer(name,hobby,telephone);
		else
			return false;
		
		customerCount++;
		return true;
	}

	@Override
	public void findMatch(String name) {
		
		Customer inputCustomer=null;
		if(cus1!=null && cus1.getName().equalsIgnoreCase(name))
			inputCustomer=cus1;
		else if(cus2!=null && cus2.getName().equalsIgnoreCase(name))
			inputCustomer=cus1;
		else if(cus3!=null && cus3.getName().equalsIgnoreCase(name))
			inputCustomer=cus1;
		else if(cus4!=null && cus4.getName().equalsIgnoreCase(name))
			inputCustomer=cus1;
		else if(cus5!=null && cus5.getName().equalsIgnoreCase(name))
			inputCustomer=cus1;
		else if(cus6!=null && cus6.getName().equalsIgnoreCase(name))
			inputCustomer=cus1;
		else
			System.out.println("User not found");
		
		System.out.println("input customer:"+inputCustomer);
		
		System.out.println("cus1:"+cus1);
		System.out.println("cus2:"+cus2);
		if(inputCustomer!=null && !inputCustomer.getName().equalsIgnoreCase(cus1.getName()) && inputCustomer.getHobby().equals(cus1.getHobby()))
		{
			System.out.println("Mathced with customer:"+cus1.getName());
		}
		else if(inputCustomer!=null && !inputCustomer.getName().equalsIgnoreCase(cus2.getName()) && inputCustomer.getHobby().equals(cus2.getHobby()))
		{
			System.out.println("Mathced with customer:"+cus2.getName());
		}
		else if(inputCustomer!=null && !inputCustomer.getName().equalsIgnoreCase(cus3.getName()) && inputCustomer.getHobby().equals(cus3.getHobby()))
			System.out.println("Mathced with customer:"+cus3.getName());
		else if(inputCustomer!=null && !inputCustomer.getName().equalsIgnoreCase(cus4.getName()) && inputCustomer.getHobby().equals(cus4.getHobby()))
			System.out.println("Mathced with customer:"+cus4.getName());
		else if(inputCustomer!=null && !inputCustomer.getName().equalsIgnoreCase(cus5.getName() )&& inputCustomer.getHobby().equals(cus5.getHobby()))
			System.out.println("Mathced with customer:"+cus5.getName());
		else if(inputCustomer!=null && !inputCustomer.getName().equalsIgnoreCase(cus6.getName()) && inputCustomer.getHobby().equals(cus6.getHobby()))
			System.out.println("Mathced with customer:"+cus6.getName());
		
	}

}
