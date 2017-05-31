package crc78;

public class asdf{

  private static boolean isPosInt(String str){
    try {
      int num = Integer.parseInt(str);
      if(num < 0){
        return false;
      }
      return true;
    } catch (NumberFormatException ex){
      return false;
    }
  }

  public static int triangle(int num){
    int sum = 0;
    int temp = num;
    while (num > 0){
      sum += num;
      num--;
    }
    return sum;
  }

  public static int lazy(int num){
    return ((num*num) + num + 2)/2;
  }

  public static void main(String[] args){

    if(args.length == 0 || (args[0].toLowerCase().compareTo("triangle") != 0 && args[0].toLowerCase().compareTo("lazy") != 0)){
        System.out.println("Error: First argument can either be 'triangle' or 'lazy'.");
        System.exit(1);
    }
    else if(args.length == 1 || !isPosInt(args[1])){
      System.out.println("Error: Second argument must be a postive 32 bit number.");
      System.exit(2);
    }
    else{
      if(args[0].toLowerCase().compareTo("lazy") == 0){
        int i = Integer.parseInt(args[1]);
        System.out.println("Lazy("+ i + ") = "+ lazy(i));
        System.exit(0);
      }
      else{
        int i = Integer.parseInt(args[1]);
        System.out.println("Tri("+ i +") = " + triangle(i));
        System.exit(0);
      }

    }

  }

}
