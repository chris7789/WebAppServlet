/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.UsuarioBean;
import java.util.ArrayList;

/**
 *
 * @author generation
 */
public class AutenticacionService {
    
    UsuarioBean us1 = new UsuarioBean("juan@pedro.com", "123");
    UsuarioBean us2 = new UsuarioBean("lupe@juan", "1234");
    UsuarioBean us3 = new UsuarioBean("mimama@comida.com", "12345");                //crearemos a los usuarios como los nuevos objetos us1
    UsuarioBean us4 = new UsuarioBean("elperro@mascota.com", "123456");             //estos seran de tipo UsuarioBeans usualmente pondriamos String o el nombre de la clase
    UsuarioBean us5 = new UsuarioBean();                                            //pero como vamos a hacer un array y estos tendran que ser de tipo UsuarioBeans para guardar usuarios
                                                                                    //tiene que guardarse de esta manera
    ArrayList<UsuarioBean> us = new ArrayList();
    
    
    
    public AutenticacionService(){
        us.add(us1);
        us.add(us2);
        us.add(us3);
        us.add(us4);
        us.add(us5);
    }
    
    
    
    
    public boolean autenticacion(String correo, String contraseña){
        
        if(contraseña == null || contraseña.trim() == ""){
            
            return false;
        }
        return true;
    }

    
    
    
    public UsuarioBean getUsuarioValido(String usuario, String contraseña) {   //UsuarioBeans esta ahi porque necesita retornar un tipo de usuario como String, int etc
        for(UsuarioBean user : us){
            if(user.getUsuario().equals(usuario)
                    && user.getContraseña().equals(contraseña)){
                return user;
            }
        }
        return null;
    }
    
    
    
}
