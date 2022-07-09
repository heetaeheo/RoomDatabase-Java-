package com.example.roomandrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomandrecyclerview.db.User;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.MyViewHolder>{


    private Context context;
    private List<User> userList;

    public UserListAdapter(Context context){
        this.context = context;
    }


    public void setUserList(List<User> userList){
        this.userList = userList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_list_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserListAdapter.MyViewHolder holder, int position) {
        holder.firstTextName.setText(this.userList.get(position).firstName);
        holder.lastTextName.setText(this.userList.get(position).lastName);
    }

    @Override
    public int getItemCount() {
        return this.userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView firstTextName;
        TextView lastTextName;

        public MyViewHolder(View view) {
            super(view);

            firstTextName  = view.findViewById(R.id.FirstNmae);
            lastTextName = view.findViewById(R.id.LastNmae);
        }
    }
}
