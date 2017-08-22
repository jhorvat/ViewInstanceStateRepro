package io.github.jhorvat.instancestaterepro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Router router = Conductor.attachRouter(this, (ViewGroup) findViewById(R.id.main_container), savedInstanceState);
        router.setRoot(RouterTransaction.with(new MainController()));
    }
}
