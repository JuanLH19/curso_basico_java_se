public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        /* Operadores de asignación */
        System.out.println("a es igual a b?-> "+(a==b));
        System.out.println("a es diferente de b?-> "+(a!=b));

        /*Operadores relacionales */
        System.out.println("a es mayor a b?-> "+(a>b));
        System.out.println("a es menor a b?-> "+(a<b));
        System.out.println("a es mayor o igual a b?-> "+(a>=b));
        System.out.println("a es menor o igual a b?-> "+(a<=b));

        if (a==b){
            System.out.println("A es igual a B");
        }else if (a!=b){
            System.out.println("A es diferente de b");
        }else if (a>b){
            System.out.println("a es mayor que b");
        }else if (a<b){
            System.out.println("a es menor que b");
        }else if (a>=b){
            System.out.println("a es mayor o igual a b");
        }else if (a<=b){
            System.out.println("a es menor o igual a b");
        }
    }
}
