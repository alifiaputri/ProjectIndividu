package id.sch.smktelkom_mlg.privateassignment.xirpl603.projectindividu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Mokleters on 13/05/2017.
 */

public class News_adapter extends RecyclerView.Adapter<News_adapter.ViewHolder> {
    private List<News_list> news_lists;
    private Context context;

    public News_adapter(List<News_list> news_lists, Context context) {
        this.news_lists = news_lists;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final News_list news_list = news_lists.get(position);
        holder.tvjudul.setText(news_list.getJudul());
        holder.tvpopular.setText(news_list.getPopular());
        Glide
                .with(context)
                .load(news_list.getImage())
                .into(holder.ivimage);

        holder.tvjudul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetilActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("image", news_list.getImage());
                intent.putExtra("oleh", news_list.getPopular());
                intent.putExtra("detildeskripsi", news_list.getDetildeskripsi());
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        if (news_lists != null)
            return news_lists.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivimage;
        TextView tvjudul;
        TextView tvpopular;

        public ViewHolder(View itemView) {
            super(itemView);
            ivimage = (ImageView) itemView.findViewById(R.id.imageView);
            tvjudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvpopular = (TextView) itemView.findViewById(R.id.textViewPopular);
        }
    }
}
