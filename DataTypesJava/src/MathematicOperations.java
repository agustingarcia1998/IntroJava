public class MathematicOperations {
    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x));//redondea hacia arriba

        System.out.println(Math.floor(x));//redondea hacia abajo

        //Devuelve un número elevado a otro número
        System.out.println(Math.pow(x, y));

        //Devuelve el número mayor, y=3
        System.out.println(Math.max(x, y));

        //Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un círculo
        //pí * radio2
        System.out.println(Math.PI * Math.pow(y, 2));

        //Area de una esfera
        //4*PI*radio2
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        //Volumen de una esfera
        //(4/3)/pi * radio3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
