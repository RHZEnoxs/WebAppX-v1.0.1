package spring.mvc.code.ch4.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import spring.mvc.code.ch4.domain.User;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        // 驗證username、sex和age是否為null
        ValidationUtils.rejectIfEmpty(errors, "username", null, "用戶名不能為空");
        ValidationUtils.rejectIfEmpty(errors, "sex", null, "性別不能為空");
        ValidationUtils.rejectIfEmpty(errors, "age", null, "年齡不能為空");
    }

}
