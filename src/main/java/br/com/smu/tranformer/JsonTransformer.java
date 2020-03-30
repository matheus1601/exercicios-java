package br.com.smu.tranformer;

import com.google.gson.GsonBuilder;

import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

	@Override
	public String render(Object obj) throws Exception {
		return new GsonBuilder().setPrettyPrinting().create().toJson(obj);
	}

}