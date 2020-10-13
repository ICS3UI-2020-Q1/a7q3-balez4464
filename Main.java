/**
 *Created a program that prints stars in a random order
 * @author Zachary Balean 
 */
public class Main {

  public static void chaotic(int numOfLines){
    //for loop for printing lines
    for(int i = 0; i <= numOfLines; i++){
      //prints new line evrytime
      System.out.println();
      //to find random number
      int randNum = (int)(Math.random()*(4 - 1 + 1))+ 1;
      //prints stars that amount of time
      for(int j = 0; j <= randNum; j++){
        System.out.print("* ");
      }
    }

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calls method
    chaotic(6);
    
  }
}
