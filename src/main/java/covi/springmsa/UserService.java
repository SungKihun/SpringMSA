package covi.springmsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class UserService {

//    @Autowired
//    private UserRepository userRepository;

    private static final String REDIS_KEY_PREFIX = "user:";

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Async
    public void saveUser(User user) {
        redisTemplate.opsForValue().set(REDIS_KEY_PREFIX + user.getId(), user.getName());
    }

    @Async
    public String getUserById(Long userId) {
        return redisTemplate.opsForValue().get(REDIS_KEY_PREFIX + userId);
    }

//    @Async
//    public CompletableFuture<User> createUser(User user) {
//        User savedUser = userRepository.save(user);
//        return CompletableFuture.completedFuture(savedUser);
//    }
//
//    @Async
//    public CompletableFuture<User> getUserById(Long userId) {
//        Optional<User> user = userRepository.findById(userId);
//        return CompletableFuture.completedFuture(user.orElse(null));
//    }

}
