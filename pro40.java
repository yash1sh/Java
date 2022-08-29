class pro40{
    String hotelName;
    int getNo;
    String address;
    int bill;
    pro40(String hotelName,int getNo,String address,int bill)
    {
        this.hotelName=hotelName;
        this.getNo=getNo;
        this.address=address;
        this.bill=bill;
        
    }
    public String toString()
    {
        return "Hotel-Name: "+hotelName+"\nHotel-no: "+getNo+"\nAddress: "+address+"\nbill is : "+bill;
    }
    public static void main(String[] args) {
        pro40 p= new pro40("Taj Mehal", 696969, "Delhi", 99999999);
        System.out.println(p);
    }
}