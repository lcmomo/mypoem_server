package cn.edu.nwsuaf.lims.service;
import cn.edu.nwsuaf.lims.model.Poem2;
import cn.edu.nwsuaf.lims.core.Service;

import java.util.List;


/**
 * Created by liuchao Li on 2019/09/11.
 */
public interface Poem2Service extends Service<Poem2> {
 public List<Poem2> findByCategory(String modelName);
 public List<Poem2> findByAuthor(String authorName);
}
