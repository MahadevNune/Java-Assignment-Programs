
public class Stringuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer S1=new StringBuffer();
		StringBuffer S2=new StringBuffer(20);
		StringBuffer S3=new StringBuffer("Krishna Mohan");
		S1.append("Mahadev Nune");
		System.out.println("Append for Type 1 StringBuffer: "+S1);
		S2.append("Nune Mahadev Gupta");
		System.out.println("Append for Type 2 StringBuffer: "+S2);
		S3.append(" Nune");
		System.out.println("Append for Type 3 StringBuffer: "+S3);
		S1.insert(8, "Gupta ");
		System.out.println("Insert for Type 1 StringBuffer: "+S1);
		S2.insert(0, "My Name is ");
		System.out.println("Insert for Type 2 StringBuffer: "+S2);
		S3.insert(0, "My Father Name is ");
		System.out.println("Insert for Type 3 StringBuffer: "+S3);
		S1.delete(8, 14);
		System.out.println("Delete Gupta for Type 1 StringBuffer: "+S1);
		S2.delete(24, 30);
		System.out.println("Delete Gupta for Type 2 StringBuffer: "+S2);
		S3.delete(26, 32);
		System.out.println("Delete Mohan for Type 3 StringBuffer: "+S3);
		String Output=S1.substring(8);
		System.out.println("Retrieve Nune for Type 1 StringBuffer: "+Output);
		String Output2=S2.substring(11,23);
		System.out.println("Retrieve Nune Mahadev for Type 2 StringBuffer: "+Output2);
		S1.reverse();
		System.out.println("Reverse string Mahadev Nune for Type 1 StringBuffer: "+S1);
		int cap=S2.capacity();
		System.out.println("Checking the capacity of Type 2 StringBuffer:"+cap);
		S3.replace(0, 2,"Nune Mahadev's");
		System.out.println("Replacing My with Nune Mahadev's for Type 3 StringBuffer: "+S3);
		System.out.println(S2.length());
	}

}
