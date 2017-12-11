package rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Конфигурация REST приложения
 */
@ApplicationPath("/rest")
public class RestApplication extends Application {
    public RestApplication(){}
}