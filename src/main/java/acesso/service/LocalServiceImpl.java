package acesso.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import acesso.domain.InfoLocal;
import acesso.exception.LocalAlreadyExistsException;
import acesso.repository.LocalRepository;

@Service
@Validated
public class LocalServiceImpl implements AcessoService {

    private final LocalRepository repository;

    @Autowired
    public LocalServiceImpl(final LocalRepository repository) {
        this.repository = repository;
    }
    
    public InfoLocal getById(int id) {    
    	return repository.findOne(id);
    }
    
	public List<InfoLocal> listaLocais() {
		return repository.findAll();
	}
	
    @Transactional
    public InfoLocal save(@NotNull @Valid final InfoLocal localValido) {
    	
        InfoLocal existing = repository.findOne(localValido.getId());
        
        if (existing != null) {
            throw new LocalAlreadyExistsException(String.format("Esse lugar ja foi atualizado", localValido.getNome()));
        }
        
        return repository.save(localValido);
    }

	public LocalRepository getRepository() {
		return repository;
	}

	
}
