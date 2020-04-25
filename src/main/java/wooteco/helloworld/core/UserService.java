package wooteco.helloworld.core;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    public List<String> findAll() {
        return new ArrayList<>();
    }
}
