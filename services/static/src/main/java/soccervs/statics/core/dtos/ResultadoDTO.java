package soccervs.statics.core.dtos;

public class ResultadoDTO extends ResultadoCreateDTO {
	private Long id;

	public ResultadoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultadoDTO(Byte jogos, Byte vitorias, Byte empates, Byte derrotas, Byte aproveitamento, Byte marcados,
			Byte sofridos, Float desempenho, Long competicao, Long clube, Long temporada, Long titulo) {
		super(jogos, vitorias, empates, derrotas, aproveitamento, marcados, sofridos, desempenho, competicao, clube, temporada,
				titulo);
		// TODO Auto-generated constructor stub
	}

	public ResultadoDTO(Byte jogos, Byte vitorias, Byte empates, Byte derrotas, Byte aproveitamento, Byte marcados,
			Byte sofridos, Float desempenho, Long competicao, Long clube, Long temporada, Long titulo, Long id) {
		super(jogos, vitorias, empates, derrotas, aproveitamento, marcados, sofridos, desempenho, competicao, clube,
				temporada, titulo);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
