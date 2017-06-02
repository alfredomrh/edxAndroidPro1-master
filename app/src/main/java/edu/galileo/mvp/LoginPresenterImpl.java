package edu.galileo.mvp;

import android.text.TextUtils;

/**
 * Created by alfredo.martinromo on 18/05/2017.
 * aqui se implementan un par de interfaces, la del loginpresenter y la de los metodos call back
 *
 */

public class LoginPresenterImpl implements LoginPresenter {

    //necesitamos estas dos instancias para que se pueda comunicar con ambas capas
    private LoginView loginView;
    private LoginModel loginModel;

    /**
     * En este constructor inicializamos por parametro la variable loginView e instanciamos con
     * un new el modelo
     * @param loginView
     */

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginModel =  new LoginModelImpl();
    }

    @Override
    public void validateCredential(String username, String password) {

        // Check for a valid password, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
           loginView.setPasswordError(R.string.error_field_required);
            return;
        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(username)) {
            loginView.setUsernameError(R.string.error_field_required);
            return;
        } else if (!isEmailValid(username)) {
            loginView.setUsernameError(R.string.error_invalid_email);
            return;
        }

        loginView.showProgress(true);
        loginModel.login(username,password);
    }

    /**
     * Metodos call back del model
     */

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

}
