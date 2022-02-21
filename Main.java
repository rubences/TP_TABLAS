class Main extends Bucle{
  static Bucle B= new Bucle();
  public static void main(String[] args) {
    double[] tab = new double[3];  
       tab[0] = 1.61803398875;  
       tab[1] = 2.71828182846;  
       tab[2] = 3.14159265359;  
       System.out.println("número áureo = " + tab[0]);  
       System.out.println("e = " + tab[1]);  
       System.out.println("pi = " + tab[2]); 
    B.bucle3();  
  }
}