package com.actividadas13.springboot.web.user_list_springboot.Service;

import com.actividadas13.springboot.web.user_list_springboot.Modelos.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> obtenerTodos() {
        return Arrays.asList(
                new User("Josue", "Castillo", "JosueCast04@example.com"),
                new User("Francisco", "Peña", null),
                new User("Isamar", "López", "Isamar.lopez@example.com"));
    }
}