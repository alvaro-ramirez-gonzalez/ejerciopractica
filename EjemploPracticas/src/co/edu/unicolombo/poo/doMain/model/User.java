/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.doMain.model;


/**
 *
 * @author Asus Vivobook
 */
public class User {
    private String code;
    private String name;
    private String password;
    private Role role;
    private String email;
    

    public User(String code, String name ,Role role) throws Exception{
    
        if(code == null || code.trim().isEmpty()){
            throw new Exception("el codigo es requerido");
        }
        
        if(name == null || name.trim().isEmpty()){
        throw new Exception("el rol es requerido");
        }   
        
        if(role == null){
        throw new Exception("el rol es requerido");
    }
     this.code= code;
     this.name = name;
     this.role = role;
    
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
    