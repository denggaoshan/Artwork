package modeltest;

import static org.junit.Assert.*;

import org.junit.Test;

import action.UploadAction;

public class UploadTest {

	@Test
	public void test() {
		fail("Not yet implemented");
		String filePath= "C:/Users/Administrator/Desktop/15662_G_1421639292783.jpg";
		UploadAction uploadAction = new UploadAction();
		try {
			uploadAction.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
