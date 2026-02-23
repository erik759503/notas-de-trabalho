public class Vetor {
    private int[] elementos;
    private int tamanho;

    
    
    public Vetor( int capacidade) {
        elementos = new int[capacidade];
        tamanho =0;
    }
    
    public void inserir(int valor){
        if (tamanho<elementos.length) {
            elementos[tamanho]= valor;
            tamanho++;
        }else{
            System.out.println("Vetor cheio!");
        }
    }
    
  public void remover(int indice){
      if (indice >=0 && indice < tamanho){
          
          for(int i = indice; i<tamanho -1; i++){
              elementos [i] = elementos[i+1];
          }
          tamanho--;

      }else{
          System.out.println("indice Invalido");
      }
  }
  
  public int consultar(int indice){
      if(indice>=0 && indice<tamanho){
          return elementos[indice];
          
      }else{
          System.out.println("Indice invalido");
          return -1;
      }
  }
  
  public int buscar(int valor){
      for(int i = 0 ; i<tamanho;i++){
          if (elementos[i] == valor){
              return i;
          }
      }
      return -1;
  }
  
  public void exibir() {
      for(int i=0;i<tamanho; i++){
          System.out.print(elementos[i]+"");
      }
      System.out.println();
  }
  
  public static void main(String[]args){
      
      Vetor v = new Vetor(5);
      
      v.inserir(10);
      v.inserir(20);
      v.inserir(40);
      v.inserir(50);
      
      v.exibir();
      
      v.remover(1);
      v.exibir();
      
      
      System.out.println(v.consultar(1));
      
      int pos = v.buscar(50);
      System.out.println("valor 40 está na prosição:" + pos);
        
  }
}

