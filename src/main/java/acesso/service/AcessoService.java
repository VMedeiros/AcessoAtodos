package acesso.service;

import java.util.List;

import acesso.domain.InfoLocal;

public interface AcessoService {

	InfoLocal save(InfoLocal infoLocal);

	InfoLocal getById(int id);
	
	List<InfoLocal> listaLocais();
}
