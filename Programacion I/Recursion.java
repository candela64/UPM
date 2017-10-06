class Recursion {
  
  static int factorial (int factorial1){
    if (factorial1==1){
      return 1;
    }
      else{
        return factorial1*factorial(factorial1-1);
  }
}//1º ejercicio facotorial.
  
  static int sumaEntre (int x, int y){
    if (x>y){
      return 0;
    }
    else{
      return x + sumaEntre(x+1,y);
    }
  }
  
  
  
  static int sumaDeCuadradosParesEntre (int numero1, int numero2){
    if (numero1==numero2) {
      if (numero1%2==0){
        return (numero1*numero1);
      }
      else
      {
        return 0;
      }
    }
    else
    {
      return (numero2 % 2==0 ? numero2*numero2 +(sumaDeCuadradosParesEntre(numero1,numero2 -1)):(sumaDeCuadradosParesEntre(numero1,numero2 -1)));
    }
  }
    static int numeroCifras (int c){
      if (c<1){
        return 0;
      } 
      else{
        return (1+ numeroCifras(n/10));
      }
    }
   
    static int sumaCifras (int t){
      if ( t<10) {
        return t;
      }
      else
      {
        return (SumaCifras(t%10)+(t/10));
      }
    
    }
}

  
  
  

 


  
  
  
  
  
  
  
  
public static void main (String[]args){
  
StdOut.println("Introduce un valor para factorial1");
int factorial1 = StdIn.readInt();
StdOut.println("Factorial de factorial1=" + factorial(factorial1));
StdOut.println("introduce un valor para numero1");
int numero1 = StdIn.readInt();
StdOut.println("introduce un valor para numero2");
int numero2 = StdIn.readInt();
StdOut.println("suma de los cuadrados pares=" + sumaDeCuadradosParesEntre(numero1,numero2));
StdOut.println("introduce un valor para C");
int c = StdIn.readInt();
StdOut.println("Numero de cifras=" + numeroCifras(c));
StdOut.println("Introduce valor para t");
int t=StdIn.readInt();
StdOut.println("la suma de sus cifras es =" + sumaCifras(t));

 
}
}


    
    
  

    
    
  
