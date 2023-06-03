package nguyenngoctamnhu.Lab3.validator;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import nguyenngoctamnhu.Lab3.entity.User;
import nguyenngoctamnhu.Lab3.validator.annotation.ValidUserId;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
