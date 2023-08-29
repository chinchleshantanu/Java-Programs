/* write a program to demonstrate automatic type conversion (implicit) and type casting (explicit).*/

class Test
{
	public static void main(String[] args) {
		byte b;
		int i=500;
		float f=123.56f;
		System.out.println("\n conversion of Float to byte");
		b=(byte)f;
		System.out.println("\n float was"+f+"and Byte is"+b);
		System.out.println("\n conversion of int to float");
		f=i;
		System.out.println("\n Int was"+i+"and float is"+f);
}
}
