import com.project.zoopiter.ZoopiterApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = ZoopiterApplication.class)

public class DatabaseConnectionTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testConnection() {
        assertNotNull(jdbcTemplate, "JdbcTemplate should not be null");
        jdbcTemplate.queryForObject("SELECT 1 FROM DUAL", Integer.class);
    }
}
