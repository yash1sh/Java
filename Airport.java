
class Airport 
{
	String location;
	int number_of_planes;
	int capacity;
	int place_area;
	airplane ac; 
	
	Airport(String location , int number_of_planes,int capacity,int place_area,airplane ac)
	{
		this.location=location;
		this.number_of_planes=number_of_planes;
		this.capacity=capacity;
		this.place_area = place_area;
		this.ac=ac;
	}
	
	public static void main(String arhs[])
	{
		Airport a=new Airport("Mangalora",43,43,69, new airplane("red",69,69));
		System.out.println(a.ac.seats);
	}
	
}


