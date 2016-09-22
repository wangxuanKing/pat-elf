package com.pawx.patelf;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component  
public class CustomizationBean implements EmbeddedServletContainerCustomizer  {  
    
	
	public void customize(ConfigurableEmbeddedServletContainer container) {  
         container.setContextPath("/pat");  
         container.setPort(80);  
         container.setSessionTimeout(30);  
    }  
       
}  