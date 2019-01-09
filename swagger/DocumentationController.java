package vms.apigatewayserver.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;

@Component
@Primary
@EnableAutoConfiguration
public class DocumentationController {

	    public List<SwaggerResource> get() {
	        List<SwaggerResource> resources = new ArrayList<>();
	        resources.add(swaggerResource("users-service", "/api/users/v2/api-docs", "2.0"));
	        resources.add(swaggerResource("machines-service", "/api/util/v2/api-docs", "2.0"));
	        resources.add(swaggerResource("events-service", "/api/events/v2/api-docs", "2.0"));
	        resources.add(swaggerResource("statistic-service", "/api/statistic/v2/api-docs", "2.0"));
	        return resources;
	    }
	    
	    
	    private SwaggerResource swaggerResource(String name, String location, String version) {
	        SwaggerResource swaggerResource = new SwaggerResource();
	        swaggerResource.setName(name);
	        swaggerResource.setLocation(location);
	        swaggerResource.setSwaggerVersion(version);
	        return swaggerResource;
	    }
	 
}
