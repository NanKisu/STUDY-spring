package spring6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

@Component
public class AccessResource2 {
	@Value(value = "${resource}")
	Resource resource;
	
	public void execute() {
		try(InputStream in = resource.getInputStream()){
			String result = StreamUtils.copyToString(in, StandardCharsets.UTF_8);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
