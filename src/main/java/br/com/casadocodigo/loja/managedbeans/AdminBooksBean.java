package br.com.casadocodigo.loja.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import javax.servlet.http.Part;
import javax.transaction.Transactional;

import br.com.casadocodigo.loja.daos.AuthorDAO;
import br.com.casadocodigo.loja.daos.BookDAO;
import br.com.casadocodigo.loja.infra.FileSaver;
import br.com.casadocodigo.loja.infra.MessagesHelper;
import br.com.casadocodigo.loja.models.Author;
import br.com.casadocodigo.loja.models.Book;

@Model
public class AdminBooksBean {

	private Book product = new Book();
	@Inject
	private BookDAO productDAO;
	@Inject
	private AuthorDAO authorDAO;
	private List<Author> authors = new ArrayList<>();
	private Part summary;
	@Inject
	private FileSaver fileSaver;
	
	@Inject
	private MessagesHelper messagesHelper;
	
	@PostConstruct
	public void loadObjects() {
		this.authors = authorDAO.list();
	}
	
	@Transactional
	public String save() {
		String summaryPath = fileSaver.write("summaries", summary);
		product.setSummaryPath(summaryPath);
		
		productDAO.save(product);
		
		messagesHelper.addMessage(
				new FacesMessage("Livro gravado com sucesso"));
		
		return "/livros/list?faces-redirect=true";
	}
	
	public Book getProduct() {
		return product;
	}
	
	public List<Author> getAuthors() {
		return authors;
	}

	public Part getSummary() {
		return summary;
	}

	public void setSummary(Part summary) {
		this.summary = summary;
	}
}
