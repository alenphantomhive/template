package vip.hoody.pi.service


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import vip.hoody.pi.domain.User
import vip.hoody.pi.repository.UserRepository

@Transactional
@Service
public class UserService {

    @Autowired
    UserRepository userRepository
    /**
     * 模拟查询返回用户信息
     * @param uname
     * @return
     */
    public User findUserByName(String username) {
        User user = userRepository.findByUsername(username)
        return user
    }

    public boolean userRegister(User user) {
        user.isLocke = false

        userRepository.save(user)
        return true
    }

}
