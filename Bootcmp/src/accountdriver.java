
package Bootcmp;


class accountdriver {

	public static void main(String [] args)
	{
		Account ac=new Account();
		ac.setname("Yash");
		ac.setage(12);
		ac.setsurname("Shetty");
		ac.setusn(983728);
		System.err.printf("Name is "+ac.getNamme()+"\nUsn is "+ac.getusn()+"\nAge is "+ac.getage()+"surname is "+ac.getsurname());
	}

}
