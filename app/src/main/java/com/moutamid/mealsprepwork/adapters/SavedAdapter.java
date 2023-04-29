package com.moutamid.mealsprepwork.adapters;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.moutamid.mealsprepwork.R;
import com.moutamid.mealsprepwork.models.MealModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SavedAdapter extends RecyclerView.Adapter<SavedAdapter.SavedVH> implements Filterable {
    Context context;
    List<MealModel> list, listAll;
    boolean added;

    public SavedAdapter(Context context, List<MealModel> list, boolean added) {
        this.context = context;
        this.list = list;
        this.added = added;
    }

    public SavedAdapter(Context context, List<MealModel> list, List<MealModel> listAll, boolean added) {
        this.context = context;
        this.list = list;
        this.listAll = listAll;
        this.added = added;
    }

    @NonNull
    @Override
    public SavedVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.saved_items, parent, false);
        return new SavedVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SavedVH holder, int position) {
        MealModel model = list.get(holder.getAdapterPosition());

        holder.textView.setText(model.getMeal());
        Glide.with(context).load(model.getMealThumb()).into(holder.image);

        if (added) {
            holder.itemView.setOnClickListener(v -> showDialog(model));
        }

    }

    private void showDialog(MealModel model) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.ingredients);

        String text = "1- ";

        TextView textView = dialog.findViewById(R.id.ingredients);
        Button button = dialog.findViewById(R.id.close);

        if (!model.getIngredient1().isEmpty())
            text = text + model.getIngredient1();
        if (!model.getIngredient2().isEmpty() )
            text = text + "\n2- " + model.getIngredient2();
        if (!model.getIngredient3().isEmpty() )
            text = text + "\n3- " + model.getIngredient3();
        if (!model.getIngredient4().isEmpty() )
            text = text + "\n4- " + model.getIngredient4();
        if (!model.getIngredient5().isEmpty() )
            text = text + "\n5- " + model.getIngredient5();
        if (!model.getIngredient6().isEmpty() )
            text = text + "\n6- " + model.getIngredient6();
        if (!model.getIngredient7().isEmpty() )
            text = text + "\n7- " + model.getIngredient7();
        if (!model.getIngredient8().isEmpty() )
            text = text + "\n8- " + model.getIngredient8();
        if (!model.getIngredient9().isEmpty() )
            text = text + "\n9- " + model.getIngredient9();
        if (!model.getIngredient10().isEmpty() )
            text = text + "\n10- " + model.getIngredient10();

        textView.setText(text);

        button.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setGravity(Gravity.CENTER);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
        //run on background thread
        @Override
        protected FilterResults performFiltering(CharSequence s) {
            ArrayList<MealModel> filterList = new ArrayList<>();
            if (s.toString().isEmpty()) {
                filterList.addAll(listAll);
            } else {
                for (MealModel listModel : listAll) {
                    if (
                            listModel.getMeal().toLowerCase().contains(s.toString().toLowerCase()) ||
                            ( listModel.getIngredient1().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient1() != null ) ||
                            ( listModel.getIngredient2().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient2() != null ) ||
                            ( listModel.getIngredient3().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient3() != null ) ||
                            ( listModel.getIngredient4().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient4() != null ) ||
                            ( listModel.getIngredient5().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient5() != null ) ||
                            ( listModel.getIngredient6().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient6() != null ) ||
                            ( listModel.getIngredient7().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient7() != null ) ||
                            ( listModel.getIngredient8().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient8() != null ) ||
                            ( listModel.getIngredient9().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient9() != null ) ||
                            ( listModel.getIngredient10().toLowerCase().contains(s.toString().toLowerCase()) && listModel.getIngredient10() != null )
                    ) {
                        filterList.add(listModel);
                    }
                }
            }
            FilterResults filterResults = new FilterResults();
            filterResults.values = filterList;

            return filterResults;
        }

        //run on Ui thread
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            list.clear();
            listAll.addAll((Collection<? extends MealModel>) filterResults.values);
            notifyDataSetChanged();
        }
    };

    public class SavedVH extends RecyclerView.ViewHolder {
        ImageView image;
        TextView textView;
        public SavedVH(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.name);
        }
    }

}
