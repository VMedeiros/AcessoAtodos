package acesso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import acesso.domain.InfoLocal;

public interface LocalRepository extends JpaRepository<InfoLocal, Integer> {

	public InfoLocal findByNome(String nome);
	
}
