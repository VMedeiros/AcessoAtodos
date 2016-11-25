package acesso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import acesso.domain.InfoLocal;
import acesso.service.AcessoService;

@RestController
@RequestMapping(value="/infoLocal")
public class AcessoController {

	@Autowired
	private AcessoService acessoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity< List<InfoLocal> > listaLocais() {
		
		return new ResponseEntity< List<InfoLocal> >
		(acessoService.listaLocais(), HttpStatus.OK);
		
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<InfoLocal> getInfoLocal(@PathVariable int id) {
		
		InfoLocal infoLocal = acessoService.getById(id);
		
		return infoLocal == null ? 
				new ResponseEntity<InfoLocal>(HttpStatus.NOT_FOUND) : 
					new ResponseEntity<InfoLocal>(infoLocal, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> criarLocal(@RequestBody InfoLocal infoLocal) {

		try {
			acessoService.save(infoLocal);
			return new ResponseEntity<String>(HttpStatus.CREATED);

		 } catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public AcessoService getAcessoService() {
		return acessoService;
	}
}
