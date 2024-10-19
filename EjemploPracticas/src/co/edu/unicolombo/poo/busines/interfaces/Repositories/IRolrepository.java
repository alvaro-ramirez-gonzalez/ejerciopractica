/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.busines.interfaces.Repositories;

import co.edu.unicolombo.poo.doMain.model.Role;
import java.util.List;



/**
 *
 * @author Asus Vivobook
 */
public interface IRolrepository {
    public Role findRoleById(int roleId) throws Exception;
    public Role findRoleByName(String name) throws Exception;
    public int saveRole(Role role) throws Exception;
    public void  editRole(Role role) throws Exception;
    public int deleteRole(int roleId) throws Exception;
     public List<Role> getRoleAll();
}
