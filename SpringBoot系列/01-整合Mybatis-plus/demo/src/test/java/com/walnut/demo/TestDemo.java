package com.walnut.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.walnut.demo.user.entity.EricUser;
import com.walnut.demo.user.mapper.EricUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@SpringBootTest
public class TestDemo {

    @Resource
    private EricUserMapper ericUserMapper;
    @Test
    public void queryAgeGt25() {
        // 假设有一个 QueryWrapper 对象，设置查询条件为 age > 25，查询所有满足条件的用户
        QueryWrapper<EricUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 25);
        List<EricUser> users = ericUserMapper.selectList(queryWrapper); // 调用 selectList 方法
        users.forEach(u -> log.info("User: {}", u));
    }

    /*
    * 使用ActiveRecord
    * */
    @Test
    public void queryActiveRecord() {
//        EricUser ericUser = new EricUser();
//        List<EricUser> ericUsers = ericUser.selectAll();
//        ericUsers.forEach(item -> log.info("User: {}", item));

//        EricUser ericUser = new EricUser();
//        ericUser.setName("walnut");
//        ericUser.setAge(10);
//        ericUser.setNationality("CN");
//        ericUser.insert();

/*        // 根据 ID 更新用户信息
        EricUser ericUser = new EricUser();
        ericUser.setId(1L);
        ericUser.setName("Updated Name");
        boolean isUpdated = ericUser.updateById(); // 返回值表示操作是否成功

        // 根据 ID 删除用户
        EricUser ericUser = new EricUser();
        boolean isDeleted = ericUser.deleteById(); // 返回值表示操作是否成功*/
    }


    @Test
    public void SimpleQuery() {

    }
}
