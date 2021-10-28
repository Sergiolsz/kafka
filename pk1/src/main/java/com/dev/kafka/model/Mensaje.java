package com.dev.kafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Data
public class Mensaje {

  private String id;

  private String cabeceraMensaje;

  private String cuerpoMensaje;

  private Integer longitudMensaje;

  public Mensaje(String cabeceraMensaje, String cuerpoMensaje) {
    this.id = UUID.randomUUID().toString();
    this.cabeceraMensaje = cabeceraMensaje;
    this.cuerpoMensaje = cuerpoMensaje;
    this.longitudMensaje = cuerpoMensaje.length();
  }
}
