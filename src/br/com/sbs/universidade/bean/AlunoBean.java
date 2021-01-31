package br.com.sbs.universidade.bean;

import javax.faces.bean.ManagedBean;

import br.com.sbs.universidade.dao.DAO;
import br.com.sbs.universidade.models.Aluno;

@ManagedBean
public class AlunoBean {
	
	private Aluno aluno = new Aluno();
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void gravar() {
		System.out.println("Gravando aluno ...");
		
		new DAO<Aluno>(Aluno.class).adiciona(this.aluno);
		
		this.aluno = new Aluno();
	}

}
