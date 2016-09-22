package com.pawx.patelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Domain
 *
 */
@SpringBootApplication
@ComponentScan("com.pawx")
public class ApplicationMain 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
