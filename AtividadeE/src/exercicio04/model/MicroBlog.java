package model;

public class MicroBlog {
	private Postagem[] postagens;
	private int indice;
	
	public MicroBlog(int tamanho) {
		this.postagens = new Postagem[tamanho];
	}
	
	public void postar(Postagem post) {
		if(indice < postagens.length) {
			this.postagens[indice] = post;
			indice++;
		}
		
	}
	
	public void excluir(int id) {
		for (int i = 0; i < indice; i++) {
			if(postagens[i].getId() == id) {
				postagens[i] = null;
			}
		}
	}
}
