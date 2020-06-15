package com.bookstore.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class BookstoreZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreZipkinserverApplication.class, args);
	}

}
