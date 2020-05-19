package com.franco.bothrestsoaptest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class BothRestSoapTestApplication {


	@Value("${server.soap.port}")
	private int soapPort;

	public static void main(String[] args) {
		SpringApplication.run(BothRestSoapTestApplication.class, args);
	}

	@Bean
	public SimpleJaxWsServiceExporter jaxWsExporter () throws UnknownHostException {

		SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		String addr = InetAddress.getLocalHost().getHostAddress();
		exporter.setBaseAddress(String.format("http://%s:%d/services/",addr, soapPort));

		return exporter;
	}
}
