public class Funciones {
    public static void main(String[] args) {

        double y = 3;
        //Area de un círculo
        //pí * radio2
        double area = circleArea(y);
        circleArea(y);
        //Area de una esfera
        //4*PI*radio2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)/pi * radio3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + converToDolar( 1000, "ARG"));
    }

    //las funciones se declaran en el mismo scope o nivel de la clase
    //static aplica en métodos que comparten el método main
    //double es mi valor de regreso
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    public static double converToDolar(double quantity, String currency){
     switch (currency){
         case "MXN":
             quantity = quantity * 0.052;
             break;
         case "ARG":
             quantity = quantity * 0.0051;
             break;
     }

     return quantity;
    }
}
