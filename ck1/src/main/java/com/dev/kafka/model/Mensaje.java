package com.dev.kafka.model;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Mensaje implements Serializable {

  private String id;
  private String cabeceraMensaje;
  private String cuerpoMensaje;
  private Integer longitudMensaje;

}
