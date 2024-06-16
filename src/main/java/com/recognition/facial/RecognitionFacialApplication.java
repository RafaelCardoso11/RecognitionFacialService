package com.recognition.facial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.opencv.core.Core;

@SpringBootApplication
public class RecognitionFacialApplication {

	public static void main(String[] args) {

		SpringApplication.run(RecognitionFacialApplication.class, args);


		System.out.println("Hello, OpenCV" + Core.VERSION);
	}

}
