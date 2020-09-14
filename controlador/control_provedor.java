/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Sentencias_sql;
/**
 *
 * @author CASKLE
 */
public class control_provedor extends Persona {
    
Sentencias_sql sql;

    public control_provedor(String documento, String tipo, String nombres, String apellidos, String direccion, String telefono)
    { 
        super(documento, tipo, nombres, apellidos, direccion, telefono);
        sql = new Sentencias_sql();
    }
    
    
    
    public boolean ingresar_proveedor()
    {               
       
            String datos[] = {documento,tipo,nombres,apellidos,direccion, telefono};           
            return sql.insertar(datos, "insert into proveedor(No_documento, cod_tipo_documento, Nombre, Apellido,direccion, Telefono) values(?,?,?,?,?,?)");
                                  
        
        
    }
    public Object[][] consulta_proveedor(){
        String[] columnas={"No_documento","Descripcion","Nombre","Apellido","Direccion","Telefono"};
        Object[][] datos = sql.GetTabla(columnas, "proveedor", "select No_documento,Descripcion,Nombre,Apellido,Direccion, Telefono from proveedor,tipo_de_documento where id_tipo_documento=cod_tipo_documento;");
        return datos;
    }
}
