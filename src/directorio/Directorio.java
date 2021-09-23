/*agregarCliente() que permite registrar un nuevo cliente con su respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo.
//buscarCliente() que en base al nro de teléfono retorna el Cliente asociado al mismo.
//buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de teléfono asociados a dicho apellido.
//borrarCliente() que en base a un dni elimina el cliente del directorio.*/
package directorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Directorio {
    HashMap<String,Cliente> directorio=new HashMap();
    
    public void agregarCliente(String numero, Cliente cliente){
        if(directorio.containsKey(numero)){
            System.out.println("INGRESE OTRO NUMERO");
        }else{
            directorio.put(numero, cliente);
            System.out.println("Cliente añadidio.");
        }
    }
    
    public Cliente buscarCliente(String numero){
        Cliente cliente = null;
        if(directorio.containsKey(numero)){
            cliente= directorio.get(numero);
        }        
        return cliente;
    }
    
    
    public List buscarTeléfono(String apellido){
        List<String> telefonos = new ArrayList();
        Set<String> claves = directorio.keySet();
        for (String clave : claves) {
            if(directorio.get(clave).getApellido().equals(apellido)){
                telefonos.add(clave);
            }
        }
        return telefonos;
    }
    
    public List buscarClientes(String ciudad){
        //buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes asociados a dicha ciudad.
        List<Cliente> clientes = new ArrayList();
        for (Cliente value : directorio.values()) {
            if(value.getCiudad().equals(ciudad)){
                clientes.add(value);
            }
        }
        return clientes;
    }
    
    public Cliente borrarCliente(int dni){
        //borrarCliente() que en base a un dni elimina el cliente del directorio.*/
        Set<String> claves = directorio.keySet();
        Cliente cliente = null;
        String codigo = null;
        for (String clave : claves) {
            if(directorio.get(clave).getDni()==dni){
                cliente=directorio.get(clave);
                codigo=clave;
                System.out.println("\nEl cliente: "+cliente.toString());
                System.out.println("Con el numero: "+codigo);
                System.out.println("Fue borrado");
            }                
        }
        directorio.remove(codigo);
        return cliente;
    }
    
}


