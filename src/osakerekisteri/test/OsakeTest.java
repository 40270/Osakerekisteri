package osakerekisteri.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import osakerekisteri.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.02 17:30:52 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class OsakeTest {



  // Generated by ComTest BEGIN
  /** testGetName45 */
  @Test
  public void testGetName45() {    // Osake: 45
    Osake stock = new Osake(); 
    stock.giveStock(); 
    { String _l_=stock.getName(),_r_="Nokia Oyj.*"; if ( !_l_.matches(_r_) ) fail("From: Osake line: 48" + " does not match: ["+ _l_ + "] != [" + _r_ + "]");}; 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testRegister82 */
  @Test
  public void testRegister82() {    // Osake: 82
    Osake osake1 = new Osake(); 
    assertEquals("From: Osake line: 84", 0, osake1.getNextId()); 
    assertEquals("From: Osake line: 85", 1, osake1.register()); 
    Osake osake2 = new Osake(); 
    osake2.register(); 
    int n1 = osake1.getNextId(); 
    int n2 = osake2.getNextId(); 
    assertEquals("From: Osake line: 90", n2-1, n1); 
  } // Generated by ComTest END
}