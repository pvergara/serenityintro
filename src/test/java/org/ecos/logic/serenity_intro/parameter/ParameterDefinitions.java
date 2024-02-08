package org.ecos.logic.serenity_intro.parameter;

import io.cucumber.java.ParameterType;
import org.ecos.logic.serenity_intro.data.User;
import org.ecos.logic.serenity_intro.data.Users;

public class ParameterDefinitions {

    @ParameterType(".*")
    public User user(String username) {
        if (username.equalsIgnoreCase("performance glitch"))
            return Users.PERFORMANCE_GLITCH;
        return Users.STANDARD;
    }

}