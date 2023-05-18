package Visual;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author pc
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                    DatagramSocket socket;
            boolean fin = false;
        try {
            //Creamos el socket
            socket = new DatagramSocket( 7000 );
            // IMPORTANTE EL PUERTO PUEDE CAMBIARSE A EFECTO DE ELIMINAR ERRORES DE CONEXION FAS

            byte[] mensaje_bytes = new byte[256];
            String mensaje = "";
            mensaje = new String(mensaje_bytes);
            String mensajeComp = "";

            DatagramPacket paquete = new DatagramPacket(mensaje_bytes, 256);
            DatagramPacket envpaquete = new DatagramPacket(mensaje_bytes, 256);

            int puerto;
            InetAddress address;
            byte[] mensaje2_bytes = new byte[256];
            System.out.println("Servidor Listo, esperando al cliente:");
            do {
                // Recibimos el paquete
                socket.receive(paquete);
                 // Lo formateamos
                mensaje = new String(mensaje_bytes).trim();
                // Lo mostramos por pantalla
                System.out.println(mensaje);
                //Obtenemos IP Y PUERTO
                puerto = paquete.getPort();
                address = paquete.getAddress();
                
                if (mensaje.startsWith("Inicio")) {
                    new ClienteView().setVisible(true);
                    mensajeComp = "Aceptado";
                }
                //formateamos el mensaje de salida
                mensaje2_bytes = mensajeComp.getBytes();

            //Preparamos el paquete que queremos enviar
                envpaquete = new DatagramPacket(mensaje2_bytes, mensajeComp.length(), address, puerto);

            // realizamos el envio
                socket.send(envpaquete);
            } while (1>0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

    }
    
}
