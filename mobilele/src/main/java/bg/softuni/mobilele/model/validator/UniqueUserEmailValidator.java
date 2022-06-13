package bg.softuni.mobilele.model.validator;

import bg.softuni.mobilele.repository.UserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserEmailValidator implements ConstraintValidator<UniqueUserEmail, Object> {

  private UserRepository userRepository;

  UniqueUserEmailValidator(UserRepository userRepository) {

    this.userRepository = userRepository;
  }

  @Override
  public void initialize(UniqueUserEmail constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }

  @Override
  public boolean isValid(Object value, ConstraintValidatorContext context) {
    if (value == null) {
      return true;
    }

    return userRepository.
        findByEmail(value.toString()).
        isEmpty();
  }
}
