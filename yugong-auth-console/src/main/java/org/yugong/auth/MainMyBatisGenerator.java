package org.yugong.auth;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * mybatis generate 生成入口
 *
 * @author 小天
 * @date 2019/12/14 20:55
 */
public class MainMyBatisGenerator {

    public static void main(String[] args) throws Exception {

        URL url = Thread.currentThread().getContextClassLoader().getResource("generatorConfig.xml");
        if (url == null) {
            throw new NullPointerException("mybatis generator 配置文件不存在");
        }
        // 是否覆盖旧文件
        boolean overwrite = true;
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration( new File(url.toURI()));
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
