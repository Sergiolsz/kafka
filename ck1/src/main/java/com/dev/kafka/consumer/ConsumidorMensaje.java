package com.dev.kafka.consumer;

import com.dev.kafka.model.Mensaje;
import java.util.function.Consumer;
import org.springframework.stereotype.Component;

@Component
public class ConsumidorMensaje implements Consumer<Mensaje> {

  @Override
  public void accept(Mensaje mensaje) {
    System.out.println("Mensaje recibido: " + mensaje);
  }
}
