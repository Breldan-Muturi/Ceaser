import models.Decrypt;
import models.Encrypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) throws IOException {

    boolean running = true;

    while (running){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("You are a trusted official in Turi's camp of Roman Soldiers. You encrypt and decrypt messages between Captain Turi and the Caesar. ");
      System.out.println("----------------------A NEW MESSAGE HAS ARRIVED FOR YOU!-----------------------\n" + "To ENCRYPT write message and press 1\n"+"To DECRYPT write message and press 2\n"+"To exit press 3\n");
      try{
        String choice = bufferedReader.readLine();

        if(choice.equals("1")){
          System.out.println("Enter message for encryption:");
          String text = bufferedReader.readLine();
          System.out.println("Enter encryption key:");
          int shift = Integer.parseInt(bufferedReader.readLine());

          Encrypt newEncryption = new Encrypt(text, shift);
          System.out.println("Your encrypted message is: "+ newEncryption.encryptMessage(text, shift));

        } else if(choice.equals("2")){
          System.out.println("Enter message for decryption:");
          String text = bufferedReader.readLine();
          System.out.println("Enter decryption key:");
          int shift = Integer.parseInt(bufferedReader.readLine());

          Decrypt newDecryption = new Decrypt(text,shift);
          System.out.println("Your decrypted message is: "+ newDecryption.decryptMessage(text, shift));

        } else if(choice.equals("3")){
          running = false;
        } else{
          System.out.println("Key in an acceptable input lieutenant!");
        }

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
