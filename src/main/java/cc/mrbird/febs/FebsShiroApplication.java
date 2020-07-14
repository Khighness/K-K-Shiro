package cc.mrbird.febs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: KHighness
 * @Date: 2020-7
 * @Description: Web App Start
 */

@EnableAsync
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cc.mrbird.febs.*.mapper")
public class FebsShiroApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FebsShiroApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
