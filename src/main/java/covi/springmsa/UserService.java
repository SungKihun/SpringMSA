package covi.springmsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Async
    public CompletableFuture<User> createUser(User user) {
        User savedUser = userRepository.save(user);
        return CompletableFuture.completedFuture(savedUser);
    }

    @Async
    public CompletableFuture<User> getUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return CompletableFuture.completedFuture(user.orElse(null));
    }

}
