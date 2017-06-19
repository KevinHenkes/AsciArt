import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author naya-
 *
 */
public class UserCase {

	@Test
	public void testUser() {
		assertNull(["Nom de l'utilisateur non saisi"], nomUser);
	}
	public void testmessageaccueil(){
		assertEquals("Bonjour", messageAccueil);
	}
	
}
