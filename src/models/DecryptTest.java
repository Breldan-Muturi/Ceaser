package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
  // Instantiate  my test Text field which will run each time a test is run
  private Decrypt myTest = new Decrypt("Turi", 5);

  @Test
  //  Checks that myTest created is an instance of Decrypt
  public void runDecrypt_instantiate() {
    assertTrue(myTest instanceof Decrypt);
  }

  @Test
  //  Check the getter for the text works
  public void runDecrypt_checkForText() {
    assertEquals("Turi", myTest.getText());
  }

  @Test
  //  Check the getter for the shift works
  public void runDecrypt_checkForShift() {
    assertEquals(5,myTest.getShift());
  }
  @Test
//  Check the decryption works
  public void runEncrypt_DecryptUserText(){
    assertEquals("The",myTest.decryptMessage("Xli",4));
  }
}
