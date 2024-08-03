package JSM.LegalApp.LegApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.io.Serializable;

/*
 * Entidad que representa un usuario en la aplicación.
 * Contiene información del usuario como nombre de usuario, contraseña y rol.
 * Implementa la interfaz Serializable para la serialización de objetos.
 * 
 * Nota: Esta clase usa validaciones de Bean Validation para asegurar que los campos cumplan con ciertos requisitos.
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre de usuario es obligatorio")
    @Size(min = 4, max = 50, message = "El nombre de usuario debe tener entre 4 y 50 caracteres")
    private String username;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 6, message = "La contraseña debe tener al menos 6 caracteres")
    private String password;

    @NotBlank(message = "El rol es obligatorio")
    private String role;

    /*
     * Obtiene el identificador único del usuario.
     * 
     * @return el id del usuario
     */
    public Long getId() {
        return id;
    }

    /*
     * Establece el identificador único del usuario.
     * 
     * @param id el id del usuario
     */
    public void setId(Long id) {
        this.id = id;
    }

    /*
     * Obtiene el nombre de usuario.
     * 
     * @return el nombre de usuario
     */
    public String getUsername() {
        return username;
    }

    /*
     * Establece el nombre de usuario.
     * 
     * @param username el nombre de usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /*
     * Obtiene la contraseña del usuario.
     * 
     * @return la contraseña
     */
    public String getPassword() {
        return password;
    }

    /*
     * Establece la contraseña del usuario.
     * 
     * @param password la contraseña
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /*
     * Obtiene el rol del usuario.
     * 
     * @return el rol
     */
    public String getRole() {
        return role;
    }

    /*
     * Establece el rol del usuario.
     * 
     * @param role el rol
     */
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Método de comparación para asegurar que dos objetos User sean iguales si tienen el mismo id
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        // Representación en formato string de la entidad User
        return "JSM.LegalApp.LegApp.model.User[ id=" + id + " ]";
    }
}
