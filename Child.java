package superKeyword;

public class Child extends Parent {
	void f1() {
		super.f1();
//		System.out.println(this);
		System.out.println("Child class f1");
	}
}
