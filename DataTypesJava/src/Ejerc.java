public class Ejerc {
    public static void main(String[] args) {
        //Ejercicio 1
        //guardar en variables a la familia y presentarlos
        System.out.println("Mi familia:");

        String myName = "Agustin";
        String momName ="Gabriela";
        String myWifeName = "Danae";
        String mySonsNames = "Pepino, Rabanito, Edward y Bebé";
        String myBrotherName = "Ramiro";


        int MY_AGE = 24;
        int AGE_MOM = 53;
        int AGE_WIFE = 24;
        int AGE_BROTHER = 18;

        System.out.println("Mi nombre es " + myName + " y tengo la edad de " + MY_AGE);
        System.out.println("Mi mujer se llama " + myWifeName + " y tiene " + AGE_WIFE + " años");
        System.out.println("Juntos tenemos 4 hijos, gatunos y perrunos, ellos son: " + mySonsNames);
        System.out.println("Tengo una mamá que se llama " + momName + " y tiene la edad de " + AGE_MOM);
        System.out.println("Y un hermano de nombre " + myBrotherName + " que tiene " + AGE_BROTHER + " años");


        //Ejercicio 2

        char c = 'z'; //conviertelo a int
        int cI = c;
        System.out.println("Resultado act 1 : " + cI);

        int i = 250; //conviertelo a long y luego de long a short
        long j = i;
        short s = (short)j;
        System.out.println("Resultado act 2 : " + s);

        double d = 301.067; //conviertelo a long
        long l = (long)d;
        System.out.println("Resultado act 3 : " + l);

        int i2 = 100;//súmale 5000.66 y conviertelo a float
        float sumaFloat = i2 + 5000.66f;
        System.out.println("Resultado act 4 : " + sumaFloat);

        int i3 = 737; //multiplícalo por 100 y conviertelo a byte
        byte b = (byte)(i3*100);
        System.out.println("Resultado act 5 : " + b);

        double d2 = 298.638; //divídelo entre 25 y conviertelo a long
        long divisionD = (long)(d2/25);
        System.out.println("Resultado act 6 : " + divisionD);

        //Ejercicio 3
        //
        //Explica cómo distribuirías y crearías un ambiente de producción para un programa compilado con la versión 9 de Java.
        //Incluye al menos dos Sistemas Operativos.

        //Resp:
        //Se debe tener descargados los JDKs en los cuales se compilará.
        //Se tiene que configurar los JAVA_HOME en función de la versión que se utlizara.
        //En el sistema operativo puede ser mac o windows, el procedimiento es el mismo.
    }
}
