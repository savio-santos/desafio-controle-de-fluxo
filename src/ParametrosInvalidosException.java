public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String mensagem;

	public ParametrosInvalidosException(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParametrosInvalidosException [");
		builder.append(mensagem);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
