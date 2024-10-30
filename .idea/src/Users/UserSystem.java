package Users;

import javax.security.auth.login.LoginException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class UserSystem {
    private List<User> userRegistered;

    public UserSystem(){
        this.userRegistered=new ArrayList<>();

    }
    public boolean registerUser(String name,String key)throws UserInUseException {
        for (User user : userRegistered) {
            if (user.getName().equals(name)) {
                throw new UserInUseException("El nombre de usuario" + name + "ya esta en uso");
            }
        }
        String key2=hashPassword(key);
        userRegistered.add(new User(name,key2));
    }
    public boolean login(String name,String key)throws LoginException{
        String key2=hashPassword(key);
        for(User user:userRegistered){
            if(user.getName().equals(name)&&user.getKey().equals(key2)){
                return true;
            }
        }
        throw new LoginException("Error en ususario o clave");

    }
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error al hashear la contraseña", e);
        }
    }
}
