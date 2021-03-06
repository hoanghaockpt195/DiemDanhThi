package lachongmedia.vn.demodiemdanh.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import lachongmedia.vn.demodiemdanh.R;
import lachongmedia.vn.demodiemdanh.Utils;
import lachongmedia.vn.demodiemdanh.databases.model.Student;

/**
 * Created by tranh on 5/30/2017.
 */

public class DiemDanhthiViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iv_bg)
    ImageView ivBg;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.iv_avt)
    CircleImageView ivAvt;
    @BindView(R.id.tv_sbd)
    TextView tvSbd;

    public DiemDanhthiViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
    public void bind(Student student) {
        if (student.isHereNow()) {
            ivBg.setVisibility(View.VISIBLE);
        } else
            ivBg.setVisibility(View.GONE);
        tvName.setText(student.getName());
        tvSbd.setText("Số báo danh: "+ (Utils.sbd++));
        Picasso.with(itemView.getContext()).load(student.getAvatar()).into(ivAvt);
    }
}
