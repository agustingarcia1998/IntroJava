public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //gano un bono de $200
        salary = salary + 200;
        System.out.println(salary);//1200

        //pension: $50 descuento
        salary = salary - 50;//1150
        System.out.println(salary);

        //trabajó dos horas extra, p/hora son $30
        //Cupon de comida $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizar cadenas de texto, concatenando
        String employeeName = "Agustin Nicolas";
        employeeName = employeeName + " Garcia";

        employeeName = "Edward " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}
