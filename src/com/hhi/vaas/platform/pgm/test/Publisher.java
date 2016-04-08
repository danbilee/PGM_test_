package com.hhi.vaas.platform.pgm.test;

import org.zeromq.ZMQ;

public class Publisher {
	
	private ZMQ.Context context = ZMQ.context(1);     
    private ZMQ.Socket publisher = context.socket(ZMQ.PUB);

    public Publisher(String Addr) {
    	publisher.connect(Addr);
		publisher.setSendTimeOut(0); 
	}
    
    public void send(String message) {
    	publisher.send(message);
	}
    
    public void close() {
    	publisher.close();
	}
    
    public void setSNTO() {
    	publisher.setSendTimeOut(0);

	}
    
    public void connect(String addr) {
    	publisher.connect(addr);

	}
}
