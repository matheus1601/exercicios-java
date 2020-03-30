package br.com.smu.validation;

import spark.Request;
import spark.utils.StringUtils;

public class UsuarioValidation {

	public boolean isValido(Request req) {
		return (req != null && !StringUtils.isEmpty(req));
	}

}