import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {

 GradeBook g1;
	  @Before
	  //implement the setUp method
	  public void setUp() throws Exception {
	    g1 = new GradeBook(5);
	    g1.addScore(50.0);
	    g1.addScore(75.0);
	  }

	  @After
	  public void tearDown() throws Exception {
	    g1 = null;
	  }
      // implement the testAddScore method
	  @Test
	  public void testAddScore() {
	    assertTrue(g1.toString().equals("50.0 75.0 "));
	    assertEquals(2.0, g1.getScoreSize(), 0.01);
	    
	  }
	  //implement testSum method
 
	  @Test
	  public void testSum() {
	    assertEquals(125, g1.sum(), 0.0001);
	 
	  }
     //implement the testMinimum method
	  @Test
	  public void testMinimum() {
	    assertEquals(50.0, g1.minimum(), 0.0001);
	   
	  }
     //implement testFinalScore method
	  @Test
	  public void testFinalScore() {
	    assertEquals(75.0, g1.finalScore(), 0.0001);
	    
	  }
	}




