import static java.lang.System.out;
class Narrowing2{
public static void main(String args[])
{
	int d=(short)4.8d;
	int d1=(int)(short)(int)(float)(long)5.8d;
	int ch=(int)'A';
	char a=(char)65;
	byte b= (byte)130;
	int l=(int)11212121212121212L;
	out.println(l);
	out.println(b);
}
}	