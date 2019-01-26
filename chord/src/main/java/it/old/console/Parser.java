package it.old.console;

@FunctionalInterface
public interface Parser {
  void parse(final Arguments arguments) throws Exception;
}
