package arenaiq.encaminhador.evento.core.utils;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import arenaiq.encaminhador.evento.core.models.Acontecimentos;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class JsonUtil {

  private final ObjectMapper objectMapper;

    public String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception ex) {
            return "";
        }
    }

    public Acontecimentos toAcontecimento(String json) {
        try {
            return objectMapper.readValue(json, Acontecimentos.class);
        } catch (Exception ex) {
            return null;
        }
    }
}
