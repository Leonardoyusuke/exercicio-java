public class App {
    public static void main(String[] args) throws Exception {
        //O que é esse número?
        int numero = -5;
        if(numero%2 == 0 && numero>=0){
            System.out.println(" é par e positivo");
        }else if(numero%2 == 0 && numero<0){
            System.out.println(" é par e negativo");
        }else if(numero%2 != 0 && numero>=0){
            System.out.println(" é impar e positivo");
        }else{
            System.out.println(" é impar e negativo");
        }
        //Fibonacci
        int tamanho = 8;
        int primeiro = 0;
        int segundo = 1;
        System.out.println(primeiro);
        System.out.println(segundo);
        for(int i = 2;i<tamanho;i++){
            int proximo = primeiro + segundo;
            {
                System.out.println(proximo);
                primeiro = segundo;
                segundo = proximo;
            }
        }
      //MultiplicaAí
      int multiplicador = 5;
        for (int i = 0;i<=10;i++){
            System.out.println(multiplicador + "x" + i + "=" + multiplicador*i);
        }

       //Pirâmide de números
        int elemento = 5;
        for(int i = 1; i<=elemento; i++){
            if( i>=2 ){
                for(int j = 2; j<=i; j++){
                    System.out.print(i);
                }
            }
            System.out.println(i);
        }

        //Duplicados não! 
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};
        for(int i = 0; i<array1.length; i++){
            for(int j = 0; j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i]);
                }
            }
         }
    }

}


