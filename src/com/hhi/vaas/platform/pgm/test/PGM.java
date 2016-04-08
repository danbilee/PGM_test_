package com.hhi.vaas.platform.pgm.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.zeromq.*;

public class PGM {

	public void sendData(String data_N, Publisher publisher) {

		BufferedReader br = null;
		
		try {
			String line = null;
			br = new BufferedReader(new FileReader(data_N));
			int i = 0;
			while ((line = br.readLine()) != null) {
				
				i++;
				Thread.sleep(50);
				publisher.send(line);
				Thread.sleep(100);
				System.out.println(i + " DATA sent.");
					
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {}
				System.out.println("All data sent from " + data_N);
			}

		}

	}
	
	
	

}
