package JSM.LegalApp.LegApp.service;

import JSM.LegalApp.LegApp.model.User;
import JSM.LegalApp.LegApp.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Servicio para manejar la lógica de negocio relacionada con los usuarios.
 * 
 * @author juans
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /*
     * Guarda un usuario en la base de datos.
     * 
     * @param user el usuario a guardar
     * @return el usuario guardado
     */
    public User save(User user) {
        return userRepository.save(user);
    }

    /*
     * Encuentra un usuario por su nombre de usuario.
     * 
     * @param username el nombre de usuario
     * @return el usuario encontrado
     */
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public List<User> findAll() {
    return userRepository.findAll();
}
    public User findById(Long id) {
    return userRepository.findById(id).orElse(null);
}
    public void deleteById(Long id) {
    userRepository.deleteById(id);
}
}
