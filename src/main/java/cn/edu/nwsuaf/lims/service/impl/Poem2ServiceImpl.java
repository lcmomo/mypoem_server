package cn.edu.nwsuaf.lims.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.edu.nwsuaf.lims.dao.Poem2Mapper;

import cn.edu.nwsuaf.lims.model.Poem2;
import cn.edu.nwsuaf.lims.service.Poem2Service;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by liuchao Li on 2019/09/11.
 */
@Service
@Transactional
public class Poem2ServiceImpl extends AbstractService<Poem2> implements Poem2Service {
    @Resource
    private Poem2Mapper poem2Mapper;

    @Override
    public List<Poem2> findByCategory(String modelName) {
            Condition condition = new Condition(Poem2.class);
            System.out.println(modelName);
            condition.createCriteria()
                    .andEqualTo("modelName",modelName);
            List<Poem2> list = findByCondition(condition);
            return list;
        }

    @Override
    public List<Poem2> findByAuthor(String authorName) {
        Condition condition = new Condition(Poem2.class);
        condition.createCriteria()
                .andEqualTo("authorName",authorName);
        List<Poem2> list = findByCondition(condition);
        return list;
    }
}


