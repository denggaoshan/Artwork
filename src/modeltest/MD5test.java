package modeltest;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Utils;

public class MD5test {

	@Test
	public void test() {
		Utils util = new Utils();
		String str = util.MD5("123456");
		System.out.println(str);
	}

}
