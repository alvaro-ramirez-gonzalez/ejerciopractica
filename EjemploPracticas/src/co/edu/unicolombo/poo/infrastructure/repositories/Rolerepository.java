/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.infrastructure.repositories;


import co.edu.unicolombo.poo.busines.interfaces.Repositories.IRolrepository;
import co.edu.unicolombo.poo.doMain.model.Role;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Asus Vivobook
 */
public class Rolerepository implements IRolrepository{
    private static List<Role> rolesDb;

public  Rolerepository(){
    createRelsDb();
}

private void createRelsDb(){
   if (rolesDb == null){
       
   rolesDb = new ArrayList <> ();
   } 
}

    @Override
    public Role findRoleById(int roleId) throws Exception {
        if (rolesDb .isEmpty()){
             throw new Exception ("el rol "+roleId+"no existe");
        }
        Role roleFound= null;
        for (var r : rolesDb){
            if(r.getId() == roleId){
                
              roleFound = r;  
            }
        }
      
       if (roleFound == null){
            throw new Exception ("el rol "+roleId+"no existe");
       } 
    return roleFound;
    }
    

    @Override
    public Role findRoleByName(String name) throws Exception {
    if (rolesDb .isEmpty()){
             throw new Exception ("el rol "+name+"no existe");
        }
        Role roleFound= null;
        for (var r : rolesDb){
            if(r.getName().equalsIgnoreCase(name)){
                
              roleFound = r;  
            }
        }
      
       if (roleFound == null){
            throw new Exception ("el rol "+name+"no existe");
       } 
    return roleFound;
    }

    @Override
    public int saveRole(Role role) throws Exception {
        if (role == null){
            throw new Exception("el rol es requerido");
        }
          Role roleFound = findRoleByName(role.getName());
    }

    @Override
    public void editRole(Role role) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteRole(int roleId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Role> getRoleAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
