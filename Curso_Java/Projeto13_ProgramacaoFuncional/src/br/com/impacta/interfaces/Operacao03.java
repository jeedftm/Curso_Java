package br.com.impacta.interfaces;
@FunctionalInterface
//quanto colocamos <T>, de type(Tipo),definimos que pode receber a variavel de qualquer tipo
public interface Operacao03<T> {
	int executar (T item);
}
