package com.sncf.api;

import com.sncf.api.dto.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class UserManagment implements IUserManagement {

    private static final Logger logger = LogManager.getLogger(UserManagment.class);

    @GetMapping(value = "user")
    public ResponseEntity<List<User>> getUsers() {
        logger.debug("Get users.");
        var users = new ArrayList<User>();
        var user = new User();
        user.setFirstName("AMRI");
        user.setLastName("Hassen");
        user.setBirthDate(null);
        user.setPhoneNumber("01233465");
        users.add(user);
        validation(user);
        return ResponseEntity.ok().body(users);
    }



    public boolean validation(User user) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<User>> constraintViolations =
                validator.validate(user);

        if (constraintViolations.size() > 0 ) {
            System.out.println("Impossible de valider les donnees du bean : ");
            for (ConstraintViolation<User> contraintes : constraintViolations) {
                System.out.println(contraintes.getRootBeanClass().getSimpleName()+
                        "." + contraintes.getPropertyPath() + " " + contraintes.getMessage());
            }
            return false;
        } else {
            System.out.println("Les donnees du bean sont valides");
            return true;
        }
    }

}
