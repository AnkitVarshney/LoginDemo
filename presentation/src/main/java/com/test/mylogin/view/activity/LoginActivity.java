
package com.test.mylogin.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.test.domain.executor.User;
import com.test.domain.executor.interactor.GetUserList;
import com.test.domain.executor.interactor.Params;
import com.test.domain.executor.interactor.UseCase;
import com.test.mylogin.R;
import com.test.mylogin.dagger.components.UserComponent;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.observers.DisposableObserver;

public class LoginActivity extends BaseActivity {

    private final UseCase getUserUseCase;
    private UserComponent userComponent;

    @Inject
    public LoginActivity(@Named(GetUserList.NAME) UseCase getUserUseCase) {
        this.getUserUseCase = getUserUseCase;
    }
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_login);
        this.initializeInjector();
        btn = (Button)findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getUserUseCase.execute(new UserObserver(), Params.EMPTY);



               /* NetworkRequest networkRequest = new NetworkRequest();
                networkRequest.addParameter("email_id", );
                networkRequest.addParameter("password", );
                networkRequest.addParameter("device_id", Settings.Secure.getString(getContentResolver(),
                        Settings.Secure.ANDROID_ID));
                networkRequest.addParameter("device_type", "ANDROID");
                networkRequest.addParameter("device_token", "asjfdkjsasdfkasjdrrkfjaskd");*/
            }
        });

    }


    private final class UserObserver extends DisposableObserver<User> {

        @Override public void onComplete() {
            System.out.println("  on Complete");
            Toast.makeText(LoginActivity.this, " successfully login", Toast.LENGTH_SHORT).show();
        }

        @Override public void onError(Throwable e) {
            System.out.println("  on Complete");
        }

        @Override public void onNext(User users) {
            System.out.println("  on Complete");
        }
    }


    private void initializeInjector() {
        this.userComponent = DaggerUserComponent.builder()
                .applicationComponent(getApplicationComponent())
                .activityModule(getActivityModule())
                .build();
    }
}


