package boot;

import com.torerax.kampos.boot.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		// Esta prueba verifica que el contexto de la aplicación se cargue sin errores
	}
}
