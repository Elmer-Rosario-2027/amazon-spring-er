package org.example;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AmazonDemoMain {

  public static String generateSHA256(String input) {
    return DigestUtils.sha256Hex(input);
  }

  public static void main(String[] args) {
    SpringApplication.run(AmazonDemoMain.class, args);
  }
}