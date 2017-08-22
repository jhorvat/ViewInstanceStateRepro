package io.github.jhorvat.instancestaterepro;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;


public class MainController extends Controller {
    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_main, container, false);
        getChildRouter((ViewGroup) view.findViewById(R.id.recycler_container)).pushController(RouterTransaction.with(new RecyclerViewController()));
        getChildRouter((ViewGroup) view.findViewById(R.id.frame_container)).pushController(RouterTransaction.with(new FrameLayoutController()));
        return view;
    }
}
