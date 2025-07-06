package br.com.alura.SacreenMatch.service;

public interface IConvertData {
    <T> T obterdados(String json, Class<T> classe);
}
