package account.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping("/api/auth/signup")
    public Account signupAccount(@RequestBody @Valid Account account) {
        return authService.signupAccount(account);
    }
}
