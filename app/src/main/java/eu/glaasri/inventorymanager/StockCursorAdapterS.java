package eu.glaasri.inventorymanager;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import eu.glaasri.inventorymanager.data.StockContract;

public class StockCursorAdapterS extends CursorAdapter {


    private final SupplierActivity activity;

    public StockCursorAdapterS(SupplierActivity context, Cursor c) {
        super(context, c, 0);
        this.activity = context;
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.list_items, viewGroup, false);
    }

    @Override
    public void bindView(View view, final Context context, final Cursor cursor) {
        TextView nameTextView = (TextView) view.findViewById(R.id.supplier_name);
        //TextView phoneTextView = (TextView) view.findViewById(R.id.supplier_phone);
        TextView emailTextView = (TextView) view.findViewById(R.id.supplier_email);


        String supplier_name = cursor.getString(cursor.getColumnIndex(StockContract.StockEntry.COLUMN_SUPPLIER_NAME));
        //String supplier_phone = cursor.getString(cursor.getColumnIndex(StockContract.StockEntry.COLUMN_SUPPLIER_PHONE));
        //String supplier_email = cursor.getString(cursor.getColumnIndex(StockContract.StockEntry.COLUMN_SUPPLIER_EMAIL));


        nameTextView.setText(supplier_name);
        //phoneTextView.setText(String.valueOf(supplier_phone));
        //emailTextView.setText(supplier_email);



    }
}
