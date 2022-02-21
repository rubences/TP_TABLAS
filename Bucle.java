public Class Bucle{
  final int TAMANIO = 10;
  int[] tab = new int[10];  
  int[] tab = new int[TAMANIO];  
  for (int i = 0; i < TAMANIO; i++) {  
       tab[i] = i+1;  
  } 
  // Nuevo Bucle
  for (int i = 0; i < tab.length; i++) {  
   tab[i] = i+1;  
  } 
 // Otra Forma
  for (int val: tab) {  
     System.out.println(val);  
  } 
}