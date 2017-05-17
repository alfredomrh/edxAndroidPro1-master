package edu.galileo.mvp;

/**
 * Created by alfredo on 17/05/17.
 *
 * interfaz que maneja la capa modelo, donde se implementa la logica de negocio
 *
 * contiene una interfaz con tres metodos callback y un metodo principal llamado login que tiene
 * como parametro el listener de la interfaz callback
 */

public interface LoginModel {

    interface OnLoginFinisherListener{

        void onCanceled();

        void onPasswordError();

        void onSuccess();

    }

    void login(String username, String password, OnLoginFinisherListener listener);
}
