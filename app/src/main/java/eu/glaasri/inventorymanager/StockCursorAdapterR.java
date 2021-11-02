package eu.glaasri.inventorymanager;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import eu.glaasri.inventorymanager.data.StockContract;

public class StockCursorAdapterR extends CursorAdapter {


    private final ReportActivity activity;

    public StockCursorAdapterR(ReportActivity context, Cursor c) {
        super(context, c, 0);
        this.activity = context;
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.list_itemr, viewGroup, false);
    }

    @Override
    public void bindView(View view, final Context context, final Cursor cursor) {
        TextView nameTextView = (TextView) view.findViewById(R.id.product_name);
        TextView quantityTextView = (TextView) view.findViewById(R.id.quantity);
        ProgressBar bar = (ProgressBar) view.findViewById(R.id.simpleProgressBar);

        String name = cursor.getString(cursor.getColumnIndex(StockContract.StockEntry.COLUMN_NAME));
        final int quantity = cursor.getInt(cursor.getColumnIndex(StockContract.StockEntry.COLUMN_QUANTITY));

        nameTextView.setText(name);
        quantityTextView.setText(String.valueOf(quantity));
        bar.setProgress(quantity);



    }
}
