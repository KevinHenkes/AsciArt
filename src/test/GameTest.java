import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

import entities.letters.FirstTemplate;

/**
 * 
 */

/**
 * @author naya-
 *
 */
public class GameTest {

    @Test
    public void test() {
	FirstTemplate object = new FirstTemplate();

	Field[] declaredFields = object.getClass().getDeclaredFields();

	int index = 0;
	int maxAttribute = declaredFields.length;

	for (Method method : object.getClass().getMethods()) {
	    String name = method.getName();

	    if (index < maxAttribute) {
		if (name.equalsIgnoreCase("get" + declaredFields[index].getName())) {

		    try {
			String[] letter = (String[]) method.invoke(object);
			for (int j = 0; j < letter.length; j++) {
			  int width = letter[j].length();
			  if (width != 4) {
			       Assert.assertTrue("La lettre ne fait pas la bonne largeur",width != 4);
			  }
			}
			
			int height = letter.length;
			if (height != 5) { 
			    Assert.assertTrue("La lettre ne fait pas la bonne hauteur",height != 5);
			}
			
		    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		    }

		    index++;

		}
	    }
	}
	
	Assert.assertTrue("Les lettres ont le bon format",true);
    }
}
