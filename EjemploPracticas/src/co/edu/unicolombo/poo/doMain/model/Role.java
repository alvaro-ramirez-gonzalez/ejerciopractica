/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.doMain.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Asus Vivobook
 */
public class Role {
    private int id;
    private String name;
    private String description;
    private List<User> users;
    
    private static AtomicInteger incrementId;
    
    public Role(){
    id = getIncrementeId();
    }

    public Role(String name) throws Exception{
        if (name == null  || name.trim().isEmpty()){
            throw new Exception(" el nombre requerido");
        }
        this.name = name;
        id = getIncrementeId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<User> getUsers() {
        return users;
    }

    public static AtomicInteger getIncrementId() {
        return incrementId;
    }

private int getIncrementeId(){
     if (incrementId == null ){
            incrementId = new AtomicInteger(0);
        }
     return incrementId.incrementAndGet();
   }

}