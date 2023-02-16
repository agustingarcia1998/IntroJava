public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Light";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste light mode");
                break;
            case "Night": //Ambar
                System.out.println("Seleccionaste Night mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark mode");
                break;

            default://hipotéticamente selecciona el usuario un color que no está en la lista
                System.out.println("Selecciona una opción");
        }
    }
}
