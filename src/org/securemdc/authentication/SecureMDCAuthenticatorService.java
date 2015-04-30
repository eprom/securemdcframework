package org.securemdc.authentication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SecureMDCAuthenticatorService extends Service {

	@Override
	public IBinder onBind(Intent intent){
		SecureMDCAuthenticator authenticator = new SecureMDCAuthenticator(this);
		return authenticator.getIBinder();
	}
}
