package integrationtpun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriTableauTest {

	@Test
	public void testCroissant() throws Exception {
		int tab[] = {2,4,5,6,8,1};
		int valid[] = {1,2,4,5,6,8};
		TriTableau.triCroissant(tab);
		assertEquals(valid[0],tab[0]);
	}
	@Test
	public void testDecroissant() throws Exception {
		int tab[] = {2,4,5,6,8,1};
		int valid[] = {8,6,5,4,2,1};
		TriTableau.triDecroissant(tab);
		assertEquals(valid[0],tab[0]);
	}

}
