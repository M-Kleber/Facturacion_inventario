/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Persona;
import modelo.Sentencias_sql;


/**
 *
 * @author CASKLE
 */
public class control_cliente extends Persona {
private Sentencias_sql sql; 


    public control_cliente(String documento, String tipo, String nombres, String apellidos, String direccion, String telefono) {
        super(documento, tipo, nombres, apellidos, direccion,telefono);
        sql = new Sentencias_sql();
    }   
    
        
   
    public boolean ingresar_cliente()
    {               
        
            String datos[] = {documento,tipo,nombres,apellidos,direccion,telefono};           
            return sql.insertar(datos, "insert into Cliente(Documento, cod_tipo_documento, Nombres, Apellidos, Direccion,Telefono) values(?,?,?,?,?,?)");
                      
                
    }
    
    public Object[][] consulta_clientes(){
        String[] columnas={"Documento","Descripcion","Nombres","Apellidos","Direccion","Telefono"};
        Object[][] datos = sql.GetTabla(columnas, "cliente", "select Documento,Descripcion,Nombres,Apellidos,Direccion,Telefono from cliente,tipo_de_documento where id_tipo_documento=cod_tipo_documento");
        return datos;
    }
     
    
    
}