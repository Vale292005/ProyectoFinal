package Users;

public class UserInUseException extends Exception{
    public UserInUseException(String msj){
        super(msj);
    }
}
