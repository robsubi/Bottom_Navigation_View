package com.subhash.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class BlankFragment extends Fragment {





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        WebView webView;
        View view= inflater.inflate(R.layout.fragment_blank, container, false);


        Bundle bundle=getArguments();

        @NonNull
        String name=bundle.getString("edt");

        webView=view.findViewById(R.id.webbb);

        //webView.getSettings().setJavaScriptEnabled(true);
        if (bundle!=null) {
            webView.loadUrl(name);

            webView.setWebViewClient(new MyClient());
        }


        return view;
    }

    public class MyClient extends WebViewClient
    {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);


            return true;



        }
    }

}
