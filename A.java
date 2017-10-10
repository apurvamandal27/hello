/*Q5.Write a program to show the use of local,
instance and class variable.   */
//package college;
class A{
	int a;
	static int b=40;
	static void f(){
		System.out.println("Class variable     :"+b);
	} 
	void d(){
		System.out.println("Instance variable  :"+a);
	}
	public static void main(String[]args){
		A obj=new A();
		obj.f();
		obj.d();
		int c=10;
		System.out.println("Local variable     :"+c);
	}
}
