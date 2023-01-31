public class IncrementDecrement {
    public static void main(String[] args) {
        //contextom estamos dentro de mario bros
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);//4

        lives--;//operador decremento
        System.out.println(lives);//3

        lives++;//operador incremento
        System.out.println(lives);//4

        //prefija
        //gana un regalo por ganar una vida
        int gift = 100 + lives++;//postfijo
        System.out.println(gift);
        System.out.println(lives);//5

    }
}
