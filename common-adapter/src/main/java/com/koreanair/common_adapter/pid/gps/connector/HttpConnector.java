package com.koreanair.common_adapter.pid.gps.connector;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;

public class HttpConnector {

    public static String httpsServiceCall(String body, HashMap<String,String> envMap) throws Exception {
        String result = null;
        OutputStreamWriter clsOutput = null;
        String startTime = null;
        String endTime = null;
        BufferedReader clsInput = null;
        StringBuffer buffer = new StringBuffer();

        URL url = new URL(envMap.get("url"));
        HttpsURLConnection urlConnection;
        urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.setConnectTimeout(5000);
        urlConnection.setReadTimeout(120000);
        urlConnection.setDoInput(true);
        urlConnection.setDoOutput(true);
        urlConnection.setUseCaches(false);
        urlConnection.setRequestMethod(envMap.get("method"));

        urlConnection.setRequestProperty("Content-Type", envMap.get("Content-Type"));
        urlConnection.setRequestProperty("Accept", envMap.get("Accept"));
        if(envMap.get("Authorization")!=null){
            System.out.println(envMap.get("Authorization"));
            urlConnection.setRequestProperty("Authorization", envMap.get("Authorization"));
        }
        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                // TODO Auto-generated method stub

            }

            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                // TODO Auto-generated method stub

            }
        }};

        SSLContext sc = SSLContext.getInstance("TLSv1.2");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        urlConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {

            @Override
            public boolean verify(String arg0, SSLSession arg1) {
                // TODO Auto-generated method stub
                return false;
            }
        };


        try {
            clsOutput = new OutputStreamWriter(urlConnection.getOutputStream());
            //System.out.println(body);
            clsOutput.write(body);
            clsOutput.flush();
        } catch (Exception ee) {
            ee.printStackTrace();
            if(clsOutput != null){
                clsOutput.close();
            }
        }

        try {
            clsInput = new BufferedReader(new InputStreamReader(
                    urlConnection.getInputStream(), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
            try {
                clsInput = new BufferedReader(new InputStreamReader(
                        urlConnection.getErrorStream(), "UTF-8"));
            } catch (Exception e2) {
            }
        } finally {
            String inputLine;
            if (clsInput != null) {
                while ((inputLine = clsInput.readLine()) != null)
                    buffer.append(inputLine);
            }

            if (clsInput != null)
                clsInput.close();
            if (clsOutput != null)
                clsOutput.close();
            if (urlConnection != null)
                urlConnection.disconnect();

            result = buffer.toString();
        }
        System.out.println("result============"+result.toString());
        return result;
    }

}
