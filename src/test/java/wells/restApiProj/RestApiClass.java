package wells.restApiProj;

import org.testng.annotations.Test;
interface Interef{
	public void m1(int a, int b);
}
public class RestApiClass {
  @Test
  public void f() {
	  Interef i=(a,b)->System.out.println("hi this is from lambda expression"+a+b);
	  i.m1(10,20);
  }
}
