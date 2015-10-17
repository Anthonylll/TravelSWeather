package com.Anthony.travelsweather.util;

public interface HttpCallbackListener {
    
	void onFinish(String response);
	
	void onError(Exception e);
}
