package edu.galileo.mvp;

/**
 * Created by alfredo on 17/05/17.
 *
 * Interface encargada de manejar la capa view
 */

public interface LoginView {

    void showProgress(boolean showProgress);

    void setUsernameError(int messageResId);

    void setPasswordError(int messageResId);

}
