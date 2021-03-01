package osakerekisteri.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import osakerekisteri.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.01 15:30:11 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class OsakeTest {



  // Generated by ComTest BEGIN
  /** testRegister69 */
  @Test
  public void testRegister69() {    // Osake: 69
    Osake osake1 = new Osake(); 
    assertEquals("From: Osake line: 71", 0, osake1.getNextId()); 
    assertEquals("From: Osake line: 72", 1, osake1.register()); 
    Osake osake2 = new Osake(); 
    osake2.register(); 
    int n1 = osake1.getNextId(); 
    int n2 = osake2.getNextId(); 
    assertEquals("From: Osake line: 77", n2-1, n1); 
  } // Generated by ComTest END
}