package hr.goodapp.loaderexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import hr.goodapp.loaderexample.loader.LoaderMain;


public class FragmentMain extends Fragment implements LoaderManager.LoaderCallbacks<Void>{

    public FragmentMain() {
        // Required empty public constructor
    }

    public static FragmentMain newInstance() {
        FragmentMain fragment = new FragmentMain();

        return fragment;
    }


    @Override
    public Loader<Void> onCreateLoader(int id, Bundle args) {
        return new LoaderMain(getContext());
    }

    @Override
    public void onLoadFinished(Loader<Void> loader, Void data) {
        Toast.makeText(getContext(),"onLoadFinished",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoaderReset(Loader<Void> loader) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_main, container, false);

        Button button = (Button) view.findViewById(R.id.fragment_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getContext(),Main2Activity.class));
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getLoaderManager().initLoader(0,null,this);
    }
}
