public class Bucle{
  final int TAMANIO = 10;
  int[] tab = new int[10];  
  int[] tab2 = new int[TAMANIO]; 
  int[] bucle1(){
    for (int i = 0; i < TAMANIO; i++) {  
       tab2[i] = i+1; 
      
    }
    return tab2;
  } 
  // Nuevo Bucle
  int[] bucle2(){
    for (int j = 0; j < tab.length; j++) {  
     tab[j] = j+1;  
    }
    return tab;
    } 
 // Otra Forma
  void bucle3(){
    for (int val: tab) {  
       System.out.println(val);  
    } 
  }

}