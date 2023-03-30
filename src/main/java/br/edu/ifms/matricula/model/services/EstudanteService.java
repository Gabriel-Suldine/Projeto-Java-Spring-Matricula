package br.edu.ifms.matricula.model.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.matricula.model.dto.EstudanteDto;
import br.edu.ifms.matricula.model.entities.Estudante;
import br.edu.ifms.matricula.model.mapper.EstudanteMapper;
import br.edu.ifms.matricula.model.repositories.EstudanteRepository;
import br.edu.ifms.matricula.utils.MD5;

@Service
public class EstudanteService {
	private final EstudanteRepository repository;

	public EstudanteService(EstudanteRepository repository) {
		this.repository = repository;
	}

	public EstudanteDto create(EstudanteDto estudanteDto) {
		estudanteDto.setNome( estudanteDto.getNome().toUpperCase() );
		estudanteDto.setEmail(estudanteDto.getEmail().toLowerCase());
		estudanteDto.setSenha( MD5.encode(estudanteDto.getSenha()) );
		
		if(repository.existsByCpf(estudanteDto.getCpf())) {
			throw new RuntimeException("CPF já existe para outro estudante");			
		}
		if(repository.existsByEmail(estudanteDto.getEmail())) {
			throw new RuntimeException("Email já existe para outro estudante");			
		}
		//if(repository.existsByCpforEmail(estudanteDto.getCpf(), estudanteDto.getEmail())) {
		//	throw new RuntimeException("Email/CPF já existe para outro estudante");

		//}
		
		

		Estudante estudante = EstudanteMapper.dtoToEntity(estudanteDto);		
		repository.save(estudante);
		return EstudanteMapper.entityToDto(estudante);
	}

}
