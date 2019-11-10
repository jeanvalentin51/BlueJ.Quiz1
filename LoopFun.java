 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int result = 1;
          
          for (int i=1; i<=number; i++){
              result *= i;
          }
          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String result = "";
          
          // parse the phrase and extract the words
          String [] word = phrase.split(" ");
          int iLoop = word.length;

          for (int i=0; i<iLoop; i++){
           
           // get first letter from each word   
           result += word[i].charAt(0);

          }

          // convert to upper case
          result = result.toUpperCase();
          return result;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String [] alphabet = {"a","b","c", "d", "e", "f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String [] toEncrypt = word.split("");
        String result = "";

        int newIndex = 0;
        for (int x = 0; x < toEncrypt.length; x++) {
            for (int i = 0; i < alphabet.length; i++) {
                newIndex = i + 3;
                if (newIndex >= alphabet.length) {
                    newIndex -= alphabet.length;
                }
                if (toEncrypt[x].equals(alphabet[i])){
                    result = result.concat(alphabet[newIndex]);
                }

            }
        }
        return result;
      }
}
