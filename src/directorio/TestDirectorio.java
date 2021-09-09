
package directorio;

import java.util.List;

public class TestDirectorio {

    public static void main(String[] args) {
        Directorio directorio1 = new Directorio();
        
        //directorio1.agregarCliente("2665000301", new Cliente(2654512,"Pepe","Ruiz","Cordoba","Belgrano 1045"));
        //directorio1.agregarCliente("2664589625", new Cliente(36878214,"Macarena","Ruiz","Rosario","San Martin 145"));
        //directorio1.agregarCliente("2664124578", new Cliente(15878214,"Lorena","Perez","Buenos Aires","Libertad 1546"));
        
        //System.out.println(directorio1.buscarCliente("2665000301"));
        
        /*List<String> tel = directorio1.buscarTeléfono("Ruiz");
        System.out.println("LOS NUMEROS DE TELEFONO CON ESE APELLIDO:");
        for (String string : tel) {
            System.out.print(string+", ");
        }*/
        
        /*List<Cliente> deUnaCiudad = directorio1.buscarClientes("Cordoba");
        System.out.println("LOS CLIENTES DE ESA CIUDAD SON:");
        for (Cliente cliente : deUnaCiudad) {
            System.out.println(cliente.toString());
        }*/
        
        //directorio1.borrarCliente(15878214);
        
        
    }
    
}
