package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
@RestController
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

	// This method handles the Checksum requirement for Artemis Financial
	@RequestMapping("/hash")
	public String getChecksum() throws NoSuchAlgorithmException {
		// Requirement: Unique data string including your name
		String data = "Jude Mensah Nana Baffoe: Project Two Data Integrity Check"; 
		
		// Initialize the SHA-256 MessageDigest [cite: 52]
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		
		// Generate the hash bytes [cite: 52]
		byte[] encodedhash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
		
		// Convert the bytes into a readable Hexadecimal string
		StringBuilder hexString = new StringBuilder();
		for (byte b : encodedhash) {
			String hex = Integer.toHexString(0xff & b);
			if (hex.length() == 1) hexString.append('0');
			hexString.append(hex);
		}
		
		return "<html><body style='font-family: Arial; margin: 40px;'>" +
		       "<h1>Artemis Financial - Checksum Verification</h1>" +
		       "<p><b>Original Data:</b> " + data + "</p>" +
		       "<p><b>SHA-256 Checksum:</b> <span style='color: green; font-family: monospace;'>" + 
               hexString.toString() + "</span></p>" +
		       "</body></html>";
	}
}