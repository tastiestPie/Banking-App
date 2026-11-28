package util;
import com.password4j.Hash;
import com.password4j.Password;

public class PasswordUtil {
    // hashing and salting password
    public static String hashPassword(String plainPassword) {
        Hash hash = Password.hash(plainPassword).addRandomSalt().withArgon2();
        return hash.getResult(); 
    }

    // verify password for login
    public static boolean verifyPassword(String plainPassword, String storedHash) {
        return Password.check(plainPassword, storedHash).withArgon2();
    }
}
