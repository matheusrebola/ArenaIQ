package soccervs.statics.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import soccervs.statics.core.dtos.ResultadoCreateDTO;
import soccervs.statics.core.dtos.ResultadoDTO;
import soccervs.statics.core.entities.Resultados;

@Component
public class ResultadosMapper {

	@Autowired
	private ModelMapper mapper;

	public Resultados map(ResultadoCreateDTO createDTO) {
		Resultados r = mapper.map(createDTO, Resultados.class);
		return r;
	}

	public ResultadoDTO map(Resultados saved) {
		ResultadoDTO dto = mapper.map(saved, ResultadoDTO.class);
		return dto;
	}

	public List<ResultadoDTO> map(List<Resultados> r) {
		return r.stream()
				.map(resultados -> mapper.map(r, ResultadoDTO.class))
				.collect(Collectors.toList());
	}
}
