package de.tum.jk.application.model.encoding;

import java.io.IOException;
import java.io.Reader;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.tum.jk.application.model.presenterTool.ActiveSlidePath;

public class DataDecoder implements Decoder.TextStream<ActiveSlidePath> {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init(EndpointConfig arg0) {
		// TODO Auto-generated method stub

	}

	public ActiveSlidePath decode(Reader arg0) throws DecodeException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(arg0, new TypeReference<Object>() {
		});
	}

}
