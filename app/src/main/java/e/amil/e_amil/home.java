package e.amil.e_amil;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class home extends Fragment implements View.OnClickListener {

    Button btnzakat, btninfaq, btnsodakoh;
    View view ;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public home() {
    }


    // TODO: Rename and change types and number of parameters
    public static home newInstance(String param1, String param2) {
        home fragment = new home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_home, container, false);
        btnzakat = view.findViewById(R.id.datazakat);
        btninfaq = view.findViewById(R.id.datainfaq);
        btnsodakoh = view.findViewById(R.id.datasodakoh);

        btnzakat.setOnClickListener(this);
        btninfaq.setOnClickListener(this);
        btnsodakoh.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.datazakat:
                getActivity().startActivity(new Intent(getActivity(), data_zakat.class));
                break;
            case R.id.datainfaq:
                getActivity().startActivity(new Intent(getActivity(), data_infaq.class));
                break;
            case R.id.datasodakoh:
                getActivity().startActivity(new Intent(getActivity(), data_sodakoh.class));
                break;

        }

    }

    @Override
    public void onDestroyView(){super.onDestroyView();}

}