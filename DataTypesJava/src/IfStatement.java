public class IfStatement {
    public static void main(String[] args) {

        //atención a los scopes
        boolean isBluetoothEnabled = true;
        int fileSended = 3;
        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");

        }else{
            fileSended--;
            System.out.println("Porfavor enciende tu bluetooth, para iniciar la transferencia");
        }
            System.out.println(isBluetoothEnabled);
            System.out.println(fileSended);
    }

}
