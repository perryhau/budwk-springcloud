package com.budwk.spring.boot.dao;

import org.nutz.dao.Dao;
import org.nutz.dao.util.Daos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * @author kerbores(kerbores @ gmail.com)
 */
@Configuration
@ConditionalOnBean({Dao.class})
@ConditionalOnExpression("${nutz.dao.enabled:false}")
@EnableConfigurationProperties(NutzDaoAutoConfigurationProperties.class)
@AutoConfigureAfter({NutzDaoAutoConfiguration.class})
public class NutzDatabaseInitializer {

    @Autowired
    private Dao dao;

    @Autowired
    NutzDaoAutoConfigurationProperties properties;

    @PostConstruct
    public void create() {
        boolean create = properties.getRuntime().isCreate();
        boolean migration = properties.getRuntime().isMigration();
        Arrays.stream(properties.getRuntime().getBasepackage()).forEach(pkg -> {
            if (create) {
                Daos.createTablesInPackage(dao, pkg, properties.getRuntime().isFoceCreate());
            }
            if (migration) {
                Daos.migration(dao,
                        pkg,
                        properties.getRuntime().isAddColumn(),
                        properties.getRuntime().isDeleteColumn(),
                        properties.getRuntime().isCheckIndex());
            }
        });
    }
}
