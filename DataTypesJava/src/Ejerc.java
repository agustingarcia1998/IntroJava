public class Ejerc {
    public static void main(String[] args) {
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
        System.out.println(c);
        //int i = 250; //conviertelo a long y luego de long a short
        //double d = 301.067; //conviertelo a long
        //int i = 100; //súmale 5000.66 y conviertelo a float
        //int i = 737; //multiplícalo por 100 y conviertelo a byte
        //double d = 298.638; //divídelo entre 25 y conviertelo a long
    }
}
