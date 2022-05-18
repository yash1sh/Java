

class fruit
{
	
}

class apple extends fruit

{
	
}

class mango extends fruit
{
	
}

public class green extends apple{
public static void main(String[] args) {
	green a=new green();
	System.out.println(a instanceof apple);
	System.out.println(a instanceof fruit);
	green g=new apple();
	
	
}
}
