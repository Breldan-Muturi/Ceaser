package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptTest {
// Instantiate  my test Text field which will run each time a test is run
  private Encrypt myTest = new Encrypt("Turi", 2);

  @Test
//  Checks that myTest created is an instance of Encrypt
  public void runEncrypt_instantiate(){
    assertTrue(myTest instanceof Encrypt);
  }
  @Test
//  Check the getter for the text works
  public void runEncrypt_checkForText(){
    assertEquals("Turi",myTest.getText());
  }
  @Test
//  Checks the getter for the shift works
  public void runEncrypt_checkForShift(){
    assertEquals(2,myTest.getShift());
  }
  @Test
//  Checks the encrypt function works
  public void runEncrypt_EncryptUserText(){
    assertEquals("Xli",myTest.encryptMessage("The", 4));
  }
}
