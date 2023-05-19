package account.auth;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public Account signupAccount(Account account) {
        return account;
    }
}
