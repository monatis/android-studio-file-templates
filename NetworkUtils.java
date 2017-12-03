/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end


import android.content.Context;
import android.net.Uri;
import android.util.Log;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * These utilities will be used to communicate with API servers.
 */
public final class NetworkUtils {

    private static final String TAG = NetworkUtils.class.getSimpleName();

    private static final String BASE_URL = "${BASE_URL}";

    // TODO - Implement this method according to your service and make sure that you add internet permission to your manifest.

    /**
     * Retrieves the proper URL to query for the your remote data.
     *
     * @param context used to access other Utility methods
     * @return URL to query your service
     */
    public static URL getUrl(Context context) {
        //Uri queryUri = Uri.parse(BASE_URL).buildUpon()
                //.appendQueryParameter("q", "something")
                //.build();

        //try {
            //URL queryUrl = new URL(queryUri.toString());
            //Log.v(TAG, "URL: " + queryUrl);
            //return weatherQueryUrl;
        //} catch (MalformedURLException e) {
            //e.printStackTrace();
            //return null;
        //}
        return null;
    }


    /**
     * This method returns the entire result from the HTTP response.
     *
     * @param url The URL to fetch the HTTP response from.
     * @return The contents of the HTTP response, null if no response
     * @throws IOException Related to network and stream reading
     */
    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            String response = null;
            if (hasInput) {
                response = scanner.next();
            }
            scanner.close();
            return response;
        } finally {
            urlConnection.disconnect();
        }
    }
}
