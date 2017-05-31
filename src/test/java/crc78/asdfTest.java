import org.junit.Test;
import static org.junit.Assert.*;

import crc78.asdf;

public class asdfTest {

  @Test
  public void lazy1(){
    assertEquals(asdf.lazy(3), 7);
  }

  @Test
  public void lazy2(){
    assertEquals(asdf.lazy(10), 56);
  }

  @Test
  public void lazy3(){
    assertEquals(asdf.lazy(0), 1);
  }

  @Test
  public void tri1(){
    assertEquals(asdf.triangle(0), 0);
  }

  @Test
  public void tri2(){
    assertEquals(asdf.triangle(3), 6);
  }

  @Test
  public void tri3(){
    assertEquals(asdf.triangle(10), 55);
  }


}
