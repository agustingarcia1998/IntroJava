public class Casting {
    public static void main(String[] args) {
        //En un año ubique 30 perritos
        //Cuántos perritos ubiqué al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);//2.5

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);//2

        //Exactitud
        int a = 30;
        int b = 12;

        //ejecuto la división y lo forzo a ser double
        System.out.println((double) a/b);//2.5

        double c = (double) a/b;

        System.out.println(c);

        //transformo a entero
        char n = '1';
        int nI = n;//char cabe en int, entonces no necesito casteo

        System.out.println(nI);//da 49, porque

        //char no cabe en short, al ser una variable mucho mas pequeña, por lo que necesito casteo
        short nS = (short) n;
        System.out.println(nS);


    }
}
