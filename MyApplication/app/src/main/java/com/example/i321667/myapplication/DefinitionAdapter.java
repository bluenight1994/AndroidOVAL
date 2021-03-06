package com.example.i321667.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by GanHong on 16/5/4.
 */
public class DefinitionAdapter extends RecyclerView.Adapter<DefinitionAdapter.MyViewHolder>{
    private List<OVALDefinition> definitionsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, date, category, description;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.title);
            category = (TextView) view.findViewById(R.id.category);
            date = (TextView) view.findViewById(R.id.year);
            description = (TextView) view.findViewById(R.id.definition_description);
        }
    }

    public DefinitionAdapter(List<OVALDefinition> definitionsList) {
        this.definitionsList = definitionsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.definition_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        OVALDefinition definition = definitionsList.get(position);
        holder.name.setText(definition.getDefinitionName());
        holder.category.setText(definition.getCategory());
        holder.date.setText(definition.getDate());
        holder.description.setText(definition.getDescription());
    }

    @Override
    public int getItemCount() {
        return definitionsList.size();
    }
}
