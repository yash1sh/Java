
import java.util.Scanner;
 class Book {

	 private String book_name;
	 private String book_author;
	 private int book_id;
	 private int book_price;
	
	Book(){}
//	Book(String book_name,String book_author,int  book_id,int book_price)
//	{
//		this.book_name=book_name;
//		this.book_author = book_author;
//		this.book_id=book_id;
//		this.book_price=book_price;
//	}
	
	public void EnterBookDetails()
	{
		Scanner sc=new Scanner(System.in);
		Book bb=new Book();
		System.out.println("Enter the details");
		System.out.println("Book name ");
		book_name=sc.nextLine();
		System.out.println("Book author name ");
		book_author=sc.nextLine();
		System.out.println("Book id ");
		book_id=sc.nextInt();
		System.out.println("Book price ");
		book_price=sc.nextInt();
	}
	public String getbook_name()
	{
		return book_name;
	}
//	 void Bookprint()
//	{
//	System.out.printf("Book Name is ="+book_name+"\n Book author is = "+book_author+"\n Book id is = "+book_id+"\n Book price is = "+book_price);
//	}

}
