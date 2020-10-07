import java.util.*;

class Main {
  public static void main(String[] args) {
    /*total varible (created outside loop - adds to every iteration)
    string- find length of num inside variable(changes every iteration)
    array created outside loop
    2xforloops 1 to double, 1 to sum
    */
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your card number: ");
    String s = new String(sc.nextLine());
    int length = s.length();
    int[] cardNum = new int[length];
    //call method to convert string to array
    fillArray(s, cardNum);

    int total = 0; //every iteration will add to this
    /*for loop -double every second num & -9 if more than 9
    */
    for(int i = cardNum.length -2; i >= 0; i-=2){
      int num = cardNum[i]*2;
      String str = Integer.toString(num);
      if (str.length() != 1){
        num-=9;
      }
      cardNum[i] = num;
    }
    //check if array has now doubled&-9 every second element
    for(int i = 0; i<cardNum.length;i++){
      System.out.print(cardNum[i]);
    }
    System.out.println();

    int total = 0; //every iteration will add to this
    //for loop to add all elements in the array
    for(int i = 0; i<cardNum.length; i++){
      total +=cardNum[i];
    }

    //print if card num is valid or not (%10 == 0)
    System.out.println(total);
    if (total % 10 == 0){
      System.out.println("Valid");
    }
    else{
      System.out.println("Invalid");
    }
  }
  public static int[] fillArray(String s, int[] a){
    for (int i = 0; i<s.length(); i++){
      char c = s.charAt(i);
      int n = Integer.parseInt(String.valueOf(c));
      a[i] = n;
    }
    return a;
  }
}