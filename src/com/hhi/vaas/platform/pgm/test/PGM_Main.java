package com.hhi.vaas.platform.pgm.test;

public class PGM_Main {

	public static void main(String[] args) {
		
		String almData_N = "test_alm.txt";		//"aconis_alarm.txt"
		String confData_N = "test_conf.txt";	//"aconis_config.txt"
		String sensData_N = "test_sens.txt"; 	//"aconis_sens.txt"
		
		String sensAddr = "tcp://127.0.0.1:5558";
		String almAddr = "tcp://127.0.0.1:5568";
		String confAddr = "tcp://127.0.0.1:5578";
		
		PGM pgm = new PGM();

		Publisher almPub = new Publisher(almAddr);
		Publisher confPub = new Publisher(confAddr);
		Publisher sensPub = new Publisher(sensAddr);
		
		Json jData = new Json();
		jData.getAlm();
		jData.getConf();
		jData.getSens();
	
		//sending alarm data
		pgm.sendData(almData_N, almPub); //Thread-0
		
		//sending sensor data
		pgm.sendData(sensData_N, sensPub); //Thread-1	
		
		//sending config data
		pgm.sendData(confData_N, confPub); //Thread-2
		
	
		
		
		
	}

}
