/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package JSM.LegalApp.LegApp.repository;

import JSM.LegalApp.LegApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juans
 */
public interface UserRepository extends JpaRepository <User, Long>{
     User findByUsername(String username);

    
}
