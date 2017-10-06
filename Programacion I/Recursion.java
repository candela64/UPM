class Recursion {
  
  static int factorial (int factorial1){
    if (factorial1==1){
      return 1;
    }
      else{
        return factorial1*factorial(factorial-1);
  }
}//1º ejercicio facotorial.

static void main (String[]args){
  
StdOut.print("Introduce un valor para factorial1");
int factorial1 = StdIn.readInt();
StdOut.print("Factorial de factorial1=" + factorial(factorial1));
}
}

    
    
  
