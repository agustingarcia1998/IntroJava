public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567891;
        long nL = 12345678906L;//Agrego la L al final, para diferenciar el tipo de dato LONG

        double nD = 123.456;
        float nF = 123.456F;// Agrego la F al final, para diferenciar el tipo de dato FLOAT

        var salary = 1000;
        //pension 3% del salario
        var pension = salary*0.03; //double
        var totalSalary = salary - pension; //entero - double, da double
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Agustin Garcia";
        System.out.println("El empleado es: " + employeeName + "," + " Salario: " + totalSalary);



    }
}
