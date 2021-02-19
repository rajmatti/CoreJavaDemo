class Sample<T>   // generic class
{
	private T data;

	public Sample(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
		
		Sample<Integer> s1=new Sample<Integer>(15); // creating  a objct of generic class
		//s1.setData(15);
		System.out.println("Display from generic class of type Integer: "+s1.getData());
		
		Sample<String> s2=new Sample<String>("Java Generics"); // creating  a objct of generic class
		//s2.setData("Java Generics");
		System.out.println("Display from generic class of type String: "+s2.getData());
		
		Sample<Float> s3=new Sample<Float>(120.35f); // creating  a objct of generic class
		//s3.setData(120.35f);
		System.out.println("Display from generic class of type String: "+s3.getData());
	}

}
