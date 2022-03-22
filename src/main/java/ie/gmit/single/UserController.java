package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(userJson, User.class);
            UserValidate userValidate = new UserValidate();
            UserSave userSave = new UserSave();

            if(!userValidate.verify(user)) {
                return "ERROR";
            }

            userSave.store.store(user);
            return "SUCCESS";
        }
 }

