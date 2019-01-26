package it.old.logging;


import java.util.logging.Logger;

public interface Loggable {

  default Logger log() {
    return Logger.getLogger(this.getClass().getName());
  }
}
