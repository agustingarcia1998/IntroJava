public class LogicOperations {
    public static void main(String[] args) {


        int a = 8;
        int b = 5;

        //operadores de asignación
        System.out.println("OPERADORES DE ASIGNACIÓN");//false

        System.out.println("a es igual a b? -> " + (a == b));//false
        System.out.println("a es diferente de b? -> " + (a != b));//true

        //operadores relacionales
        System.out.println("OPERADORES RELACIONALES");

        System.out.println("a es mayor que b? -> " + ( a > b));//true
        System.out.println("a es menor que b? -> " + ( a < b));//false
        System.out.println("a es mayor o igual a b? -> " + ( a >= b));//true
        System.out.println("a es menor o igual que b? -> " + ( a <= b));//false

        //If
        System.out.println("SENTENCIA IF");
        if(a == b){
            System.out.println("a es igual a b");
        } else if ((a != b) && (a > b)) {
            System.out.println("a es distinto de b");
        } else if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a < b) {
            System.out.println("a es menor que b");
        } else if (a >= b) {
            System.out.println("a es mayor o igual a b");
        } else if (a <= b) {
            System.out.println("a es menor o igual que b");

        }


    }
}
