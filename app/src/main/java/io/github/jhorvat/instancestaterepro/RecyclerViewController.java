package io.github.jhorvat.instancestaterepro;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bluelinelabs.conductor.Controller;


public class RecyclerViewController extends Controller {
    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_recycler_view, container, false);
        RecyclerView recycler = view.findViewById(R.id.recycler_view);
        recycler.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recycler.setAdapter(new Adapter());
        return view;
    }

    private static class Adapter extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new RecyclerView.ViewHolder(new TextView(parent.getContext())) {};
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ((TextView) holder.itemView).setText(String.valueOf(position));
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}
