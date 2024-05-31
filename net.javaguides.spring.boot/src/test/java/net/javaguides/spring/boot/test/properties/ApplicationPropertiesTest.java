package net.javaguides.spring.boot.test.properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ApplicationPropertiesTest {

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddlAuto;

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Value("${spring.datasource.username}")
	private String datasourceUsername;

	@Value("${spring.datasource.password}")
	private String datasourcePassword;

	@Value("${spring.datasource.driver-class-name}")
	private String datasourceDriverClassName;

	@Value("${spring.jpa.show-sql}")
	private boolean showSql;

	@Value("${server.port}")
	private int serverPort;

	@Test
	public void testDatabaseProperties() {
		assertEquals("validate", ddlAuto);
		assertEquals("jdbc:mysql://localhost:3306/schooldb?allowPublicKeyRetrieval=true&useSSL=true&requireSSL=true",
				datasourceUrl);
		assertEquals("root", datasourceUsername);
		assertEquals("##Seba04278", datasourcePassword);
		assertEquals("com.mysql.cj.jdbc.Driver", datasourceDriverClassName);
		assertFalse(showSql);
		assertEquals(8081, serverPort);
	}
}
