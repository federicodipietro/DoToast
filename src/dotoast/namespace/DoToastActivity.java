package dotoast.namespace;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DoToastActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	EditText etext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(DoToastActivity.this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
        etext = new EditText(this);
        etext.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
        ll.addView(etext);
        Button btn = new Button(this);
        btn.setOnClickListener(this);
        btn.setText("Saluta");
        btn.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        ll.addView(btn);
        setContentView(ll);
    }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(), "Ciao a tutti",Toast.LENGTH_LONG).show();
		Toast.makeText(getApplicationContext(),etext.getText().toString(),Toast.LENGTH_LONG).show();
	}
}