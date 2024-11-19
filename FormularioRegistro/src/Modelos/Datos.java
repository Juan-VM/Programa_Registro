package Modelos;

import Modelos.Personas;
import VistaInterfaz.Administradores;
import VistaInterfaz.Inicio;
import VistaInterfaz.Loggin;
import VistaInterfaz.Login;
import VistaInterfaz.PruebaMerchGitHub;
import VistaInterfaz.Registro;
import VistaInterfaz.Usuarios;
import java.util.ArrayList;

public class Datos {

  
    public static ArrayList<Personas> listaPersonas = new ArrayList<Personas>();
    public static int indiceLogin;

    
    
    public static ArrayList<Personas> getListaPersonas() {
        return listaPersonas;
    }

    public static void setListaPersonas(ArrayList<Personas> listaPersonas) {
        Datos.listaPersonas = listaPersonas;
    }

    public static int getIndiceLogin() {
        return indiceLogin;
    }

    public static void setIndiceLogin(int indiceLogin) {
        Datos.indiceLogin = indiceLogin;
    }

    

    public static int getLoginIndex(ArrayList<Personas> lista, String user, String psd) {
        int index = -1;
        for (Personas i : lista) {
            if (i.getPassword().equals(psd) && i.getNombre().equals(user)) {
                index = Datos.getListaPersonas().indexOf(i);
            }
        }
        return index;
    }

    public static String getAtributeInIndex(int index, String atributo) {
        
        String nombre;
        String apellido;
        String cedula;
        String telefono;
        String password;
        
        switch (atributo) {
            case "nombre" -> {
                nombre = listaPersonas.get(index).getNombre();
                return nombre;
            }
            case "apellido" -> {
                apellido = listaPersonas.get(index).getApellido();
                return apellido;
            }
            case "cedula" -> {
                cedula = listaPersonas.get(index).getCedula();
                return cedula;
            }
            case "telefono" -> {
                telefono = listaPersonas.get(index).getTelefono();
                return telefono;
            }
            case "password" -> {
                password = listaPersonas.get(index).getPassword();
                return password;
            }
            default ->{
                return "ATRIBUTE_NO_FOUND";
            }
        }
    }
    public static int getRolInIndex(int index) {
        int rol = listaPersonas.get(index).getRol();
        return rol;
    }
}
