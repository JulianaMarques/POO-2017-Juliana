package app;

import model.Postagem;
import model.MicroBlog;

public class TestaMicroBlog {

	public static void main(String[] args) {
		MicroBlog blog = new MicroBlog(5);
		Postagem post = new Postagem(1,"Texto");
		
		blog.postar(post);
		post.curtir();
		
		System.out.println(post.getId());
	}

}
