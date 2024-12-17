package srp;
import java.util.regex.Pattern;
public class UserValidator {    
private boolean isValidEmail(UserManager user) {        
  return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", user.getEmail());    }    
private boolean isValidPassword(UserManager user) {        
  return user.getPassword().length() >= 8;    }}