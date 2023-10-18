package awto.mybatisdemo.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@MapperScan("awto.mybatisdemo.mapper")
public class MybatisConfig {

	@Value("${postgres.url}")
	private String url;

	@Value("${postgres.username}")
	private String username;

	@Value("${postgres.password}")
	private String password;

	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(org.postgresql.Driver.class);
		dataSource.setUrl(this.url);
		dataSource.setUsername(this.username);
		dataSource.setPassword(this.password);

		return dataSource;
	}

}
