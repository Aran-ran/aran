package org.fkit.crudrepositorytest.service;

import org.fkit.crudrepositorytest.bean.User;
import org.fkit.crudrepositorytest.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;


@Service

public class UserService {
    @Resource
    private UserRepository userRepository;
    /**调用接口中的save方法进行封装，实现增加一条记录的功能*/
    @Transactional
    public User save(User user){
      return userRepository.save(User);
    }
    /**调用接口中的deleteById方法进行封装，实现删除的功能*/
    @Transactional
    public void delete(int id)
    {
        userRepository.deleteById(id);
    }
    /**调用接口中的findAll方法进行封装，实现查找的功能*/
    @Transactional
    public Iterable<User> select(){
        return userRepository.findAll();
    }
    public User getById(Integer id){
        Optional<User> op = userRepository.findById(id);
        return op.get();
    }
    /**调用接口中的findByID方法进行封装，实现更新的功能*/

      public void update(User user){
    }
}
