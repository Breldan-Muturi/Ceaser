package models;

public class Decrypt {
  private String text;
  private int shift;

  public Decrypt(String text, int shift) {
    this.text = text;
    this.shift = shift;
  }

  public String getText() {
    return text;
  }

  public int getShift() {
    return shift;
  }
  public static String decryptMessage(String text, int shift){
    if(shift > 26){
      shift = shift % 26;
    } else if( shift < 0){
      shift = (shift%26) + 26;
    }

    String decryptedtext = "";
    int length = text.length();
    for(int i = 0; i < length; i++){
      char ch = text.charAt(i);
      if(Character.isLetter(ch)){
        if(Character.isLowerCase(ch)){
          char c = (char)(ch-shift);
          if(c < 'a'){
            decryptedtext += (char) (ch +(26 - shift));
          } else{
            decryptedtext += c;
          }
        } else if (Character.isUpperCase(ch)){
          char c = (char)(ch-shift);
          if(c < 'A'){
            decryptedtext += (char) (ch +(26 - shift));
          } else{
            decryptedtext += c;
          }
        }
      }else{
        decryptedtext += ch;
      }
    }
    return decryptedtext;
  }

}
