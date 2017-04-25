package de.tum.jk.application.model.encoding;

import java.io.IOException;

import java.io.Writer;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.tum.jk.application.model.presenterTool.ActiveSlidePath;


public class DataEncoder implements Encoder.TextStream<ActiveSlidePath> {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	public void init(EndpointConfig arg0) {
		// TODO Auto-generated method stub
		
	}

	public void encode(ActiveSlidePath object, Writer writer) throws EncodeException, IOException {
		ObjectMapper x = new ObjectMapper();
		String a = x.writeValueAsString(object);
		writer.write(a);
		
	}
	

	

}
