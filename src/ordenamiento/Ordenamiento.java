
package ordenamiento;

public class Ordenamiento 
{
// recibe un arreglo de tipo entero
    //devuelve vacio
    // comentario de prueba git hub
    //metodo para ordenar
void sort (int arr[])
    {
    //tamaño de arreglo
 int n = arr.length;
  //para  recorrerlo
  for (int i = 0; i< n-1; i++ ){     
   
   int min_idx = i;
     //siempre que voy a hacer arrglos tengo que tener 2 "for" anidados
    
    for (int j = i+1; j < n; j ++)
      //comparar
      if (arr[j]< arr[min_idx]) 
         min_idx = j;    
          
    //intercambio de menor a mayor
    
    int temp = arr [min_idx];
     arr [min_idx] = arr [i];
       arr[i] = temp;
       
  }
    }
    
public static void main(String[] args) {
    //crear el arreglo 
    Ordenamiento Ob = new Ordenamiento();
    Ob.sort(arr);
    
    
    int arr[] = {64,25,12,22,11};
    

}
    
}
