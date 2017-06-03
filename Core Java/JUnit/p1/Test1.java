package p1;

import static org.junit.Assert.*;

import org.junit.Test;

import InterviewProgramms.BalancedString;


public class Test1 {
	/*@Test
	public void testadd(){
		String str="Hello";
		assertEquals("Hello",str);
		
	}*/
	@Test
	public void testadd(){
	BalancedString b=new BalancedString();
	String s="{ab}ab[ab]]";
	assertEquals(b.check(s),s+" Balanced");
	}

}
