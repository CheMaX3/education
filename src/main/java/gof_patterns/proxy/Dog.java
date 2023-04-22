package gof_patterns.proxy;
/*
Позволяет добавлять новый функционал в уже имеющуюуся систему без исправления всей системы
напр логирование, кэширование, аутентификацию и т.д.
 */
public interface Dog {
    String getBreed();
    String getId();

}
