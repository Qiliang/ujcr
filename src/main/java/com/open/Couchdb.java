package com.open;

import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Couchdb {

	private final String db;

	public Couchdb(String db) {
		this.db = db;
	}

	public JSONObject Get() throws ClientProtocolException, IOException, JSONException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpHost targetHost = new HttpHost("localhost", 5984);
		HttpGet httpget = new HttpGet("/" + db);
		HttpResponse response = httpclient.execute(targetHost, httpget);
		HttpEntity entity = response.getEntity();
		String content = IOUtils.toString(entity.getContent(), getEncoding(entity));
		org.apache.http.util.EntityUtils.consume(entity);
		return new JSONObject(content);
	}

	private String getEncoding(HttpEntity entity) {
		if (entity.getContentEncoding() == null)
			return null;
		return entity.getContentEncoding().getValue();
	}

	public static void main(String[] args) throws Throwable {
		Couchdb couchdb = new Couchdb("/ujcr");
		JSONObject j = couchdb.Get();
		JSONArray array = j.names();
		for (int i = 0; i < array.length(); i++) {
			System.out.println(array.get(i) + ":" + j.get(array.getString(i)));
		}

	}
}
