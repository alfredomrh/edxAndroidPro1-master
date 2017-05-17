package edu.galileo.mvp;

/**
 * Created by alfredo on 17/05/17.
 *
 * Esta es la capa intermediaria entre la vista y el modelo donde se encuentra la logica de negocio
 * lo único que tiene es un metodo que se encarga de validar los datos introducidos
 */

public interface LoginPresenter {

    void validateCredential(String username, String password);

}
